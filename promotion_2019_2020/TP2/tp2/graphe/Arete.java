package tp2.graphe;

/**
* Classe représentant une arête valuée et orientée d'un graphe
* @author
* @version 
*/

public class Arete{

	/**
    * La valeur du poids de l'arête
    * 
    * @see Arete#setValeur(int)
    * @see Arete#getValeur()
    */
	private int valeur;

	/**
    * Le sommet origine de l'arête
    * 
    * @see Arete#setOrigine(Sommet)
    * @see Arete#getOrigine()
    */
	private Sommet origine;

	/**
    * Le sommet destination de l'arête
    * 
    * @see Arete#setDestination(Sommet)
    * @see Arete#getDestination()
    */
	private Sommet destination;


	/**
    * Constructeur Arête.
    * <p>
    * A la construction d'un objet Arête "vide", la valeur du poids est fixée à -1,
    * ce qui correspond à une arête qui n'existe pas. De plus, les sommets d'origine et de destination
    * sont fixés à null 
    * </p>
    * 
    * @see Arete#Arete(int, Sommet, Sommet)
    */

	public Arete(){
		this.valeur = -1;
		this.origine = null;
		this.destination = null;
	}


	/**
    * Constructeur Arête.
    * <p>
    * Les attributs de l'arête peuvent être initialisés à la création de l'objet Arête 
    * </p>
    *
    * @param valeur valeur du poids de l'arête
    * @param origine sommet origine de l'arête
    * @param destination sommet destination de l'arête 
    *
    * @see Arete#valeur
    * @see Arete#origine
    * @see Arete#destination
    * @see Arete#Arete(int, Sommet, Sommet)
    */
	public Arete(int valeur, Sommet origine, Sommet destination){
		this.valeur = valeur;
		this.origine = origine;
		this.destination = destination;
	}	

	/**
    * Retourne la valeur du poids de l'arête
    * @return valeur du poids de l'arête
	* @see Arete#valeur
    */
	public int getValeur(){
		return this.valeur;
	}

	/**
    * Retourne le Sommet origine de l'arête
    * @return objet Sommet origine
	* @see Arete#origine
    */
	public Sommet getOrigine(){
		return this.origine;
	}

	/**
    * Retourne le Sommet destination de l'arête
    * @return objet Sommet destination
	* @see Arete#destination
    */
	public Sommet getDestination(){
		return this.destination;
	}

	/**
    * Modifie la valeur du poids de l'arête
    * @param valeur La nouvelle valeur du poids de l'arête
	* @see Arete#valeur
    */
	public void setValeur(int valeur){
		this.valeur = valeur;
	}

	/**
    * Met à jour le Sommet d'origine de l'arête
    * @param origine Nouveau Sommet d'origine
	* @see Arete#origine
    */
	public void setOrigine(Sommet origine){
		this.origine = origine;
	}

	/**
    * Met à jour le Sommet de destination de l'arête
    * @param destination Nouveau Sommet de destination
	* @see Arete#destination
    */
	public void setDestination(Sommet destination){
		this.destination = destination;
	}
}