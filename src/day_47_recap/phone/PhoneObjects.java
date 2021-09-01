package day_47_recap.phone;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone iphone = new iPhone("12","large","black",999.00);
        iphone.call(911);
        iphone.call(911,199);
        iphone.text(123415);


        Samsung samsung = new Samsung("Galaxy","medium","white",780.00);
        Nokia nokia = new Nokia("sidekick","small","red",50.00);



    }
}
