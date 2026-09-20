package client;

import abstractBladeFactory.FencingBladeFactory;
import bladeProducts.Epee;
import bladeProducts.Foil;
import bladeProducts.Sabre;

public class FencingBladeClient {

    private final FencingBladeFactory factory;

    public FencingBladeClient(FencingBladeFactory factory) {
        this.factory = factory;
    }

    public void displayFoil() {
        Foil foil = factory.createFoil();
        foil.displayInfo();
    }

    public void displayEpee() {
        Epee epee = factory.createEpee();
        epee.displayInfo();
    }

    public void displaySabre() {
        Sabre sabre = factory.createSabre();
        sabre.displayInfo();
    }
}