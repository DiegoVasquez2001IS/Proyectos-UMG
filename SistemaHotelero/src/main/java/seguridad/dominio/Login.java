package seguridad.dominio;

public class Login {

    public static String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int id_usuario;
    private String username;
    private String password;

    public Login() {
    }

    public Login(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public Login(int id_usuario, String username, String password) {
        this.id_usuario = id_usuario;
        this.username = username;
        this.password = password;
    }
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", username=" + username + ", password=" + password + '}';
    }
    
    
}
