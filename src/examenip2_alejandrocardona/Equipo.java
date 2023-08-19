/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenip2_alejandrocardona;

import java.util.ArrayList;

public class Equipo {
    
    private String nombre, pais;
    private int rating;
    private ArrayList <Jugador> plantilla;
    private Estadio est;

    public Equipo(String nombre, String pais, int rating, ArrayList<Jugador> plantilla, Estadio est) {
        this.nombre = nombre;
        this.pais = pais;
        this.rating = rating;
        this.plantilla = plantilla;
        this.est = est;
    }

    public Equipo(String nombre, String pais, int rating, ArrayList<Jugador> plantilla) {
        this.nombre = nombre;
        this.pais = pais;
        this.rating = rating;
        this.plantilla = plantilla;
    }

    public Equipo(String nombre, String pais, ArrayList<Jugador> plantilla) {
        this.nombre = nombre;
        this.pais = pais;
        this.plantilla = plantilla;
    }

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    
    

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    public Estadio getEst() {
        return est;
    }

    public void setEst(Estadio est) {
        this.est = est;
    }
    
    
    
}
