package com.javarush.test.level02.lesson08.task04;

/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
*/
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {
        //напишите тут ваш код
        int n1;
        int n2;
        int m2;

        if (a < b)
            n1 = a;
        else
            n1 = b;

        if (c < d)
            n2 = c;
        else
            n2 = d;

        return min(n1, n2);
    }

    public static int min(int a, int b)
    {
        //напишите тут ваш код
        int m;
        if (a < b)
            m = a;
        else
            m = b;
        return m;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}