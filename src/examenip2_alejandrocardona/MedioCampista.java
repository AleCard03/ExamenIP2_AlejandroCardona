
package examenip2_alejandrocardona;

public class MedioCampista extends Jugador{
    
    private int vision, passing , regate;

    public MedioCampista(String nombre, int edad, String nacionalidad, String pieHabil, Equipo e) {
        super(nombre, edad, nacionalidad, pieHabil, e);
        
        setVision();
        setPassing();
        setRegate();
        
    }
    
    @Override
    public int getAvgRating(){
        
        int promedio = getAgarre();
        return promedio;
        
    }
    
    public void setVision(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.vision = x;
        
        
    }
     public void setPassing(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.passing = x;
        
        
        
    }
      public void setRegate(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.regate = x;
        
        
        
    }

    public int getVision() {
        return vision;
    }

    public int getPassing() {
        return passing;
    }

    public int getRegate() {
        return regate;
    }
      
    
    
}
