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
public class StaticInnerHolderSingleton {
    private StaticInnerHolderSingleton(){
    }

   private static class StaticHolder{
        private static StaticInnerHolderSingleton singleton = new StaticInnerHolderSingleton();
    }

    public static StaticInnerHolderSingleton getInstance() {
        return StaticHolder.singleton;
    }
}
