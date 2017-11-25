package controller;
/*
 * @author Lucian Epure
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

import view.ApplyPromotion;

public class PromotionListener implements ActionListener{

	private JTable table;
	private int selectedRow;
	private int selectedCol;

	public PromotionListener(JTable accounts,int selectedRow,int selectedCol){
		table=accounts;
		this.selectedCol=selectedCol;
		this.selectedRow=selectedRow;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ApplyPromotion ap = new ApplyPromotion(table,selectedRow,selectedCol);
		ap.setVisible(true);
	}
}
