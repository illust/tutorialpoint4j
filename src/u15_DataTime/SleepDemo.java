package u15_DataTime;
import java.util.Date;

/**
 * Created by Sven on 2018/3/29.
 */
public class SleepDemo {
    public static void main(String[] args){
        try{
            System.out.println(new Date() + "\n");
            Thread.sleep(5*60*100);
            System.out.println(new Date() + "\n");
        }catch(Exception e){
            System.out.println("Got an exception!");
        }
    }
}
