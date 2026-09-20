package bladeFactory;
import blade.Blade;
import blade.EpeeBlade;
public class EpeeBladeFactory implements BladeFactory {
    @Override
    public Blade createBlade() {
        return new EpeeBlade();
    }
}
