import java.util.ArrayList;


public class Pool {
   private ArrayList<Card> a;
   public Pool() {
       a = new ArrayList<Card>();
   }
   public void ad(Card x) {
       this.a.add(x);
   }
   public ArrayList<Card> getPool() {
       return this.a;
   }
}