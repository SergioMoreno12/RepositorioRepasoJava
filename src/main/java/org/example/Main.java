package org.example;

public class Main {
    public static void main(String[] args) {

        //Crear persona desde el constructor vacio
        Persona p1 = new Persona();
        p1.setNombres("Juan");
        p1.setEdad(26);
        p1.setGenero("Masculino");

        Persona p2 = new Persona("Pedro", 25, "Masculino");

        //Mostrar persona
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}