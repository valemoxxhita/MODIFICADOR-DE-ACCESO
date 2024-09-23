package org.example;

import org.example.ayudas.Licor;
import org.example.modelos.Cliente;


public class Main {

public static void main(String[] args)
{
        Cliente objeto1 = new Cliente();
        Cliente objeto2 = new Cliente("Valentina", "1023630311", 18, "Medellín", "Femenino");
        Licor objetoUno = new Licor();
        Licor objetoDos = new Licor(20, "Amaretto", "Disaronno", "Italia", "Almendra");

        System.out.println(objetoUno);
        System.out.println(objeto1);
        System.out.println(objeto2);
        System.out.println(objetoDos);

    System.out.println(objetoDos.getPorcentajeAlcohol());
    System.out.println(objetoDos.getNombre());
    System.out.println(objetoDos.getMarca());
    System.out.println(objetoDos.getPaisOrigen());
    System.out.println(objetoDos.getTipoLicor());

    System.out.println(objeto2.getNombre());
    System.out.println(objeto2.getIdentificacion());
    System.out.println(objeto2.getEdad());
    System.out.println(objeto2.getCiudad());
    System.out.println(objeto2.getGenero());


}

}
