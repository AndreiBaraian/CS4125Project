package gui;
/*
 * @author Lucian Epure
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bll.AccountBLL;
import account.*;
import customer.*;
import promotion.*;
import region.*;
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
		if(accountsTable.getValueAt(selectedRow, 3).toString()=="Family"&&promotion=="Surfer")
		{
			List<String> numbers = new ArrayList<>();
			numbers.add(DoneAddingListener.custo_number);
			Account SurferPromotionFamilyAccount = new SurferPromotion(new FamilyAccount(Double.parseDouble(accountsTable.getValueAt(selectedRow, 6).toString()),new Romania(),DoneAddingListener.customer,numbers));
			System.out.println("Promotion Complete! your promotion type is "+promotion);
			System.out.println("Applied Account is "+accountsTable.getValueAt(selectedRow, 3).toString() +" Account");
			System.out.println("Account owner is "+id);
		}
		if(accountsTable.getValueAt(selectedRow, 3).toString()=="Family"&&promotion=="Friend")
		{
			List<String> numbers = new ArrayList<>();
			numbers.add(DoneAddingListener.custo_number);
			Account FriendPromotionFamilyAccount = new FriendPromotion(new FamilyAccount(Double.parseDouble(accountsTable.getValueAt(selectedRow, 6).toString()),new Romania(),DoneAddingListener.customer,numbers));
			System.out.println("Promotion Complete! your promotion type is "+promotion);
			System.out.println("Applied Account is "+accountsTable.getValueAt(selectedRow, 3).toString() +" Account");
			System.out.println("Account owner is "+id);
		}
		if(accountsTable.getValueAt(selectedRow, 3).toString()=="Family"&&promotion=="Traveler")
		{
			List<String> numbers = new ArrayList<>();
			numbers.add(DoneAddingListener.custo_number);
			Account TravelerPromotionFamilyAccount = new TravelerPromotion(new FamilyAccount(Double.parseDouble(accountsTable.getValueAt(selectedRow, 6).toString()),new Romania(),DoneAddingListener.customer,numbers));
			System.out.println("Promotion Complete! your promotion type is "+promotion);
			System.out.println("Applied Account is "+accountsTable.getValueAt(selectedRow, 3).toString() +" Account");
			System.out.println("Account owner is "+id);
		}
		if(accountsTable.getValueAt(selectedRow, 3).toString()=="Enterprise"&&promotion=="Surfer")
		{
			Account SurferPromotionEnterpriseAccount = new SurferPromotion(new EnterpriseAccount(Double.parseDouble(accountsTable.getValueAt(selectedRow, 6).toString()),new Romania(),DoneAddingListener.customer,DoneAddingListener.endate,DoneAddingListener.custo_number));
			System.out.println("Promotion Complete! your promotion type is "+promotion);
			System.out.println("Applied Account is "+accountsTable.getValueAt(selectedRow, 3).toString() +" Account");
			System.out.println("Account owner is "+id);
		}
		if(accountsTable.getValueAt(selectedRow, 3).toString()=="Enterprise"&&promotion=="Friend")
		{
			Account FriendPromotionEnterpriseAccount = new FriendPromotion(new EnterpriseAccount(Double.parseDouble(accountsTable.getValueAt(selectedRow, 6).toString()),new Romania(),DoneAddingListener.customer,DoneAddingListener.endate,DoneAddingListener.custo_number));
			System.out.println("Promotion Complete! your promotion type is "+promotion);
			System.out.println("Applied Account is "+accountsTable.getValueAt(selectedRow, 3).toString() +" Account");
			System.out.println("Account owner is "+id);
		}
		if(accountsTable.getValueAt(selectedRow, 3).toString()=="Enterprise"&&promotion=="Travler")
		{
			Account TravelerPromotionEnterpriseAccount = new TravelerPromotion(new EnterpriseAccount(Double.parseDouble(accountsTable.getValueAt(selectedRow, 6).toString()),new Romania(),DoneAddingListener.customer,DoneAddingListener.endate,DoneAddingListener.custo_number));
			System.out.println("Promotion Complete! your promotion type is "+promotion);
			System.out.println("Applied Account is "+accountsTable.getValueAt(selectedRow, 3).toString() +" Account");
			System.out.println("Account owner is "+id);
		}
		
		

	}

}
