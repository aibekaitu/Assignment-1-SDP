import java.util.Scanner;

import blade.Blade;
import bladeFactory.BladeFactory;
import bladeFactory.FoilBladeFactory;
import bladeFactory.EpeeBladeFactory;
import bladeFactory.SabreBladeFactory;

import abstractBladeFactory.FencingBladeFactory;
import abstractBladeFactory.BFBladeFactory;
import abstractBladeFactory.StMBladeFactory;

import client.FencingBladeClient;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FencingEquipmentDirector director = new FencingEquipmentDirector();

        System.out.println("Choose fencing weapon:");
        System.out.println("1 - Foil");
        System.out.println("2 - Epee");
        System.out.println("3 - Sabre");

        int weaponChoice = scanner.nextInt();

        FencingEquipmentSet equipmentSet;
        BladeFactory bladeFactory;

        if (weaponChoice == 1) {
            equipmentSet = director.createFoilSet();
            bladeFactory = new FoilBladeFactory();
        } else if (weaponChoice == 2) {
            equipmentSet = director.createEpeeSet();
            bladeFactory = new EpeeBladeFactory();
        } else if (weaponChoice == 3) {
            equipmentSet = director.createSabreSet();
            bladeFactory = new SabreBladeFactory();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        Blade blade = bladeFactory.createBlade();

        System.out.println("\nFactory Method:");
        blade.displayInfo();

        System.out.println("\nChoose blade manufacturer:");
        System.out.println("1 - BF");
        System.out.println("2 - StM");

        int manufacturerChoice = scanner.nextInt();

        FencingBladeFactory familyFactory;

        if (manufacturerChoice == 1) {
            familyFactory = new BFBladeFactory();
        } else if (manufacturerChoice == 2) {
            familyFactory = new StMBladeFactory();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        FencingBladeClient client = new FencingBladeClient(familyFactory);

        System.out.println("\nAbstract Factory:");

        if (weaponChoice == 1) {
            client.displayFoil();
        } else if (weaponChoice == 2) {
            client.displayEpee();
        } else {
            client.displaySabre();
        }

        System.out.println("\nFencing Equipment Set:");
        System.out.println(equipmentSet);

        scanner.close();
    }
}