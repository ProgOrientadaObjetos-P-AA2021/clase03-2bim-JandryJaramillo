package herencias2;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=0;
        System.out.println("¿Qué desea ingresar?");
        System.out.println("1) Estudiante");
        System.out.println("2) Docente");
        System.out.println("3) Policia");
        System.out.println("Ingrese una opción 1-3");
        n = sc.nextInt();
        
        switch(n){
            case 1: n = 1;
            Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = sc.next();
            e.setNombre(nombre);
            
            System.out.println("Ingrese el apellido del estudiante:");
            String a = sc.next();
            e.setApellido(a);
            
            System.out.println("Ingrese la edad del estudiante:");
            int ed = sc.nextInt();
            e.setEdad(ed);
            
            System.out.println("Ingrese la matrícula del estudiante:");
            double m = sc.nextDouble();
            e.setMatricula(m);
            System.out.println(e);
            
            case 2: n = 2;
            Docente d = new Docente("Luis", "Alvarez", 40, 1000);           
            System.out.println("Ingrese el nombre del docente:");
            String nombred = sc.next();
            d.setNombre(nombred);
            
            System.out.println("Ingrese el apellido del docente:");
            String ad = sc.next();
            d.setApellido(ad);
            
            System.out.println("Ingrese la edad del docente:");
            int edd = sc.nextInt();
            d.setEdad(edd);
            
            System.out.println("Ingrese el sueldo del docente:");
            int sd = sc.nextInt();
            d.setSueldo(sd);
            System.out.println(d);
            
            case 3: n = 3;
            Policia p = new Policia("ALEX", "MENDOZA", 35, "Cabo");                       
            System.out.println("Ingrese el nombre del policia:");
            String nombrep = sc.next();
            p.setNombre(nombrep);
            
            System.out.println("Ingrese el apellido del policia:");
            String ap = sc.next();
            p.setApellido(ap);
            
            System.out.println("Ingrese la edad del policia:");
            int edp = sc.nextInt();
            p.setEdad(edp);
            
            System.out.println("Ingrese el rango del policia:");
            String rp = sc.next();
            p.setRango(rp);
            System.out.println(p);
            default:
                break;
        }        
    }    
}