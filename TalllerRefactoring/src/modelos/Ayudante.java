package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    
    public ArrayList<Paralelo> paralelos;

    public Ayudante(){
        super();
    }
    
    //Todos los getters y setters que la clase necesite haciendo uso de la clase padre.

    
    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
