
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public abstract class ViewInscriptionAbstraite  {
	
	ArrayList<ActionListener> list = new ArrayList<ActionListener>();
	 
		
	public void notifyObserver(JButton Button) {
		for(ActionListener list : list) {
			Button.addActionListener(list);
		}
	}
		
		
	public abstract boolean Entrees_Enregistres();
	public abstract int getMatricule();
	public abstract String getPrenom();
	public abstract String getNom();
	public abstract String getMail();
	public abstract String getPassword();
	public abstract int getUniv();	
	public abstract void Actualiser();
	public abstract void displayErrorMessage(String string);
	public abstract JButton getButton();
	
}
