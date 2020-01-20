package com.prueba.treenode.treenode.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene los atributos y métodos del árbol
 *
 * @author jaime tellez
 */
public class Tree implements Serializable {

    public Node root;

    public Tree() {
        root = null;
    }

    /**
     * método encargado de agregar los nodos al árbol
     *
     * @param index identificador del nodo a agregar
     */
    public void addNode(int index) {
        Node n = new Node(index);

        if (root == null) {
            root = n;
        } else {
            Node aux = root;

            while (aux != null) {
                n.father = aux;

                if (n.key < aux.key) {
                    aux = aux.right;
                    if (aux == null) {
                        n.father.right = n;
                    }
                } else {
                    aux = aux.left;
                    if (aux == null) {
                        n.father.left = n;
                    }
                }
            }
        }
    }

    /**
     * Método encargado de calcular cual dado dos nodos cual es el ancestro común
     * más cercano
     *
     * @param tree  árbol a recorrer
     * @param node1 nodo 1 a evaluar
     * @param node2 nodo 2 a evaluar
     */
    public Integer lowestCommonAncestor(Tree tree, int node1, int node2) {
        Integer response = null;
        if (tree != null && tree.root != null) {
            List<Integer> auxListNode1 = new ArrayList<>();
            searchAncestors(node1, tree.root, auxListNode1);

            List<Integer> auxListNode2 = new ArrayList<>();
            searchAncestors(node2, tree.root, auxListNode2);

            for (int item : auxListNode1) {
                if (auxListNode2.contains(item)) {
                    System.out.println("Ancestro común más cercano " + item);
                    response = item;
                    break;
                }
            }
        }
        return response;
    }

    /**
     * método encargado de buscar los ancestros de un nodo
     *
     * @param node nodo a buscar
     * @param root nodo raiz
     * @param list lista de ancestros
     */
    public void searchAncestors(int node, Node root, List<Integer> list) {
        Node aux = searchNode(node, root);

        if (aux != null && aux.father != null) {
            list.add(aux.father.key);
            searchAncestors(aux.father.key, root, list);
        }
    }

    /**
     * método encargado de buscar un nodo dentro del árbol
     *
     * @param nodo nodo a buscar
     * @param root nodo raiz
     * @return nodo encontrado
     */
    public Node searchNode(int nodo, Node root) {
        Node aux = root;

        while (aux.key != nodo) {
            if (nodo < aux.key) {
                aux = aux.right;
            } else {
                aux = aux.left;
            }

            if (aux == null) {
                System.out.println("Nodo " + nodo + " no existe en el árbol");
                return null;
            }
        }
        return aux;
    }


}
