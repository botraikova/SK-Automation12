package Structures;

import java.util.LinkedList;

public class reversedLinkedList {
    public static void main(String[] args) {
        LinkedList<String> petList = new LinkedList<String>();

        petList.add("dog");
        petList.add("cat");
        petList.add("iguana");

        System.out.print("Elements before reversing: " + petList);
        petList = reverseLinkedList(petList);
        System.out.print("\nElements after reversing: " + petList);
    }
    public static LinkedList<String> reverseLinkedList(LinkedList<String> revList) {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = revList.size() - 1; i >= 0; i--) {

            revLinkedList.add(revList.get(i));
        }

        return revLinkedList;
    }
}