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

public ReportListener(JTable table, int row, int col)
{
	this.table=table;
	this.row=row;
	this.col=col;
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Working on that");
		String id= table.getValueAt(row, col).toString();
		AccountBLL accountbll= new AccountBLL();
		accountbll.presentReport(id);
	}
		
}
