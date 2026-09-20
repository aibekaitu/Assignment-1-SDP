package abstractBladeFactory;

import bladeProducts.Foil;
import bladeProducts.Epee;
import bladeProducts.Sabre;
import bfBlades.BFFoil;
import bfBlades.BFEpee;
import bfBlades.BFSabre;

public class BFBladeFactory implements FencingBladeFactory {

    @Override
    public Foil createFoil() {
        return new BFFoil();
    }

    @Override
    public Epee createEpee() {
        return new BFEpee();
    }

    @Override
    public Sabre createSabre() {
        return new BFSabre();
    }
}