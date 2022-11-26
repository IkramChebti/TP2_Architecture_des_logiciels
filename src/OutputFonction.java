import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class OutputFonction implements IJournal {
	private List<IJournal> journals = new ArrayList<IJournal>();
	@Override
	public void outPut_Msg(String message) throws IOException {
		DateMsg s = new DateMsg();
		String MessageAvecInfos =s.outPut_Msg(message);
		for(IJournal i: journals) {
			i.outPut_Msg(MessageAvecInfos);
		}
	}
	 public void ajouter(IJournal journal){
			journals.add(journal);
		}
	
	
}
