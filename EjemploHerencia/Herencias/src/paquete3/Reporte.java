package paquete3;

public class Reporte {
   protected String codigo;
   
   public Reporte (String c){
       setCodigo(c);
   }
   
   public void setCodigo(String c){
       codigo = c; 
   }
   
   public String getCodigo(){
       return codigo;
   }
   
   @Override
    public String toString(){
        return String.format("Código: %s\n", getCodigo());
    }
}