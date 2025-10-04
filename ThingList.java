public class ThingList{
    private Node head;

    public ThingList() {
        head = null;
    }

    public void add (Thing t){
        Node n = new Node(t);
        n.next = head;
        head = n;
    }

    public void iterateAndMove(int round){
        for(Node curr = head; curr!= null; curr = curr.next){
            cur.data.move(round);
        }
    }

    private void printAll(){
        for(Node curr = head; curr != null; curr = curr.next){
            curr.data.print();
        }
    
    }

}