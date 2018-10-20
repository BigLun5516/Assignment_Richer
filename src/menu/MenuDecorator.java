package menu;

import outdevice.OutDevice;

public abstract class MenuDecorator extends Menu {
    public MenuDecorator(Menu menu){
        this.menu = menu;
    }

    @Override
    public boolean process(){
        return menu.process();
    }

    @Override
    public void show(OutDevice outDevice){
        menu.show(outDevice);
    }

    @Override
    public boolean doChoice(int choice){
        return menu.doChoice(choice);
    }

    protected Menu menu;
}
