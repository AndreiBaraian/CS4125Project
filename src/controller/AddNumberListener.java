package controller;
/**
 * @author Lucian Epure 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import view.AddNumber;

public class AddNumberListener implements ActionListener{
	
	private JTable table;
	private AddNumber addNumber;
	private int selectedRow;
	private int selectedCol;
	
	public AddNumberListener(JTable table, int selectedRow, int selectedCol) {
		super();
		this.table = table;
		this.selectedRow = table.getSelectedRow();
		this.selectedCol = selectedCol;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		addNumber = new AddNumber(table,selectedRow,selectedCol);
		addNumber.setVisible(true);
	}

}
