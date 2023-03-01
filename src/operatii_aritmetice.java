
import java.util.*;

public class operatii_aritmetice
{
    static void suma(int x, int y) //functie sau metoda care calculeaza suma a doua numre intregi
    {
       System.out.println(x+y);
    }
    static void diferenta (int c , int d)
    {
        int dif = c - d;
        System.out.println(dif);
    }
    public static int produsul(int e, int f)
    {
       int prod ;
       prod = e*f;
    }
     static int catul(int q, int r)
    {
        int cat = q/r;
        return cat;
    }
    public static void restul_impartirii(int n ,int m)
    {
        int rest = n%m;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti primul numar =");
        int a = in.nextInt();
        System.out.println("*------------------------------------*");
        System.out.println("Introduceti cel de-al doilea numar = ");
        int b = in.nextInt();
        System.out.println("*------------------------------------*");
        System.out.println("Suma a doua numere este =");
        suma(a,b);
        System.out.println("*-------------------------------------*");
        System.out.println("Diferenta celor doua numere este = ");
        diferenta(a,b);
        System.out.println("*-------------------------------------------------*");
        int p = in.produsul(a,b);
        System.out.println("Produsul celor  doua numere este =" +p);
        System.out.println("*==================================================*");
        System.out.println("Catul celor  doua numere este = "+ catul(a,b));
        System.out.println("*==================================================*");
        System.out.println("Restul impartirii celor doua numere este = ");
        in.restul_impartirii(a,b);

    }
}