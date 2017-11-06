package gui;
/**
 * @author Lucian Epure 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

import control.Control;

public class AddAccountListener implements ActionListener {
private Control c;
private JTable table;
private AddAccount a;
	public AddAccountListener(Control c,JTable table)
	{
		this.c=c;
		this.table=table;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		 a= new AddAccount(c,table);
		a.setVisible(true);
	}

}
