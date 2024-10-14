package LinkedLists;


public class LinkedLists {
    private Link first; // reference to the first link

    public LinkedLists() { // constructor
        first = null; // no links on list yet
    }

    public boolean isEmpty() { // true if list is empty
        return (first == null);
    }

    public void insertHead(String data) { // make new link
        Link newLink = new Link(data);
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    public void printList() {
        Link current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}