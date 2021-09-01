package day_47_recap.phone;

public class iPhone extends Phone{

    public iPhone(String model, String size, String color, double price){
        super("Apple", model, size, color, price);
    }

    public void call(long phoneNumber){
        System.out.println("Apple iPhone is calling " + phoneNumber);
    }

    public void call(long phone1, long phone2){
        call(phone1);
        call(phone2);
    }

    public void call(long phone1, long phone2, long phone3){
        call(phone1, phone2);
        call(phone3);
    }

    public void text(long phoneNumber){
        System.out.println("Apple iphone is texting" + phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Apple iPhone is face timing with " + phoneNumber);
    }

    public void faceTime(long phone1, long phone2){
        faceTime(phone1);
        faceTime(phone2);
    }

}
