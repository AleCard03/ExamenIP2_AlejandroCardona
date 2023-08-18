
package examenip2_alejandrocardona;

public class Defensa extends Jugador{
    
    private int fisico, ritmo, entrada;

    public Defensa(String nombre, int edad, String nacionalidad, String pieHabil, Equipo e) {
        super(nombre, edad, nacionalidad, pieHabil, e);
        
        setFisico();
        setRitmo();
        setEntrada();
        
    }
    
    @Override
    public int getAvgRating(){
        
        int promedio = getAgarre();
        return promedio;
        
    }
    
    public void setFisico(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.fisico = x;
        
        
    }
     public void setRitmo(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.ritmo = x;
        
        
        
    }
      public void setEntrada(){
        
        int x;
        do{
            x= (rng.nextInt(12)+1)*12;
        }while(x< 70 || x>100);
        this.entrada = x;
        
        
        
    }

    public int getFisico() {
        return fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public int getEntrada() {
        return entrada;
    }
    
    
}
