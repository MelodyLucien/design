package com.lucien.pattern.adapter.classMode;

import com.lucien.pattern.adapter.Adaptee;
import com.lucien.pattern.adapter.Target;

/**
 * <pre>
 *     author : Lucien Z
 *     e-mail : 825038797@qq.com
 *     time   : 2019/05/29
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class Adapter extends Adaptee implements Target {
    @Override
    public void getV2() {
        getV1();
    }
}
