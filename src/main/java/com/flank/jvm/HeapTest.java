package com.flank.jvm;

/**
 * [GC (Allocation Failure) [PSYoungGen: 2031K->496K(2560K)] 2031K->878K(9728K), 0.0009052 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [GC (Allocation Failure) [PSYoungGen: 2237K->496K(2560K)] 2619K->2126K(9728K), 0.0009036 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [GC (Allocation Failure) [PSYoungGen: 2544K->484K(2560K)] 8014K->6610K(9728K), 0.0006348 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [Full GC (Ergonomics) [PSYoungGen: 484K->0K(2560K)] [ParOldGen: 6126K->4537K(7168K)] 6610K->4537K(9728K), [Metaspace: 3159K->3159K(1056768K)], 0.0060476 secs] [Times: user=0.09 sys=0.00, real=0.01 secs]
 * [GC (Allocation Failure) [PSYoungGen: 66K->192K(2560K)] 7164K->7289K(9728K), 0.0005648 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [Full GC (Ergonomics) [PSYoungGen: 192K->0K(2560K)] [ParOldGen: 7097K->5820K(7168K)] 7289K->5820K(9728K), [Metaspace: 3196K->3196K(1056768K)], 0.0031301 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [GC (Allocation Failure) [PSYoungGen: 0K->0K(2560K)] 5820K->5820K(9728K), 0.0002475 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [Full GC (Allocation Failure) [PSYoungGen: 0K->0K(2560K)] [ParOldGen: 5820K->5755K(7168K)] 5820K->5755K(9728K), [Metaspace: 3196K->3196K(1056768K)], 0.0062587 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
 * i = 17
 * Heap
 *  PSYoungGen      total 2560K, used 142K [0x00000000ffd00000, 0x0000000100000000, 0x0000000100000000)
 *   eden space 2048K, 6% used [0x00000000ffd00000,0x00000000ffd238b8,0x00000000fff00000)
 *   from space 512K, 0% used [0x00000000fff00000,0x00000000fff00000,0x00000000fff80000)
 *   to   space 512K, 0% used [0x00000000fff80000,0x00000000fff80000,0x0000000100000000)
 *  ParOldGen       total 7168K, used 5755K [0x00000000ff600000, 0x00000000ffd00000, 0x00000000ffd00000)
 *   object space 7168K, 80% used [0x00000000ff600000,0x00000000ffb9ef68,0x00000000ffd00000)
 *  Metaspace       used 3254K, capacity 4496K, committed 4864K, reserved 1056768K
 *   class space    used 356K, capacity 388K, committed 512K, reserved 1048576K
 * java.lang.OutOfMemoryError: Java heap space
 * @author flank
 * @date 2021/3/1 10:38
 */
public class HeapTest {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
