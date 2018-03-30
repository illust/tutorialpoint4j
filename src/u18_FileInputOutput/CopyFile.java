package u18_FileInputOutput;
import java.io.*;
/**
 * Created by Sven on 2018/3/29.
 */
public class CopyFile {
    public static void main(String args[]) throws IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        }finally {
            if(in != null){
                in.close();
            }
        }
    }
}
