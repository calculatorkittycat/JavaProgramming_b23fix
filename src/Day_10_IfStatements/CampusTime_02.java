package Day_10_IfStatements;

public class CampusTime_02 {

    public static void main(String[] args) {

        int time = 9;
        String result = "";
        if (time > 8 && time < 23) {
            if (time >= 8 && time <= 23) {
                result = "open";
            } else {
                result = "closed";
            }
        } else {
            result = "FAIL";

        }
        System.out.println(result);
    }
}
