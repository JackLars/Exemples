package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nb1 = reader.readLine();
        String nb2 = reader.readLine();
        String nb3 = reader.readLine();

        int a = Integer.parseInt(nb1);
        int b = Integer.parseInt(nb2);
        int c = Integer.parseInt(nb3);

        if ((a == b) && (b == c))
            System.out.println(a + " " + b + " " + c);
        else if ((a == c) && (a != b))
            System.out.println(a + " " + c);
        else if ((a == b) && (a != c))
            System.out.println(a + " " + b);
        else if ((b == c) && (b != a))
            System.out.println(b + " " + c);
    }
}