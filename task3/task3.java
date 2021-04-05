import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //3
        //3(1)
        System.out.println("Input Radius of flower bed :");
        double radius = sc.nextDouble();
        final double Pi = 3.1415926536;
        System.out.println("Area of flower bed = " + Pi*radius*radius);
        System.out.println("Perimeter of flower bed = " + Pi*radius*2);
        //3(2)
        System.out.println("What is ur name?");
        String name = sc.next();
        System.out.println("Where are u live , " + name + " ?");
        String loc = sc.next();
        //3(3)
        int sum = 0;
        int N =3;
        int[] c = new int[N];
        int[] t = new int [N];
        System.out.println("Input c1,2,3:");
        for (int i = 0 ; i < c.length;i++){
            c[i] = sc.nextInt();
        }
        System.out.println("Input t1,2,3:");
        for (int i = 0 ; i < t.length;i++){
            t[i] = sc.nextInt();
        }
        for (int i = 0 ; i < c.length;i++){
            System.out.println("c["+ (i+1) +"]*"+"t["+ (i+1) +"] = "+c[i]*t[i]);
            sum+=c[i]*t[i];

        }
        System.out.println("Sum = " + sum );
    }
}
