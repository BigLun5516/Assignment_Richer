package outdevice;

public class OutDeviceWithSpace extends OutDevice {
    public OutDeviceWithSpace(OutDevice outDevice){
        this.outDevice = outDevice;
    }

    @Override
    public void draw(String string){
        outDevice.draw("    ");
        outDevice.draw(string);
    }

    @Override
    public void drawLn(String string){
        outDevice.draw("    ");
        outDevice.drawLn(string);
    }

    private OutDevice outDevice;
}
