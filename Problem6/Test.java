package Problem6;

public class Test{
    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater();
        Movie movie1 = new Movie("The Matrix", "8:00pm", 100);
        Movie movie2 = new Movie("Jaws", "9:00pm", 80);
        theater.addMovie(movie1);
        theater.addMovie(movie2);

        theater.displaySchedule();

        theater.sellTicket(movie1, 2);

        theater.sellTicket(movie2, 3);

        theater.sellTicket(movie1, 50);

        movie2.sellTickets(10);
        theater.displaySchedule();
        theater.removeMovie(movie1);
        theater.displaySchedule();
    }
}
