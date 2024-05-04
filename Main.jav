import java.util.Date;

/// Sergio Masin///
public class Main{
    public static void main(String[] args){
        Date fecha_nacimiento = new Date("13/08/2000");
        Date fecha_ingreso = new Date("25/10/2018"); 

        Empleado emp1 = new Empleado("1757808835", "Sergio Masin", 'M', fecha_nacimiento, fecha_ingreso);
        emp1.getResidencia().setCiudad("Quito");
        emp1.getResidencia().setDireccion("La Gasca");
        System.out.println("Cédula: "+emp1.getCedula());
        System.out.println("Nombre: "+emp1.getNombre());
        System.out.println("Género: "+emp1.getGenero());
        System.out.println("Ciudad de residencia: "+ emp1.getResidencia().getCiudad());
        System.out.println("Dirección de residencia: "+emp1.getResidencia().getDireccion());
        System.out.println("------------------------------");

        
        System.out.println("\nEl sueldo actual es: "+emp1.getSalario());
        emp1.setSalario(500.50);
        System.out.println("El nuevo sueldo del empleado es: "+emp1.getSalario());

       
        System.out.println("\nLa edad del empleado es: "+emp1.CalcularEdad());
        System.out.printf("\n");

        
        emp1.CalcularPrestaciones();
    }
}