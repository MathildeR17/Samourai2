package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, argent, "the");
	}

	public int seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("Tout le monde est vraiment trop injuste");
		
		return getArgent();
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
	}
}
