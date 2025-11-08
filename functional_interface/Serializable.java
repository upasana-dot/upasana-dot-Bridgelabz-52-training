import java.io.Serializable;
class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}
public class SerializableExample {
    public static void main(String[] args) {
        User user = new User("Alice", 30);  
        System.out.println("Created User: " + user);
    }
}