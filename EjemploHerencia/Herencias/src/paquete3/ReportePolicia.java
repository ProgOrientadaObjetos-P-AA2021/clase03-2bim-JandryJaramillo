package paquete3;

import herencias2.Policia;
import java.util.ArrayList;

public class ReportePolicia extends Reporte{
    double promedioEdadess;
    ArrayList<Policia> lista;

    public ReportePolicia(String c,ArrayList<Policia> l) {
        super(c);        
        lista = l;
    }
    
    public void setPromedioEdades(){
        double suma = 0;
        for(int i = 0; i < lista.size();i++){
            suma = suma + getLista().get(i).getEdad() ;
        }
       promedioEdadess = suma / lista.size(); 
    }
   
    public double getPromedioEdades(){
       return promedioEdadess;
    }
    
    public void setLista(ArrayList<Policia> l){
       lista = l; 
    }
   
    public ArrayList<Policia> getLista(){
       return lista;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%sReporte Policia: \n",
                super.toString());
        for(int i = 0;i < lista.size();i++){
            cadena = String.format("%s - %s %s - %d - %.2f\n",cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getEdad(),
                    getPromedioEdades());
        }
        return cadena;
    } 
}