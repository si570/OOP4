import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        System.out.println("Enter in a Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Please enter your email: ");
        String email = sc.nextLine();
        System.out.println("Please enter your Course: ");
        String course = sc.nextLine();

        person n = new person();
        n.setName(name);
        n.setEmail(email);
        n.setCourse(course);


    }
    }

