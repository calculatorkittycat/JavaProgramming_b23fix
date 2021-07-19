package Day_10_IfStatements;

public class DaysOfWeek {
    public static void main(String[] args) {


        int number = 44;
        String day = "";

        if(number>= 1 && number <= 7){


//:()? else if : else
           /* if (number == 1) {
                day = ("monday");
            } else if (number == 2) {
                day = ("tuesday");
            } else if (number == 3) {
                day = ("wednesday");
            } else if (number == 4) {
                day = ("thursday");
            } else if (number == 5) {
                day = ("friday");
            } else if (number == 6) {
                day = ("saturday");
            } else {
                day = ("sunday");
            }
*/
            day =  (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday" :(number==4)? "Thursday" :(number==5)? "Friday"
            :(number==6)? "Saturday" : "sunday";

        }else{
            day = "No Such Day";
        }





        System.out.println("day = " + day);
    }
}
