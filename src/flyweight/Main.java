package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BulletRegistry bulletRegistry = new BulletRegistry();

        Bullet fiveMMBullet = new Bullet();
        fiveMMBullet.setBulletType(BulletType.FIVE_MM);
        bulletRegistry.registerBullet(BulletType.FIVE_MM, fiveMMBullet);

        Bullet sevenMMBullet = new Bullet();
        sevenMMBullet.setBulletType(BulletType.SEVEN_MM);
        bulletRegistry.registerBullet(BulletType.SEVEN_MM, sevenMMBullet);

        List<FlyingBullet> flyingBullets = new ArrayList<>();

        for (int i = 0; i < 2000; i++) {
            System.out.println("something");
            FlyingBullet flyingBullet = new FlyingBullet();
            flyingBullet.setBullet(bulletRegistry.getBullet(BulletType.FIVE_MM));
            flyingBullet.setBulletStatus(BulletStatus.NONFIRED);
            System.out.println(flyingBullet);


        }
    }
}
