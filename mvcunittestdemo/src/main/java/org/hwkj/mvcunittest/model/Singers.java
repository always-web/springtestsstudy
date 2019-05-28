package org.hwkj.mvcunittest.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author HuWendong
 * @date 2019/5/28 16:20
 */
public class Singers implements Serializable {
    private List<Singer> singers;

    public Singers() {
    }

    public Singers(List<Singer> singers) {
        this.singers = singers;
    }

    public List<Singer> getSingers() {
        return singers;
    }

    public void setSingers(List<Singer> singers) {
        this.singers = singers;
    }
}
