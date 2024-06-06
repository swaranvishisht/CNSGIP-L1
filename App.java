public class App {
    public static void main(String[] args) throws Exception {
       // pizza basepizza= new pizza(true);
        //basepizza.addextratopping();
        //basepizza.addextracheese();
       // basepizza.takeaway();
        //basepizza.getbill();
           
        Deluxpizzza dp=new  Deluxpizzza(false);
        dp.addextracheese();
        dp.takeaway();
        dp.addextratopping();
        dp.getbill();
    }
}
