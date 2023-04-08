package Problem6;

public class Movie {
    private String title;
    private String time;
    private int numSeats;
    private int numTicketsSold;

    public Movie(String title, String time, int numSeats) {
        this.title = title;
        this.time = time;
        this.numSeats = numSeats;
        this.numTicketsSold = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public int getNumSeatsAvailable() {
        return numSeats - numTicketsSold;
    }

    public void sellTickets(int numTickets) {
        numTicketsSold += numTickets;
    }
}
