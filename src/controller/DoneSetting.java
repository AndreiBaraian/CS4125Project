package controller;
/*
 * @author Lucian Epure
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import bll.RegionBLL;



public class DoneSetting implements ActionListener{

	private JTextField newPriceTF;
	private JComboBox<String> serviceTypeCB;
	private JComboBox<String> countryCB;
	private RegionBLL regionbll;
	
	public DoneSetting( JTextField newTF, JComboBox<String> serviceTypeCB,JComboBox<String> countryCB){
		this.newPriceTF=newTF;
		this.serviceTypeCB=serviceTypeCB;
		this.countryCB=countryCB;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		double newPrice= Double.parseDouble(newPriceTF.getText());
		String service=(String) serviceTypeCB.getSelectedItem();
		String regionName=(String) countryCB.getSelectedItem();
		regionbll= new RegionBLL();
		regionbll.modifyPrice(regionName,newPrice,service);
		
	}

}
