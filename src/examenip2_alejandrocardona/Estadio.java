
package examenip2_alejandrocardona;

public class Estadio {
    
    private String nombre, ciudad;
    private Equipo e;
    private int capacidad;

    public Estadio(String nombre, String ciudad, Equipo e, int capacidad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.e = e;
        this.capacidad = capacidad;
    }

    public Estadio(String nombre, String ciudad, int capacidad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
    }
    
    

    public Estadio() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Equipo getE() {
        return e;
    }

    public void setE(Equipo e) {
        this.e = e;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
