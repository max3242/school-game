public class Card{
  String co;
  String su;
  String na="";
  int va;
  public Card(String sui, int val){
      this.va=val;
      this.su=sui;
      if(sui.equals("c")||sui.equals("s")){
          this.co="b";
      }else if(sui.equals("h")||sui.equals("d")){
          this.co="r";
      }
      if(val>10){
       if(val==11){
           this.na="j";
       }
       if(val==12){
           this.na="q";
       }
       if(val==13){
           this.na="k";
       }
       if(val==14){
           this.na="a";
       }
      }
  }
  public String c(){
      return this.co;
  }
  public String s(){
      return this.su;
  }
  public int v(){
      return this.va;
  }
  public String n(){
      return this.na+this.va+this.su;
  }
}