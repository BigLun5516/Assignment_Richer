package outdevice;

public class StreamDevice extends OutDevice {
    @Override
    public void draw(String string){
        System.out.print(string);
    }

    @Override
    public void drawLn(String string){
        System.out.println(string);
    }


}
