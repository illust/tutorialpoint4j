package u15_DataTime;
import java.util.*;
import java.text.*;

/**
 * Created by Sven on 2018/3/29.
 */
public class DateDemo {
    public static void main(String[] args){
        Date dt = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dt));

    }
}
