package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.JTextField;
import bll.AccountBLL;
import control.NumberControl;

public class DoneAddNumber implements ActionListener {
	
	private JTextField numberTF;
	private JTable table;
	private int accountSelectedRow;
	
	public DoneAddNumber(JTextField numberTF, JTable table,
			int accountSelectedRow) {
		super();
		this.numberTF = numberTF;
		this.table = table;
		this.accountSelectedRow = accountSelectedRow;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try{
			NumberControl nc = new NumberControl(table.getValueAt(accountSelectedRow, 0).toString(),numberTF.getText());
			nc.addNumber();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
