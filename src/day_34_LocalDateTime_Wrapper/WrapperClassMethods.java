package day_34_LocalDateTime_Wrapper;

public class WrapperClassMethods {

    public static void main(String[] args) {

        //parse methods are for converting string to primitive

        String str = "123";
        System.out.println("str = " + str+(2*2));
        int num = Integer.parseInt(str);
        System.out.println("num" + num+1+(3*2)  );

        String str2 = "123";
        int num2 = Integer.valueOf(str);//wrapper is being converted to int primitive//unboxing
        //             integer wrapper class
        System.out.println(num2 -1);

        Integer num3 = Integer.parseInt(str);//autoboxing
                        //int primitive
        int num4 = Integer.parseInt(str);
        //         int primitive

       Integer num5 = Integer.valueOf(str);
       //               wrapper class// not auto or un

        System.out.println(num -1);

        String str3 = "true";

        Boolean.parseBoolean(str3);

        System.out.println("________________________________________");

        char ch = '4';

        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);
        System.out.println(isDigit);
        System.out.println(isLetter);
        System.out.println(isSpecialChar);

        System.out.println("________________________________________");
        System.out.println("________________________________________");

        String s = "a1b2c3";

        int sum = 0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println("Sum" + sum);

        System.out.println("________________________________________");

        String s2 = "AAABBBCCC123123!@!#$%^&*()";

        String letters = "",
                digits = "",
                specialChars = "";

        for (char each : s2.toCharArray()) {

            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)){
                letters+= each;
            }else{
                specialChars += each;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);








    }
}
