package bladeFactory;
import blade.Blade;
import blade.SabreBlade;
public class SabreBladeFactory implements BladeFactory{
    @Override
    public Blade createBlade() {
        return new SabreBlade();
    }
}
