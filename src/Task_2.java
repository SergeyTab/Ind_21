import java.util.Scanner;

public class Task_2 {

    //Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа символов "*".

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество символов *: ");
        int a = sc.nextInt();
        sc.close();

        asterisk("*", a);
    }

    public static void asterisk(String a, int count){
        if (count>0){
            count--;
            System.out.print("* ");
            asterisk(a, count);
        }
    }
}
