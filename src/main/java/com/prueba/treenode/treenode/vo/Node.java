package com.prueba.treenode.treenode.vo;

import java.io.Serializable;

/**
 * Clase nodo que contiene sus propiedades más importantes
 *
 * @author jaime tellez
 */
public class Node implements Serializable {
    public Node father;
    public Node left;
    public Node right;

    public int key;

    public Node(int index) {
        key = index;
        left = null;
        right = null;
        father = null;
    }
}

