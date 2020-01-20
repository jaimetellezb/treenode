package com.prueba.treenode.treenode.controller;

import com.prueba.treenode.treenode.service.TreeService;
import com.prueba.treenode.treenode.util.RequestNode;
import com.prueba.treenode.treenode.util.ResponseNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Clase controllador que se encarga de exponer los servicios REST
 *
 * @author jaime tellez
 */
@RestController
@RequestMapping("/api/v1")
public class TreeController {

    @Autowired /* Inyectar TreeService*/
    private TreeService treeService;

    /**
     * Servicio Web Rest que se encarga de consultar el ancestro común más cercano
     *
     * @param node1
     * @param node2
     * @param requestNode
     * @return
     */
    @GetMapping(value = "/nodes/node1={node1}node2={node2}")
    public ResponseEntity<ResponseNode> lowestCommonAncestor(@PathVariable(value = "node1") int node1,
                                                             @PathVariable(value = "node2") int node2,
                                                             @RequestBody RequestNode requestNode) {
        ResponseNode node = treeService.lowestCommonAncestor(node1, node2, requestNode);
        return ResponseEntity.ok().body(node);
    }

    /**
     * servicio Web encargado de crear un árbol binario
     *
     * @param requestNode
     * @return mensaje de éxito
     */
    @PostMapping(value = "/nodes")
    public ResponseEntity<String> createNode(@RequestBody RequestNode requestNode) {
        treeService.createNode(requestNode);
        return ResponseEntity.ok().body("el árbol se creó exitosamente");
    }

}
