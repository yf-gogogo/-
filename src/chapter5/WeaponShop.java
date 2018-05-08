package chapter5;

import chapter5.decorate.SilencerGun;
import chapter5.gun.InterfaceGun;
import chapter5.gun.M4A1;

public class WeaponShop {
    public static void main(String[] args) {
        InterfaceGun M4A1 = new M4A1();
        M4A1.openFire();
        System.out.println("******启动装饰器******");
        InterfaceGun silencerM4A1 = new SilencerGun(M4A1);
        silencerM4A1.openFire();
    }
}
