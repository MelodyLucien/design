package com.lucien.pattern.singleton;

/**
 * <pre>
 *     author : Lucien Z
 *     e-mail : 825038797@qq.com
 *     time   : 2019/05/30
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class LazyModeSingleton {
    private static volatile LazyModeSingleton lazyModeSingleton;

    private LazyModeSingleton(){
    }

    public static LazyModeSingleton getLazyModeSingleton() {
        if(lazyModeSingleton  == null){
            synchronized (LazyModeSingleton.class) {
                lazyModeSingleton = new LazyModeSingleton();
            }
        }
        return lazyModeSingleton;
    }
}
