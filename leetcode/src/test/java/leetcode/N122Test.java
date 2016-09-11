package leetcode;

import ch00.TimeCountExecutor;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class N122Test {

    private static final Logger log = Logger.getGlobal();

    private final TimeCountExecutor<Integer> executor = new TimeCountExecutor<>();
    private static final int maxSize = 10;
    private N122 n122;
    private MyRandom r = new MyRandom(40);

    private class MyRandom {
        private int bound;
        private Random r = new Random();

        MyRandom(int bound) {
            this.bound = bound;
        }

        int nextInt() {
            return r.nextInt(bound) / 2;
        }
    }

    @Before
    public void setUp() throws Exception {
        Integer[] arr = Stream.generate(r::nextInt).limit(maxSize).toArray(Integer[]::new);
        n122 = new N122(arr);
        log.info("arr: " + Arrays.toString(arr));
    }

    @Test
    public void process() throws Exception {
        log.info("n122 result: " + executor.timeLog(n122::process));
    }

}