package ge.edu.btu.midterm.iostreams;

import java.io.Serializable;

public class Partie implements Serializable {

    private long id;

    private String name;

    private int votes;

    public Partie() {
    }

    public Partie(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void addVote() {
        votes++;
    }

    @Override
    public String toString() {
        return name + ": " + votes;
    }
}
