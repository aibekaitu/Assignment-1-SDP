import java.util.Scanner;

import blade.Blade;
import bladeFactory.BladeFactory;
import bladeFactory.EpeeBladeFactory;
import bladeFactory.FoilBladeFactory;
import bladeFactory.SabreBladeFactory;
import abstractBladeFactory.BFBladeFactory;
import abstractBladeFactory.StMBladeFactory;
import client.FencingBladeClient;
public class Main {
    public static void main(String[] args) {
        FencingEquipmentDirector director = new FencingEquipmentDirector();
        FencingEquipmentSet foilSet = director.createFoilSet();
        FencingEquipmentSet sabreSet = director.createSabreSet();
        FencingEquipmentSet epeeSet = director.createEpeeSet();

        System.out.println("\nFactory Method");
        BladeFactory foilFactory = new FoilBladeFactory();
        Blade foildBlade = foilFactory.createBlade();
        foildBlade.displayInfo();

        BladeFactory epeeFactory = new EpeeBladeFactory();
        Blade epeeBlade= epeeFactory.createBlade();
        epeeBlade.displayInfo();

        BladeFactory sabreFactory =new SabreBladeFactory();
        Blade sabreBlade= sabreFactory.createBlade();
        sabreBlade.displayInfo();

        System.out.println("\nAbstract Factory");

        FencingBladeClient bfClient =
                new FencingBladeClient(new BFBladeFactory());

        System.out.println("BF Blades:");
        bfClient.displayBlades();

        FencingBladeClient stmClient =
                new FencingBladeClient(new StMBladeFactory());

        System.out.println("\nStM Blades:");
        stmClient.displayBlades();
    }
}