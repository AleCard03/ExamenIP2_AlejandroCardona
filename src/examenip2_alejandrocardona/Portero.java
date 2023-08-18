
package examenip2_alejandrocardona;

import java.util.Random;

public class Portero extends Jugador {
    
    Random rng = new Random();
    int agarre, lanzamiento , passing;

    public Portero(int agarre, int lanzamiento, int passing, String nombre, int edad, String nacionalidad, String pieHabil, Equipo e) {
        super(nombre, edad, nacionalidad, pieHabil, e);
        
        setAgarre(0);
        setLanzamiento();
        setPassing();
    }

    public Portero(int agarre, int lanzamiento, int passing) {
        setAgarre(0);
        setLanzamiento();
        setPassing();
    }
    
    
    

    public Portero(String nombre, int edad, String nacionalidad, String pieHabil, int rating, Equipo e, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        super(nombre, edad, nacionalidad, pieHabil, rating, e, agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo);
    }

    public Portero() {
    }

    public Portero(String nombre, int edad, String nacionalidad, String pieHabil, Equipo e) {
        super(nombre, edad, nacionalidad, pieHabil, e);
    }
    
    
    
    @Override
    public int getAvgRating(){
        
        int promedio = getAgarre();
        return promedio;
        
    }
    
    public void setAgarre(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.agarre = x;
        
        
    }
     public void setLanzamiento(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.lanzamiento = x;
        
        
        
    }
      public void setPassing(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.passing = x;
        
        
        
    }

    public int getAgarre() {
        return agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public int getPassing() {
        return passing;
    }
    
      
      
}
