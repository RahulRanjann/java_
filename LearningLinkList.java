
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }


public class LearningLinkList{
    public static void main(String[] args) {
        Node n1 =  new Node("Rahul");
        Node n2 = new Node("Ranjan");
        Node n3 = new Node("RAman");
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        Node temp = n1;
        while (temp != null) {
            System.out.print(temp.data +" ->");
             temp = temp.next;
        }
        System.out.println("null");

    }
}