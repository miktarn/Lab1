package pack;

import java.util.Scanner;

//Номер зачетки: 9330
//С2=0("+"); C3=0=C; C5=0("*"); C7=6("double");
public class Main {
    public static void main(String[] args) {
        double C = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        double n = sc.nextDouble();
        System.out.println("Гуд,теперь введите m");
        double m = sc.nextDouble();

        double a = 0;
        double b = 1;
        double result = 0;
        try {

            if(a == 0){throw new ArithmeticException();}

            for (double i = a; i <= n; i++) {
                for (double j = b; j <= m; j++) {
                    result += (i * j) / i; // Хотя можно и i + 0.0
                }
            }

            System.out.println("Результат: "+result);

        }catch (ArithmeticException e){
            System.err.println("Shit.Happened.Exception");
        }

    }
}
