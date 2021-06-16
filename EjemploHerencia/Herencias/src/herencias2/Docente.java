package herencias2;

public class Docente extends Persona {
    
    public Docente(String n, String a, int e,int s) {
        super(n, a, e);
        setSueldo(s);
    }
    
    public int sueldo;
    
    public void setSueldo(int s){
        sueldo=s;
    }
    
    public int getSueldo(){
        return sueldo;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %d", super.toString(), getSueldo());
    }
}