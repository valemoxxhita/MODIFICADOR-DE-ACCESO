package org.example.ayudas;


public class Licor
{
    private Integer porcentajeAlcohol;
    private String nombre;
    private String marca;
    private String paisOrigen;
    private String tipoLicor;

    public Licor()
    {
    }

    public Licor(Integer porcentajeAlcohol, String nombre, String marca, String paisOrigen, String tipoLicor) {
        this.porcentajeAlcohol = porcentajeAlcohol;
        this.nombre = nombre;
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.tipoLicor = tipoLicor;
    }

    //Encapsulsamiento

    public Integer getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Integer porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getTipoLicor() {
        return tipoLicor;
    }

    public void setTipoLicor(String tipoLicor) {
        this.tipoLicor = tipoLicor;
    }
}
