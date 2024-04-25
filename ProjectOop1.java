
package project.oop1;
import java.util.Scanner;
import java.util.ArrayList;



public class ProjectOop1 {
 static ArrayList<Vehicle>arra=new ArrayList<Vehicle>();
 static int []asd=new int[100];
 static int freearea=100;
 static int usedspace=100-freearea;
 static int start=0;
 static int []checkid=new int[50];
 static int countt=0;
 static int checkkid=0;

 

 
    public static void main(String[] args) {
       Scanner reader= new Scanner(System.in);
      while(true){
         System.out.println("               Hello ^-^                           ");  
        System.out.println("if you need to add vehicle please enter 1 ");
        System.out.println("if you need to release your vehicle please enter 2 ");
        System.out.println("if you need to show parking status please enter 3 ");
        System.out.println("if you need to exist please enter 4 ");
        int num;
        num=reader.nextInt();
        if(num==4){
            System.out.println("thank you for your time  Good luck  ^__^ ");
            break;
        }
        switch(num){
            case 1:
                try{
                add();
                }
                catch(Exception e){
                    System.out.println("invaild choice , try again"); 
                    
                }
                
                break;
            case 2:
                release();
                break;
            case 3 :
                show();
                break;
            default :
                System.out.println("******invalid choice please enter new number******");
                break;
        }
        
        
      }
     
      
        
      
      
        
    }
     public static void add(){//to add Vehicle
         Scanner reader=new Scanner(System.in);
          System.out.println("                  Hi ^-^                                "); 
         System.out.println("please enter 1 if you need to enter car");  
         System.out.println("please enter 2 if you need to enter bus");
         System.out.println("please enter 3 if you need to enter truck");
         System.out.println("please enter 4 if you need to enter motorcycle");
         int num,check=0;num=reader.nextInt();
     switch (num) {
         case 1:
         { int test=0,start=0;
             for(int i=0;i<100-4;i++){
        if(asd[i]==0&&asd[i+1]==0&&asd[i+2]==0&&asd[i+3]==0&&asd[i+4]==0){
            test++;
            start=i;
            break;
        }
        
             }
             if(test!=0){
                 System.out.println("please enter name  and id ");
                 String name ;
                 int id;
                 name=reader.next();
                 id=reader.nextInt();
                 for(int i=0;i<50;i++){
                     if(checkid[i]==id){
                     check++;
                     checkkid++;
                     System.out.println("**************invaild choice this id already exist please enter correct id************");
                     break;  } 
                 }
                 if(checkkid!=0){
                    checkkid=0;
                     break;
                     
               }
                  checkid[countt]=id;
                         countt++;    
                 Vehicle a=new Car(name,id);
                 arra.add(a);
                 freearea-= a.get_lenght();
                 usedspace+=a.get_lenght();
                 for(int i=start;i<=start+4;i++){
                    if(asd[i]==0){
                        asd[i]=id;
                    }
                        
                    
                 
                 }
                 
                 }
             else{ System.out.println("iam sorry there is no freespace to park");check++;}
                 break;
         }
         case 2:
         {int test=0,start =0;
             for(int i=0;i<100-9;i++){
        if(asd[i]==0&&asd[i+1]==0&&asd[i+2]==0&&asd[i+3]==0&&asd[i+4]==0&&asd[i+5]==0&&asd[i+6]==0&&asd[i+7]==0&&asd[i+8]==0&&asd[i+9]==0){
            test++;
            start=i;
            break;
        }
             }
             if(test!=0){
                 System.out.println("please enter name and id ");
                 String name ;
                 int id;
                 name=reader.next();
                 id=reader.nextInt();
                 for(int i=0;i<50;i++){
                     if(checkid[i]==id){
                     check++;
                     checkkid++;
                     System.out.println("**************invaild choice this id already exist please enter correct id************");
                     break;  } 
                 }
                  if(checkkid!=0){
                    checkkid=0;
                     break;
                     
               }
                  checkid[countt]=id;
                         countt++;
                 Vehicle a=new Bus(name,id);
                 arra.add(a);
                 freearea-= a.get_lenght();
                 usedspace+=a.get_lenght();
                 for(int i=start;i<=start+9;i++){
                    if(asd[i]==0){
                        asd[i]=id;
                    }
                   
                 
                 }
                 }
             else{ System.out.println("iam sorry there is no freespace to park");check++;}
                 break;
         }
         case 3:
             {
                 int test=0,start=0;
             for(int i=0;i<100-6;i++){
        if(asd[i]==0&&asd[i+1]==0&&asd[i+2]==0&&asd[i+3]==0&&asd[i+4]==0&&asd[i+5]==0&&asd[i+6]==0){
            test++;
            start=i;
            break;
        }
        
             }
             if(test!=0){
                 System.out.println("please enter name and id ");
                 String name ;
                 int id;
                 name=reader.next();
                 id=reader.nextInt();
              for(int i=0;i<50;i++){
                     if(checkid[i]==id){
                     check++;
                     checkkid++;
                     System.out.println("**************invaild choice this id already exist please enter correct id************");
                     break;  } 
                 }
               if(checkkid!=0){
                    checkkid=0;
                     break;
                     
               }
                  checkid[countt]=id;
                         countt++;
                 Vehicle a=new Truck(name,id);
                 arra.add(a);
                 freearea-= a.get_lenght();
                 usedspace+=a.get_lenght();
                  for(int i=start;i<=start+6;i++){
                     if(asd[i]==0){
                        asd[i]=id;
                     }
                    
                 
                 } 
                 }
             else{ System.out.println("iam sorry there is no freespace to park");check++;  }
                 break;
             }
         case 4:
             {
                int test=0,start=0;
             for(int i=0;i<100-1;i++){
        if(asd[i]==0&&asd[i+1]==0){
            test++;
            start=i;
            break;
        }
        
             }
             if(test!=0){
                 System.out.println("please enter name and id ");
                 String name ;
                 int id;
                 name=reader.next();
                 id=reader.nextInt();
                for(int i=0;i<50;i++){
                     if(checkid[i]==id){
                     check++;
                     checkkid++;
                     System.out.println("**************invaild choice this id already exist please enter correct id************");
                     break;  } 
                 }
               if(checkkid!=0){
                    checkkid=0;
                     break;
                     
               }
                  checkid[countt]=id;
                         countt++;
                 Vehicle a=new Motorcycle(name,id);
                 arra.add(a);
                 freearea-= a.get_lenght();
                 usedspace+=a.get_lenght();
                 for(int i=start;i<=start+1;i++){
                     if(asd[i]==0){
                        asd[i]=id;
                    
                    
                     }
                 }
                 }
             else{ System.out.println("*****iam sorry there is no freespace to park********");
             check++;
             }
             break;
             }
         default:
             check++;
             System.out.println("*********invaild choice please choose again************        ");
             break;
     }
     if(check==0){
         System.out.println("thanks you for using my system your demand is done");
     }
         System.out.println("      Now you will go to the main menu   ");
         System.out.println(" ");
     }
      public static void release(){//to release Vehicle
           Scanner reader=new Scanner(System.in);
           int test=0;
       System.out.println("please enter id for your Vehicle");
       int id;
       id=reader.nextInt();
       for(int i=0;i<arra.size();i++){
           int ch;
           ch=arra.get(i).get_id();
           if(ch==id){
            System.out.println("please enter the time you spend");
              double spendhours,yourcost;
               spendhours=reader.nextInt();
              yourcost=arra.get(i).get_price(spendhours);
              System.out.println("your cost = "+yourcost);
              freearea+=arra.get(i).get_lenght();
              usedspace-=arra.get(i).get_lenght();
              arra.remove(arra.get(i));
              test++;
               break;
           }
           
       }
              
             for(int i=0;i<100;i++){//to murege  
             if(asd[i]==id)
                 asd[i]=0;
             }
            for(int i=0 ;i<50;i++){ //to  make id which release equel zero
          if(checkid[i]==id)
              checkid[i]=0;
      }
       
       if(test!=0)   
       {System.out.println("thanks you for using my system your demand is done");}
       else System.out.println("*********this id not exist in my parking*******   ");
     System.out.println("       Now you will go to the main menu ");
         System.out.println(" ");
    
    }
       public static void show (){//to show the statu parking
     for(int i=0;i<arra.size();i++){
         System.out.println("****place"+ (i+1) +" content****");
          System.out.println("the details of Vehicle");
          System.out.println("name : "+arra.get(i).name);
          System.out.println("id : "+arra.get(i).get_id()); 
          System.out.println("the lenght : "+arra.get(i).get_lenght());
      }
           System.out.println("the free space = "+freearea);
           System.out.println("the used space = "+usedspace);
         
    System.out.println("***thanks you for using my system your demand is done***");
    System.out.println("       Now you will go to the main menu    ");
    System.out.println(" ");
    }
       
    
}



