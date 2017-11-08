package gui;
/**
 * @author Lucian Epure 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Control;

public class SetPricesActionListener implements ActionListener{
	private SetPrices setPrices;
	private Control c;
	public SetPricesActionListener(){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e) {
		setPrices = new SetPrices();
		setPrices.setVisible(true);
	}

}
