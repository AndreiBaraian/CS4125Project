package gui;
/**
 * @author Lucian Epure 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

import control.Control;

public class AddAccountListener implements ActionListener {
	
	private JTable table;
	private AddAccount addAccount;
	
	public AddAccountListener(JTable table){
		this.table=table;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		 addAccount= new AddAccount(table);
		 addAccount.setVisible(true);
	}

}
