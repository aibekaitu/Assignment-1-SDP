package abstractBladeFactory;

import bladeProducts.Foil;
import bladeProducts.Epee;
import bladeProducts.Sabre;
import stmBlades.StMFoil;
import stmBlades.StMEpee;
import stmBlades.StMSabre;

public class StMBladeFactory implements FencingBladeFactory {

    @Override
    public Foil createFoil() {
        return new StMFoil();
    }

    @Override
    public Epee createEpee() {
        return new StMEpee();
    }

    @Override
    public Sabre createSabre() {
        return new StMSabre();
    }
}