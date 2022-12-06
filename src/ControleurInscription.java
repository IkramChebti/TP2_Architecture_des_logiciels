
	import java.awt.Button;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.IOException;
	import java.sql.SQLException;

	import javax.swing.JButton;

	import Etudiant;
	import EtudiantService;
	import IEtudiant;

	public class ControleurInscription implements ActionListener {
		
		private EtudiantService EtudiantService;
		
		public ControleurInscription(ViewInscription View,EtudiantService EtudiantService) {
			this.View = View;
			this.EtudiantService = EtudiantService;
		}
		
		protected void finalize() {
			View.unregistre(this);
		}
		@Override
		public void actionPerformed(ActionEvent Etudiant) {
			if (Etudiant.getSource() == View.getButton()) {
			if(View.Entrees_Enregistres()) {
				int matricule = View.getMat();
				String nom =View.getNom();
				String prenom = View.getPrenom();
				String email =View.getMail();
				String password = View.getPassword();
				int ID_Univ = View.getUniv();
				IEtudiant Etudiant = new Etudiant(matricule,nom,prenom,email,password,ID_Univ);
				try {
					if(EtudiantService.inscription(Etudiant)) {
						View.Actualiser();
					}else {
						View.displayErrorMessage("Erreur");
					}				
				} catch (SQLException e1) {
					Etud.printStackTrace();
				} catch (IOException e1) {
					Etud.printStackTrace();
				}
				}
			}
			if (Etudiant.getSource() == View.getButton()) { 
			    View.Actualiser();
			}
				
		}
		
}
