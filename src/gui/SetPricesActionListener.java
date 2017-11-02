package gui;
/**
 * @author Lucian Epure 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetPricesActionListener implements ActionListener{
	private SetPrices setPrices;
	
	public void actionPerformed(ActionEvent e) {
		setPrices = new SetPrices();
		setPrices.setVisible(true);
	}

}
