package com.kyo.jnidemo.jni;

/**
 * @Description class used to load .so file
 * @Author KyoWang
 * @Since 2017/01/04
 */
public class JNIDemoUtil {

    static {
        System.loadLibrary("JNIDemo");
    }

    public native static String getString();
}
