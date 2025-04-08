import java.util.Scanner;

public class Principal {
    
    //Clase interna del paciente
    static class Paciente {
        String nombre;
        int edad;
        String expediente;
        
        public void mostrarInformacion() {
            System.out.println ("Paciente: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Expediente: " + expediente);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Crear el objeto paciente
        Paciente paciente= new Paciente();
        //Solicitar datos
        System.out.print("Ingrese el nombre del paciente: ");
        paciente.nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del paciente: ");
        paciente.edad = scanner.nextInt();
        scanner.nextLine(); //Limpiar buffer
        System.out.print("Ingrese el numero de expediente: ");
        paciente.expediente = scanner.nextLine();
        //Mostrar la informacion
        paciente.mostrarInformacion();
        scanner.close();
    }
}