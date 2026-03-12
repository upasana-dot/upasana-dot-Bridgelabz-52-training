package LinkedList;

class Ticket {

    int id;
    String customer;
    String movie;
    int seat;

    Ticket next;

    Ticket(int id, String customer, String movie, int seat) {

        this.id = id;
        this.customer = customer;
        this.movie = movie;
        this.seat = seat;
    }
}

class TicketSystem {

    Ticket head;

    void addTicket(int id, String customer, String movie, int seat) {

        Ticket newTicket = new Ticket(id, customer, movie, seat);

        if (head == null) {

            head = newTicket;
            newTicket.next = head;
            return;
        }

        Ticket temp = head;

        while (temp.next != head)
            temp = temp.next;

        temp.next = newTicket;
        newTicket.next = head;
    }

    void displayTickets() {

        if (head == null)
            return;

        Ticket temp = head;

        do {

            System.out.println(temp.id + " "
                    + temp.customer + " "
                    + temp.movie + " "
                    + temp.seat);

            temp = temp.next;

        } while (temp != head);
    }

    void countTickets() {

        int count = 0;

        Ticket temp = head;

        if (head == null)
            return;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Tickets = " + count);
    }
}

public class TicketReservation {

    public static void main(String[] args) {

        TicketSystem system = new TicketSystem();

        system.addTicket(1, "Aman", "Avengers", 10);
        system.addTicket(2, "Riya", "Avatar", 12);

        system.displayTickets();

        system.countTickets();
    }
}
