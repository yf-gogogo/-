package chapter5.decorate;

import chapter5.gun.InterfaceGun;

public class SilencerGun extends AbstractGunDecorator {
    public SilencerGun(InterfaceGun decoratedGun){
        super(decoratedGun);
    }

    @Override
    public void openFire() {
        setSilencer();
        System.out.println("消音M4A1 开火");
    }

    private void setSilencer(){
        System.out.println("安装上消音器");
    }
}
