package com.company;

/**
 * Created by Brainacad4 on 09.04.2018.
 */
public interface IPair<K,V> {

    public K getKey();
    public V getValue();
    public void setValue(V val);
}
