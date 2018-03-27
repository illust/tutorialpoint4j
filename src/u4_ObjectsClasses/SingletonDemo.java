package u4_ObjectsClasses;

/**
 * Created by Sven on 2018/3/27.
 */
public class SingletonDemo {
    public static void main(String[] args){
        Singleton tmp = Singleton.getInstance();
        tmp.demoMethod();
    }
}
