package modelos;

public class CalculoCalificaciones {
    
    public Estudiante estudiante;

    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaInicial(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        for(Paralelo par:estudiante.paralelos){
            if(p.equals(par)){
                return  ((nexamen+ndeberes+nlecciones)*0.80) + ((ntalleres)*0.20);
            }
        }
        return 0;
    }
    
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    public double CalcularNotaFinal(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        for(Paralelo par:estudiante.paralelos){
            if(p.equals(par)){
                return ((nexamen+ndeberes+nlecciones)*0.80) + ((ntalleres)*0.20);
            }
        }
        return 0;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        for(Paralelo par:estudiante.paralelos){
            if(p.equals(par)){
                return p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
            }
        }
        return 0;
    }

}
