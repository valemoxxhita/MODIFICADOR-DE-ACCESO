package org.example.modelos;

public class Cliente
{
    String nombre;
    String identificacion;
    Integer edad;
    String ciudad;
    String genero;

    public Cliente()
    {
    }

    public Cliente(String nombre, String identificacion, Integer edad, String ciudad, String genero)
    {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.ciudad = ciudad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
