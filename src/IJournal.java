import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;
public interface IJournal {

	public void outPut_Msg(String message) throws IOException;
}
