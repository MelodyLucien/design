package com.lucien.pattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     author : Lucien Z
 *     e-mail : 825038797@qq.com
 *     time   : 2019/05/30
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class RegistersSingleton {
    private static Map <String, RegistersSingleton> maps = new HashMap <>();

    private RegistersSingleton() {
    }

    public static RegistersSingleton getInstance(String key) {
        RegistersSingleton singleton = maps.get(key);
        if (singleton == null) {
            synchronized (RegistersSingleton.class) {
                if(singleton == null) {
                    maps.put(key, new RegistersSingleton());
                }
            }
        }
        return maps.get(key);
    }
}
