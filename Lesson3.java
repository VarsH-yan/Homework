package javalesson;

public class Lesson3 {
    public static void main(String[] args) {
        //Task 1
        //Create an array and fill it with 2 number.
        int[] arr1 = {5, 89};

        //Task 2
        //Create an array and fill it with numbers from 1:1000.
        int[] arr2 = new int[1000];
        for (int i = 0; i < arr2.length;) {
            arr2[i] = ++i;
        }


        //Task 3
        //Create an array and fill it with odd numbers from -20:20
        int[] arr3 = new int[41];
        for (int i = 0, j = -20; i < arr3.length; i++, j++) {
            arr3[i] = j;
        }

        //Task 4
        //Create an array and fill it. Print all elements which can be divided by 5.
        int[] arr4 = {4, 5, -20, 9, 8, 255, 42};
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 5  == 0 ){
                System.out.print(arr4[i] + " ");
            }
        }
        System.out.println();

        //Task 5
        //Create an array and fill it. Print all elements which are between 24.12 and 467.23.
        double[] arr5 = {2.3, 256.25, 0.25555, 57.256, 467.23, -5.25};
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] >= 24.12 && arr5[i] <= 467.23){
                System.out.print(arr5[i] + " ");

            }
        }

        System.out.println();

        //Task 6
        //Create an array and fill it. Print count of elements which can be divided by 2.
        int[] arr6 = {4, 5, -20, 9, 8, 255, 42};
        int count = 0;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        //Task 7
        //Given an integer, 0< N < 21 , print its first 10 multiples.
        int n = 25; //given N
        if (n > 0 && n < 21){
            for (int i = 1; i <= 10 ; i++) {
                System.out.println( n + " x " + i + " = " + n * i);
            }
        }
        else{
            System.out.println("Given number is not between 1 to 21 ");
        }

    }
}


