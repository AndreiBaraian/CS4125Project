package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import computeTransaction.ComputeTransaction;

public class ComputeTransactionListener implements ActionListener{
	ComputeTransaction computeTransaction; 
	@Override
	public void actionPerformed(ActionEvent e) {
		computeTransaction = new ComputeTransaction(); 
		
	}

}
