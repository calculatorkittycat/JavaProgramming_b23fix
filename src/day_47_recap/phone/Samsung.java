package day_47_recap.phone;

public final class Samsung extends Phone {

    public Samsung(String model, String size, String color, double price) {
        super("samsung", model, size, color, price);
    }

    public void call(long phoneNumber) {
        System.out.println("Samsung galaxy is Calling" + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Samsung galaxy is texting" + phoneNumber);
    }

    public void text(long phone1, long phone2) {
        System.out.println("Samsung galaxy is texting" + phone1 + phone2);
    }

    public void text(long phone1, long phone2, long phone3) {
        text(phone1,phone2);
        text(phone3);
    }

    public void text(long phone1, long phone2, long phone3, long phone4) {
        text(phone1,phone2,phone3);
        text(phone4);
    }

    public void freeze(){
        System.out.println(getBrand()+" "+getBrand()+ " is frozen");
    }




}
