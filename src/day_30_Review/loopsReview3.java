package day_30_Review;

public class loopsReview3 {

    public static void main(String[] args) {

        String sentence = "I lurvfefe javak, javak is teh funzorz";
        String word = "javak";
        int count = 0;

        while ( sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        System.out.println(count);
        System.out.println(sentence);

        System.out.println("___________________________________");


for( int j = 1; j<= 5; j++){
    for (int i = 0; i <= 10; i++) {
        System.out.print(i+" ");
    }
    System.out.println();

    System.out.println("________________________________________");

    String str = "aabcccd";

    for( int b = 0; b <= str.length()-1; b++){

        char ch = str.charAt(b);
        int frequency = 0;
        for(int i =0; i<= str.length()-1 ; i++){
            if(str.charAt(i) == ch){
                frequency++;
            }
        }

        if(frequency ==1){
            System.out.print(ch);
        }
    }




}






    }
}
