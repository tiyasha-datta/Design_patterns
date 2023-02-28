package singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Singleton {

    //private constructor
    private Singleton(){}

    //private static object reference
    private static Singleton obj;

    //private static method for object creation
    public static Singleton getObj(){
        if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }

}
