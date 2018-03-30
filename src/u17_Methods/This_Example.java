package u17_Methods;

/**
 * Created by Sven on 2018/3/29.
 * this是java中的一个关键字，用于引用当前类的对象，在实例方法或构造函数中使用。
 * 使用this可以引用类成员比如构造器，变量和方法。
 * 通常this有以下几种用法：
 * 1) 在构造器或者方法中，将同名的实例变量和局部变量区分开；
 * 2) 调用类当中的其他构造器（通常为参数化或者默认构造器），也称为显式构造器调用
 * */
public class This_Example {
    // Instance variable num
    int num = 10;
    This_Example(){
        System.out.println("This is an example program on keyword this ");
    }
    This_Example(int num){
        // Invoking the default constructor
        this();

        // Assigning the local variable num to the instance variable num
        this.num = num;
    }

    public void greet(){
        System.out.println("Hi Welcome to Tutorialspoint");
    }

    public void print(){
        // Local variable num
        int num = 20;

        // Printing the local variable
        System.out.println("value of local variable num is : " + num);

        // Printing the instance variable
        System.out.println("value of instance num is : " + this.num);

        // Invoking the greet method of a class
        this.greet();
    }

    public static void main(String[] args){
        // Instantiating the class
        This_Example obj1 = new This_Example();

        // Invoking the print method
        obj1.print();

        // Passing a new value to the num variable through parametrized constructor
        This_Example obj2 = new This_Example(30);

        // Invoking the print method again
        obj2.print();
    }
}
