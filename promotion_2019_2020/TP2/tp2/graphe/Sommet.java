package tp2.graphe;

import java.util.ArrayList;

/**
* Classe représentant un sommet d'un graphe
* @author
* @version 
*/
public class Sommet{

	/**
    * Le nom attribué au sommet
    * 
    * @see Sommet#setNom(String)
    * @see Sommet#getNom()
    */
	private String nom;

	/**
    * Valeur booléenne qui détermine si le sommet est marqué ou pas
    * 
    * @see Sommet#setMarque(boolean)
    * @see Sommet#getMarque()
    */
	private boolean marque;

	/**
    * Liste des arêtes reliées au sommet
    * 
    * @see Sommet#ajouterArete(Arete)
    * @see Sommet#getArete()
    */
	private ArrayList<Arete> aretes;

	/**
    * Constructeur Sommet.
    * <p>
    * A la construction d'un objet Sommet, un nom et une valeur de marquage lui sont initialement attribués. 
    * La liste des arêtes qui lui sont attachées est vide
    * </p>
    * 
    * @param nom initiation du nom du sommet
    * @param marque valeur initiale de marquage du sommet
    * @see Sommet#Sommet(String)
    * @see Sommet#nom
    * @see Sommet#marque
    */
	public Sommet(String nom, boolean marque){
		this.nom = nom;
		this.marque = marque;
		this.aretes = new ArrayList<Arete>();
	}

	/**
    * Constructeur Sommet.
    * <p>
    * Créer un Sommet non marqué et ne possédant aucune arête.
    * </p>
    * 
    * @param nom initiation du nom du sommet
    * @see Sommet#Sommet(String, boolean)
    * @see Sommet#nom
    */
	public Sommet(String nom){
		this.nom = nom;
		this.marque = false;
		this.aretes = new ArrayList<Arete>();
	}


	/**
    * Retourne le nom du Sommet
    * @return valeur du nom
	* @see Sommet#nom
    */
	public String getNom(){
		return this.nom;
	}

	/**
    * Retourne vrai si le sommet est marqué, faux sinon.
    * @return valeur du marquage
	* @see Sommet#marque
    */
	public boolean getMarque(){
		return this.marque;
	}

	/**
    * Retourne la liste des arêtes attachées au Sommet
    * @return liste des arêtes
	* @see Sommet#aretes
    */
	public ArrayList<Arete> getAretes(){
		return this.aretes;
	}

	/**
    * Met à jour le nom du Sommet
    * @param nom nouveau nom à attribuer au Sommet
	* @see Sommet#nom
    */
	public void setNom(String nom){
		this.nom = nom;
	}


	/**
    * Modifie le marquage du Sommet
    * @param marque valeur booléenne de marquage
	* @see Sommet#marque
    */
	public void setMarque(boolean marque){
		this.marque = marque;
	}

	/**
    * Ajouter une nouvelle Arête au Sommet
    * @param arete nouvelle arête à ajouter
	* @see Sommet#aretes
    */
	public void ajouterArete(Arete arete){
		this.aretes.add(arete);
	}

	
}