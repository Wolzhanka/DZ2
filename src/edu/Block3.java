package edu;

public class Block3
{
    public static void main(String[] args) {
        System.out.println("Task 3.1");
        System.out.println(abs(8));
        System.out.println(abs(-13));
        System.out.println(abs(0));

        System.out.println("Task 3.2");
        System.out.println(safeDiv(7, 0));
        System.out.println(safeDiv(13, 4));
        System.out.println(safeDiv(6, -4));

        System.out.println("Task 3.3");
        System.out.println(max(0, 0));
        System.out.println(max(-8, -16));
        System.out.println(max(11, 3));

        System.out.println("Task 3.4");
        System.out.println(max(1, -1));
        System.out.println(max(-3, -11));
        System.out.println(max(12, 3));

        System.out.println("Task 3.5");
        System.out.println(makeDecision(2, 5));
        System.out.println(makeDecision(20, 8));
        System.out.println(makeDecision(7, 7));

        System.out.println("Task 3.6");
        System.out.println(max(6, -2, 8));
        System.out.println(max(3, 7, 4));
        System.out.println(max(-1, -8, 3));

        System.out.println("Task 3.7");
        System.out.println(sum3(6, -2, 4));
        System.out.println(sum3(3, 7, 10));
        System.out.println(sum3(-1, -8, -9));

        System.out.println("Task 3.7");
        System.out.println(sum2(-2, 4));
        System.out.println(sum2(7, 10));
        System.out.println(sum2(-8, -9));

        System.out.println("Task 3.8");
        System.out.println(is35(7));
        System.out.println(is35(10));
        System.out.println(is35(-9));

        System.out.println("Task 3.9");
        System.out.println(magic6(-2, 6));
        System.out.println(magic6(7, 10));
        System.out.println(magic6(-6, -9));

        System.out.println("Task 3.10");
        System.out.println(age(7));
        System.out.println(age(11));
        System.out.println(age(34));

        System.out.println("Task 3.11");
        System.out.println(day(7));
        System.out.println(day(3));
        System.out.println(day(11));

        System.out.println("Task 3.12");
        printDays("четверг");
        printDays("среда");
        printDays("фбвг");

    }

        /* Необходимо реализовать метод таким образом,
        чтобы он возвращал модуль числа х (если оно было положительным,
        то таким и остается, если он было отрицательным –
        то необходимо вернуть его без знака минус).
        */

        public static int abs(int x)
        {
            if (x < 0)
            {
                return -x;
            }
            return x;
        }

        /* Необходимо реализовать метод таким образом,
        чтобы он возвращал деление x на y, и при этом гарантировал,
        что не будет выкинута ошибка деления на 0.
        При делении на 0 следует вернуть из метода число 0.
        */

        public static int safeDiv(int x, int y)
        {
            if (y == 0)
            {
                return 0;
            }
            return x / y;
        }

        /* Необходимо реализовать метод таким образом,
        чтобы он возвращал максимальное значение из двух полученных методом чисел.
        */

        public static int max(int x, int y)
        {
            if (x > y) {
                return x;
            }
            return y;
        }

        /* Необходимо реализовать метод таким образом, чтобы он возвращал строку,
        которая включает два принятых методом числа и корректно выставленный
        знак операции сравнения (больше, меньше, или равно).
        */

        public static String makeDecision(int x, int y)
        {
            if (x > y) {
                return x + " > " + y;
            } else if (x < y) {
                return x + " < " + y;
            } else {
                return x + " = " + y;
            }
        }

        /* Тройной максимум
        */

        public static int max(int x, int y, int z)
        {
            if (x >= y && x >= z) {
                return x;
            } else if (y >= x && y >= z) {
                return y;
            } else {
                return z;
            }
        }

        /* Необходимо реализовать метод таким образом,
        чтобы он возвращал true, если два любых числа (из трех принятых)
        можно сложить так, чтобы получить третье.
        */

        public static boolean sum3(int x, int y, int z)
        {
            return (x + y == z) || (x + z == y) || (y + z == x);
        }

        /* Необходимо реализовать метод таким образом,
        чтобы он возвращал сумму чисел x и y.
        Однако, если сумма попадает в диапазон от 10 до 19, то надо вернуть число 20.
        */

    public static int sum2(int x, int y)
    {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

        /* Необходимо реализовать метод таким образом, чтобы он возвращал true,
        если число x делится нацело на 3 или 5. При этом,
        если оно делится и на 3, и на 5, то вернуть надо false.
        */

    public static boolean is35(int x)
    {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        return x % 3 == 0 || x % 5 == 0;
    }

        /* Необходимо реализовать метод таким образом, чтобы он возвращал true,
        если одно из принятых методом чисел равно шести, или их сумма равна шести,
        или разница между ними равна шести.
        */

    public static boolean magic6(int x, int y)
    {
        return x == 6 || y == 6 || (x + y == 6) || (x - y == 6) || (y - x == 6);
    }


        /* Необходимо реализовать метод таким образом, чтобы он возвращал строку,
        в которой сначала будет число х, а затем одно из слов: год, года, лет
        Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.
        Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел 12, 13, 14.
        Слово “лет” добавляется во всех остальных случаях.
        */

    public static String age(int x)
    {
        int y = x % 10;
        int z = x % 100;

        if (z >= 11 && z <= 14) {
            return x + " лет";
        } else if (y == 1) {
            return x + " год";
        } else if (y >= 2 && y <= 4) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    /* Метод принимает число x, обозначающее день недели.
    Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    которая будет обозначать текущий день недели, где 1- это понедельник,
    а 7 – воскресенье. Если число не от 1 до 7 то верните текст “это не день недели”.
    Вместо if в данной задаче используйте switch.
     */

    public static String day(int x)
    {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    /* В качестве параметра метод принимает строку, в которой записано название дня недели.
    Необходимо реализовать метод таким образом, чтобы он выводил на экран название переданного
    в него дня и всех последующих до конца недели дней. Если в качестве строки передан не день,
    то выводится текст “это не день недели”. Первый день понедельник, последний – воскресенье.
    Вместо if в данной задаче используйте switch.
    Делать для каждого из case вывод сразу всех дней – решение явно некорректное.
    Попробуйте применить для решения задачи принцип падения сквозь метки.
     */

    public static void printDays(String x)
    {
        switch (x) {
            case "понедельник": System.out.println("понедельник");
                break;
            case "вторник": System.out.println("вторник");
                break;
            case "среда": System.out.println("среда");
                break;
            case "четверг": System.out.println("четверг");
                break;
            case "пятница": System.out.println("пятница");
                break;
            case "суббота": System.out.println("суббота");
                break;
            case "воскресенье": System.out.println("воскресенье");
                break;
            default: System.out.println("это не день недели");
        }
    }

}
