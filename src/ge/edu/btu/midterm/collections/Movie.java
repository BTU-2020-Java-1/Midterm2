package ge.edu.btu.midterm.collections;

public class Movie {

    private String name;

    private double rank;

    public Movie() {
    }

    public Movie(String name, double rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return name + ": " + getRank();
    }
}
