package controller;
/*
 * @author Lucian Epure
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ProcessBills;

public class ProcessBillsListener implements ActionListener{

	ProcessBills processBills;
	public ProcessBillsListener(){
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		processBills = new ProcessBills();
		processBills.setVisible(true);
	}

}
