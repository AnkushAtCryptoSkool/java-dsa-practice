public class LL {
    LL(){
        count = 0;
    }
    public class Node {
        String data;
        Node next;
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    private int count;

    public int getCount() {
        return count;
    }

    public void add(String data){
        count++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void addFirst(String data){

    }
    public void print(){
        if(head == null)
            System.out.println("List is empty");
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
    public void delete(int idx){
        count--;
        if(idx == 0){
            head = head.next;
            return;
        }
        Node curr = head;
        int temp = 0;
        while (temp <idx-1){
            curr = curr.next;
            temp++;
        }
        curr.next = curr.next.next;
    }
    public void reverse(){
        Node curr = head;
        Node nextNode = null;
        Node prev = null;
        while (curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.add("this");
        ll.add("is");
        ll.add("LL");
        ll.print();
        System.out.println();
        ll.delete(0);
        ll.print();
        System.out.println();
//        System.out.println(ll.getCount());
//        ll.delete(2);
//        ll.print();
//        System.out.println();
//        ll.reverse();
//        ll.print();
//        System.out.println();
//        System.out.println(ll.getCount());
    }
}
