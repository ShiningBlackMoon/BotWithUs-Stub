package net.botwithus.rs3.util;

import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {
    public static ThreadLocalRandom getSecureThreadLocalRandom() { return null; }
    public static boolean nextBoolean() { return false; }
    public static double nextDouble(int min, int max) { return -1d; }
    public static <E> E nextElement(E[] array) { return null; }
    public static <E> E nextElement(Collection<E> collection) { return null; }
    public static int nextInt() { return -1; }
    public static int nextInt(int max) { return -1; }
    public static int nextInt(int min, int max) { return -1; }
}
