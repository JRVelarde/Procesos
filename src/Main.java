
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame dos números");
        System.out.println("Número a =");
        a = sc.nextInt();
        System.out.println("Número b =");
        b = sc.nextInt();

        System.out.println(suma(a, b));
        sc.close();
    }
    static int suma(int a, int b){
        int resultado = 0;
        int c = 0;
        if (a > b){
            c = a;
            a = b;
            b = c;
        }
        for (int i = a; i <= b; i++){
            resultado = resultado + i;
        }
        return resultado;
    }
}