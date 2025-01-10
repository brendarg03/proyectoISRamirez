package poo;

public class Usuario { // inicia clase
    //atribuos
    private int idusuario;
    private String usuario;
    private String password;
    
    // constructor vacio
    public Usuario() {
    }

    //constructor que parasa parametros
    public Usuario(int idusuario, String usuario, String password) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.password = password;
    } // termina el constructor que pasa parametros
    
    // Metodos getter y setter - métodos de acceso

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
} // termina clase
