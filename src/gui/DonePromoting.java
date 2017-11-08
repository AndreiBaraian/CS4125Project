package gui;
/*
 * @author Lucian Epure
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bll.AccountBLL;


public class DonePromoting implements ActionListener{
private JComboBox<String> applyPromotion;
private JTable availablePromotionsTable;
private DefaultTableModel model; 
private JTable accountsTable;
private int selectedRow;
private int selectedCol;
private AccountBLL accountbll;
	public DonePromoting(JComboBox<String> applyPromotion, JTable availablePromotionsTable,JTable accountsTable, int selectedAccountRow, int selectedAccountCol)
	{
		this.accountsTable=accountsTable;
		this.selectedCol=selectedCol;
		this.selectedRow=selectedRow;
		this.availablePromotionsTable=availablePromotionsTable;
		this.applyPromotion=applyPromotion;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id= accountsTable.getValueAt(selectedRow, selectedCol).toString();
		String promotion= applyPromotion.getSelectedItem().toString();
		model= (DefaultTableModel) availablePromotionsTable.getModel();
		model.addRow(new Object[]{promotion}); 
		

	}

}
