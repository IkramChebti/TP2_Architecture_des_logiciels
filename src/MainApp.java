import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		try {
			
			OutputFonction c = new OutputFonction();
			IJournal journal1 = new AfficherMsgEcran();
			IJournal journal2 = new AfficherMsgFichier();
			IJournal journal3 = new DateMsg();
			c.ajouter(journal1);
			c.ajouter(journal2);
			c.ajouter(journal3);

			IDBConnection db = DBConnection.getInstance();
			IEtudiantRep EtudRep= new EtudiantRepository(db,c);
		    IUniversiteRep UnivRep= new UniversiteRepository(db,c);
			EtudiantService serv=new EtudiantService(EtudRep,UnivRep,c);
			

		    serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
