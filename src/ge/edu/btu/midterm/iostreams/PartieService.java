package ge.edu.btu.midterm.iostreams;

public interface PartieService {

    void savePartie(Partie partie);

    Partie readPartie(long id);
}
