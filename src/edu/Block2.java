package edu;

public class Block2
{
    public static void main(String[] args)
    {
        System.out.println("Task 2.1");
        System.out.println(fraction(5.25));
        System.out.println(fraction(100.255));
        System.out.println(fraction(-10.92));

        System.out.println("Task 2.2");
        System.out.println(sumLastNums(53));
        System.out.println(sumLastNums(111));
        System.out.println(sumLastNums(1988));

        System.out.println("Task 2.3");
        System.out.println(charToNum('0'));
        System.out.println(charToNum('7'));
        System.out.println(charToNum('5'));

        System.out.println("Task 2.4");
        System.out.println(isPositive(15));
        System.out.println(isPositive(-1124));
        System.out.println(isPositive(-906));

        System.out.println("Task 2.5");
        System.out.println(is2Digits(15));
        System.out.println(is2Digits(1124));
        System.out.println(is2Digits(900));

        System.out.println("Task 2.6");
        System.out.println(isUpperCase('A'));
        System.out.println(isUpperCase('b'));
        System.out.println(isUpperCase('C'));

        System.out.println("Task 2.7");
        System.out.println(isInRange(11, 3, 9));
        System.out.println(isInRange(4, 12, 16));
        System.out.println(isInRange(10, 7, 5));

        System.out.println("Task 2.8");
        System.out.println(isDivisor(11, 3));
        System.out.println(isDivisor(4, 12));
        System.out.println(isDivisor(10, 7));

        System.out.println("Task 2.9");
        System.out.println(isEqual(11, 3, 8));
        System.out.println(isEqual(10, 10, 10));
        System.out.println(isEqual(7, 7, 7));

        System.out.println("Task 2.10");
        int sum = lastNumSum(5, 11);
        System.out.print("5 + 11 = " + sum + "\n" + sum);
        sum = lastNumSum(sum, 123);
        System.out.print(" + 123 = " + sum + "\n" + sum);
        sum = lastNumSum(sum, 14);
        System.out.print(" + 14 = " + sum + "\n" + sum);
        sum = lastNumSum(sum, 1);
        System.out.print(" + 1 = " + sum + "\n" + sum);
    }

    /* Необходимо реализовать метод таким образом,
    чтобы он возвращал только дробную часть числа х.
    Подсказка: вещественное число может быть
    преобразовано к целому путем отбрасывания дробной части.
     */

    public static double fraction(double x)
    {
        int y = (int) x;
        return x - y;
    }

    /* Необходимо реализовать метод таким образом,
    чтобы он возвращал результат сложения двух последних знаков числа х,
    предполагая, что знаков в числе не менее двух.
    */

    public static int sumLastNums(int x)
    {
        int y = (x % 100) / 10;
        return y + x % 10;
    }

    /* Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”.
    Необходимо реализовать метод таким образом,
    чтобы он преобразовывал символ в соответствующее число.
    */

    public static int charToNum(char x)
    {
        return x - 48;
    }

    /* Необходимо реализовать метод таким образом,
    чтобы он принимал число x и возвращал true если оно положительное.
    */

    public static boolean isPositive(int x)
    {
        return x > 0;
    }

    /* Необходимо реализовать метод таким образом,
    чтобы он принимал число x и возвращал true если оно двузначное.
     */

    public static boolean is2Digits(int x)
    {
        return x >= 10 && x < 100;
    }

    /* Необходимо реализовать метод таким образом,
    чтобы он принимал символ x и возвращал true
    если это большая буква в диапазоне от ‘A’ до ‘Z’.
    */

    public static boolean isUpperCase(char x)
    {
        return x >= 'A' && x <= 'Z';
    }

    /* Метод принимает левую и правую границу (a и b) некоторого числового диапазона.
    Необходимо реализовать метод таким образом, чтобы он возвращал true,
    если num входит в указанный диапазон (включая границы).
    Обратите внимание, что отношение a и b заранее неизвестно
    (неясно кто из них больше, а кто меньше)
    */

    public static boolean isInRange(int a, int b, int num)
    {
        int x = a - b;
        return (x < 0  && num >= a && num <= b) || (x > 0  && num >= b && num <= a);
    }

    /* Необходимо реализовать метод таким образом,
    чтобы он возвращал true если любое из принятых чисел делит другое нацело.
    */

    public static boolean isDivisor (int a, int b)
    {
        return (b != 0 && a % b == 0) || (a != 0 && b % a == 0);
    }

    /* Необходимо реализовать метод таким образом,
    чтобы он возвращал true если все три полученных методом числа равны
    */

    public static boolean isEqual (int a, int b, int c)
    {
        return (a == b) && (a == c);
    }

    /* Выполните с его помощью последовательное сложение пяти чисел:
    5, 11, 123, 14, 1, и результат выведите на экран.
    Постарайтесь выполнить задачу, используя минимально возможное количество вспомогательных переменных.
    Ответом на данное задание является код метода main, в котором происходит вызов данного метода.
    */

    public static int lastNumSum(int a, int b)
    {
        return (a%10)+(b%10);
    }

}


