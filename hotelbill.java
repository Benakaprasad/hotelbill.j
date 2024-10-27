import java.util.Scanner;
class Hotel
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int ch;
      double totalstarters=0;int starterscount=0;
      double totalmainfood=0;int mainfoodcount=0;
      double totalcurries=0;int curriescount=0;
      double totaldesserts=0;int dessertscount=0;
      double totalsalads=0;int saladscount=0;
    do
      {
        System.out.println("****************************************");
        System.out.println("\t\t\tWELCOME TO SAGAR RESTAURANT\t\t\t\t\t");
        System.out.println("****************************************");
        System.out.println("enter 1 for menu");
        System.out.println("enter 2 for placing the order");
        System.out.println("enter 3 for billing");
        System.out.println("enter 4 for service time");
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
                 double total1=0,total2=0,total3=0;
            int soup1=100;
            int soup2=110;
            int soup3=110;
            System.out.println("enter 1 to start selecting the items from starters:");
             System.out.println("if you dont wish to order that particular food enter 0 for quantity");
          int size=in.nextInt();
            switch(size)
            {
                case 1:
                System.out.println("do you want chicken manchow soup:");
                System.out.println("enter the quantity:");
                int quantity1=in.nextInt();
                if(quantity1>0)
                total1=soup1*quantity1;
                starterscount+=quantity1;
                case 2:
                System.out.println("do you want sweet corn chicken soup:");
                System.out.println("enter the quantity:");
                int quantity2=in.nextInt();
                 if(quantity2>0)
                total2=soup2*quantity2;
                starterscount+=quantity2;
                case 3:
                System.out.println("do you want hot and sour chicken soup:");
                System.out.println("enter the quantity:");
                int quantity3=in.nextInt();
                if(quantity3>0)
                total3=soup3*quantity3;
                 starterscount+=quantity3;
                case 4:
                 totalstarters=total1+total2+total3;
                 System.out.println("**************************");
                System.out.println("total bill for starters is:"+totalstarters);
                System.out.println("**************************");
                break;
                 default:
                System.out.println("invalid choice");
                break;
               
            }
           
            double total4=0,total5=0,total6=0,total7=0,total8=0,total9=0,total10=0,total11=0,total12=0,total13=0;
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
            System.out.println("enter 1 to start selecting the items from mainfood:");
             System.out.println("if you dont wish to order that particular food enter 0 for quantity");
            int size1=in.nextInt();
             switch(size1)
            {
                case 1:
                System.out.println("do you want butter roti:");
                System.out.println("enter the quantity:");
                int quantity4=in.nextInt();
                if(quantity4>0)
                total4=item1*quantity4;
                mainfoodcount+=quantity4;
                case 2:
                System.out.println("do you want butter khulcha:");
                System.out.println("enter the quantity:");
                int quantity5=in.nextInt();
                 if(quantity5>0)
                total5=item2*quantity5;
                 mainfoodcount+=quantity5;
                case 3:
                System.out.println("do you want butter chicken:");
                System.out.println("enter the quantity:");
                int quantity6=in.nextInt();
                 if(quantity6>0)
                total6=item3*quantity6;
                mainfoodcount+=quantity6;
                case 4:
                System.out.println("do you want palak paneer:");
                System.out.println("enter the quantity:");
                int quantity7=in.nextInt();
                 if(quantity7>0)
                total7=item4*quantity7;
                 mainfoodcount+=quantity7;
                case 5:
                System.out.println("do you want chicken biriyani:");
                System.out.println("enter the quantity:");
                int quantity8=in.nextInt();
                 if(quantity8>0)
                total8=item5*quantity8;
                 mainfoodcount+=quantity8;
                case 6:
                System.out.println("do you want mutton biriyani:");
                System.out.println("enter the quantity:");
                int quantity9=in.nextInt();
                if(quantity9>0)
                total9=item6*quantity9;
                 mainfoodcount+=quantity9;
                case 7:
                System.out.println("do you want chicken chops:");
                System.out.println("enter the quantity:");
                int quantity10=in.nextInt();
                 if(quantity10>0)
                total10=item7*quantity10;
                 mainfoodcount+=quantity10;
                case 8:
                System.out.println("do you want chicken pepper fry:");
                System.out.println("enter the quantity:");
                int quantity11=in.nextInt();
                if(quantity11>0)
                total11=item8*quantity11;
                 mainfoodcount+=quantity11;
                case 9:
                System.out.println("do you want chicken roast:");
                System.out.println("enter the quantity:");
                int quantity12=in.nextInt();
                 if(quantity12>0)
                total12=item9*quantity12;
                 mainfoodcount+=quantity12;
                case 10:
                System.out.println("do you want chicken tandoori:");
                System.out.println("enter the quantity:");
                int quantity13=in.nextInt();
                if(quantity13>0)
                total13=item10*quantity13;
                mainfoodcount+=quantity13;
                case 11:
                totalmainfood=total4+total5+total6+total7+total8+total9+total10+total11+total12+total13;
               System.out.println("**************************");
                System.out.println("total bill for main food:"+totalmainfood);
               System.out.println("**************************");
                break;
                default:                
                System.out.println("invalid choice");
                break;
          }
           double total14=0,total15=0,total16=0,total17=0,total18=0,total19=0,total20=0,total21=0; 
            int item11=130;
            int item12=135;
            int item13=165;
            int item14=120;
            int item15=145;
            int item16=130;
            int item17=165;
            int item18=120;            
            System.out.println("enter 1 to start selecting the items from curries:");
             System.out.println("if you dont wish to order that particular food enter 0 for quantity");
            int size2=in.nextInt();
             switch(size2)
            {
                case 1:
                System.out.println("do you want paradise special chicken:");
                System.out.println("enter the quantity:");
                int quantity14=in.nextInt();
                if(quantity14>0)
                total14=item11*quantity14;
                 curriescount+=quantity14;
                case 2:
                System.out.println("do you want chicken tikka masala:");
                System.out.println("enter the quantity:");
                int quantity15=in.nextInt();
                 if(quantity15>0)
                total15=item12*quantity15;
                curriescount+=quantity15;
                case 3:
                System.out.println("do you want kadai chicken:");
                System.out.println("enter the quantity:");
                int quantity16=in.nextInt();
                 if(quantity16>0)
                total16=item13*quantity16;
               curriescount+=quantity16;
                case 4:
                System.out.println("do you want murgh musallam:");
                System.out.println("enter the quantity:");
                int quantity17=in.nextInt();
                if(quantity17>0)
                total17=item14*quantity17;
               curriescount+=quantity17;
                case 5:
                System.out.println("do you want chicken nawabi:");
                System.out.println("enter the quantity:");
                int quantity18=in.nextInt();
                if(quantity18>0)
                total18=item15*quantity18;
                curriescount+=quantity18;
                case 6:
                System.out.println("do you want chicken kandhari:");
                System.out.println("enter the quantity:");
                int quantity19=in.nextInt();
                 if(quantity19>0)
                total19=item16*quantity19;
                 curriescount+=quantity19;
                case 7:
                System.out.println("do you want mutton rogan josh:");
                System.out.println("enter the quantity:");
                int quantity20=in.nextInt();
                 if(quantity20>0)
                total20=item17*quantity20;
                curriescount+=quantity20;
                case 8:
                System.out.println("do you want kadai gohst:");
                System.out.println("enter the quantity:");
                int quantity21=in.nextInt();
                if(quantity21>0)
                total21=item18*quantity21;
                curriescount+=quantity21;
                case 9:
                totalcurries=total14+total15+total16+total17+total18+total19+total20+total21;
                System.out.println("**************************");
                System.out.println("total bill for curries:"+totalcurries);
                System.out.println("**************************");
                break;
                default:                
                System.out.println("invalid choice");
                break;
          } 
            double total22=0,total23=0,total24=0,total25=0,total26=0,total27=0;
            int item19=130;
            int item20=135;
            int item21=165;
            int item22=120;
            int item23=145;
            int item24=130;
             System.out.println("enter 1 to start selecting the items from desserts:");
             System.out.println("if you dont wish to order that particular food enter 0 for quantity");
            int size3=in.nextInt();
             switch(size3)
            {
                case 1:
                System.out.println("do you want chocolate:");
                System.out.println("enter the quantity:");
                int quantity22=in.nextInt();
                 if(quantity22>0)
                total22=item19*quantity22;
                 dessertscount+=quantity22;
                case 2:
                System.out.println("do you want butter scotch:");
                System.out.println("enter the quantity:");
                int quantity23=in.nextInt();
                if(quantity23>0)
                total23=item20*quantity23;
                dessertscount+=quantity23;
                case 3:
                System.out.println("do you want vanilla with hot chocolate sauce:");
                System.out.println("enter the quantity:");
                int quantity24=in.nextInt();
                 if(quantity24>0)
                total24=item21*quantity24;
                 dessertscount+=quantity24;
                case 4:
                System.out.println("do you want triple sundae:");
                System.out.println("enter the quantity:");
                int quantity25=in.nextInt();
                if(quantity25>0)
                total25=item22*quantity25;
                 dessertscount+=quantity25;
                case 5:
                System.out.println("do you want browney with ice cream/chocolate:");
                System.out.println("enter the quantity:");
                int quantity26=in.nextInt();
                 if(quantity26>0)
                total26=item23*quantity26;
                dessertscount+=quantity26;
                case 6:
                System.out.println("do you want tooti frutty:");
                System.out.println("enter the quantity:");
                int quantity27=in.nextInt();
                 if(quantity27>0)
                total27=item24*quantity27;
                dessertscount+=quantity27;
                case 7:
                totaldesserts=total22+total23+total24+total25+total26+total27;
               System.out.println("**************************");
                System.out.println("total bill for desserts:"+totaldesserts);
                System.out.println("**************************");
                break;
                default:                
                System.out.println("invalid choice");
                break;
          }      
             double total28=0,total29=0,total30=0,total31=0;
            int item25=30;
            int item26=35;
            int item27=40;
            int item28=20;
             System.out.println("enter 1 to start selecting the items from salads:");
             System.out.println("if you dont wish to order that particular food enter 0 for quantity");
            int size4=in.nextInt();
             switch(size4)
            {
                case 1:
                System.out.println("do you want fresh green salad:");
                System.out.println("enter the quantity:");
                int quantity28=in.nextInt();
                 if(quantity28>0)
                total28=item25*quantity28;
                 saladscount+=quantity28;
                case 2:
                System.out.println("do you want greek salad:");
                System.out.println("enter the quantity:");
                int quantity29=in.nextInt();
                 if(quantity29>0)
                total29=item26*quantity29;
                saladscount+=quantity29;
                case 3:
                System.out.println("do you want russian salad:");
                System.out.println("enter the quantity:");
                int quantity30=in.nextInt();
                 if(quantity30>0)
                total30=item27*quantity30;
                 saladscount+=quantity30;
                case 4:
                System.out.println("do you want tossed green salad:");
                System.out.println("enter the quantity:");
                int quantity31=in.nextInt();
                 if(quantity31>0)
                total31=item28*quantity31;
                 saladscount+=quantity31;
                case 5:
                totalsalads=total28+total29+total30+total31;
                System.out.println("**************************");
                System.out.println("total bill for salads:"+totalsalads);
               System.out.println("**************************");
                break;
                default:                
                System.out.println("invalid choice");
                break;
          }   
           break;
             }
        case 3:
            {
                            double gst=0;double totalg=0;double totalmeg=0;
            System.out.println("**************************************************"); 
            System.out.println("\t\t\t\t\t\tBILLING\t\t\t\t\t\t");
            System.out.println("**************************************************"); 
            System.out.println("total for starters is:"+totalstarters);  
            System.out.println("total for main food is:"+totalmainfood); 
            System.out.println("total for curries is:"+totalcurries);      
            System.out.println("total for desserts is:"+totaldesserts);    
            System.out.println("total for salads is:"+totalsalads);
            System.out.println("**************************************************");
            totalmeg=totalstarters+totalmainfood+totalcurries+totaldesserts+totalsalads;
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
            System.out.println("bill of total food items ordered is:"+totalmeg);
            System.out.println("total bill to be paid:"+totalg);
    break;
            }
        case 4:
            {
                double total_estimated_service_time=0;
                double estimated_service_time_starters=0;
                 double estimated_service_time_mainfood=0;
                 double estimated_service_time_curries=0;
                  double estimated_service_time_desserts=0;
               double estimated_service_time_salads=0;
                 System.out.println("thank you for choosing the food items your");
                estimated_service_time_starters=starterscount*5;
                estimated_service_time_mainfood=mainfoodcount*10;
                 estimated_service_time_curries=curriescount*8;
                 estimated_service_time_desserts=dessertscount*6;
                 estimated_service_time_salads=saladscount*2;
                total_estimated_service_time= estimated_service_time_starters+estimated_service_time_mainfood+estimated_service_time_curries+  estimated_service_time_desserts+ estimated_service_time_salads;
            System.out.println("service time for main food is:"+estimated_service_time_mainfood+" mins");
            System.out.println("service time for curries is:"+estimated_service_time_curries+" mins");
            System.out.println("service time for starters is:"+ estimated_service_time_starters+" mins");
            System.out.println("service time for desserts is:"+ estimated_service_time_desserts+" mins");
            System.out.println("service time for salads is:"+estimated_service_time_salads+" mins");
             System.out.println("total estimated time is:"+ total_estimated_service_time+" mins");
            break;
            }
            case 5:
                {
                    System.out.println("feedback:please enter your feedback:");
                   in.nextLine();//clearing the input buffer
                    String feedback=in.nextLine();
                    System.out.println("thank you for your feedback");
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
