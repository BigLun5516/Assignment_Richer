package menu;

import outdevice.OutDevice;
import outdevice.OutDeviceWithSpace;
import outdevice.StreamDevice;

public class MenuDecoratorWithMusic extends MenuDecorator {
    public MenuDecoratorWithMusic(Menu menu){
        super(menu);
    }

    @Override
    public boolean process() {
        show(new OutDeviceWithSpace(new StreamDevice()));
        boolean res = menu.doChoice(getChoice());
        return res;
    }

    @Override
    public void show(OutDevice outDevice) {
        System.out.println("\nplaying music\n");
        super.show(outDevice);
        System.out.println("\nstop music\n");
    }
}
