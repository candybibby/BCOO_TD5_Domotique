/**
 * 
 * @author Le fantome de l'IUT
 *
 */
public class Lampe {

	
	
	
				// ATTIBUTES
	
	private String nom;
	
	private boolean allume;
	
	private static int nbEtape = 0;

	
	
	
				// CONSTRUCTORS
	
	/**
	 * 
	 * @param s
	 */
	public Lampe(String s) {
		if ( s.equals(" ")  )
			s = "lampe";
		this.nom = s;
		this.allume = false;
		// TODO Auto-generated constructor stub
	}

	
	
				// METHODS
	
	/**
	 * 
	 */
	public void allumer(){
		this.allume = true;
	}
	
	
	/**
	 * 
	 */
	public void eteindre(){
		this.allume = false;;
	}
	
	
	/**
	 * 
	 */
	public String toString(){
		String etat = "Off";
		if (this.isAllume())
			etat = "On";
		return (nbEtape + "-" + this.getNom() + "  : " + etat);
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isAllume(){
		return this.allume;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getNom(){
		return this.nom;
	}
	

	
}
