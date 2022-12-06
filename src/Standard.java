
public class Standard extends Package {

	public Standard(TypePackage nom_Tpack) {
		super(nom_Tpack);
	}

	@Override
	public int getNbrLivreAutorise() {
		return 10;
	}

	@Override
	public int getNbrLivreBonus() {
		return 5;
	}


}
