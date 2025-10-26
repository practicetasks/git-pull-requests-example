import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Git");

        List<User> users = List.of(
                new User(1L, "Bob"),
                new User(2L, "Jack")
        );

        users.forEach(System.out::println);
    }
}
