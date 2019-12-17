package tp2.graphe;

import java.util.ArrayList;

/**
* Description de la classe
* @author
* @version 
*/

public class Graphe{

	/**
	* Description des attributs
	*/

	private ArrayList<Sommet> sommets;
	private ArrayList<Arete> aretes;

	public Graphe(){
		this.sommets = new ArrayList<Sommet>();
		this.aretes = new ArrayList<Arete>();
	}

	public Graphe(ArrayList<Sommet> sommets, ArrayList<Arete> aretes){
		this.sommets = sommets;
		this.aretes = aretes;
	}

}