package u3_BasicSyntax;

/**
 * Created by Sven on 2018/3/26.
 */

class FreshJuice{
    enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String args[]){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);
    }
}

/**
 * 笔记：
 * 枚举可以被声明为他们自己或者在一个类中。
 * 方法，变量，构造函数也可以在枚举内部定义。
 */
