package javameistars.helloworld;

public class HelloWorld {
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println("Hello to "+args[0]);
        } else {
            System.out.println("Hello world");
        }
    }
}
