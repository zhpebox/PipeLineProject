package com.TfanXing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public abstract class AbsFruit<S, V> {

    S s;
    V v;

    List<?> m ;

    public AbsFruit(S s, V v) {
        this.s = s;
        this.v = v;
    }

    public List<?> getList(){
        m = Arrays.asList(s,v);
        return m;
    }

}
