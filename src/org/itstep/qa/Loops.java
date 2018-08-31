package org.itstep.qa;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //1 При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        for(int i = 1; i < 100; i++){
            if(i % 2 != 0)
                System.out.println(i);
        }
        System.out.println("------------------------");
        //2.Дано число n. При помощи цикла for определить факториал n!
        //(Определение n! = 1*2*3*…*n, 0! = 1)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();;
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        System.out.println(f);
        System.out.println("-----------------------------------");
        //3.Перепишите программы из заданий 1 и 2 с использованием цикла while.
        int i = 0;
        while(i++ < 100){
            if(i % 2 != 0){
                System.out.println(i + " ");
            }
        }
        i = 2;
        f = 1;
        while(i <= n){
            f *= i;
            i++;
        }
        System.out.println(f);
        System.out.println("-----------------------");
        //4.Даны переменные x и n. Вычислить x в степени n.

        int a = 2;
        int x = 4;
        int res = 0;
        while(x-- > 0){
            res += a * a;
        }
        System.out.println(res);
        System.out.println("-----------------------------");

        //Задача 5*
        //Придумать способ ввода 3-х целых чисел с проверкой того, что пользователь вводит целые числа.
        //сли пользователь допускает ошибку – дать ему возможность ввести число повторно.
        double number = 0;
        int counter = 0;
        do{
            number = sc.nextDouble();
            if(number % 1 == 0){
                counter++;
            }
            else{
                System.out.println("You've entered wrong data\nTry again:");
            }
            if(counter == 3)
                break;
        }while(true);

    }
}
