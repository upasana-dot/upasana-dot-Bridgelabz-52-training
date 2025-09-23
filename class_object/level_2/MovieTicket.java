package level_2;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }
    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket();
        t1.bookTicket("Inception", 12, 300);
        t1.displayTicket();
    }
}

