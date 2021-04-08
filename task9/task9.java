import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task9 {

    public static double div(double a, double b){
        return a/b;
    }

    public static int ReadNumber(int start, int end)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= start || number >= end) throw new IllegalArgumentException("number is not in a range");
        else System.out.println("Okey , number in a range");
        return number;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (b == 0) {
            throw new NullPointerException("Dividing 0 error");
        }
        double c = div(a,b);
        System.out.println(c);
        System.out.println("Range checker ||| ");
        System.out.println("Input number : ");
        ReadNumber(2,12);
//3
        System.out.println("Start point (Int):");
        int start = sc.nextInt();

        System.out.println("End point (Int):");
        int end = sc.nextInt();

        System.out.println("Input a1,a2....a10");

        for (int i = 0;i<10;i++)    start = ReadNumber(start,end);


    }
}
