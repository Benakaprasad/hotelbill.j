import java.util.*;
import java.io.*;
class hotel
{
    public static void main(string args[])
    {
      Scanner in=new Scanner(System.in);
      int ch;
      
      do
      {
        System.out.println("\t\t\t\t\t\t\tWELCOME TO SAGAR RESTAURANT\t\t\t\t\t");
        System.out.println("******************");
        System.out.println("enter 1 for menu");
        System.out.println("enter 2 for placing the order");
        System.out.println("enter 3 for service time");
        System.out.println("enter 4 billing");
        System.out.println("enter 5 for feedback");
        System.out.println("enter 6 for exit");
        System.out.println("enter your choice\n\n");
        ch=in.nextInt();
        switch(ch)
        {
          case 1:
          {
          System.out.println("MENU");
          System.out.println("STARTERS");
          System.out.println("*************");
          System.out.println("1.CHICKEN MANCHOW SOUP-----------------\t\t100\-");
          System.out.println("2.SWEET CORN CHICKEN SOUP-----------------\t\t110\-");
          System.out.println("3.HOT AND SOUR CHICKEN SOUP-----------------\t\t110\-");
          System.out.println("MAIN FOOD");
          System.out.println("*************");
          System.out.println("1.BUTTER ROTI-----------------\t\t30\-");
          System.out.println("2.BUTTER KHULCHA-----------------\t\t35\-");
          System.out.println("3.BUTTER CHICKEN-----------------\t\t165\-");
          System.out.println("4.PALAK PANEER-----------------\t\t$120\-");
          System.out.println("5.CHICKEN BIRIYANI-----------------\t\t145\-");
          System.out.println("6.MUTTON BIRIYANI-----------------\t\t130\-");
          System.out.println("7.CHICKEN CHOPS-----------------\t\t165\-");
          System.out.println("8.CHCIKEN PEPPER FRY-----------------\t\t$120\-");
          System.out.println("9.CHICKEN ROAST-----------------\t\t145\-");
          System.out.println("10.CHICKEN TANDOORI-----------------\t\t130\-");
          System.out.println("CURRIES");
          System.out.println("*************");
          System.out.println("1.PARADISE SPECIAL CHICKEN-----------------\t\t130\-");
          System.out.println("2.CHICKEN TIKKA MASALA-----------------\t\t135\-");
          System.out.println("3.KADAI CHICKEN-----------------\t\t165\-");
          System.out.println("4.MURGH MUSALLAM-----------------\t\t$120\-");
          System.out.println("5.CHICKEN NAWABI-----------------\t\t145\-");
          System.out.println("6.CHICKEN KANDHARI-----------------\t\t130\-");
          System.out.println("7.MUTTON ROGAN JOSH-----------------\t\t165\-");
          System.out.println("8.KADAI GOSHT-----------------\t\t$120\-");
          System.out.println("DESSERTS");
          System.out.println("*************");
          System.out.println("1.CHOCOLATE-----------------\t\t70\-");
          System.out.println("2.BUTTER SCOTCH-----------------\t\t$95\-");
          System.out.println("3.VANILLA WITH HOT CHOCOLATE SAUCE-----------------\t\t75\-");
          System.out.println("4.TRIPLE SUNDAE-----------------\t\t80\-");
          System.out.println("5.BROWNEY WITH ICE CREAM/CHOCOLATE-----------------\t\t60\-");
          System.out.println("6.TOOTI FRUTTY-----------------\t\t55\-");
          System.out.println("SALADS");
          System.out.println("*************");
          System.out.println("1.FRESH GARDEN SALAD-----------------\t\t30");
          System.out.println("2.GREEK SALAD-----------------\t\t35");
          System.out.println("3.RUSSIAN SALAD-----------------\t\t40");
          System.out.println("4.TOSSED GREEN SALAD-----------------\t\t20");
          break;
         }
         case 2:
         {
            double total1,total2,total3;
            int soup1=100;
            int soup2=110;
            int soup3=110;
            System.out.println("enter your number of choice from starters:");
            System.out.println("enter 4 for total bill for starters");
            int size=in.nextInt();
            switch(size)
            {
                case 1:
                System.out.println("chicken manchow soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total1=soup1*quantity;
                break;
                case 2:
                System.out.println("sweet corn chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total2=soup2*quantity;
                break;
                case 3:
                System.out.println("hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total3=soup3*quantity;
                break;
                case 4:
                double total=total1+total2+total3;
                System.out.println("starters bill is:"+total);
                break;
                default:
                System.out.println("invalid chocie");
                break;
            }
            double total4,total5,total6,total7,total8,total9,total10,total11,total12,total13;
            int item1=30;
            int item2=35;
            int item3=165;
            int item4=120;
            int item5=145;
            int item6=130;
            int item7=165;
            int item8=120;
            int item9=145;
            int item10=130;
            System.out.println("enter your number of choice from main food:");
            System.out.println("enter 11 total bill for starters");
            int size1=in.nextInt();
             switch(size1)
            {
                case 1:
                System.out.println("chicken manchow soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total4=item1*quantity;
                break;
                case 2:
                System.out.println("sweet corn chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total5=item2*quantity;
                break;
                case 3:
                System.out.println("hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total6=item3*quantity;
                break;
                case 4:
                System.out.println("hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total7=item4*quantity;
                break;
                case 5:
                System.out.println("hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total8=item5*quantity;
                break;
                case 6:
                System.out.println("hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total9=item6*quantity;
                break;
                case 7:
                System.out.println("hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total10=item7*quantity;
                break;
                case 8:
                System.out.println("hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total11=item8*quantity;
                break;
                case 9:
                System.out.println("hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total12=item9*quantity;
                break;
                case 10:
                System.out.println("hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity=in.nextInt();
                total13=item10*quantity;
                break;
                case 11:
                double sum=total4+total5+total6+total7+total8+total9+total10+total11+total12+total13;
                System.out.println("total bill for main food"+sum);
                break;
                default:                
                System.out.println("invalid choice");
                break;
          }
            
                
        

                 
                
        

                                

                                            

        
    }
}
