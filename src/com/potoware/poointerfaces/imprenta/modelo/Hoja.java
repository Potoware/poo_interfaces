package com.potoware.poointerfaces.imprenta.modelo;

abstract class Hoja {

    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public  String imprimir();
}
