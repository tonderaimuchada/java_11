public class GarbageCollector {
    public static void main(String[] args) {
//        Z garbage collector (experimental feature) can run concurrently with application threads thus reduces pause times
//        It reduces heap fragmentation by moving live objects to contiguous memory blocks
//
//        Run as: java -XX:+UnlockExperimentalVMOptions -XX:+UseZGC AppName

//        Epsilon also experimental, does not perform any memory management tasks
//                Designed for testing, evaluating performance without garbage collection overhead
//                Ideal where memory management is handled outside the JVM
    }
}