package com.potoware.poointerfaces.imprenta;

import com.potoware.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Jhon","Connor"),"Software Engineer","Resumen laboral ...");
        cv.addExperiencias("Java")
                .addExperiencias("Oracle DBA")
                .addExperiencias("Spring Framework")
                .addExperiencias("Desarrollador fullstack")
                .addExperiencias("Angular");

        Libro libro = new Libro(new Persona("Alejandro", "Potosi"),"Patrones de diseño Elementos reusabes", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron obserbador"))
                .addPagina(new Pagina("Patron fabrida"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe(new Persona("Juan", "Mecanico"),new Persona("Lucho", "Suarez"),"Estudio sobre microservicios");
        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);
        Imprimible.imprimir(libro);

        Imprimible.imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Que pasa chavales, generico clase anonima";
            }
        });
    }


}
