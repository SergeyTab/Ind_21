public class Task_1 {

    //Составить процедуру, "рисующую" на экране горизонтальную линию из 10 символов "*".

    public static void main(String[] args) {
        String a;
        asterisk("*", 10);
    }

    public static void asterisk(String a, int count) {
        if (count > 0) {
            count--;
            System.out.print("* ");
            asterisk(a, count);
        }
    }

}
