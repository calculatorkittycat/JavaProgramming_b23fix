package day_43_OOP_Encapsulation;

public class Credentials {

    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        boolean startsWithLetter = Character.isLetter(username.charAt(0));
        if(!startsWithLetter || username.length() <5){
            return;
        }

        this.username = username;
    }

    public void setPassword(String password) {
        if(!isStrongPassword(password)){// if the given password is not a strong password
            return;//exit the method
        }
        this.password = password;
    }


    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ") && !password.contains(",");
        boolean r2 = false,
                r3 = false,
                r4 = false;

        for (char each : password.toCharArray()) {
            if(Character.isLetter(each)){
                r2 = true;
            }else if(!Character.isLetterOrDigit(each)) {
                r3 = true;
            }else{
                r4 = true;
            }
        }
        return r1 && r2 && r3 && r4;
    }





}
