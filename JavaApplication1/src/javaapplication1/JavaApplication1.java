package javaapplication1;
import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        Investment invest = new Investment(0);
        Interest res = new Interest(0);
        Years yoa = new Years(0);
        Calculation calc = new Calculation(0,0,0,1); 
    }
    static class Calculation{
        
    public Calculation(int t, int r, int p, int n){
     /* t = yoa;
      r = res;
      p = invest;
      n = 1;
    }    
    int val = p*(1+(r/n))^(n*t);*/
    }
    }
    static class Years{
        
    public Years(int yoi){
        System.out.print("How Long wil you invest?");
        Scanner lon = new Scanner(System.in);
        int you = lon.nextInt();
        yoi = you;
        System.out.println("Investment is for "+you+" years");
    }
    }
    
    static class Interest{
    
    public Interest(int ann){
        System.out.print("What is the annual interest rate?\n");
        Scanner rate = new Scanner(System.in);
        int rat = rate.nextInt();
        ann = rat;
        System.out.println("Annual interest rate is "+rat+"%");
    }
    }
    
    static class Investment{
        
    public Investment(int inv){ 
        System.out.println("Please Enter investment");
        Scanner scan = new Scanner(System.in);
        int inve = scan.nextInt();
        inv = inve;
        System.out.println("Your investment is "+inve+" dollars\n");
}
    }
}