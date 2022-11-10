package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}
	public void gagnerArgent(int n) {
		this.argent += n;
	}
	public void perdreArgent(int n) {
		this.argent -= n;
	}
	public void parler(String msg) {
		String s = "";
		s += " -(" + this.nom + ") - ";
		s += msg;
		System.out.println(s);
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + getNom() + " et j'aime boire du " + getBoisson());
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + getBoisson() + "! GLOUPS!");
	}

	
}
