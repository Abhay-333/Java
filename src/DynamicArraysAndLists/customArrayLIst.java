package DynamicArraysAndLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class customArrayLIst {

    public static class MyList {
        int arr[];
        int pointer = -1, size = 0;

        MyList(int size) {
            this.size = size;
            this.arr = new int[size];
        }

        MyList() {
            this.size = 0;
            this.arr = new int[0];
        }

        public int get(int index) {
            return arr[index];
        }

        public boolean isFull() {
            if (pointer + 1 >= arr.length) return true;
            return false;
        }

        public void add(int value) {
            if (isFull()) {
                int newArr[] = Arrays.copyOf(arr, size + 1);
                newArr[++pointer] = value;
                System.out.println(Arrays.toString(newArr));
                arr = newArr;
                size++;
            } else {
                arr[++pointer] = value;
            }
        }

        public void add(int index, int value) {
            if (isFull()) {
                int newArr[] = new int[size + 1];

                for (int i = 0; i < index; i++) {
                    newArr[i] = arr[i];
                }
                newArr[index] = value;

                for (int i = index; i <= pointer; i++) {
                    newArr[i + 1] = arr[i];
                }
                arr = newArr;
                size++;
            } else {
                for (int i = pointer; i >= index; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[index] = value;
            }
            pointer++;
        }

        public int capacity() {
            return pointer + 1;
        }

        public void remove(int index) {
            if (index < 0 || index > pointer) {
                throw new IndexOutOfBoundsException("Index " + index + " out of bound from length " + capacity());
            }

            int newArr[] = new int[size - 1];

            for (int i = 0, k = 0; i < arr.length; i++) {
                if (i == index) continue;
                newArr[k++] = arr[i];
            }
            size--;
            pointer--;
            arr = newArr;
        }


        @Override
        public String toString() {
            return Arrays.toString(arr);
        }
    }

    public static void main(String[] args) {
        // write a program to create a class name MyList and it should contain all the features of list

        MyList list1 = new MyList(5);
        List<String> list2 = new ArrayList<String>();
        list2.add("A");
        list2.add("B");
        list2.add("A");
        list2.add(null);
        System.out.println(list2);
        list1.add(4);
        list1.add(44);
        list1.add(1, 25);
        list1.remove(2);

    }
}
