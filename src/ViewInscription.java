
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import controleur.ViewInscriptionAbstraite;


public class ViewInscription extends ViewInscriptionAbstraite {

	
		private JTextField matricule = new JTextField(10);
		private JTextField nom = new JTextField();
		private JTextField Prenom = new JTextField();
		private JTextField Email = new JTextField();
		private JTextField password = new JTextField();
		private JTextField universite = new JTextField();
		private JButton Button;
		
		public ViewInscription() {
			JLabel Titre = new JLabel("Inscription");
			Titre.setForeground(Color.getHSBColor(300, 225, 100));
			JPanel pan = new JPanel ();
			pan.setBackground(Color.getHSBColor(99, 87, 36));
			pan.setLayout(null);
			Titre.setBounds(88, 0, 380, 47);
			Font font1 = new Font ("Garamond", Font.BOLD, 23);
			Titre.setFont(font1);
			pan.add(Titre);
			JLabel mat = new JLabel("Matricule :");
			mat.setBounds(44, 45, 100, 28);
			pan.add(mat);
			matricule.setBounds(120, 48, 180, 28);
			pan.add(matricule);
			
			JLabel labnom = new JLabel("Nom :");
			labnom.setBounds(45, 110, 100, 28);
			pan.add(labnom);
			nom.setBounds(120, 48, 177, 28);
			pan.add(nom);
			
			JLabel labprenom = new JLabel("Prenom :");
			labprenom.setBounds(44, 120, 100, 26);
			pan.add(labprenom);
			Prenom.setBounds(113, 130, 177, 28);
			pan.add(Prenom);
			
			JLabel labEmail = new JLabel("Email :");
			labEmail.setBounds(45, 130, 100, 28);
			pan.add(labEmail);
			Email.setBounds(113, 133, 177, 29);
			pan.add(Email);
			
			JLabel passwordL = new JLabel ("Password :");
			passwordL.setBounds(44, 130, 110, 29);
			pan.add(passwordL);
			password.setBounds(113, 133, 177, 28);
			pan.add(password);
			
			JLabel univL = new JLabel ("Universite:");
			univL.setBounds(50, 200, 100, 28);
			pan.add(univL);
			universite.setBounds(112, 200, 180, 28);
			pan.add(universite);
			
			Button = new JButton("Enregister");
			Button.setBounds(112, 190, 100, 29);
			pan.add(Button);
			
			JFrame j = new JFrame();
			j.getContentPane().add(pan);
			j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			j.setTitle("Inscription");
			j.setSize(330, 330);
			j.setVisible(true);
		}
		
		public int getMatricule() {
			return Integer.parseInt(matricule.getText());
		}
		
		public String getNom() {
			return nom.getText();
		}
		public String getPrenom() {
			return Prenom.getText();
		}
		
		public String getMail() {
			return Email.getText();
		}
		
		public String getPassword() {
			return password.getText();
		}
		
		public int getUniv() {
			return Integer.parseInt(universite.getText());
		}
		public JButton getButton() {
			return Button;
		}
		
		
	
		}




