import java.util.Scanner;
class Hotel
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int ch;
    do
      {
        System.out.println("****************************************");
        System.out.println("\t\t\tWELCOME TO SAGAR RESTAURANT\t\t\t\t\t");
        System.out.println("****************************************");
        System.out.println("enter 1 for menu");
        System.out.println("enter 2 for placing the order");
        System.out.println("enter 3 for service time");
        System.out.println("enter 4 billing");
        System.out.println("enter 5 for feedback");
        System.out.println("enter 6 for exit");
        System.out.println("enter your choice");
         System.out.println("****************************************");
        ch=in.nextInt();
        switch(ch)
        {
          case 1:
          {
          System.out.println("MENU:");
           System.out.println("*************");
          System.out.println("STARTERS");
          System.out.println("*************");
          System.out.println("1.CHICKEN MANCHOW SOUP-----------------\t\t\t\t100");
          System.out.println("2.SWEET CORN CHICKEN SOUP-----------------\t\t\t110");
          System.out.println("3.HOT AND SOUR CHICKEN SOUP-----------------\t\t110");
           System.out.println("*************");
          System.out.println("MAIN FOOD");
          System.out.println("*************");
          System.out.println("1.BUTTER ROTI-----------------\t\t\t\t\t\t30");
          System.out.println("2.BUTTER KHULCHA-----------------\t\t\t\t\t35");
          System.out.println("3.BUTTER CHICKEN-----------------\t\t\t\t\t165");
          System.out.println("4.PALAK PANEER-----------------\t\t\t\t\t\t120");
          System.out.println("5.CHICKEN BIRIYANI-----------------\t\t\t\t\t145");
          System.out.println("6.MUTTON BIRIYANI-----------------\t\t\t\t\t130");
          System.out.println("7.CHICKEN CHOPS-----------------\t\t\t\t\t165");
          System.out.println("8.CHCIKEN PEPPER FRY-----------------\t\t\t\t120");
          System.out.println("9.CHICKEN ROAST-----------------\t\t\t\t\t145");
          System.out.println("10.CHICKEN TANDOORI-----------------\t\t\t\t130");
           System.out.println("*************");
          System.out.println("CURRIES");
          System.out.println("*************");
          System.out.println("1.PARADISE SPECIAL CHICKEN-----------------\t\t\t130");
          System.out.println("2.CHICKEN TIKKA MASALA-----------------\t\t\t\t135");
          System.out.println("3.KADAI CHICKEN-----------------\t\t\t\t\t165");
          System.out.println("4.MURGH MUSALLAM-----------------\t\t\t\t\t120");
          System.out.println("5.CHICKEN NAWABI-----------------\t\t\t\t\t145");
          System.out.println("6.CHICKEN KANDHARI-----------------\t\t\t\t\t130");
          System.out.println("7.MUTTON ROGAN JOSH-----------------\t\t\t\t165");
          System.out.println("8.KADAI GOSHT-----------------\t\t\t\t\t\t120");
           System.out.println("*************");
          System.out.println("DESSERTS");
          System.out.println("*************");
          System.out.println("1.CHOCOLATE-----------------\t\t\t\t\t\t\t70");
          System.out.println("2.BUTTER SCOTCH-----------------\t\t\t\t\t\t95");
          System.out.println("3.VANILLA WITH HOT CHOCOLATE SAUCE-----------------\t\t75");
          System.out.println("4.TRIPLE SUNDAE-----------------\t\t\t\t\t\t80");
          System.out.println("5.BROWNEY WITH ICE CREAM/CHOCOLATE-----------------\t\t60");
          System.out.println("6.TOOTI FRUTTY-----------------\t\t\t\t\t\t\t55");
           System.out.println("*************");
          System.out.println("SALADS");
          System.out.println("*************");
          System.out.println("1.FRESH GARDEN SALAD-----------------\t\t\t\t30");
          System.out.println("2.GREEK SALAD-----------------\t\t\t\t\t\t35");
          System.out.println("3.RUSSIAN SALAD-----------------\t\t\t\t\t40");
          System.out.println("4.TOSSED GREEN SALAD-----------------\t\t\t\t20");
          break;
         }
         case 2:
         {           
            double total1=0,total2=0,total3=0; double totalstarters=0; 
            int soup1=100;
            int soup2=110;
            int soup3=110;
            System.out.println("enter your number of choice from starters:");
            System.out.println("enter 4 for total bill for starters");
          int size=in.nextInt();
            switch(size)
            {
                case 1:
                System.out.println("you have odered chicken manchow soup:");
                System.out.println("enter the quantity:");
                int quantity1=in.nextInt();
                total1=soup1*quantity1;
                break;
                case 2:
                System.out.println("you have ordered sweet corn chicken soup:");
                System.out.println("enter the quantity:");
                int quantity2=in.nextInt();
                total2=soup2*quantity2;
                break;
                case 3:
                System.out.println("you have ordered hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity3=in.nextInt();
                total3=soup3*quantity3;
                break;
                case 4:
                totalstarters=total1+total2+total3;
                System.out.println("starters bill is:"+totalstarters);
                break;
                default:
                System.out.println("invalid choice");
                break;
            }
           
            double total4=0,total5=0,total6=0,total7=0,total8=0,total9=0,total10=0,total11=0,total12=0,total13=0;double totalmainmenu=0;
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
            System.out.println("enter 11 total bill for main food");
            int size1=in.nextInt();
             switch(size1)
            {
                case 1:
                System.out.println("you have ordered butter roti:");
                System.out.println("enter the quantity:");
                int quantity4=in.nextInt();
                total4=item1*quantity4;
                break;
                case 2:
                System.out.println("you have ordered butter khulcha:");
                System.out.println("enter the quantity:");
                int quantity5=in.nextInt();
                total5=item2*quantity5;
                break;
                case 3:
                System.out.println("you have ordered butter chicken:");
                System.out.println("enter the quantity:");
                int quantity6=in.nextInt();
                total6=item3*quantity6;
                break;
                case 4:
                System.out.println("you have ordered palak paneer:");
                System.out.println("enter the quantity:");
                int quantity7=in.nextInt();
                total7=item4*quantity7;
                break;
                case 5:
                System.out.println("you have ordered chicken biriyani:");
                System.out.println("enter the quantity:");
                int quantity8=in.nextInt();
                total8=item5*quantity8;
                break;
                case 6:
                System.out.println("you have ordered mutton biriyani:");
                System.out.println("enter the quantity:");
                int quantity9=in.nextInt();
                total9=item6*quantity9;
                break;
                case 7:
                System.out.println("you have ordered chicken chops:");
                System.out.println("enter the quantity:");
                int quantity10=in.nextInt();
                total10=item7*quantity10;
                break;
                case 8:
                System.out.println("you have ordered chicken pepper fry:");
                System.out.println("enter the quantity:");
                int quantity11=in.nextInt();
                total11=item8*quantity11;
                break;
                case 9:
                System.out.println("you have ordered chicken roast:");
                System.out.println("enter the quantity:");
                int quantity12=in.nextInt();
                total12=item9*quantity12;
                break;
                case 10:
                System.out.println("you have ordered chicken tandoori:");
                System.out.println("enter the quantity:");
                int quantity13=in.nextInt();
                total13=item10*quantity13;
                break;
                case 11:
                totalmainmenu=total4+total5+total6+total7+total8+total9+total10+total11+total12+total13;
                System.out.println("total bill for main food"+totalmainmenu);
                break;
                default:                
                System.out.println("invalid choice");
                break;
          }
           double total14=0,total15=0,total16=0,total17=0,total18=0,total19=0,total20=0,total21=0; double totalcurries=0;
            int item11=130;
            int item12=135;
            int item13=165;
            int item14=120;
            int item15=145;
            int item16=130;
            int item17=165;
            int item18=120;            
            System.out.println("enter your number of choice from curries:");
            System.out.println("enter 9 total bill for curries");
            int size2=in.nextInt();
             switch(size2)
            {
                case 1:
                System.out.println("you have ordered paradise special chicken:");
                System.out.println("enter the quantity:");
                int quantity14=in.nextInt();
                total14=item11*quantity14;
                break;
                case 2:
                System.out.println("you have ordered chicken tikka masala:");
                System.out.println("enter the quantity:");
                int quantity15=in.nextInt();
                total15=item12*quantity15;
                break;
                case 3:
                System.out.println("you have ordered kadai chicken:");
                System.out.println("enter the quantity:");
                int quantity16=in.nextInt();
                total16=item13*quantity16;
                break;
                case 4:
                System.out.println("you have ordered murgh musallam:");
                System.out.println("enter the quantity:");
                int quantity17=in.nextInt();
                total17=item14*quantity17;
                break;
                case 5:
                System.out.println("you have chciken nawabi:");
                System.out.println("enter the quantity:");
                int quantity18=in.nextInt();
                total18=item15*quantity18;
                break;
                case 6:
                System.out.println("you have ordered chicken kandhari:");
                System.out.println("enter the quantity:");
                int quantity19=in.nextInt();
                total19=item16*quantity19;
                break;
                case 7:
                System.out.println("you have ordered mutton rogan josh:");
                System.out.println("enter the quantity:");
                int quantity20=in.nextInt();
                total20=item17*quantity20;
                break;
                case 8:
                System.out.println("you have ordered kadai gohst:");
                System.out.println("enter the quantity:");
                int quantity21=in.nextInt();
                total21=item18*quantity21;
                break;
                case 9:
                totalcurries=total14+total15+total16+total17+total18+total19+total20+total21;
                System.out.println("total bill for main food"+totalcurries);
                break;
                default:                
                System.out.println("invalid choice");
                break;
          } 
            double total22=0,total23=0,total24=0,total25=0,total26=0,total27=0;double totaldesserts=0;
            int item19=130;
            int item20=135;
            int item21=165;
            int item22=120;
            int item23=145;
            int item24=130;
            System.out.println("enter your number of choice from desserts:");
            System.out.println("enter 7 total bill for desserts");
            int size3=in.nextInt();
             switch(size3)
            {
                case 1:
                System.out.println("you have ordered chocolate:");
                System.out.println("enter the quantity:");
                int quantity22=in.nextInt();
                total22=item19*quantity22;
                break;
                case 2:
                System.out.println("you have ordered butter scotch:");
                System.out.println("enter the quantity:");
                int quantity23=in.nextInt();
                total23=item20*quantity23;
                break;
                case 3:
                System.out.println("you have ordered vanilla with hot chocolate sauce:");
                System.out.println("enter the quantity:");
                int quantity24=in.nextInt();
                total24=item21*quantity24;
                break;
                case 4:
                System.out.println("you have ordered triple sundae:");
                System.out.println("enter the quantity:");
                int quantity25=in.nextInt();
                total25=item22*quantity25;
                break;
                case 5:
                System.out.println("you have ordered browney with ice cream/chocolate:");
                System.out.println("enter the quantity:");
                int quantity26=in.nextInt();
                total26=item23*quantity26;
                break;
                case 6:
                System.out.println("you have ordered tooti frutty:");
                System.out.println("enter the quantity:");
                int quantity27=in.nextInt();
                total27=item24*quantity27;
                break;
                case 7:
                totaldesserts=total22+total23+total24+total25+total26+total27;
                System.out.println("total bill for main food"+totaldesserts);
                break;
                default:                
                System.out.println("invalid choice");
                break;
          }      
             double total28=0,total29=0,total30=0,total31=0;double totalsalads=0;
            int item25=30;
            int item26=35;
            int item27=40;
            int item28=20;
            System.out.println("enter your number of choice from salads:");
            System.out.println("enter 5 total bill for salads");
            int size4=in.nextInt();
             switch(size4)
            {
                case 1:
                System.out.println("you have ordered fresh green salad:");
                System.out.println("enter the quantity:");
                int quantity28=in.nextInt();
                total28=item25*quantity28;
                break;
                case 2:
                System.out.println("you have ordered greek salad:");
                System.out.println("enter the quantity:");
                int quantity29=in.nextInt();
                total29=item26*quantity29;
                break;
                case 3:
                System.out.println("you have ordered russian salad:");
                System.out.println("enter the quantity:");
                int quantity31=in.nextInt();
                total30=item27*quantity31;
                break;
                case 4:
                System.out.println("you have ordered tossed green salad:");
                System.out.println("enter the quantity:");
                int quantity32=in.nextInt();
                total31=item28*quantity32;
                break;
                case 5:
                totalsalads=total22+total23+total24+total25;
                System.out.println("total bill for salads"+totalsalads);
                break;
                default:                
                System.out.println("invalid choice");
                break;
          }   
           break;
        }
        case 3:
        {
            System.out.println("thank you for choosing the food items");
            System.out.println("service time for main food is:25mins");
            System.out.println("service time for curries is:18mins");
            System.out.println("service time for starters is:20mins");
            System.out.println("service time for desserts is:8mins");
            System.out.println("service time for salads is:2mins");
            break;
        }
        case 4:
        {
            double gst=0;double totalg=0;double totalmeg=0;
            double totalstarters=0,totalmainmenu=0,totalcurries=0,totaldesserts=0,totalsalads=0;
            System.out.println("\t\t\t\t\t\tBILLING\t\t\t\t\t\t");
            System.out.println("**************************************************"); 
            System.out.println("total for starters is:"+totalstarters);  
            System.out.println("total for main food is:"+totalmainmenu); 
            System.out.println("total for curries is:"+totalcurries);      
            System.out.println("total for desserts is:"+totaldesserts);    
            System.out.println("total for salads is:"+totalsalads);
            System.out.println("**************************************************");
            totalmeg=totalstarters+totalmainmenu+totalcurries+totaldesserts+totalsalads;
            if(totalmeg<1000)
            {
              gst=totalmeg*0;
                totalg=totalmeg+gst;
            } 
            else if(totalmeg>=1000 && totalmeg<=2499)
            {
              gst=totalmeg*0.12;
                totalg=totalmeg+gst;
            }
            else if(totalmeg>=2500 && totalmeg<=7499)
            {
                gst=totalmeg*0.18;
                totalg=totalmeg+gst;
            }
           else
            {
              gst=totalmeg*0.28;
                totalg=totalmeg+gst;
            }
            System.out.println("total bill is:"+totalg);
    break;
        }
            case 5:
                {
                    System.out.println("feedback:please enter your feedback:");
                    String feedback=in.next();
                    System.out.println("thank you for your feedback:"+feedback);
                    break;
                }
            case 6:
                {
System.out.println("thank you for visiting sagar restaurant :)");
                break;
                }
            default:
                System.out.println("invalid choice please try again");
                break;
        }
      }
      while(ch!=6);
        }
        }
