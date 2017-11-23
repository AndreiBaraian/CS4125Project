package controller;
/**
 * @author Lucian Epure 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bll.RegionBLL;
import region.Region;
import view.SetPrices;

public class SetPricesActionListener implements ActionListener{
	private SetPrices setPrices;
	private RegionBLL regionBLL;
	private Region region;
	
	public SetPricesActionListener(){
		regionBLL = new RegionBLL();
	}
	
	public void actionPerformed(ActionEvent e) {
		setPrices = new SetPrices();
		setPrices.setVisible(true);	
		String service = (String) setPrices.getServiceTypeCB().getSelectedItem();
		String regionName = (String) setPrices.getCountryCB().getSelectedItem();
		region = regionBLL.search(regionName);
		//setPrices.setPreviousTF(previousTF);  -------------------------------------  Will be completed to display the previous price of the desired service
	}

}
