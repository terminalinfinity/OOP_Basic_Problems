package Problem6;

import java.util.ArrayList;

public class MovieTheater {
    private ArrayList<Movie> schedule;

    public MovieTheater() {
        schedule = new ArrayList<Movie>();
    }

    public void addMovie(Movie movie) {
        schedule.add(movie);
        System.out.println("Added " + movie.getTitle() + " to the schedule.");
    }

    public void removeMovie(Movie movie) {
        schedule.remove(movie);
        System.out.println("Removed " + movie.getTitle() + " from the schedule.");
    }

    public void displaySchedule() {
        System.out.println("Movie schedule:");
        for (Movie movie : schedule) {
            System.out.println("- " + movie.getTitle() + " at " + movie.getTime());
        }
    }

    public void sellTicket(Movie movie, int numTickets) {
        if (movie.getNumSeatsAvailable() >= numTickets) {
            movie.sellTickets(numTickets);
            System.out.println(numTickets + " ticket(s) sold for " + movie.getTitle() + ".");
        } else {
            System.out.println("Sorry, not enough seats available for " + movie.getTitle() + ".");
        }
    }
}
