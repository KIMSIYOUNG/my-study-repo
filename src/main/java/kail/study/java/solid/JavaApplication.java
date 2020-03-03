package kail.study.java.solid;

public class JavaApplication {
    public static void main(String[] args){
        String example = new String("Hello World");
        String example2 = new String("Hello World");
        System.out.println("두 변수가 가지고 있는 주소 값이 같니?");
        System.out.println(example == example2);
        System.out.println(example);


        String s = "hello";
        System.out.println(s);
        s += "world";
        System.out.println(s);

        int a = 3;
        System.out.println(a);
        a+= 3;
        System.out.println(a);
    }
}
