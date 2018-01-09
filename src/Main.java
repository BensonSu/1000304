import java.util.*;
public class Main {

    public static void main(String[] args) {
          Scanner scn=new Scanner(System.in);
          String str=scn.next();
          int strLeng=str.length();
          boolean flag=true;
          int i;
          for(i=0;i<strLeng/2;i++)
          {
              if(str.charAt(i)!=str.charAt(strLeng-i-1))
                  break;
          }
          if(i==strLeng/2)
              System.out.println("YES");
          else
              System.out.println("N0");
    }
}
