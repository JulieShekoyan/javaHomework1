package com.company;

public class MyLinkedList implements MyList {


    private int size;
    Node<Integer> first;
    Node<Integer> last;


    public class Node<Integer> {
        Integer value;
        Node<Integer> next;

        public Node(Integer value) {
            this.value = value;
        }

    }

    @Override
    public void add(Integer value) {
        Node<Integer> node = new Node<>(value);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }

    @Override
    public boolean remove(Integer value) {

        if (first == null) {
            return false;
        }

        if (first.value.equals(value)) {
            first.next = first;
            size--;
            return true;
        }
        Node<Integer> current = first;
        for (int i = 0; i < size - 1; i++) {
            if (current.next.value.equals(value)) {

                if (i == size - 2) {
                    current.next = null;
                    last = current;
                } else {
                    current.next = current.next.next;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Integer get(int index) {

        if (first == null) {
            return null;
        }

        Node<Integer> current = first;

        if (index == 0) {
            return first.value;
        }

        for (int i = 0; i < size - 1; i++) {
            if (i == index - 1) {
                current.value = current.next.value;
                return current.value;

            }
            current = current.next;
        }

        return null;
    }

    @Override
    public void remove(int index) {

        if (first == null) {
            return;
        }

        Node<Integer> current = first;

        if (index == 0) {
            first.next = first;
            size--;
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            if (i == index - 1) {
                if(index == size - 1){
                    current.next = null;
                    last = current;
                    size--;
                    return;
                }
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Integer value) {
        if (first.value.equals(value)) {
            return true;
        }
        Node<Integer> current = first;
        for (int i = 0; i < size - 1; i++) {
            if (current.next.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<Integer> current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.value);
            if (i < size - 1) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}
