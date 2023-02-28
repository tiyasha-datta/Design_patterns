package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getObj();
        Singleton s2 = Singleton.getObj();
        Singleton s3 = Singleton.getObj();

        SingletonMultithreading sm1 = SingletonMultithreading.getObj();
        SingletonMultithreading sm2 = SingletonMultithreading.getObj();
        SingletonMultithreading sm3 = SingletonMultithreading.getObj();

        SingletonDoubleLock sd1 = SingletonDoubleLock.getObj();
        SingletonDoubleLock sd2 = SingletonDoubleLock.getObj();
        SingletonDoubleLock sd3 = SingletonDoubleLock.getObj();

    }
}
