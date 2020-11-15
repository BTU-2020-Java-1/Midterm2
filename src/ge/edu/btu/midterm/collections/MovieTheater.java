package ge.edu.btu.midterm.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieTheater implements IMovieTheater {

    private String name;

    private Map<MovieGenre, List<Movie>> moviesMap = new HashMap<>();

    public MovieTheater() {
    }

    public MovieTheater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void initMovieTheater() {
        for (MovieGenre genre : MovieGenre.values()) {
            moviesMap.put(genre, new ArrayList<>());
        }
    }

    @Override
    public void addMovie(MovieGenre genre, Movie movie) {
        moviesMap.get(genre).add(movie);
    }

    @Override
    public Map<MovieGenre, Double> getAverageRanks() {
        Map<MovieGenre, Double> averageRanks = new HashMap<>();
        for (MovieGenre genre : moviesMap.keySet()) {
            List<Movie> movies = moviesMap.get(genre);
            double sum = 0.0;
            double average = 0.0;
            for (Movie movie : movies) {
                sum = sum + movie.getRank();
            }
            if (!movies.isEmpty()) {
                average = sum / movies.size();
            }
            averageRanks.put(genre, average);
        }
        return averageRanks;
    }

    @Override
    public void printInfo() {
        for (MovieGenre genre : moviesMap.keySet()) {
            System.out.println(genre);
            for (Movie movie : moviesMap.get(genre)) {
                System.out.println(movie);
            }
        }
    }
}
