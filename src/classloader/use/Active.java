package classloader.use;

/**
 * 类加载的主动使用
 * -XX:+TraceClassLoading 用于追踪类的加载信息并打印出来
 * @author stalern
 * @date 2019/10/6--11:03
 */
public class Active {
    public static void main(String[] args) {
        System.out.println(Child.str);
    }
}
