package controller;
/*
 * @author Xiangkai Tang
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.JTextField;

public class DoneAddNumber implements ActionListener {
	
	private JTextField numberTF;
	private JTable table;
	private int accountSelectedRow;
	
	public DoneAddNumber(JTextField numberTF, JTable table,int accountSelectedRow) {
		super();
		this.numberTF = numberTF;
		this.table = table;
		this.accountSelectedRow = table.getSelectedRow();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try{
			NumberControl nc = new NumberControl(table.getValueAt(accountSelectedRow, 0).toString(),numberTF.getText());
			nc.addNumber();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
