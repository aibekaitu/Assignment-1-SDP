import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        FencingEquipmentDirector director = new FencingEquipmentDirector();
        FencingEquipmentSet foilSet = director.createFoilSet();
        FencingEquipmentSet sabreSet = director.createSabreSet();
        FencingEquipmentSet epeeSet = director.createEpeeSet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose fencing weapon:");
        System.out.println("1 - Foil");
        System.out.println("2 - Epee");
        System.out.println("3 - Sabre");

        int choice = scanner.nextInt();
        if (choice == 1) {
            FencingEquipmentSet set = director.createFoilSet();
            System.out.println(set);

        } else if (choice == 2) {
            FencingEquipmentSet set = director.createEpeeSet();
            System.out.println(set);

        } else if (choice == 3) {
            FencingEquipmentSet set = director.createSabreSet();
            System.out.println(set);
        }
            else {
            System.out.println("Invalid choice!");
        }
    }
}