public class UserA implements User {
    private String username;
    private String password;
    UserA (String username, String password){
        this.username = username;
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return  password;
    }
}