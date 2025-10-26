import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Git");

        Map<Long, User> users = Map.of(
                1L, new User(1L, "Bob"),
                2L, new User(2L, "Jack")
        );
        users.values().forEach(System.out::println);
    }
}
