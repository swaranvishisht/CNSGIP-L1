public class pizza {
  private int price;
  private Boolean veg;
  private int extrachesseprice=100;
  private int extratopping=150;
  private int backpack=20;
  private int basepizza; 
  private boolean isExtrachesseAdded=false;
  private boolean isExtraToppingAdded=false;
  private boolean isoptedtakeaway=false;

    public pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        basepizza=this.price;
    }

    public void addextracheese(){
        isExtrachesseAdded=true;
      System.out.println("Extra chesse added");
      this.price+=extrachesseprice;
    }

    public void addextratopping(){
     isExtraToppingAdded=true;
      System.out.println("Extra toppings added");
     this.price+=extratopping;
   }

     public void takeaway(){
        isoptedtakeaway=true;
      System.out.println("Take away opted");
      this.price+=backpack;
    }

    public void getbill(){
        String bill=" ";
        System.out.println("pizza:"+basepizza);
        if(isExtrachesseAdded){
           bill+="Extra chesse added:"+extrachesseprice+"\n";
        }
        if(isExtraToppingAdded){
           bill+="Extra Topping added:"+extratopping+"\n";
        }
        if(isoptedtakeaway){
           bill+="Take away:"+backpack+"\n";
        }
         bill+="Bill:"+this.price+"\n";
         System.out.println(bill);
    }

   public void getpizzaprice(){
    System.out.println(this.price);
   }


  
}
