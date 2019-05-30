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
public class HungerModeSingleton {
    private static HungerModeSingleton singleton = new HungerModeSingleton();
    private HungerModeSingleton(){
    }

    public static HungerModeSingleton getInstance() {
        return singleton;
    }
}
