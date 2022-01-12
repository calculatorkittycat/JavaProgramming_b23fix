package utilities.interviewQuestions;


    public class Array_FirstUniqueElement {

    /*
    write a program that can find the first duplicated element from the array
     */

        public int firstDuplicatedElement(int[] array) {
            int firstDuplicated = 0;

            for (int each : array) {
                int frequency = 0;
                for (int each2 : array) {
                    if (each == each2)
                        frequency++;
                }

                if (frequency > 1) {
                    firstDuplicated = each;
                    break;
                }

            }

            return firstDuplicated;

        }

        public static void main(String[] args) {
            Array_FirstUniqueElement array_firstUniqueElement = new Array_FirstUniqueElement();

            int[] arr = {1,1,2,2,3,4,5,6};

            System.out.println(array_firstUniqueElement.firstDuplicatedElement(arr));
        }
    }

