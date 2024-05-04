import java.util.Calendar;
import java.util.Date;

public class Empleado {
    public String cedula;
    public String nombre;
    private Residencia residencia;
    private char genero;
    private Date fecha_nacimiento;
    private double salario;
    private Date fecha_ingreso;
    private int edad;
    public double prestaciones;
    private int antiguedad;

    
    public Empleado(){
        this.cedula="";
        this.nombre="";
        this.genero='F';
        this.fecha_nacimiento= new Date();
        this.salario=466; 
        this.fecha_ingreso= new Date();
        this.residencia = new Residencia("Dirección1", "Quito", 170908); 
    }

    
    public Empleado(String cedula, String nombre, char genero, Date fecha_nacimiento, Date fecha_ingreso){
        this.cedula=cedula;
        this.nombre=nombre;
        this.genero=genero;
        this.fecha_nacimiento= fecha_nacimiento;
        this.salario=466; 
        this.fecha_ingreso= fecha_ingreso;
        this.residencia = new Residencia("Dirección1", "Quito", 170908);
    }
    

   
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Residencia getResidencia() {
        return residencia;
    }

    public void setResidencia(Residencia residencia) {
        this.residencia = residencia;
    }

   
    public int CalcularEdad(){
        int anio_nacimiento = this.fecha_nacimiento.getYear()+1900; 
        Calendar calendar = Calendar.getInstance();
        int anio_actual = calendar.get(Calendar.YEAR);


        return anio_actual-anio_nacimiento;
    }


    public void CalcularAntiguedad(){
        int anio_ingreso = this.fecha_ingreso.getYear(); 
        Calendar calendar = Calendar.getInstance();
        int anio_actual = calendar.get(Calendar.YEAR);

        this.antiguedad = anio_actual-anio_ingreso;
    }

 
    public void CalcularPrestaciones(){
        CalcularAntiguedad();
        double prestaciones = this.antiguedad * (this.salario/12);
        System.out.println("El empleado "+nombre+" tiene " + antiguedad + " años de antiguedad y "+salario+"[$] de salario.");
        System.out.println("Las prestaciones son: " + antiguedad+"[años] * ("+salario+"[$]/12) = "+ String.format("%.2f",prestaciones)+"[$]" );
    }
}