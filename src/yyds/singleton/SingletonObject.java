package yyds.singleton;

public class SingletonObject {
    private static SingletonObject singletonObject = new SingletonObject();
    public SingletonObject(){}
    public static SingletonObject getSingletonObject(){
        return singletonObject;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
