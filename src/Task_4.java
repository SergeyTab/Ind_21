public class Task_4 {

    //Напечатать числа в виде следующей таблицы:
    // 1 2...10
    // 1 2...10
    // 1 2...10
    // 1 2...10

    public static void main(String[] args) {
        printTable(1);
        System.out.println();
        printTable(1);
        System.out.println();
        printTable(1);
        System.out.println();
        printTable(1);
        System.out.println();

    }

    public static void printTable(int a){
        if (a <= 10){
            System.out.printf("%d ", a);
            a++;
            printTable(a);
        }

    }
}
