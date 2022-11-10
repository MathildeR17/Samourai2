package histoire;
import personnages.Humain;

public class MonHistoire {

	public static void main(String[] args) {
		Humain h = new Humain("Mathilde", 100, "thé");
		h.direBonjour();
		h.parler("j'ai " + h.getArgent());
		h.gagnerArgent(40);
		h.parler("j'ai " + h.getArgent());
		h.perdreArgent(20);
		h.parler("j'ai " + h.getArgent());
		h.boire();

	}

}
