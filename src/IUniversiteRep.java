import java.sql.SQLException;
import java.util.ArrayList;

public interface IUniversiteRep {

	public Universite GetById(int universityId) throws SQLException;
	
}
