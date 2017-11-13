package gui;
/**
 * @author Lucian Epure 
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ApplyPromotion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable availablePromotions;
	private JScrollPane availablePromotionsH;
	private int accountSelectedRow;
	private int accountSelectedCol;
	private JTable accountsTable;

	
	public ApplyPromotion(JTable accountsTable,int selectedRow,int selectedCol) {
		this.accountsTable=accountsTable;
		this.accountSelectedCol=selectedCol;
		this.accountSelectedRow=selectedRow;
		
		String name = accountsTable.getValueAt(0, 4).toString();
		
		setTitle("Apply Promotion");
		setBounds(100, 100, 430, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> applyPromotionCB = new JComboBox<String>();
		applyPromotionCB.setBounds(85, 36, 104, 20);
		contentPane.add(applyPromotionCB);
		applyPromotionCB.addItem("Friend");
		applyPromotionCB.addItem("Surfer");
		applyPromotionCB.addItem("Traveler");
		
		Object[] promotionsColumn = {  "Added Promotions" };

		final DefaultTableModel promotionModel = new DefaultTableModel(promotionsColumn, 0);
		
		final DefaultTableModel availablePromotionsModel = new DefaultTableModel(promotionsColumn, 0);
		availablePromotions = new JTable(availablePromotionsModel);
		availablePromotions.setBounds(231, 15, 388, 246);
		
		availablePromotionsH = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		availablePromotionsH.setViewportView(availablePromotions);
		availablePromotionsH.setBounds(215, 11, 188, 110);
		contentPane.add(availablePromotionsH);
		
		
		
		
		JLabel lblPromotion = new JLabel("Promotion");
		lblPromotion.setBounds(10, 39, 91, 14);
		contentPane.add(lblPromotion);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(57, 98, 89, 23);
		contentPane.add(btnConfirm);
		btnConfirm.addActionListener(new DonePromoting(applyPromotionCB,availablePromotions,accountsTable,accountSelectedRow,accountSelectedCol));
	}
}
