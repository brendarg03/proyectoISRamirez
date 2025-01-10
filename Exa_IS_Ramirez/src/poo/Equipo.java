package poo;

public class Equipo { // inicia clase
    //atribuos
    private int idEquipo;
    private String marca;
    private String modelo;
    private int precio;
    
    // constructor vacio
    public Equipo() {
    }

    //constructor que parasa parametros
    public Equipo(int idEquipo, String marca, String modelo, int precio) {
        this.idEquipo = idEquipo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    } // termina el constructor que pasa parametros
    
    // Metodos getter y setter - métodos de acceso

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
       
} // termina clase
