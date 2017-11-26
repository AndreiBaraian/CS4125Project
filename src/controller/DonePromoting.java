package controller;

/**
 * @author Lucian Epure
 * @author Andre Baraian 20%
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bll.AccountBLL;
import bll.EnterpriseAccountBLL;
import bll.FamilyAccountBLL;
public class DonePromoting implements ActionListener{
	
	private JComboBox<String> applyPromotion;
	private JTable availablePromotionsTable;
	private DefaultTableModel promotionModel; 
	private DefaultTableModel accountModel;
	private JTable accountsTable;
	private int selectedRow;
	private int selectedCol;
	private AccountBLL<?> accountBLL;

	public DonePromoting(JComboBox<String> applyPromotion, JTable availablePromotionsTable,JTable accountsTable, int selectedAccountRow, int selectedAccountCol) {
		this.accountsTable=accountsTable;
		this.selectedCol=selectedAccountCol;
		this.selectedRow=selectedAccountRow;
		this.availablePromotionsTable=availablePromotionsTable;
		this.applyPromotion=applyPromotion;
		this.accountBLL = getBLL((String)accountsTable.getValueAt(selectedAccountRow, 3));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		List<String> recievedAttributes = new ArrayList<String>();
		String recievedMinutes;
		String recievedMessages;
		String accountId = accountsTable.getValueAt(selectedRow, selectedCol).toString(); 
		String promotion = applyPromotion.getSelectedItem().toString();
		promotionModel = (DefaultTableModel) availablePromotionsTable.getModel();
		promotionModel.addRow(new Object[]{promotion}); 
		accountModel = (DefaultTableModel) accountsTable.getModel();
		recievedAttributes = accountBLL.applyPromotion(promotion,accountId);
		recievedMinutes = recievedAttributes.get(0);
		recievedMessages = recievedAttributes.get(1);
		accountModel.setValueAt(recievedMinutes, selectedRow, 4);
		accountModel.setValueAt(recievedMessages, selectedRow, 5);
	}
		private AccountBLL<?> getBLL(String type) {
		AccountBLL<?> accountBLL = null;
		if(type.equals("EnterpriseAccount")) {
			accountBLL = new EnterpriseAccountBLL();
			//System.out.println("I am here");
		}
		else
			accountBLL = new FamilyAccountBLL();
		return accountBLL;
	}

}
