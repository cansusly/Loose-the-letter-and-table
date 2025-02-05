public class circularList {
    Node current;
    int size;
    void addPerson( String name) {
        Node newNode = new Node(name);
        if (current == null) {
            current = newNode;
            current.next = current;
        } else {
            Node last = current;
            while (last.next != current) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = current;
        }
        size++;
    }
    void removePerson3(String playerName) { //removes the person when necessary
        if (current == null || size == 0) {
            System.out.println("There are no players in the game");
            return;
        }

        Node prev = current;
        Node temp = current;
        boolean found = false;

        do {
            if (temp.playerName.equals(playerName)) {
                found = true;
                if (size == 1) {
                    current = null;
                } else {
                    prev.next = temp.next;
                    if (temp == current) {
                        current = temp.next;
                    }
                }
                size--;
                break;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != current);

        if (!found) {
            System.out.println("Player not found in the list.");
        }
    }
    void rotate(int k) {
        for (int i = 0; i < k; i++) {
            current = current.next;
        }

    }
    public String toString() {
        String s = "";
        Node tmp = current;
        int sizecounter=0;
        while (sizecounter!=size) {
            s += tmp.playerName + "->";
            tmp = tmp.next;
            sizecounter++;
        }
        return s;
    }
}