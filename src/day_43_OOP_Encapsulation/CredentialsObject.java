package day_43_OOP_Encapsulation;

public class CredentialsObject {

    public static void main(String[] args) {

        Credentials facebook = new Credentials("qw","12");
        facebook.setUsername("cybertek");
        facebook.setPassword("Password1!");

        System.out.println(facebook);

        System.out.println(facebook.getUsername());
        System.out.println(facebook.getPassword());

        System.out.println("________________");


        Credentials gmail = new Credentials(null,null);

        gmail.setUsername("gmail.com");
        gmail.setPassword("gmail123456!");

        System.out.println(gmail.getUsername());
        System.out.println(gmail.getPassword());


    }
}
