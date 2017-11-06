package gui;
/**
 * @author Lucian Epure 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import control.Configuration;
import control.Control;
import service.Call;
import service.InternetUsage;
import service.Message;
import service.Service;

public class GenerateServicesListener implements ActionListener{

	
	private JTextField min;
	private JTextField max;
	private JTextField quantity;
	private JComboBox<String> type;
	private JComboBox<String> from;
	private JComboBox<String> to;
	private JTable table;
	private Control c;
	public GenerateServicesListener(Control c, JComboBox<String> t, JComboBox<String> from, JComboBox<String> to, JTextField min, JTextField max, JTextField quantity,JTable table){
		this.c=c;
		this.type=t;
		this.from=from;
		this.to=to;
		this.min=min;
		this.max=max;
		this.quantity=quantity;
		this.table=table;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		Configuration config= new Configuration((String)type.getSelectedItem(),(String)from.getSelectedItem(),(String)to.getSelectedItem(),min.getText(),max.getText(),quantity.getText());
		c.generateServices(config);
		
		
		DefaultTableModel model= (DefaultTableModel) table.getModel();
		for(Service s: c.getServices())
		{
			
				model.addRow(new Object[]{ s.getClass().getSimpleName(),s.getNumber(),s.getLocationFrom().getName(),s.getValue() , "Not yet"});
			
			

			}
		}
		
			
		
		

}

