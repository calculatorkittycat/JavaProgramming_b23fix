package day_23_Arrays;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {

        String str = "aabccckffktdktdkhgk";

        String removeDup = "";//abc
        for (int i = 0; i <= str.length()-1 ; i++) {//each time the loop executes the index number will be increased by 1 until str.length()-1
            char ch = str.charAt(i);

            if(removeDup.contains(""+ch)){//if the character is already contained in removeDup
                continue;//skip it
            }
            removeDup += ch;
        }



        String result = ""; //a2b1c3
                            //a b c
                            //2 1 3

        for (int j = 0; j < removeDup.length()-1; j++) {// 0 1 2 // to get each character from the string removeDup

            char ch = removeDup.charAt(j);  //'a', 'b', 'c'
            int frequency = 0; //is responsible for the frequencies of ch
                                //2 1 3

            for (int i = 0; i <= str.length()-1 ; i++) {//responsible for returning the frequency of ch
                char each = str.charAt(i);
                if(each == ch){
                    frequency++;
                }
            }

            result += ""+ch+frequency;



        }
        System.out.println(result);



    }
}
