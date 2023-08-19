
package examenip2_alejandrocardona;

import java.util.Random;

public abstract class Jugador {
    
    Random rng = new Random();
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String pieHabil;
    private int rating;
    private Equipo e;
    
    //Caracteristicas Especificas
    private int agarre;
    private int lanzamiento , fisico, ritmo , entrada , vision , passing , regate , disparo;

    public Jugador(String nombre, int edad, String nacionalidad, String pieHabil, int rating, Equipo e, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
        this.rating = rating;
        this.e = e;
        this.agarre = agarre;
        this.lanzamiento = lanzamiento;
        this.fisico = fisico;
        this.ritmo = ritmo;
        this.entrada = entrada;
        this.vision = vision;
        this.passing = passing;
        this.regate = regate;
        this.disparo = disparo;
        
    }

    public Jugador(String nombre, int edad, String nacionalidad, String pieHabil, Equipo e) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
        this.e = e;
//        setAgarre();
//        setLanzamiento();
//        setFisico();
//        setRitmo();
//        setEntrada();
//        setVision();
//        setPassing();
//        setRegate();
//        setDisparo();
    }
    
    

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Equipo getE() {
        return e;
    }

    public void setE(Equipo e) {
        this.e = e;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre() {
        this.agarre = (rng.nextInt(5)+1)*13;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento() {
        this.lanzamiento = (rng.nextInt(5)+1)*13;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico() {
        this.fisico = (rng.nextInt(5)+1)*13;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo() {
        this.ritmo = (rng.nextInt(5)+1)*13;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada() {
        this.entrada = (rng.nextInt(5)+1)*13;
    }

    public int getVision() {
        return vision;
    }

    public void setVision() {
        this.vision = (rng.nextInt(5)+1)*13;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing() {
        this.passing = (rng.nextInt(5)+1)*13;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate() {
        this.regate = (rng.nextInt(5)+1)*13;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo() {
        this.disparo = (rng.nextInt(5)+1)*13;
    }
    
    public abstract int getAvgRating();
    
    public String toString(){
        
        return getNombre()+"  \n"+getAvgRating();
        
    }
    
}
