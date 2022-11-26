import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DateMsg implements IJournal {

	@Override
	
	public String outPut_Msg(String message) throws IOException{
		
		SimpleDateFormat  sdf = new SimpleDateFormat("'Le : 'dd.MM.yyyy' Heure : ' HH:mm:ss");
        String currentDateandTime = sdf.format(new Date());
        StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
        String callerClass = ste.getClassName();
        //System.out.println(message +" "+ currentDateandTime +" depuis la  classe :"+ callerClass);
        return message +" "+ currentDateandTime +" depuis la  classe :"+ callerClass;
	}
}
