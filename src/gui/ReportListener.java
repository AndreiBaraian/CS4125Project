package gui;
/*
 * @author Lucian Epure
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

import account.Account;
import bll.AccountBLL;

public class ReportListener implements ActionListener{
private JTable table;
private int col;
private int row;
private AccountBLL<?> accountBLL;

public ReportListener(JTable table, int row, int col)
{
	this.table = table;
	this.row = row;
	this.col = col;
	accountBLL=new AccountBLL();
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String id= table.getValueAt(row, col).toString();
		
		accountBLL.presentReport(id);
	}
		
}
