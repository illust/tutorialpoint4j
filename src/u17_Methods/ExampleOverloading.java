package u17_Methods;

/**
 * Created by Sven on 2018/3/29.
 * Method Overloading
 * 当一个类有同名但是参数不同的多个方法时，称为方法重载，它与覆盖(overriding)不同。
 * 覆盖是指方法拥有相同的名字，类型，参数数量等等
 */
public class ExampleOverloading {
    public static void main(String[] args){
        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.4;
        int result1 = minFunction(a,b);
        // same function name with different parameters
        double result2 = minFunction(c,d);
        System.out.println("Minimum Value = " + result1);
        System.out.println("Minimum Value = " + result2);
    }

    // for integer
    public static int minFunction(int n1,int n2){
        int min;
        if(n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    // for double
    public static double minFunction(double n1,double n2){
        double min;
        if(n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }
}
