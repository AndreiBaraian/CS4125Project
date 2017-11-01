package gui;

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
	private JTable promotions;
	private JScrollPane promotionsH;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ApplyPromotion() {
		setTitle("Apply Promotion");
		setBounds(100, 100, 450, 174);
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
		promotions = new JTable(promotionModel);
		promotions.setBounds(231, 15, 388, 246);
		
		promotionsH = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		promotionsH.setViewportView(promotions);
		promotionsH.setBounds(215, 11, 188, 110);
		contentPane.add(promotionsH);
		
		
		
		
		JLabel lblPromotion = new JLabel("Promotion");
		lblPromotion.setBounds(10, 39, 91, 14);
		contentPane.add(lblPromotion);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(57, 98, 89, 23);
		contentPane.add(btnConfirm);
	}
}
