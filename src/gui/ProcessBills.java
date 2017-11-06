 package gui;
 /**
  * @author Lucian Epure 
  */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import control.Control;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProcessBills extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JButton btnSetPrices;
	private JLabel lblType;
	protected JComboBox<String> typeCB;
	protected JComboBox<String> countryFromCB;
	protected JComboBox<String> countryToCB;
	private JScrollPane h;
	protected JTextField minDurationTF;
	protected JTextField maxDurationTF;
	private JLabel lblMinDuration;
	private JLabel lblMaxDuration;
	private JTextField quantityTF;
	private JLabel lblQuantity;
	private JLabel lblFromcountry;
	private JLabel lblTocountry;
	private JButton btnComputeTranscation;
	private Control c;
	

	public ProcessBills(Control c) {
		this.setC(c);
		setTitle("Processing Bill");
		setBounds(100, 100, 713, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		Object[] column = { "Type","Caller", "From", "Duration","Date" };

		final DefaultTableModel model = new DefaultTableModel(column, 0);
		table = new JTable(model);
		table.setBounds(231, 15, 388, 246);
		
		h = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		h.setViewportView(table);
		h.setBounds(223, 11, 464, 298);
		contentPane.add(h);
		
		typeCB = new JComboBox<String>();
		typeCB.setBounds(83, 59, 119, 20);
		typeCB.addItem("Any");
		typeCB.addItem("Call");
		typeCB.addItem("Message");
		typeCB.addItem("Internet");
		contentPane.add(typeCB);
		
		
		lblType = new JLabel("Type");
		lblType.setBounds(20, 62, 34, 14);
		contentPane.add(lblType);

		
		minDurationTF = new JTextField();
		minDurationTF.setBounds(116, 90, 86, 20);
		minDurationTF.setText("0");
		contentPane.add(minDurationTF);
		minDurationTF.setColumns(10);
		
		maxDurationTF = new JTextField();
		maxDurationTF.setBounds(116, 120, 86, 20);
		maxDurationTF.setText("999999");
		contentPane.add(maxDurationTF);
		maxDurationTF.setColumns(10);
		
		lblFromcountry = new JLabel("From (country)");
		lblFromcountry.setBounds(20, 159, 86, 14);
		contentPane.add(lblFromcountry);
		
		lblTocountry = new JLabel("To (country)");
		lblTocountry.setBounds(20, 184, 86, 14);
		contentPane.add(lblTocountry);
		
		lblMinDuration = new JLabel("Min Duration");
		lblMinDuration.setBounds(20, 93, 79, 14);
		contentPane.add(lblMinDuration);
		
		lblMaxDuration = new JLabel("Max Duration");
		lblMaxDuration.setBounds(20, 123, 79, 14);
		contentPane.add(lblMaxDuration);
		
		quantityTF = new JTextField();
		quantityTF.setBounds(116, 212, 86, 20);
		quantityTF.setText("50");
		contentPane.add(quantityTF);
		quantityTF.setColumns(10);
		
		lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(20, 215, 79, 14);
		contentPane.add(lblQuantity);
		
		countryFromCB = new JComboBox<String>();
		countryFromCB.setBounds(116, 156, 86, 17);
		countryFromCB.addItem("Any");
		countryFromCB.addItem("Ireland");
		countryFromCB.addItem("EU");
		countryFromCB.addItem("USA");
		countryFromCB.addItem("China");
		contentPane.add(countryFromCB);
		
		countryToCB = new JComboBox<String>();
		countryToCB.setBounds(116, 181, 86, 20);
		countryToCB.addItem("Any");
		countryToCB.addItem("Ireland");
		countryToCB.addItem("EU");
		countryToCB.addItem("USA");
		countryToCB.addItem("China");
		contentPane.add(countryToCB);
		
		
		btnSetPrices = new JButton("Set Prices");
		btnSetPrices.setBounds(10, 290, 96, 23);
		contentPane.add(btnSetPrices);
		btnSetPrices.addActionListener( new SetPricesActionListener());
		
		btnComputeTranscation = new JButton("Compute Transaction");
		btnComputeTranscation.setBounds(10, 240, 192, 36);
		contentPane.add(btnComputeTranscation);
		
		JButton btnGeneratePerformedServices = new JButton("Generate Performed Services");
		btnGeneratePerformedServices.setBounds(20, 26, 182, 23);
		contentPane.add(btnGeneratePerformedServices);
		GenerateServicesListener G= new GenerateServicesListener(c,typeCB,countryFromCB,countryToCB,minDurationTF,maxDurationTF,quantityTF, table);
		btnGeneratePerformedServices.addActionListener(G);
		
	}


	public Control getC() {
		return c;
	}


	public void setC(Control c) {
		this.c = c;
	}
}
