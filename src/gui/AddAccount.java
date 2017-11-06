package gui;
/**
 * @author Lucian Epure 
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import control.Control;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddAccount extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField nameTF;
	private JTextField numberTF;
	private JTextField ageTF;
	private JTextField emailTF;
	private JTextField addressTF;
	private JTextField endDateTF;
	private JTable table;
	
	public AddAccount(Control c,JTable table) {
		setTitle("Add");
		this.table=table;
		setBounds(100, 100, 225, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 27, 66, 14);
		contentPane.add(lblName);
		
		JComboBox<String> typeCB = new JComboBox<String>();
		typeCB.setBounds(86, 215, 113, 20);
		typeCB.addItem("Family");
		typeCB.addItem("Enterprise");
		contentPane.add(typeCB);
		
		nameTF = new JTextField();
		nameTF.setBounds(86, 24, 113, 20);
		contentPane.add(nameTF);
		nameTF.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(10, 218, 66, 14);
		contentPane.add(lblType);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(10, 154, 66, 14);
		contentPane.add(lblNumber);
		
		numberTF = new JTextField();
		numberTF.setBounds(86, 151, 113, 20);
		contentPane.add(numberTF);
		numberTF.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 77, 66, 14);
		contentPane.add(lblAddress);
		
		addressTF = new JTextField();
		addressTF.setBounds(86, 74, 113, 20);
		contentPane.add(addressTF);
		addressTF.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 104, 66, 14);
		contentPane.add(lblAge);
		
		ageTF = new JTextField();
		ageTF.setBounds(86, 101, 113, 20);
		contentPane.add(ageTF);
		ageTF.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 129, 66, 14);
		contentPane.add(lblEmail);
		
		emailTF = new JTextField();
		emailTF.setBounds(86, 126, 113, 20);
		contentPane.add(emailTF);
		emailTF.setColumns(10);
		
		JLabel sex = new JLabel("Sex");
		sex.setBounds(10, 52, 66, 14);
		contentPane.add(sex);
		
		JLabel lblRegion = new JLabel("Region");
		lblRegion.setBounds(10, 179, 66, 14);
		contentPane.add(lblRegion);
		
		JComboBox<String> regionCB = new JComboBox<String>();
		regionCB.setBounds(86, 184, 113, 20);
		regionCB.addItem("Ireland");
		regionCB.addItem("EU");
		regionCB.addItem("USA");
		regionCB.addItem("China");
		regionCB.addItem("Russia");
		contentPane.add(regionCB);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(58, 296, 89, 23);
		contentPane.add(btnAdd);
	
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setBounds(10, 255, 72, 14);
		contentPane.add(lblEndDate);
		
		endDateTF = new JTextField();
		endDateTF.setBounds(86, 252, 113, 20);
		contentPane.add(endDateTF);
		endDateTF.setColumns(10);
	
		btnAdd.addActionListener(new DoneAddingListener(c,typeCB,nameTF,numberTF,addressTF,ageTF,emailTF,regionCB,endDateTF,table));
		
	}
}
