package menu;

import outdevice.OutDevice;
import outdevice.OutDeviceWithSpace;
import outdevice.StreamDevice;

public class MenuDecoratorWithHead extends MenuDecorator {
    public MenuDecoratorWithHead(Menu menu){
        super(menu);
    }

    @Override
    public boolean process() {
        show(new OutDeviceWithSpace(new StreamDevice()));
        int choice = getChoice();
        return doChoice(choice);
    }

    @Override
    public void show(OutDevice outDevice) {
        outDevice.drawLn("=========================");
        outDevice.drawLn("=                       =");
        outDevice.drawLn("=========================");
        super.show(outDevice);
    }
}
