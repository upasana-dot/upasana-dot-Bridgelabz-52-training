interface SensitiveData{}
class UserData implements SensitiveData{
    private String username;
    private String password;
    public UserData(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
public class SensitiveDataExample {
    public static void main(String[] args) {
        UserData user = new UserData("john_doe", "securePassword123");      
    }
}