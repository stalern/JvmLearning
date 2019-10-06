package classloader.use;

/**
 * 子类
 * @author stalern
 * @date 2019/10/6--11:14
 */
class Child extends Parent {
    //static String str = "Child init";
    static {
        System.out.println("Child static");
    }
}
