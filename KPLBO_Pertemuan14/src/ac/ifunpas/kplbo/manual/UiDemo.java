package ac.ifunpas.kplbo.manual;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UiDemo extends JFrame {
	private JLabel lblNama;
	private JTextField txtNama;
	private JComboBox<String> cmbProdi;
	private JButton btnSubmit;
	private JPanel p;
	
	public UiDemo() {
		lblNama = new JLabel();
		txtNama = new JTextField();
		cmbProdi = new JComboBox<String>();
		btnSubmit = new JButton();
		p = new JPanel();
		
		lblNama.setText("Nama : ");
		txtNama.setColumns(30);
		cmbProdi.addItem("Pilih Prodi");
		cmbProdi.addItem("TI");
		cmbProdi.addItem("TP");
		cmbProdi.addItem("MS");
		cmbProdi.addItem("IF");
		cmbProdi.addItem("TL");
		cmbProdi.addItem("PWK");
		
		btnSubmit.setText("Submit");
		
		p.add(lblNama);
		p.add(txtNama);
		p.add(cmbProdi);
		p.add(btnSubmit);
		
		this.add(p);
		
		this.setLayout(new FlowLayout());
		
	}
	
	public static void main(String[] args) {
		UiDemo ui = new UiDemo();
		ui.setSize(700, 100);
		ui.setVisible(true);
	}
}
