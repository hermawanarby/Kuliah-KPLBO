package uas;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI193040161 extends JFrame {
	private JLabel lblNama;
	private JLabel lblProdi;
	private JTextField txtNama;
	private JComboBox<String> cmbProdi;
	private JPanel p;
	
	public UI193040161() {
		lblNama = new JLabel();
		lblProdi = new JLabel();
		txtNama = new JTextField();
		cmbProdi = new JComboBox<String>();
		p = new JPanel();
		
		lblNama.setText("Nama : ");
		txtNama.setColumns(30);
		
		lblProdi.setText("Prodi : ");
		cmbProdi.addItem("Pilih Prodi");
		cmbProdi.addItem("TI");
		cmbProdi.addItem("TP");
		cmbProdi.addItem("MS");
		cmbProdi.addItem("IF");
		cmbProdi.addItem("TL");
		cmbProdi.addItem("PWK");
		
		p.add(lblNama);
		p.add(txtNama);
		p.add(lblProdi);
		p.add(cmbProdi);
		
		this.add(p);
		
		this.setLayout(new FlowLayout());
		
	}
	
	public static void main(String[] args) {
		UI193040161 ui = new UI193040161();
		ui.setSize(700, 100);
		ui.setVisible(true);
	}
}
