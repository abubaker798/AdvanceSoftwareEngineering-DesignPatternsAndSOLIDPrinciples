import java.util.HashMap;
import java.util.Map;

public class  Account {

    private String userName;
    private String password;

    Account(String userName , String password ){
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void login(String userName , String password){
        System.out.println("Profile is loading ...");
    }

}