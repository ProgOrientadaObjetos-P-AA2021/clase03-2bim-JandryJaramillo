package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;

public class ReporteEstudiante extends Reporte{
    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c) {
        super(c);
    }
    
    public void setPromedioMatriculas(){
        double suma = 0;
        for(int i = 0; i < lista.size();i++){
            suma = suma + getLista().get(i).getMatricula();
        }
       promedioMatriculas = suma / lista.size(); 
    }
   
    public double getPromedioMatriculas(){
       return promedioMatriculas;
    }
    
    public void setLista(ArrayList<Estudiante> l){
       lista = l; 
    }
   
    public ArrayList<Estudiante> getLista(){
       return lista;
    }
    
    @Override
    public String toString(){
        return String.format("Promedio : %s", getCodigo());
    }   
}