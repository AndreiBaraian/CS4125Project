package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import bll.RegionBLL;
import control.Control;
import region.Region;



public class DoneSetting implements ActionListener{

	private JTextField previousPrice;
	private JTextField newPriceTF;
	private JComboBox<String> serviceTypeCB;
	private JComboBox<String> countryCB;
	private Control c;
	private RegionBLL regionbll;
	
	public DoneSetting(JTextField previousTF, JTextField newTF, JComboBox<String> serviceTypeCB,JComboBox<String> countryCB){
		
		
		this.previousPrice=previousTF;
		this.newPriceTF=newTF;
		this.serviceTypeCB=serviceTypeCB;
		this.countryCB=countryCB;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		double newPrice= Double.parseDouble(newPriceTF.getText());
		String service=(String) serviceTypeCB.getSelectedItem();
		String regionName=(String) countryCB.getSelectedItem();
		System.out.println(regionName);
		
		regionbll= new RegionBLL();
		regionbll.modifyPrice(regionName,newPrice,service);
		
	}

}
