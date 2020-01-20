# treenode
API REST para gestionar un árbol binario

# Desarrollado con las siguientes Tecnologías
Java 1.8
Spring Framework 5
Spring Boot 2

## ejecución de la API REST
1. Se debe ejecutar desde la carpeta raiz el siguiente comando: mvn spring-boot:run
   para subir la aplicación.
   
2. para probar los servicios web REST se debe acceder a la siguiente Ruta por medio de SoapUI, Postman 
   o el de su preferencia:
   
  * Crear árbol binario
  URL: http://localhost:8080/api/v1/nodes 
  Método: POST
  Content-Type: application/json
  Body:  
   {
    "tree": [
          67, 
          76, 
          39, 
          28, 
          44, 
          74,
          85, 
          29, 
          83, 
          87
        ]	
   }
   
   * Dado un árbol binario y dos nodos retornar el ancestro común más cercano
    URL: http://localhost:8080/api/v1/nodes/node1={node1}node2={node2}
    Ejemplo: http://localhost:8080/api/v1/nodes/node1=28node2=44
    Método: GET
    Content-Type: application/json
    Body:  
     {
      "tree": [
            67, 
            76, 
            39, 
            28, 
            44, 
            74,
            85, 
            29, 
            83, 
            87
          ]	
     }
   
   También hay un documento con las pruebas realizadas
