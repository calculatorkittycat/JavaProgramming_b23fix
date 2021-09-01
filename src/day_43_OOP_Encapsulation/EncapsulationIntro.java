package day_43_OOP_Encapsulation;

public class EncapsulationIntro {

    private String userName = "Cybertek",
                  password = "Ctek12!";


    public String getUserName(){//allows us to read private data outside the class
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public void setUserName(String userName){
       if(userName.length() <5){
           System.out.println("User name too short, shorty.");
           return;
       }
       this.userName = userName;
    }

    public void setPassword(String password){
        if(password.length() < 8){
            System.out.println("Password too short, shorty.");
            return;
        }
        this.password = password;
    }


}
