import java.util.Random;
public class linkedList {
    public CharNode first;
    public CharNode last;

    public void insertLast( char Char){
        CharNode newNode = new CharNode(Char);
        if(first==null){
            first=newNode;
            last=newNode;
        }else {
            last.next=newNode;
            last=newNode;
        }
    }
    public void insertLastString( String name, int index){
        CharNode newNode = new CharNode(name,index);
        if(first==null){
            first=newNode;
            last=newNode;
        }else {
            last.next=newNode;
            last=newNode;
        }
    }

    @Override
    public String toString() {
        if (first == null) {
            return "Empty List";
        }


        String result = "";
        CharNode current = first;

        while (current != null) {
            result += "(" + current.Char + ")";
            if (current.next != null) {
                result += " -> ";
            }
            current = current.next;
        }

        return result;
    }
    public String String() {
        if (first == null) {
            return "Empty List";
        }


        String result = "";
        CharNode current = first;

        while (current != null) {
            result += "(" + current.name +", " + current.index + ")";
            if (current.next != null) {
                result += " -> ";
            }
            current = current.next;
        }

        return result;
    }
    public circularList addToList(linkedList list, int N){
        circularList c = new circularList();
        CharNode current = list.first;
        int counter =0;
        Random random = new Random();
        while (current!=null){
            counter++;
            current = current.next;
        }
        for (int i =0; i<N; i++){
            int rand = random.nextInt(counter);
            current = list.first;

            while (current.next!=null){
                if (current.index==rand){
                    c.addPerson(current.name);
                    System.out.println(rand);
                }
                current=current.next;
            }
        }

        return c;
    }
    public void removeFirst() {
        if (first == null) {
            System.out.println("The list is already empty");
            return;
        }
        first = first.next;
    }


}