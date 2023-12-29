package classes;

public class User {
    public String username;
    public String password;
    public boolean isAdmin;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.isAdmin = false;
    }
}
