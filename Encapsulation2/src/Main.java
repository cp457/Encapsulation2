import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Put here your age!");
        person.setAge(scanner.nextInt());

        System.out.println("Your name?");
        person.setName(scanner.next());

        System.out.println("What about your surname?");
        person.setSurname(scanner.next());

        System.out.println("How tall are you?");
        person.setHeight(scanner.nextDouble());

        System.out.printf("%d, %s, %s, %,.2f", person.getAge(), person.getName(), person.getSurname(), person.getHeight());
    }
}
