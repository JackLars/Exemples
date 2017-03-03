package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int d;

        if (a < b)
        {
            d = a;
            a = b;
            b = d;
        }
        if (a < c)
        {
            d = a;
            a = c;
            c = d;
        }
        if (b < c)
        {
            d = b;
            b = c;
            c = d;
        }


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
