package view;
/**
 * @author Lucian Epure 
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.DoneSetting;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class SetPrices extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSet;
	private JLabel lblServiceType;
	private JComboBox<String> serviceTypeCB;
	private JComboBox<String> countryCB;
	private JLabel lblNew;
	private JLabel lblPrevious;
	private JLabel lblCountry;
	private JTextField previousTF;
	private JTextField newTF;
	

	public SetPrices() {
		
		setTitle("Set Prices");
		setBounds(100, 100, 282, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCountry = new JLabel("Country");
		lblCountry.setBounds(10, 30, 46, 14);
		contentPane.add(lblCountry);

		
		lblPrevious = new JLabel("Previous");
		lblPrevious.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrevious.setBounds(10, 128, 84, 14);
		contentPane.add(lblPrevious);
		
		lblNew = new JLabel("New");
		lblNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblNew.setBounds(10, 153, 84, 14);
		contentPane.add(lblNew);
		
		lblServiceType = new JLabel("Service Type");
		lblServiceType.setBounds(10, 61, 84, 14);
		contentPane.add(lblServiceType);
		
		
		countryCB = new JComboBox<String>();
		countryCB.setBounds(121, 27, 119, 20);
		countryCB.addItem("Romania");
		countryCB.addItem("Ireland");
		countryCB.addItem("China");
		contentPane.add(countryCB);
		
		
		serviceTypeCB = new JComboBox<String>();
		serviceTypeCB.setBounds(121, 58, 119, 20);
		serviceTypeCB.addItem("Call");
		serviceTypeCB.addItem("Message");
		serviceTypeCB.addItem("Internet");
		contentPane.add(serviceTypeCB);
		
		previousTF = new JTextField();
		previousTF.setBounds(121, 125, 86, 20);
		contentPane.add(previousTF);
		previousTF.setColumns(10);
		
		newTF = new JTextField();
		newTF.setBounds(121, 156, 86, 20);
		contentPane.add(newTF);
		newTF.setColumns(10);
		
		btnSet = new JButton("Set");
		btnSet.setBounds(57, 207, 89, 23);
		contentPane.add(btnSet);
		btnSet.addActionListener(new DoneSetting(newTF,serviceTypeCB,countryCB));
		
		
	}


	public JTextField getPreviousTF() {
		return previousTF;
	}


	public void setPreviousTF(String text) {
		this.previousTF.setText(text);
	}


	public JComboBox<String> getServiceTypeCB() {
		return serviceTypeCB;
	}


	public void setServiceTypeCB(JComboBox<String> serviceTypeCB) {
		this.serviceTypeCB = serviceTypeCB;
	}


	public JComboBox<String> getCountryCB() {
		return countryCB;
	}


	public void setCountryCB(JComboBox<String> countryCB) {
		this.countryCB = countryCB;
	}
	
	
}
