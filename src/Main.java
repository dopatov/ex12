import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        double factorial;
        System.out.println("introduce un numero");
        Scanner sc= new Scanner(System.in);

        int num=sc.nextInt();
        factorial=1;
        for (int i = 1; i <= num ;i++){
            factorial=factorial*i;

    }
        System.out.println("el factorial de " +num +" es "+ factorial);
}}
