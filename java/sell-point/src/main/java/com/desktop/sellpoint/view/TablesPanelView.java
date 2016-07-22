package com.desktop.sellpoint.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TablesPanelView {

	public static void main(String[] args) {

		Display display = new Display();
		
		Shell shell = new Shell(display);
		
		
		
		
		
		
		
		// Shell can be used as container
	/*	Label label = new Label(shell, SWT.BORDER);
		label.setText("This is a label:");
		label.setToolTipText("This is the tooltip of this label");

		Text text = new Text(shell, SWT.NONE);
		text.setText("This is the text in the text widget");
		text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
		text.setForeground(display.getSystemColor(SWT.COLOR_WHITE));
*/
		
		Button button =  new Button(shell, SWT.PUSH);

		//register listener for the selection event
		button.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        System.out.println("Called!");
		    }
		}); 
		button.setText("CALLED!");
		button.setLocation(10, 10);
		
		
		// set widgets size to their preferred size
	//	text.pack();
	//	label.pack(); 
		
		button.pack();
		
		
		
		
		
		
		shell.open();

		// run the event loop as long as the window is open
		while (!shell.isDisposed()) {
		    // read the next OS event queue and transfer it to a SWT event 
		  if (!display.readAndDispatch())
		   {
		  // if there are currently no other OS event to process
		  // sleep until the next OS event is available 
		    display.sleep();
		   }
		}

		// disposes all associated windows and their components
		display.dispose(); 
		
	}

}
