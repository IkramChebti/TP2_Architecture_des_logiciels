
public class Premium extends Package {

	public Premium(TypePackage nom_Tpack) {
		super(nom_Tpack);
	}

	@Override
	public int getNbrLivreAutorise() {
		return 20;
	}

	@Override
	public int getNbrLivreBonus() {

		return 10;
	}


}
