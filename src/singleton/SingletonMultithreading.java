package singleton;

public class SingletonMultithreading {

    //private constructor
    private SingletonMultithreading(){}

    //private static obect reference
    private static SingletonMultithreading obj;

    //private static method for object creation
    public static synchronized SingletonMultithreading getObj(){
        if(obj == null){
            obj = new SingletonMultithreading();
        }
        return obj;
    }
}
