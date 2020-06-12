import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function (User user, List<String> allUsers) {
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}"; //A
        if (user!=null) { //A
            if (user.getUsername()!=null && user.getPassword()!=null) { //B
                String password = user.getPassword(); //C
                String passwordLower = password.toLowerCase(); //C
                if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) { //C
                    boolean digit = false, upper = false, special = false; //D
                    for (int i=0;i<password.length();i++) { //D
                        if (Character.isDigit(password.charAt(i))) //E
                            digit = true; //F
                        if (Character.isUpperCase(password.charAt(i))) //G
                            upper = true; //H
                        if (specialCharacters.contains(String.valueOf(password.charAt(i)))) //I
                            special = true; //J
                    }
                    if (digit && upper && special)  //K
                        return true; //L
                }
            }
        }
        return false; //M
    }
}