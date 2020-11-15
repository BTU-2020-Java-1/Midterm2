package ge.edu.btu.midterm.oop;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        House house = new House("4522", 80_000, 100, 17.5);
        Car car = new Car("9508", 15_000, true);

        List<Realty> realties = new ArrayList<>();
        realties.add(house);
        realties.add(car);

        try {
            validateRealties(realties);
        } catch (RealtyException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა: " + ex.getMessage());
        }

        for (Realty realty : realties) {
            System.out.println(realty);
        }
    }

    private static void validateRealties(List<Realty> realties) throws RealtyException {
        for (int i = 0; i < realties.size(); i++) {
            for (int j = i + 1; j < realties.size(); j++) {
                if (realties.get(i).getCode().equals(realties.get(j).getCode())) {
                    throw new RealtyException("Duplicate code");
                }
            }
        }
    }
}
