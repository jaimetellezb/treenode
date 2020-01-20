package com.prueba.treenode.treenode.util;

/**
 * Clase que contiene el objeto response de la petición
 *
 * @author jaime tellez
 */
public class ResponseNode {
    private int ancestor;

    public ResponseNode(int ancestor) {
        this.ancestor = ancestor;
    }

    public int getAncestor() {
        return ancestor;
    }

    public void setAncestor(int ancestor) {
        this.ancestor = ancestor;
    }
}
