package Home_work_1;

//Задание №1//
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //Задание №2//
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание №3//
    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    //Задание №4//
    public static void printColor() {
        int value = 123;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value == 0 || value <= 100) {
            System.out.println("Жёлтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }

    //Задание №5//
    public static void compareNumbers() {
        int a = 7;
        int b = 5;
        if (a >= b) {
            System.out.println("a>=b");
        } else if (a < b) {
            System.out.println("a<b");
        }
    }
}