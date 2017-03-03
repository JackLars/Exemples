package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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

        if ((a != b) && (b == c))
            System.out.println(1);
        else if ((b != a) && (a == c))
            System.out.println(2);
        else
            System.out.println(3);

    }
}
