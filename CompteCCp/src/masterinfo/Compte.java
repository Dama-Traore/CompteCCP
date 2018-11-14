package masterinfo;

public class Compte {
	public Compte() {}
	
	public String proprietaire;
	public float montantinitial;
	public int numero;
	
	public Compte (String propritaire, int numero,float montantinitial) {
		
		this.proprietaire=proprietaire;
		
		this.numero= numero;
		this.montantinitial = montantinitial;
	}
	
	
public void debiter(int numero, float montant) {
	
	if (montantinitial>= montant) {
	montantinitial = montantinitial-montant;
	System.out.println("Operation reussie\n votre solde actuelle est "+ montant);
}
	else
		System.out.println("solde insuffisant\n echec");
}

}
