package javalesson;

public class MyProject {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hello PicsArt");

        byte a = 5, b = 9;
        System.out.println(a);
        a = (byte) (a - b);
        System.out.println(a);

        short c = 2265;
        System.out.println(c);

        int x = 10;
        long l = 546;
        long ll = 4544444545L;
        System.out.println(x);
        System.out.println(l + " " + ll);

        double d = 4.56;
        float f = 564.5665F;
        System.out.println(d);
        System.out.println(f);

        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue + " " + isFalse);

        char cc = '%';
        char ccc = '\u0025';
        System.out.println(cc);
        System.out.println(ccc);

        String surName = "Hovhannisyan";
        System.out.println(surName);
    }
}
