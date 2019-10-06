package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * VM args: -Xms20m -Xmx20m -XX: +HeapDumpOnOutOfMemoryError
 * @author stalern
 * @date 2019/9/29--09:47
 */
public class HeapOom {
    private static class OomObject{

    }

    public static void main(String[] args) {
        List<OomObject> list = new ArrayList<>();
        while (true){
            list.add(new OomObject());
        }
    }
}
