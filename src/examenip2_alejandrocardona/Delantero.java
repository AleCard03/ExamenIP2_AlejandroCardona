
package examenip2_alejandrocardona;

public class Delantero extends Jugador {
    
    private int ritmo , disparo, regate;

    public Delantero(String nombre, int edad, String nacionalidad, String pieHabil, Equipo e) {
        super(nombre, edad, nacionalidad, pieHabil, e);
        
        setRitmo();
        setDisparo();
        setRegate();
        
    }
    
    @Override
    public int getAvgRating(){
        
        int promedio = getAgarre();
        return promedio;
        
    }
    
    public void setRitmo(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.ritmo = x;
        
        
    }
     public void setDisparo(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.disparo = x;
        
        
        
    }
      public void setRegate(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.regate = x;
        
        
        
    }

    public int getRitmo() {
        return ritmo;
    }

    public int getDisparo() {
        return disparo;
    }

    public int getRegate() {
        return regate;
    }
    
      
    
}
