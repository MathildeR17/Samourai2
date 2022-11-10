package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}

	/**
	 * @return the clan
	 */
	public String getClan() {
		return clan;
	}

	/**
	 * @return the reputation
	 */
	public int getReputation() {
		return reputation;
	}

	/*Il peut extorquer un commerçant : 
	 * il prend tout l’argent du commerçant, 
	 * gagne un point de réputation 
	 * annonce ce qu’il vient de faire
	*/
	public void extorquer(Commercant commercant) {
		gagnerArgent(commercant.getArgent());
		this.reputation += 1;
		parler("Je viens d'extorquer un commercant et de gagner 1 point de réputation.");
	}
	
	/* il gagne en réputation 
	 * crie sa victoire.
	 */
	public void gagner() {
		this.reputation += 1;
		parler("J'ai gagné le duel face au ronin!!");
	}
	
	/*S’il perd dans un duel l’opposant à un ronin, 
	 * il perd tout son argent, 
	 * perd un point de réputation, 
	 * annonce sa défaite
	 * */
	public int perdre() {
		perdreArgent(getArgent());
		this.reputation -= 1;
		parler("J'ai perdu le duel face au ronin...");
		
		return getArgent();
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("je suis fier de faire partie du clan " + getClan() + "!");
	}
	
}
