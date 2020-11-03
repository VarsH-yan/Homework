package javalesson;

public class Lesson2 {
    public static void main(String[] args) {

        int result = 8;
        result %= 5;
        System.out.println(result);

        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );

        int x = 5;
        System.out.println(x > 3 && x < 10);

        int[][] myArr = { {1, 2, 3, 4}, {5, 6, 7, 8} };
        int r = myArr[1][2];
        System.out.println(r);

        int number=13;
        if(number%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }

        String day = "Sunday";
        switch (day) {
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Today is Monday");
        }
    }
}
