package com.lucien.pattern.adapter.ojectmode;

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
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void getV2() {
        adaptee.getV1();
    }
}
