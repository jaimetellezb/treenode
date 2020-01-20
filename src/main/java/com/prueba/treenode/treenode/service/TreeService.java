package com.prueba.treenode.treenode.service;


import com.prueba.treenode.treenode.util.RequestNode;
import com.prueba.treenode.treenode.util.ResponseNode;

/**
 * Interfaz que de la implementación de los métodos de árbol binario
 *
 * @author jaime tellez
 */
public interface TreeService {

    /**
     * método que se encarga de crear un árbol
     *
     * @param requestNode objecto donde se envía la lista de nodos a crear
     */
    void createNode(RequestNode requestNode);

	/**
	 * método que obtiene el ancestro en común más cercano de dos nodos ingresados
	 *
	 * @param node1 nodo1 a evaluar
	 * @param node2 nodo2 a evaluar
	 * @param requestNode objeto que contiene el árbol
	 * @return objeto con el ancestro común más cercano
	 */
    ResponseNode lowestCommonAncestor(int node1, int node2, RequestNode requestNode);

}
