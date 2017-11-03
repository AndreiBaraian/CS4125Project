package gui;
/**
 * @author Lucian Epure 
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class SetPrices extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField previousTFCaller;
	private JTextField newTFCaller;
	private JButton btnSet;
	private JLabel lblServiceType;
	private JComboBox<String> serviceTypeCB;
	private JComboBox<String> countryCB;
	private JLabel lblNew;
	private JLabel lblPrevious;
	private JLabel lblCountry;
	private JTextField previousTFReciever;
	private JTextField newTFReciever;

	/**
	 * Create the frame.
	 */
	public SetPrices() {
		setTitle("Set Prices");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCountry = new JLabel("Country");
		lblCountry.setBounds(10, 30, 46, 14);
		contentPane.add(lblCountry);

		
		lblPrevious = new JLabel("Previous");
		lblPrevious.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrevious.setBounds(160, 153, 84, 14);
		contentPane.add(lblPrevious);
		
		previousTFCaller = new JTextField();
		previousTFCaller.setBounds(23, 150, 92, 20);
		contentPane.add(previousTFCaller);
		previousTFCaller.setColumns(10);
		
		lblNew = new JLabel("New");
		lblNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblNew.setBounds(160, 178, 84, 14);
		contentPane.add(lblNew);
		
		newTFCaller = new JTextField();
		newTFCaller.setBounds(23, 175, 92, 20);
		contentPane.add(newTFCaller);
		newTFCaller.setColumns(10);
		
		lblServiceType = new JLabel("Service Type");
		lblServiceType.setBounds(10, 61, 84, 14);
		contentPane.add(lblServiceType);
		
		
		countryCB = new JComboBox<String>();
		countryCB.setBounds(121, 27, 237, 20);
		countryCB.addItem("Ireland");
		countryCB.addItem("EU");
		countryCB.addItem("USA");
		countryCB.addItem("China");
		countryCB.addItem("Russia");
		countryCB.addItem("Australia");
		contentPane.add(countryCB);
		
		
		serviceTypeCB = new JComboBox<String>();
		serviceTypeCB.setBounds(121, 58, 237, 20);
		serviceTypeCB.addItem("Call");
		serviceTypeCB.addItem("Message");
		serviceTypeCB.addItem("Internet");
		contentPane.add(serviceTypeCB);
		
		btnSet = new JButton("Set");
		btnSet.setBounds(155, 203, 89, 23);
		contentPane.add(btnSet);
		
		JLabel lblCaller = new JLabel("Caller");
		lblCaller.setBounds(54, 118, 46, 14);
		contentPane.add(lblCaller);
		
		JLabel lblReciever = new JLabel("Reciever");
		lblReciever.setBounds(286, 118, 72, 14);
		contentPane.add(lblReciever);
		
		previousTFReciever = new JTextField();
		previousTFReciever.setBounds(272, 150, 86, 20);
		contentPane.add(previousTFReciever);
		previousTFReciever.setColumns(10);
		
		newTFReciever = new JTextField();
		newTFReciever.setBounds(272, 175, 86, 20);
		contentPane.add(newTFReciever);
		newTFReciever.setColumns(10);
	}
}
