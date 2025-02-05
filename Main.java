import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
        circularList circular = new circularList();
        linkedList listforNames = new linkedList();
        System.out.println("Enter the size of the players");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int N = sc.nextInt();
        String line;

        int index =0;
        while ((line =reader.readLine())!=null){
            index++;
            listforNames.insertLastString(line, index);
        }
        System.out.println(listforNames.String());
        circular = listforNames.addToList(listforNames,N);

        while (circular.size>1){
            System.out.println(circular.toString());
            int k = rand.nextInt(N)+1;
            circular.rotate(k);
            Node selected = circular.current;

            if (selected.nameList.first.next == null) {
                System.out.println("Random k= " + k + ", Name of the Player: " + selected.playerName );
                System.out.println(selected.playerName + " has no characters left and will be removed.");
                circular.current=circular.current.next;
                circular.removePerson3(selected.playerName);
                System.out.println("****");
                continue;
            }
            System.out.println("****");
            System.out.println("Random k= " + k + ", Name of the Player: " + selected.playerName );
            System.out.println(selected.nameList.toString());
            selected.nameList.removeFirst();
            System.out.println(selected.nameList.toString());
            System.out.println("****");
        }

        System.out.println("The winner is :" + circular.current.playerName);

    }

}