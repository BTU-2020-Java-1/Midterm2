package ge.edu.btu.midterm.iostreams;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PartieService partieService = new PartieServiceImpl();

        while (true) {
            System.out.println("1. პარტიის დამატება");
            System.out.println("2. ხმის მიცემა");
            System.out.println("3. ინფორმაციის დაბეჭდვა");
            System.out.println("0. გამოსვლა");

            String option = scanner.nextLine();
            if (option.equals("0")) {
                break;
            }
            switch (option) {
                case "1":
                    System.out.println("პარტიის id:");
                    long id = Long.parseLong(scanner.nextLine());
                    System.out.println("პარტიის სახელი:");
                    String name = scanner.nextLine();
                    Partie partie = new Partie(id, name);
                    partieService.savePartie(partie);
                    break;
                case "2":
                    System.out.println("პარტიის id:");
                    partie = partieService.readPartie(Long.parseLong(scanner.nextLine()));
                    partie.addVote();
                    partieService.savePartie(partie);
                    break;
                case "3":
                    System.out.println("პარტიის id:");
                    partie = partieService.readPartie(Long.parseLong(scanner.nextLine()));
                    System.out.println(partie);
                    break;
                default:
                    System.out.println("არასწორი ოპცია");
            }
        }
    }
}
