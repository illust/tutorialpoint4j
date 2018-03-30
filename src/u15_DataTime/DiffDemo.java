package u15_DataTime;
import java.util.Date;
/**
 * Created by Sven on 2018/3/29.
 */
public class DiffDemo {
    public static void main(String args[]){
        try{
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        }catch (Exception e){
            System.out.println("Got an exception!");
        }
    }
}
