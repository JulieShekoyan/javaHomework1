package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList mySinglyLinkedList = new MyLinkedList();

        mySinglyLinkedList.add(5);
        mySinglyLinkedList.add(9);
        mySinglyLinkedList.add(26);
        mySinglyLinkedList.add(91);
        mySinglyLinkedList.add(34);
        System.out.println(mySinglyLinkedList);
        System.out.println(mySinglyLinkedList.get(4));
        mySinglyLinkedList.remove((Integer) 9);
        mySinglyLinkedList.remove((int)3);
        System.out.println(mySinglyLinkedList);


        MyLinkedList myDoublyLinkedList = new MyLinkedList();

        myDoublyLinkedList.add(96);
        myDoublyLinkedList.add(324);
        myDoublyLinkedList.add(69);
        myDoublyLinkedList.add(26);
        myDoublyLinkedList.add(853);
        myDoublyLinkedList.add(4);
        myDoublyLinkedList.add(0);
        System.out.println(myDoublyLinkedList);
        System.out.println(myDoublyLinkedList.get(4));
        myDoublyLinkedList.remove((Integer) 69);
        myDoublyLinkedList.remove((int)5);
        System.out.println(myDoublyLinkedList);


    }
}

