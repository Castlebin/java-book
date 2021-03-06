package ch02;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.4.1 Java堆内存溢出
 * <p>
 * VM args:

    -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/Users/heller/tmp/heapOOM.hprof

 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
