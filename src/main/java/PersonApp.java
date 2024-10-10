import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // promptting for user1 input
        System.out.println("Enter in a Name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your email: ");
        String email = sc.nextLine();
        System.out.println("Please enter your Course: ");
        String course = sc.nextLine();

        // promptting for user2 input
        System.out.println("Enter in a Name: ");
        String name2 = sc.nextLine();
        System.out.println("Please enter your email: ");
        String email2 = sc.nextLine();
        System.out.println("Please enter your Course: ");
        String course2 = sc.nextLine();

        // promptting for user3 input
        System.out.println("Enter in a Name: ");
        String name3 = sc.nextLine();
        System.out.println("Please enter your email: ");
        String email3 = sc.nextLine();
        System.out.println("Please enter your Course: ");
        String course3 = sc.nextLine();

        //first student
        person n = new person();
        n.setName(name);
        n.setEmail(email);
        n.setCourse(course);

        //second student
        person n2 = new person();
        n2.setName(name2);
        n2.setEmail(email2);
        n2.setCourse(course2);


        //third student
        person n3 = new person("billybob", "billybob@atu.ie", "SW and Elec Eng");
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);


    }
}

