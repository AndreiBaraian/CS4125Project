package controller;
/**
 * @author Lucian Epure 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.SetPrices;

public class SetPricesActionListener implements ActionListener{
	private SetPrices setPrices;
	
	public SetPricesActionListener(){
	}
	
	public void actionPerformed(ActionEvent e) {
		setPrices = new SetPrices();
		setPrices.setVisible(true);	
	}

}
