package ge.edu.btu.midterm.iostreams;

import java.io.*;

public class PartieServiceImpl implements PartieService {

    @Override
    public void savePartie(Partie partie) {
        String path = "data/" + partie.getId() + ".txt";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))){
            out.writeObject(partie);
        } catch (IOException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა " + ex.getMessage());
        }
    }

    @Override
    public Partie readPartie(long id) {
        String path = "data/" + id + ".txt";
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            return (Partie) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა " + ex.getMessage());
        }
        return null;
    }
}
