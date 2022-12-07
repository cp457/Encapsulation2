import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Put here your age!");
        person.age = scanner.nextInt();

        System.out.println("Your name?");
        person.name =  scanner.nextLine();

        System.out.println("What about your surname?");
        person.surname = scanner.nextLine();

        System.out.println("How tall are you?");
        person.height = scanner.nextDouble();

        System.out.printf("%s, %s, %d, %.2f", person.getName(), person.getSurname(), person.getAge(), person.getHeight());
    }
}
