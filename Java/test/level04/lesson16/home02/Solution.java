package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nb1 = reader.readLine();
        String nb2 = reader.readLine();
        String nb3 = reader.readLine();

        int a = Integer.parseInt(nb1);
        int b = Integer.parseInt(nb2);
        int c = Integer.parseInt(nb3);

        if ((a < b) && (b < c))
            System.out.println(b);
        else if ((b < a) && (a < c))
            System.out.println(a);
        else if ((b < c) && (c < a))
            System.out.println(c);
    }
}
