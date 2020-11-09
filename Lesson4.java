package javalesson;

public class Lesson4 {
    public static void main(String[] args) {

        //Bubble sort (analyze and implement bubble sort).
        //in ascending order
        int[] arrSort = {8, 5, 6, 22, 9, 56, 44, 16};

        int mid = 0;
        for (int j = 0; j < arrSort.length ; j++) {

            for (int i = 0; i < arrSort.length - 1; i++) {
                if (arrSort[i] > arrSort[i + 1]) {
                    mid = arrSort[i];
                    arrSort[i] = arrSort[i + 1];
                    arrSort[i + 1] = mid;
                }
            }
        }
        for (int element : arrSort) {
            System.out.print(element + " ");
        }
    }
}
