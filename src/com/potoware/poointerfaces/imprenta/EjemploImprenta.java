package com.potoware.poointerfaces.imprenta;

import com.potoware.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Jhon Due","Software Engineer","Resumen laboral ...");
        cv.addExperiencias("Java");
        cv.addExperiencias("Oracle DBA");
        cv.addExperiencias("Spring Framework");
        cv.addExperiencias("Desarrollador fullstack");
        cv.addExperiencias("Angular");

        Libro libro = new Libro("Erich Gamma","Patrones de diseño Elementos reusabes", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron obserbador"))
                .addPagina(new Pagina("Patron fabrida"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Fascade"));

        Informe informe = new Informe("Alejandro Potosi","Juan","Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }


    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
