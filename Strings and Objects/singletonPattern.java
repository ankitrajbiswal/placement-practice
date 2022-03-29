public class singletonPattern {
    public static void main(){
        AppConfig obj=AppConfig.getInstance();
        AppConfig obj2=AppConfig.getInstance();

    }
    
}
class AppConfig{
    private AppConfig(){

    }
    private static AppConfig obj=new AppConfig();
    public static AppConfig getInstance(){
        return obj;
    } 
}
