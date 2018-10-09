package com.soa.ws;

public class Empresa {
    private String nombre;
    private String email;
    private String web;
    private String tipoSociedad;
    private String nif;

    public Empresa() {
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Empresa(String nombre, String email, String web, String tipoSociedad, String nif) {
        this.nombre = nombre;
        this.email = email;
        this.web = web;
        this.tipoSociedad = tipoSociedad;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getTipoSociedad() {
        return tipoSociedad;
    }

    public void setTipoSociedad(String tipoSociedad) {
        this.tipoSociedad = tipoSociedad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", web='" + web + '\'' +
                ", tipoSociedad='" + tipoSociedad + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }
}
