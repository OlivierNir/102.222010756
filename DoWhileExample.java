public class DoWhileExample{
    public static void main(String[]args){
        int num=1;
        System.out.println("odd number between 1 and 10 are:");
        do{
             System.out.println(num); 
            num+=2;// num=num+2;
            if(num==7){
                break;//break statement with loop
            }
        }
    while (num<10);
    }
}