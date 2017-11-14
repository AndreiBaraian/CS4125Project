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
	private DefaultTableModel promotionModel; 
	private DefaultTableModel accountModel;
	private JTable accountsTable;
	private int selectedRow;
	private int selectedCol;
	private AccountBLL<?> accountBLL;

	public DonePromoting(JComboBox<String> applyPromotion, JTable availablePromotionsTable,JTable accountsTable, int selectedAccountRow, int selectedAccountCol)
	{
		this.accountsTable=accountsTable;
		this.selectedCol=selectedAccountCol;
		this.selectedRow=selectedAccountRow;
		this.availablePromotionsTable=availablePromotionsTable;
		this.applyPromotion=applyPromotion;
		this.accountBLL= new AccountBLL();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		List<String> recievedAttributes = new ArrayList<String>();
		String recievedMinutes;
		String recievedMessages;
		String accountId = accountsTable.getValueAt(selectedRow, selectedCol).toString(); 
		String promotion = applyPromotion.getSelectedItem().toString();
		promotionModel= (DefaultTableModel) availablePromotionsTable.getModel();
		promotionModel.addRow(new Object[]{promotion}); 
		accountModel=(DefaultTableModel) accountsTable.getModel();
		recievedAttributes=accountBLL.applyPromotion(promotion,accountId);
		recievedMinutes=recievedAttributes.get(0);
		recievedMessages=recievedAttributes.get(1);
		accountModel.setValueAt(recievedMinutes, selectedRow, 4);
		accountModel.setValueAt(recievedMessages, selectedRow, 5);
		
	
		/*
		 * if(accountsTable.getValueAt(selectedRow, 3).toString()=="Family"&&promotion=="Surfer")
		{
			List<String> numbers = new ArrayList<>();
			numbers.add(DoneAddingListener.custo_number);
			Account SurferPromotionFamilyAccount = new SurferPromotion(new FamilyAccount(Double.parseDouble(accountsTable.getValueAt(selectedRow, 6).toString()),new Romania(),DoneAddingListener.customer));
			
			System.out.println("Promotion Complete! your promotion type is "+promotion);
			System.out.println("Applied Account is "+accountsTable.getValueAt(selectedRow, 3).toString() +" Account");
			System.out.println("Account owner is "+id);
		}
		if(accountsTable.getValueAt(selectedRow, 3).toString()=="Family"&&promotion=="Friend")
		{
			List<String> numbers = new ArrayList<>();
			numbers.add(DoneAddingListener.custo_number);
			Account FriendPromotionFamilyAccount = new FriendPromotion(new FamilyAccount(Double.parseDouble(accountsTable.getValueAt(selectedRow, 6).toString()),new Romania(),DoneAddingListener.customer));
			System.out.println("Promotion Complete! your promotion type is "+promotion);
			System.out.println("Applied Account is "+accountsTable.getValueAt(selectedRow, 3).toString() +" Account");
			System.out.println("Account owner is "+id);
		}
		if(accountsTable.getValueAt(selectedRow, 3).toString()=="Family"&&promotion=="Traveler")
		{
			List<String> numbers = new ArrayList<>();
			numbers.add(DoneAddingListener.custo_number);
			Account TravelerPromotionFamilyAccount = new TravelerPromotion(new FamilyAccount(Double.parseDouble(accountsTable.getValueAt(selectedRow, 6).toString()),new Romania(),DoneAddingListener.customer));
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
		
		
*/
	}

}
