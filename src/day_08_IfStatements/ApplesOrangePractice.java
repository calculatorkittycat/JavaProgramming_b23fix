package day_08_IfStatements;

public class ApplesOrangePractice {

    public static void main(String[] args) {


        int ApplesCount = 20;
        int OrangesCount = 30;
        int PearsCount = 30;

        boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;

        System.out.println(comp);

    }
}
