package bladeFactory;
import blade.Blade;
import blade.FoilBlade;
public class FoilBladeFactory implements BladeFactory {
    @Override
    public Blade createBlade(){
        return new FoilBlade();
    }
}
