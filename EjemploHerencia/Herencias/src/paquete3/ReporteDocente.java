package paquete3;

import herencias2.Docente;
import java.util.ArrayList;

public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String c,ArrayList<Docente> l) {
        super(c);        
        lista = l;
    }
    
    public void setPromedioSueldos(){
        double suma = 0;
        for(int i = 0; i < lista.size();i++){
            suma = suma + getLista().get(i).getSueldo() ;
        }
       promedioSueldos = suma / lista.size(); 
    }
   
    public double getPromedioSueldos(){
       return promedioSueldos;
    }
    
    public void setLista(ArrayList<Docente> l){
       lista = l; 
    }
   
    public ArrayList<Docente> getLista(){
       return lista;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%sReporte Docente: \n",
                super.toString());
        for(int i = 0;i < lista.size();i++){
            cadena = String.format("%s - %s %s - %d - %.2f\n",cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getEdad(),
                    getPromedioSueldos());
        }
        return cadena;
    } 
}