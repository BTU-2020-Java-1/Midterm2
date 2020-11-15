package ge.edu.btu.midterm.collections;

public class Runner {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Movie 1", 9.5);
        Movie movie2 = new Movie("Movie 2", 7.7);
        Movie movie3 = new Movie("Movie 3", 10.0);
        Movie movie4 = new Movie("Movie 4", 8.9);
        Movie movie5 = new Movie("Movie 5", 8.2);

        MovieTheater movieTheater = new MovieTheater("Movie Theater");
        movieTheater.initMovieTheater();

        movieTheater.addMovie(MovieGenre.DRAMA, movie1);
        movieTheater.addMovie(MovieGenre.COMEDY, movie2);
        movieTheater.addMovie(MovieGenre.COMEDY, movie3);
        movieTheater.addMovie(MovieGenre.FANTASY, movie4);
        movieTheater.addMovie(MovieGenre.DRAMA, movie5);

        System.out.println(movieTheater.getAverageRanks());

        movieTheater.printInfo();
    }
}
