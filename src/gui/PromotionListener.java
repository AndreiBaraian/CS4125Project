package gui;
/*
 * @author Lucian Epure
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PromotionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ApplyPromotion ap= new ApplyPromotion();
		ap.setVisible(true);
	}
 
}
