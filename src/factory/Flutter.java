package factory;

public class Flutter {

    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("this changes the theme");
    }

    public void setRefresherRate(){
        System.out.println("this changes the refresher rate");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(platform);
    }
}
