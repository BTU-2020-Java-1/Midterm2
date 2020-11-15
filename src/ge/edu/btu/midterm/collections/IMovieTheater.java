package ge.edu.btu.midterm.collections;

import java.util.Map;

public interface IMovieTheater {

    void initMovieTheater();

    void addMovie(MovieGenre genre, Movie movie);

    Map<MovieGenre, Double> getAverageRanks();

    void printInfo();
}
