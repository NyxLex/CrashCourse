import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//1(56)
        System.out.println("#56");
        System.out.println("Input a,b,c,x,y :");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if  (((a<x)&&(b<y))||((a<y)&&(b<x))||((a<x)&&(c<y))||((a<y)&&(c<x))||
                ((b<x)&&(c<y))||((b<y)&&(c<x)))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("FALSE");
        }


//2(88)
        System.out.println("#88");
        System.out.println("Input N: ");
        int N=sc.nextInt();
        //a
        int N2=N*N;
        String strN = Integer.toString(N2);
        for(int i = 0 ; i < strN.length();i++){
            if(strN.charAt(i)=='3')
            {
                System.out.println("True");
                break;
            }
            else if ( i == strN.length()-1){
                System.out.println("False");
            }
        }
        //b
        String Nstr = Integer.toString(N);
        System.out.println("Reverse to N: ");
        for(int i = Nstr.length()-1 ; i >= 0;i--){
            System.out.print(Nstr.charAt(i));
        }
        //c
        System.out.println(" ");
        System.out.println("Changing first and last symbol of  N.... ");
        Nstr = Nstr.substring(Nstr.length()-1)+Nstr.substring(1, Nstr.length()-1)+Nstr.charAt(0);
        int d = Integer.parseInt(Nstr);
        System.out.println(d);
        //d

        String one = "1";
        String one2 ="1";
        String myN = Integer.toString(N);
        myN = one + myN + one2;
        N = Integer.parseInt(myN);
        System.out.println("Add 2 symbols first and last position : ");
        System.out.println(N);

//3
        //1
        System.out.println("Input Radius of flower bed :");
        double radius = sc.nextDouble();
        final double Pi = 3.1415926536;
        System.out.println("Area of flower bed = " + Pi*radius*radius);
        System.out.println("Perimeter of flower bed = " + Pi*radius*2);
        //2
        System.out.println("What is ur name?");
        String name = sc.nextLine();



    }
}
