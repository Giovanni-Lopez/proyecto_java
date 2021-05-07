package proyecto_java;

import java.util.Scanner;

/**
 *
 * @author Giovanni López
 */
public class Proyecto_java {

    public String apellidos;
    public int edad;
    public String estudio;
    
    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);       
        Proyecto_java obj = new Proyecto_java();
        
        System.out.println("Nombre: ");
        obj.setNombre(leer.nextLine());
        
        System.out.println("Apellidos: ");
        obj.setApellidos(leer.nextLine());
        
        System.out.println("Edad: ");
        obj.setEdad(leer.nextInt());
        
        System.out.println("Estudio: ");
        obj.setEstudio(leer.nextLine());        
    }    
}
