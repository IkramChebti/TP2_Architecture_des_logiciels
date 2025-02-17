import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	
	private IEtudiantRep EtudRep;
    private IUniversiteRep UnivRep;
    private IJournal journal;
	public EtudiantService(IEtudiantRep EtudRep, IUniversiteRep UnivRep,IJournal journal) {
		this.EtudRep = EtudRep;
		this.UnivRep = UnivRep;
		this.journal = journal;
	}

	public boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	
	{
		IEtudiantRep EtudRep= new EtudiantRepository();
	    IUniversiteRep UnivRep= new UniversiteRepository();
	    Etudiant stud = new Etudiant(matricule, nom, pr�nom, email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    
	    System.out.println("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
		
		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }                           
	     
		 EtudRep.add(stud);
		 System.out.println("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
		 return true;	
	}
	
	public void AjouterBonus() throws SQLException, IOException {
		ArrayList<Etudiant> lesetudiants =  GetEtudiantParUniversite();
		for( Etudiant n :lesetudians) {
			n.Bonus(UnivRep.nbrLivreBonus(n.getId_universite()));
		}
		}
	

public ArrayList<Etudiant> GetEtudiantParUniversite()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}

