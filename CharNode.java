public class CharNode {
    CharNode next;
    char Char;
    String name;
    int index;
    CharNode(char Char){
        this.Char = Char;
        next = null;
    }
    CharNode(String name, int index){
        this.index = index;
        this.name = name;
        next =null;
    }
}