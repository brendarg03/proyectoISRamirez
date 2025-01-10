package POO;

public class Paciente { //inicia clase
    //atribuos
    private String rgCURP;
    private int rgDiasHosp;
    private int rgCobroDia;
    private String rgNombre;
    private String rgApellidos;
    
    // constructor vacio
    public Paciente() {
    }

    //constructor que parasa parametros
    public Paciente(String rgCURP, int rgDiasHosp, int rgCobroDia, String rgNombre, String rgApellidos) {
        this.rgCURP = rgCURP;
        this.rgDiasHosp = rgDiasHosp;
        this.rgCobroDia = rgCobroDia;
        this.rgNombre = rgNombre;
        this.rgApellidos = rgApellidos;
    } // termina el constructor que pasa parametros
    
    // Metodos getter y setter - métodos de acceso
    public String getRgCURP() {
        return rgCURP;
    }

    public void setRgCURP(String rgCURP) {
        this.rgCURP = rgCURP;
    }

    public int getRgDiasHosp() {
        return rgDiasHosp;
    }

    public void setRgDiasHosp(int rgDiasHosp) {
        this.rgDiasHosp = rgDiasHosp;
    }

    public int getRgCobroDia() {
        return rgCobroDia;
    }

    public void setRgCobroDia(int rgCobroDia) {
        this.rgCobroDia = rgCobroDia;
    }

    public String getRgNombre() {
        return rgNombre;
    }

    public void setRgNombre(String rgNombre) {
        this.rgNombre = rgNombre;
    }

    public String getRgApellidos() {
        return rgApellidos;
    }

    public void setRgApellidos(String rgApellidos) {
        this.rgApellidos = rgApellidos;
    }
        
} // termina clase
