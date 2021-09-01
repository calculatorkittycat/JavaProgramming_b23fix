package day_50;

public class MorningWorkout {

    public static void main(String[] args)  {

        for (int i = 1; i < 30; i++) {
            System.out.println("Push-up "+i);
            pause(0.5);
        }

        System.out.println("_______________");
        for (int i = 1; i <20 ; i++) {
            System.out.println("Pull-up "+i);
            pause(0.5);
        }

    }

    public static void pause(double seconds){
        try {
            Thread.sleep((long)(seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
