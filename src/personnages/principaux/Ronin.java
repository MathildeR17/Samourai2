package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}
	
	public void donner(int n, Commercant c) {
		perdreArgent(n);
		c.gagnerArgent(n);
	}
	
	/*Si le double de l’honneur du ronin est plus grand que la réputation du yakuza,
	 * le ronin gagne : 
	 * 		il prend l’argent du yakuza, 
	 * 		gagne en honneur 
	 * 		annonce sa victoire. 
	 * S’il perd : 
	 * 		on décrémente son compteur honneur, 
	 * 		il râle à cause de sa défaite. 
	 * En cas de victoire on fait appel à la méthode perdre du yakuza 
	 * en cas de défaite on fait appel à la méthode gagner du yakuza.

	 * */
	public void provoquer(Yakuza y) {
		int honor = 2*honneur;
		int reputation = y.getReputation();
		
		if (honor>reputation) {
			gagnerArgent(y.getArgent());
			this.honneur += 1;
			y.perdre();
			parler("J'ai gagné le duel face au Yakuza!!");
		}
		else {
			this.honneur -= 1;
			y.gagner();
			parler("Pff... j'ai perdu face au Yakuza");
		}
	}

}
