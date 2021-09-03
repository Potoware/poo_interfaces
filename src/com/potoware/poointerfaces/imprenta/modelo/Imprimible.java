package com.potoware.poointerfaces.imprenta.modelo;

public interface Imprimible {
    String TEXTO_DEFECTO = "Imprimiento un valor por defecto";
    default String imprimir(){
        return TEXTO_DEFECTO;
    };

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
