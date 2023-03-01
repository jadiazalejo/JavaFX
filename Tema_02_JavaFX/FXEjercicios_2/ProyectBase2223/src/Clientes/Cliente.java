package Clientes;

public abstract class Cliente {
    private static int idLast=0;
    private final int id;
    private final String userName;
    private String password;
    private String email;
    
    public Cliente(String userName, String password, String email){
        this.id=++Cliente.idLast;
        this.userName=userName;
        this.password=password;
        this.email=email;
    }
    public int getId(){
        return id;
    }
    public String getUserName(){
        return userName;
    }
    public boolean changePassword(String password, String newPassword){
        boolean resultado=false;
        if(password.equals(this.password)){
            this.password=newPassword;
            resultado=true;
        }
        return resultado;
    }
    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    public abstract String muestraDatos();
}