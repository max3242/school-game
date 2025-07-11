import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Game{
   int dscor=0;
   int multi=1;
   int req=1;
   int scor=0;
   ArrayList<Card> d=new ArrayList<Card>();
   ArrayList<Card> d1=new ArrayList<Card>();
   ArrayList<Card> hand=new ArrayList<Card>();
   ArrayList<Pool> p=new ArrayList<Pool>();
   public Game(){
       for(int i=2;i<15;i++){
           d.add(new Card("s",i));
           d1.add(new Card("s",i));
       }
       for(int i=2;i<15;i++){
           d.add(new Card("h",i));
           d1.add(new Card("h",i));
       }
       for(int i=2;i<15;i++){
           d.add(new Card("c",i));
           d1.add(new Card("c",i));
       }
       for(int i=2;i<15;i++){
           d.add(new Card("d",i));
           d1.add(new Card("d",i));
       }
       while(scor>=req||(req==1&&scor==0)){
           round();
       }
   }
   public void round(){
       d.clear();
       hand.clear();
       p.clear();
       scor=0;
       for(Card c:d1){
           d.add(c);
       }
       String in="";
       int x=0;
       int pol=0;
       p.add(new Pool());
       for(int i=0;i<7;i++){
           x=(int)(Math.random()*(d.size()));
           hand.add(d.remove(x));
       }
       System.out.println("Hand:");
       for(Card c:hand){
           System.out.print(c.n()+" ");  
       }
       System.out.println("");
       Scanner s1=new Scanner(System.in);
       while (!in.equals("done")) {
           System.out.println("(Type 'close' to finish the hand, Type 'done' to go to scoring) Enter the index of the card you want to play:");
           in = s1.nextLine();
             if (in.equals("done")) {
               System.out.println("Finished with the hand.");
               break;
            }
           if (in.equals("close")) {
               System.out.println("Pile finished. Moving to next pile...");
               pol+=1;
               p.add(new Pool());
               
           }else if (!in.equals("close")&&!in.equals("done")) {
               try {
               int index = Integer.parseInt(in);
                   if (index >= 0 && index < hand.size()) {
                       p.get(pol).ad(hand.remove(index));
                   } else {
                       System.out.println("Invalid index. Please choose a valid card index.");
                   }
               } catch (NumberFormatException e) {
                   System.out.println("Invalid input. Please enter a valid card index number.");
               }
           }
           System.out.println("Hand:");
           for(Card c:hand){
               System.out.print(c.n()+" ");
           }
           System.out.println("");
           System.out.println("Current Pool:");
           for(Card c:p.get(pol).getPool()){
            System.out.print(c.n()+" ");
           }
           System.out.println("");
       }
       req+=1;
       


   }




   public static void main(String[] args){
       Game a1=new Game();
   }
}
