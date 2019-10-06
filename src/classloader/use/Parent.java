package classloader.use;

/**
 * 父类
 * 静态代码块在静态字段之前加载
 * @author stalern
 * @date 2019/10/6--11:13
 */
class Parent {
    static String str = "Parent init";
    static {
        System.out.println("Parent static");
    }
}
