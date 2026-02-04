package chess;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Tournament {
    ArrayList<Player>playerList;

    Tournament(){
        playerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many players?");
        //sc.nextInt();
        int a = sc.nextInt();
        System.out.println("Enter player names:");
        sc.nextLine();
        for(int i=0;i<a;i++){
          String name = sc.nextLine();
          Player p = new Player(name);
          addPlayer(p);
        }
          System.out.println("------");
          showPlayers();
          System.out.println("------");
          makeMatches();
        }
    static int r = 1;
    void makeMatches() {
    ArrayList<Player>WinnerList=new ArrayList<>();

        Collections.shuffle(playerList);
          if(r>1){
              System.out.println();
          }
          System.out.println("Round "+r++);
          for(int i=0;i<playerList.size()-1;i+=2){
            Player p1 = playerList.get(i);
            Player p2 = playerList.get(i+1);

            System.out.println("Match: " + p1.name + " vs " + p2.name);
            Match m = new Match(p1,p2);

            Random random = new Random();
            Player w = m.selectWinner(random.nextInt(2) + 1);
            WinnerList.add(w);
          }
            playerList=WinnerList;
            if(playerList.size()==1){
            Player last= playerList.get(0);
            System.out.println("Winner is "+ last.name);
          }
          else{
            makeMatches();
            }
          }
        void addPlayer(Player p){
        playerList.add(p);
        }
        void showPlayers(){
        for(int i=0;i<playerList.size();i++){
            Player p = playerList.get(i);
            System.out.println(p.id + " " + p.name);
        }
    }
}
