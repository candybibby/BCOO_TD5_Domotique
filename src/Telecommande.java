
import java.util.*;

/**
 * 
 * @author d'un Anonyme ^^
 *
 */
public class Telecommande {

	
			// ATTRIBUTS
	
	private List<Lampe> lampe;
	
	
	
			// CONSTRUCTEUR
	
	public Telecommande() {
		lampe = new ArrayList<Lampe>();
		// TODO Auto-generated constructor stub
	}
	
	
			// METHODES 
	
	
	public void ajouterLampe(Lampe l){
		
	}
	
	
	public void activerLampe (int indiceLampe){
		this.lampe.get(indiceLampe).allumer();
		
	}
	
	
	public void desactiverLampe (int indiceLampe){
		this.lampe.get(indiceLampe).eteindre();
	}

	
	public void activerTout(){
		
	}
	
	
	public String toString(){
		return "";
	
	}
	
	
	public Lampe getLampe(int indiceLampe){
		return this.lampe.get(indiceLampe);
	}
	
	
}

