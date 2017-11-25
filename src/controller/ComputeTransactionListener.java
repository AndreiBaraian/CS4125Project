package controller;
/*
 * @author Lucian Epure
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import computeTransaction.ComputeTransaction;
import exceptions.InsertException;

public class ComputeTransactionListener implements ActionListener{
	
	ComputeTransaction computeTransaction; 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		computeTransaction = new ComputeTransaction(); 
		try {
			computeTransaction.processServices();
		} catch (InsertException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
