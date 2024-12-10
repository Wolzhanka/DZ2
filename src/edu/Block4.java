package edu;

public class Block4 {
    public static void main(String[] args) {
        System.out.println("Task 4.1");
        System.out.println(listNums(8));
        System.out.println(listNums(-8));
        System.out.println(listNums(4));

        System.out.println("Task 4.2");
        System.out.println(reverseListNums(4));
        System.out.println(reverseListNums(-4));
        System.out.println(reverseListNums(6));

        System.out.println("Task 4.3");
        System.out.println(chet(8));
        System.out.println(chet(6));
        System.out.println(chet(4));

        System.out.println("Task 4.4");
        System.out.println(pow(2, 6));
        System.out.println(pow(3, 2));
        System.out.println(pow(4, 0));

        System.out.println("Task 4.5");
        System.out.println(numLen(2264));
        System.out.println(numLen(-21));
        System.out.println(numLen(0));

        System.out.println("Task 4.6");
        System.out.println(equalNum(2264));
        System.out.println(equalNum(-222222));
        System.out.println(equalNum(333));

        System.out.println("Task 4.7");
        square(0);
        square(4);
        square(6);

        System.out.println("Task 4.8");
        leftTriangle(0);
        leftTriangle(4);
        leftTriangle(6);

        System.out.println("Task 4.9");
        rightTriangle(1);
        rightTriangle(5);
        rightTriangle(7);
    }


    /* Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    в которой будут записаны все числа от 0 до x (включительно).
     */

    public static String listNums(int x) {
        String nums = "";

        if (x >= 0) {
            for (int i = 0; i <= x; i++) {
                nums += i;
                if (i < x) {
                    nums += " ";
                }
            }
        } else {
            for (int i = 0; i >= x; i--) {
                nums += i;
                if (i > x) {
                    nums += " ";
                }
            }
        }
        return nums;
    }


    /* Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    в которой будут записаны все числа от x до 0 (включительно).
     */

    public static String reverseListNums(int x) {
        String list = "";

        if (x >= 0) {
            for (int i = x; i >= 0; i--) {
                list += i;
                if (i > 0) {
                    list += " ";
                }
            }
        } else {
            for (int i = x; i <= 0; i++) {
                list += i;
                if (i < 0) {
                    list += " ";
                }
            }
        }
        return list;
    }


    /* Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    в которой будут записаны все четные числа от 0 до x (включительно).
     */

    public static String chet(int x) {
        String chet = "";

        for (int i = 0; i <= x; i += 2) {
            chet += i;
            if (i + 2 <= x) {
                chet += " ";
            }
        }
        return chet;
    }


    /* Необходимо реализовать метод таким образом,
    чтобы он возвращал результат возведения x в степень y.
     */

    public static int pow(int x, int y) {
        int pow = 1;

        for (int i = 0; i < y; i++) {
            pow *= x;
        }
        return pow;
    }


    /* Необходимо реализовать метод таким образом,
    чтобы он возвращал количество знаков в числе x.
     */

    public static int numLen(long x) {
        if (x == 0) {
            return 1;
        }

        int len = 0;

        while (x != 0) {
            x /= 10;
            len++;
        }
        return len;
    }


     /* Необходимо реализовать метод таким образом, чтобы он возвращал true,
     если все знаки числа одинаковы, и false в ином случае.
      */

    public static boolean equalNum(int x) {

        x = x < 0 ? -x : x; // нагуглила оператор "? :" чтобы сменить знак - на +

        int z = x % 10;

        while (x > 0) {
            if (x % 10 != z) {
                return false;
            }
            x /= 10;
        }
        return true;
    }


    /* Необходимо реализовать метод таким образом,
    чтобы он выводил на экран квадрат из символов ‘*’ размером х,
    у которого х символов в ряд и х символов в высоту.
     */

    public static void square(int x)
    {
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < x; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /* Необходимо реализовать метод таким образом,
    чтобы он выводил на экран треугольник из символов ‘*’
    у которого х символов в высоту,
    а количество символов в ряду совпадает с номером строки.
     */

    public static void leftTriangle(int x) {

        for (int i = 1; i <= x; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    /* Необходимо реализовать метод таким образом,
    чтобы он выводил на экран треугольник из символов ‘*’
    у которого х символов в высоту, а количество символов в ряду совпадает с номером строки,
    при этом треугольник выровнен по правому краю.
     */

    public static void rightTriangle(int x)
    {
        for (int i = 1; i <= x; i++)
        {
            for (int j = 1; j <= x - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /* Данный метод считывает с консоли введенное пользователем число и выводит,
    угадал ли пользователь то, что было загадано, или нет.
    Перепишите этот метод таким образом, чтобы он запускался до тех пор,
    пока пользователь не угадает число. После этого выведите на экран количество попыток,
    которое потребовалось пользователю, чтобы угадать число.
     */

    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int tries = 0;
        int x;
        System.out.println("What number am I thinking (0 to 9)? :");

        do {
            System.out.print("Let's try! ");
            x = sc.nextInt();
            tries++;

            if (x != randomNum) {
                System.out.println("No, try again");
            }
        } while (x != randomNum);

        System.out.println("Yes, it`s " + randomNum);
        System.out.println(" Tries: " + tries);
    }

}



