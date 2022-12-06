
public class ClasseAbstract extends AbstractFct{

	@Override
	public Package getPackage(TypePackage typePackage) {
		 
		if(typePackage.equals(TypePackage.Standard)){
			return new Standard(null);
		}else {
			return new Premium(null);
		}
		
	}


}
