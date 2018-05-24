package com.company;


import java.util.ArrayList;

public class PairCollection<K extends Number & Comparable,V> {

    private ArrayList<Pair<K,V>> list;

    public PairCollection(ArrayList<Pair<K,V>> list)
    {
        this.list = list;
    }

    public ArrayList getAllItemms(){return list;}

    public V getValue(K key){
        for (Pair<K,V> holder : list) {
            if ( holder.getKey() == key){
                return holder.getValue();
            }
        }
        return null;
    }

    public int getKeysCount(K key)
    {
        return list.size();
    }

    public void removeByValue(String checkVar){
        Pair pair;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue().equals(checkVar)){
                pair = list.get(i);
                pair.setValue(checkVar);
                list.remove(pair);
            }
        }
    }
}
