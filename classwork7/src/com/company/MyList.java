package com.company;

public interface MyList<T> {

    Integer get(int index);
    void add(Integer value);
    void remove(int index);
    boolean remove(Integer value);
    int size();
    boolean contains(Integer value);
}
