package chapter5.decorate;

import chapter5.gun.InterfaceGun;

public abstract class AbstractGunDecorator implements InterfaceGun {
    protected InterfaceGun decoratedGun;

    public AbstractGunDecorator(InterfaceGun decoratedGun){
        this.decoratedGun = decoratedGun;
    }

    @Override
    public void openFire() {
        if(decoratedGun!=null){
            decoratedGun.openFire();
        }
    }
}
