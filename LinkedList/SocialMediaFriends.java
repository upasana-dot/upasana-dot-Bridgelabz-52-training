package LinkedList;

class User {

    int id;
    String name;
    int age;

    User next;

    User(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class SocialMedia {

    User head;

    void addUser(int id, String name, int age) {

        User newUser = new User(id, name, age);

        newUser.next = head;
        head = newUser;
    }

    void searchUser(int id) {

        User temp = head;

        while (temp != null) {

            if (temp.id == id) {
                System.out.println("User Found: " + temp.name);
                return;
            }

            temp = temp.next;
        }

        System.out.println("User Not Found");
    }

    void displayUsers() {

        User temp = head;

        while (temp != null) {

            System.out.println(temp.id + " "
                    + temp.name + " "
                    + temp.age);

            temp = temp.next;
        }
    }
}

public class SocialMediaFriends {

    public static void main(String[] args) {

        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "Aman", 20);
        sm.addUser(2, "Riya", 21);

        sm.displayUsers();

        sm.searchUser(2);
    }
}
