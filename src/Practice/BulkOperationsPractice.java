package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulkOperationsPractice {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(53_000,75_000,34_000,80_000));

        ArrayList<Integer> newScores = new ArrayList<>();
        newScores.addAll(scores);
        newScores.addAll(Arrays.asList(90_000,100_000,60_000));
        System.out.println("Before Sort" + newScores);

        for (Integer sorted : newScores) {
            System.out.println(sorted);
        }

        Collections.sort(newScores);


        System.out.println("After Sort");
        for (int sorted: newScores){
            System.out.print(sorted+" ");
        }
        System.out.println();
        ArrayList<Integer> money = new ArrayList<>();
        money.addAll(Arrays.asList(24,25,874,27,983,23));

        Collections.sort(money);

        System.out.println(money);

        System.out.println("________________________________");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Kevin", "Pam", "Creed", "Dwight", "Michael Scott"));
        System.out.println("names = " + names);

        names.removeAll(Arrays.asList("Michael Scott"));

        System.out.println(names);

        System.out.println("_________________set method_______________");


        names.set(0,"Angela");
        System.out.println(names);
        names.set(1,"Darrel");
        System.out.println(names);

        System.out.println("Array size = " +names.size());


        names.clear();
        System.out.println(names);

        names.add("Andy");
        names.add("Jan");
        names.add("Holly Flax");
        names.add("Oscar");
        System.out.println(names);

        boolean b1 = names.contains("Oscar");
        System.out.println("names contains Oscar, True or false? :" + " " + b1);

        System.out.println("_________________set method_______________");

        ArrayList<String> newNames = new ArrayList<>();
        newNames.addAll(Arrays.asList("Andy", "Jan", "Holly Flax", "Oscar"));

        boolean b2 = names.equals(newNames);
        System.out.println();
        System.out.println(names);
        System.out.println("Match?");
        System.out.println(newNames);

        System.out.println(b2);

        System.out.println();

        ArrayList<String> newNames2 = new ArrayList<>();

        newNames2.addAll(Arrays.asList("Andy", "Jan", "Your Mom", "Oscar"));
        System.out.println(names);
        System.out.println("Match?");
        System.out.println(newNames2);

        boolean b3 = names.equals(newNames2);
        System.out.println(b3);


    }

}
