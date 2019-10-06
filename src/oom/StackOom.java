package oom;

/**
 * VM args: -Xss128k
 * @author stalern
 * @date 2019/9/29--09:57
 */
public class StackOom {
    private int stackLength = 1;

    public void stackLeak(){
        stackLength ++;
        stackLeak();
    }
}
