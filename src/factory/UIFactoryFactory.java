package factory;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform platform){
        switch(platform){
            case IOS: return new IOSFactory();
            case ANDROID: return new AndroidFactory();
            case WINDOWS: return new WindowsFactory();
        }
        return null;
    }
}
