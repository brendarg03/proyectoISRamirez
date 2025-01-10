package poo;

public class Productos { // inicia clase
    //atribuos
    private int idProducto;
    private String nombreProducto;
    private String categoriaProducto;
    private int cantidadProducto;
    private int costoProducto;
    private int precioProducto;
    
    // constructor vacio
    public Productos() {
    }

    //constructor que parasa parametros
    public Productos(int idProducto, String nombreProducto, String categoriaProducto, int cantidadProducto, int costoProducto, int precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.categoriaProducto = categoriaProducto;
        this.cantidadProducto = cantidadProducto;
        this.costoProducto = costoProducto;
        this.precioProducto = precioProducto;        
    } // termina el constructor que pasa parametros
    
    
    // Metodos getter y setter - métodos de acceso
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(int costoProducto) {
        this.costoProducto = costoProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }
    
} // termina clase
