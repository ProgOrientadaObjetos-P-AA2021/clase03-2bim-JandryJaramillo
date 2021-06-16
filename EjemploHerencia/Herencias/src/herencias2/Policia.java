package herencias2;

public class Policia extends Persona{
    
    public Policia(String n, String a, int e, String s) {
        super(n, a, e);
        setRango(s);
    }
    
    public String rango;
    
    public void setRango(String s){
        rango=s;
    }
    
    public String getRango(){
        return rango;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %s", super.toString(), getRango());
    }
}