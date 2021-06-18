package yyds.singleton;

/**
 *单例模式（Singleton Pattern）
 *
 *这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象
 *
 * 优点：
 *      1.在内存中只有一个实例，减少内存开销，尤其是频繁的创建和销毁实例
 *      2.避免对系统资源多重占用
 *
 * 缺点：
 *      1.没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getSingletonObject();
        singletonObject.showMessage();
    }
}