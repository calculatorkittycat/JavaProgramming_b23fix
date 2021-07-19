package Practice;

public class UtopianTreeReplit {
    public static void main(String[] args) {

        int growth = 0;
        int treeSize = 0;

        for (int year = 1; year <=10; year++){

            if (year < 3) {
                growth = 1;
                treeSize++;
                System.out.println("year " + year + " - growth " + growth + " cm");
                System.out.println("tree size: " + treeSize + "cm");
            }
        if (year == 3) {
            growth = 1;
            treeSize++;
            System.out.println("year " + year + " - growth " + growth + " cm");
            System.out.println("tree size: " + treeSize + "cm");
        }
        if (year >= 4 && year <= 10) {
            growth = 2;
            treeSize+=growth;
            System.out.println("year " + year + " - growth " + growth + " cm");
            System.out.println("tree size: " + treeSize + "cm");
        }
    }
}
    }

