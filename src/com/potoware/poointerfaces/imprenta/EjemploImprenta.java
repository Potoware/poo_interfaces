package com.potoware.poointerfaces.imprenta;

import com.potoware.poointerfaces.imprenta.modelo.Curriculum;
import com.potoware.poointerfaces.imprenta.modelo.Hoja;
import com.potoware.poointerfaces.imprenta.modelo.Informe;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Jhon Due","Software Engineer","Resumen laboral ...");
        cv.addExperiencias("Java");
        cv.addExperiencias("Oracle DBA");
        cv.addExperiencias("Spring Framework");
        cv.addExperiencias("Desarrollador fullstack");
        cv.addExperiencias("Angular");

        Informe informe = new Informe("Alejandro Potosi","Juan","Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);

    }


    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
