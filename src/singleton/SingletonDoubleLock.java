package singleton;

public class SingletonDoubleLock {

    //private constructor
    private SingletonDoubleLock(){}

    //private static obect reference
    private static SingletonDoubleLock obj;

    //private static method for object creation
    public static SingletonDoubleLock getObj(){
        if(obj == null) {
            synchronized (SingletonDoubleLock.class){
                if (obj == null) {
                    obj = new SingletonDoubleLock();
                }
            }
        }
        return obj;
    }
}
