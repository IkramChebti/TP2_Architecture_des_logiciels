import java.sql.SQLException;

public interface IUniversiteRep {

	public Universite GetById(int universityId) throws SQLException;
}
