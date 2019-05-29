package com.lucien.pattern.classMode;

import com.lucien.pattern.Target;

/**
 * <pre>
 *     author : Lucien Z
 *     e-mail : 825038797@qq.com
 *     time   : 2019/05/29
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class Client {
    public static void main(String[] args) {
        Target target =  new Adapter();
        target.getV2();
    }
}
