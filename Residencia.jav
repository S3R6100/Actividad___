public class Residencia {
    public String direccion;
    private String ciudad;
    private int codigo_postal;


    public Residencia(String direccion, String ciudad, int codigo_postal) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigo_postal = codigo_postal;
    }


    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
}