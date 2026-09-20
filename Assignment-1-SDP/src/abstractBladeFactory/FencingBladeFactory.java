package abstractBladeFactory;
import bladeProducts.Foil;
import bladeProducts.Epee;
import bladeProducts.Sabre;
public interface FencingBladeFactory {
    Foil createFoil();
    Epee createEpee();
    Sabre createSabre();
}
