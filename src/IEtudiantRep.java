import java.sql.SQLException;


public interface IEtudiantRep {

	public void add(Etudiant E) throws SQLException;
	public boolean Exists(String email) throws SQLException;
	public boolean Exists(int mat) throws SQLException;	
}
