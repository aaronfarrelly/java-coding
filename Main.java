package LinkedLists;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedLists linkedList = new LinkedLists();

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        while (!word.equals("END")) {
            linkedList.insertHead(word);
            System.out.println("Enter a word: ");
            word = scanner.nextLine();
        }

        System.out.println("Words in the linked list:");
        linkedList.printList();
    }
}