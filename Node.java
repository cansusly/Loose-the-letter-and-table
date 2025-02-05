public class Node {
    String playerName;
    Node next;
    linkedList nameList;

    public Node(String playerName){//Creates a list of chars inside the method of Node
        this.playerName=playerName;
        this.nameList = new linkedList();
        for (int i =0; i<playerName.length();i++ ){
            nameList.insertLast(playerName.charAt(i));
        }
    }

}