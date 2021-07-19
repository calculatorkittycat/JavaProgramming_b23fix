package Day_10_IfStatements;

public class FieldTrip {

    public static void main(String[] args) {


        int grade = 4;

        String teacher = "";
        int group = 0;
        String location = "";

        if (grade >= 1 && grade <= 6){// if grade number is valid

            if(grade == 1){
                location = "Apple Orchard"; group = 3; teacher = "Miss. Smith";
            }else if( grade == 2){
                location = "Zoo"; group = 7; teacher = "Mr.Lee";
            }else if(grade == 3){
                location = "Aquarium"; group = 5; teacher = "Mr.Wilson";
            }else if(grade == 4){
                location = "Movie Theater"; group = 2; teacher = "Miss. Reyes";
            }else if(grade == 5){
                location = "Museum"; group = 5; teacher = "Miss. Lela";
            }else{//grade = 6
                location = "Six Flags"; group = 8; teacher = "Mr.Watt";
            }


        }else{// if grade number is invalid
            location = "Unknown"; teacher = "Unknown";
        }
        System.out.println("grade = " + grade);
        System.out.println("group = " + group);
        System.out.println("location = " + location);
        System.out.println("teacher = " + teacher);
        }



    }

