import java.util.Scanner;

enum HTTPError{
    HTTP_ERROR401,HTTP_ERROR402,HTTP_ERROR403,HTTP_ERROR404
}
public class solve {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 float numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if(a>-5 && a<5 &&  b>-5 && b<5 && c>-5 && c<5 ){
            System.out.println("a , b , c is in range [-5;5]");
        }
        else{
            System.out.println("a , b , c isn't in range [-5;5]");
        }
        System.out.println("Input 3 integer numbers");
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int min=0,max=0;
        if (e > f && e>g ){
            max = e;
        }
        if (f > e && f>g ){
            max = f;
        }
        if (g > f && g>e ){
            max = g;
        }
        if (g < f && g<e ){
            min = g;
        }
        if (e < f && e<g ){
            min = e;
        }
        if (f < g && f<e ){
            min = f;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        System.out.println(HTTPError.HTTP_ERROR401);
    }
}
