package client;

import abstractBladeFactory.FencingBladeFactory;
import bladeProducts.Foil;
import bladeProducts.Epee;
import bladeProducts.Sabre;

public class FencingBladeClient {

    private final Foil foil;
    private final Epee epee;
    private final Sabre sabre;

    public FencingBladeClient(FencingBladeFactory factory) {
        foil = factory.createFoil();
        epee = factory.createEpee();
        sabre = factory.createSabre();
    }

    public void displayBlades() {
        foil.displayInfo();
        epee.displayInfo();
        sabre.displayInfo();
    }
}