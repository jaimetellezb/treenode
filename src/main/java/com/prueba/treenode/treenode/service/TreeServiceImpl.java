package com.prueba.treenode.treenode.service;

import com.prueba.treenode.treenode.util.RequestNode;
import com.prueba.treenode.treenode.util.ResponseNode;
import com.prueba.treenode.treenode.vo.Tree;
import org.springframework.stereotype.Service;

/**
 * Clase que implementa la interfaz TreeService
 *
 * @author jaime tellez
 */
@Service
public class TreeServiceImpl implements TreeService {

    /**
     * Método que se encarga de realizar la implementación de la creación
     * del árbol binario
     *
     * @param requestNode árbol binario
     */
    public void createNode(RequestNode requestNode) {
        Tree tree = new Tree();
        for (int node : requestNode.getTree()) {
            tree.addNode(node);
        }
    }

    /**
     * Método que contiene la implementación de la búsqueda del ancestro común más cercano
     * entre 2 nodos
     *
     * @param node1       nodo1 a evaluar
     * @param node2       nodo2 a evaluar
     * @param requestNode objeto  con el árbol binario
     * @return ancestro
     */
    public ResponseNode lowestCommonAncestor(int node1, int node2, RequestNode requestNode) {
        Tree tree = new Tree();
        for (int node : requestNode.getTree()) {
            tree.addNode(node);
        }
        return new ResponseNode(tree.lowestCommonAncestor(tree, node1, node2));
    }
}
