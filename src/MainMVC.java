import java.sql.SQLException;



public class MainMVC {

	public static void main(String[] args) throws SQLException {
		OutPutFonction c = new OutPutFonction();
		IJournal journal1 = new AfficherMsgEcran();
		IJournal journal2 = new AfficherMsgFichier();
		IJournal journal3 = new DateMsg();
		c.ajouter(journal1);
		c.ajouter(journal2);
		c.ajouter(journal3);
		
		IDBConnection db = DBConnection.getInstance();
		IEtudiantRep EtudRep= new EtudiantRepository();
	    IUniversiteRep UnivRep= new UniversiteRepository();
		EtudiantService serv=new EtudiantService (EtudRep,UnivRep,c);
	
		ViewInscriptionAbstraite Av = new ViewInscription();
		ControleurInscription d = new ControleurInscription(Av, serv);

	}
}
