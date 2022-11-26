import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AfficherMsgFichier implements IJournal {

	public void outPut_Msg(String message) {
		
			File fichier = new File("C:\\Users\\micro\\Documents\\ikram\\mi\\MasterISII\\M1ISII\\TP-ARCHI-LOG\\Journal.txt");
		   if (!fichier.exists()) {
		    fichier.createNewFile();	
	        }
		
		   FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
		   BufferedWriter bw = new BufferedWriter(fw);
		   bw.write(message);
		   bw.newLine();
		   bw.close();
	}

}
