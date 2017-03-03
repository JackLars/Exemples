package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String nb4 = reader.readLine();

        int a = Integer.parseInt(nb1);
        int b = Integer.parseInt(nb2);
        int c = Integer.parseInt(nb3);
        int d = Integer.parseInt(nb4);
        int min;

        if (a < b)
            min = b;
        else
            min = a;

        if ((c < d) && (min < d))
            min = d;
        else if ((d < c) && (min < c))
            min = c;

        System.out.println(min);

    }
}
