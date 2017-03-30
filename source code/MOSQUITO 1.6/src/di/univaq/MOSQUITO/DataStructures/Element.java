package di.univaq.MOSQUITO.DataStructures;

import java.util.Vector;

public interface Element {

	/**
	 * Imposta gli id del file xml che indicano le connessioni
	 * in ingresso al corrente elemento (nell'xml tale id si trova sotto
	 * l'attributo targetConnections del nodo children).
	 * 
	 * @param target gli id di ingresso dell'elemento.
	 */
	public void setTargets(String[] target);

	/**
	 * Imposta l'insieme di elmenti figli dell'elemento corrente
	 * (ogni diagramma uml � stato strutturato come un grafo).
	 * 
	 * @param childs i figli del corrente elemento.
	 */
	public void setChildren(Vector childs);

	/**
	 * Restituisce i figli di questo elemento.
	 * 
	 * @return i figli di questo elemento.
	 */
	public Vector getChildren();

	/**
	 * Imposta la posizione del corrente elmento.
	 * 
	 * @param location la locazione dell'elemento
	 * @param size la grandezza dell'elemento
	 */
	public void setLocation(String location, String size);
	
	/**
	 * Inserisce nel vettore childeren i vicini secondo
	 * la rappresentazione a grafo.
	 * 
	 * @param elements gli elementi del vettore.
	 */
	public void loadNeighbours(Vector elements);

}
