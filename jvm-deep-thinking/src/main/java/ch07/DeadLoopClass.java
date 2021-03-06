package ch07;

/**
 * 类加载时，同一个类的<cinit>()方法是同步的
 */
class DeadLoopClassTest {

    static class DeadLoopClass {
        static {
            if (true) {
                System.out.println(Thread.currentThread() + " init DeadLoopClass");
                while (true) {
                }
            }
        }
    }

    public static void main(String[] args) {
        Runnable script = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + " start...");
                DeadLoopClass dl = new DeadLoopClass();
                System.out.println(Thread.currentThread() + " run over.");
            }
        };

        Thread thread1 = new Thread(script);
        Thread thread2 = new Thread(script);
        thread1.start();
        thread2.start();
    }
}
