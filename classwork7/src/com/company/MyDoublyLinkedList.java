package com.company;

public class MyDoublyLinkedList implements MyList {


    private int size;
    Node<Integer> first;
    Node<Integer> last;


    public class Node<Integer> {
        Integer value;
        Node<Integer> next;
        Node<Integer> previous;

        public Node(Integer value) {
            this.value = value;
        }

    }


    @Override
    public Integer get(int index) {

        if (index == 0) {
            return first.value;
        }
        Node<Integer> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;

        }
        return current.value;
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
        node.previous = last;
        last.next = node;
        last = node;
        size++;
    }

    @Override
    public void remove(int index) {
        Integer value = get(index);
        remove(value);
    }

    @Override
    public boolean remove(Integer value) {
        if (first == null) {
            return false;
        }

        if (first.value.equals(value)) {
            first.next.previous = null;
            first = first.next;
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
                    current.next.next.previous = current.next.previous;
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
