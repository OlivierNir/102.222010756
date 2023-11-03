public class BobPay  
 {  
    public static double monthly(double principal,double rate,double time,double n){
        double z;
z=principal*Math.pow(1+(rate/n),n*time);
        return z;
    }
   public static void main (String args[]) 
       {  BobPay add=new BobPay();
         double p, r,  t,nt, si; /*principal amount, rate, time and
                                simple interest respectively */   
              p = 500000;  r = 0.18; t = 5;nt=12;  
               si  =add.monthly (p,r,t,nt);  
              System.out.println(" all amount is: " +si);    
    }}  