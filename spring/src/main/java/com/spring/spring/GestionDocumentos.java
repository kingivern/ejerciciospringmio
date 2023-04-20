package com.spring.spring;

public class GestionDocumentos {
 /* 7.2 Creamos el campo de nuestra interfaz GestionDocumento */
 private GestionDocumentos documentoNuevo;


 /* 7.2 Creamos el constructor que inyectará la dependencia */
 public GestionDocumentos(GestionDocumentos documentoNuevo) {
     this.documentoNuevo = documentoNuevo;
 }

 /*7.2 en el siguiente método añadimos el campo de clase documentoNuevo con el método de la Interfaz GestionDocumentos*/
 public String getDocumento() {
    return "Informe del DIRECTOR: " + documentoNuevo.getDocumento();
 }

}
