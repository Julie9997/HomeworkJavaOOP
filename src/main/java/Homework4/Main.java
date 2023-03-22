package Homework4;


import Homework4.gb.GBList;
import Homework4.gb.list.GBArrayList;
import Homework4.gb.list.GBArrayListWithCapacity;
import Homework4.gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> gbList = new GBArrayList<>();
        gbList.add(4);
        gbList.add(2);
        gbList.add(3);
        System.out.println(gbList.size());
        System.out.println(gbList.get(1));
        gbList.remove(2);
        for (Integer i: gbList) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        GBList<Integer> gbListWithCapacity = new GBArrayListWithCapacity<>(10);
        gbListWithCapacity.add(4);
        gbListWithCapacity.add(2);
        gbListWithCapacity.add(3);
        System.out.println(gbListWithCapacity.get(1));
        gbListWithCapacity.remove(2);
        for (Integer i: gbListWithCapacity) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        GBLinkedList<Integer> gbLinkedList = new GBLinkedList<>();
        System.out.println(gbLinkedList.isEmpty());
        gbLinkedList.add(3);
        gbLinkedList.addLast(5);
        gbLinkedList.addFirst(7);
        gbLinkedList.addLast(8);
        gbLinkedList.addLast(6);
        gbLinkedList.add(3, 1);
        gbLinkedList.remove(3);
        for (Integer i: gbLinkedList) {
            System.out.print(i + " ");
        }

    }
}
