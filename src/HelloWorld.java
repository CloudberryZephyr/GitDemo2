import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        java.lang.String name = in.nextLine();


        System.out.println("Hello " + name);
    }
}
