package Day_26_MultiDimensionalArray;

public class CommonElements {
    public static void main(String[] args) {

//index number....element
        int[] arr1 = {1,2,3,4,5};

        int[] arr2 = {4,5,6,7,8,9,10,11};

        for (int element : arr2) {//gets the elements of arr2 // int for loop named element looking at all index numbers/elements of arr2
            for (int each : arr1) {//represents each element in the first array 1,2,3,4,5// gets the elements of arr1
                if(each == element){ //when ever there is matching element that is the element that will be printed
                    System.out.println(each);
                }
            }
        }


        System.out.println("_______________________________________");
        for (int i = 0; i < arr2.length; i++) {//i: indexes of arr2

            for (int j = 0; j < arr1.length; j++) {//j: indexes of arr1
                if(arr2[i] == arr1[j]){
                    System.out.println(arr2[i]);
                }

            }

        }







    }
}
