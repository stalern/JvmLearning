package classloader.constant;

/**
 * 常量的使用
 * 常量会在编译阶段被放入Test的常量池中，本质上调用类即Test并没有直接调用Constant类
 * 所以Constant并没有初始化
 * 注意：Constant.STRING这一常量并不是在Constant的常量池中，而是在Test的常量池中
 * 当文件编译完成后，甚至可以将Constant的class文件删除
 *
 * 助记符：
 * ldc 将int,float或者String的常量值从常量池推送至栈顶
 * bipush 将单字节（-128~127）的常量值推送至栈顶 short s = 127
 * sipush 将短整型常量值（-32768~32767）推送至栈顶 int i = 128
 * iconst_（1~5） 将int类型 1~5 推送至栈顶 int i = 1
 * @author stalern
 * @date 2019/10/6--11:37
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Constant.STRING);
    }
}
