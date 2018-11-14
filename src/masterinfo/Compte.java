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
	
	public String getProprietaire() {
		return this.proprietaire;
	}
	
	public void setProprietaire (String proprietaire) {
		this.proprietaire= proprietaire;
	}
	public float getMontantinitial() {
		return this.montantinitial;
	}
	public void setMontantInitial(float m) {
		this.montantinitial= m;
	}
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int i) {
		this.numero=i;
	}
public boolean debiter(Compte c1, float montant) {
	
	if (montantinitial>= montant) {
	float d  = montantinitial-montant;
	c1.setMontantInitial(d);
	return true;}else
return false;
	
}

public boolean transferer(Compte c1, Compte c2, float m) {
	
	if (c1.getMontantinitial()>m)
	{ c1.setMontantInitial(montantinitial-m);
	c2.setMontantInitial(montantinitial+m);
	return true;
	}
	else return false;}



public boolean credit (Compte c1, float c)

{c1.setMontantInitial(montantinitial+c);
	return true;
}
}
