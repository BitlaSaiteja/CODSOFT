import java.util.*;
public class random {
    public static void main(String args[]){
        Random random=new Random();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your range: ");
        int range=s.nextInt();
        int num=random.nextInt(range);
        System.out.println("Please Enter your number of attempts: ");
        int attempts=s.nextInt();
        int guess;
      while(attempts>0){
          System.out.println("Enter your guess: ");
          guess=s.nextInt();
         if(num==guess){
             System.out.println("Hurray your guess is correct! "+guess);
             System.out.println("Your score is 5");
             return;
         }else if(num<guess){
             System.out.println("You guess is bigger than the random number select smaller number: ");

         }else if(num >guess){
             System.out.println("You guess is smaller than the random number select bigger number: ");
         }
          attempts--;
      }
        System.out.println("Sorry your attempts are over!");
        char c;
        int count=0;
        while(true){
            System.out.println("Do you want try again! (y/n)");
            c=s.next().charAt(0);
            if(c=='y'){
                System.out.println("Enter your guess:  ");
                guess=s.nextInt();
                if(num==guess){
                    System.out.println("Hurray your guess is correct! "+guess);
                    count+=1;
                    if(count<5){
                        System.out.println("Your score is 3");
                        System.out.println("No of attempts: "+count);
                    }
                    else if(count>5){
                        System.out.println("Your score is 2");
                        System.out.println("No of attempts: "+count);
                    }
                }else if(num<guess){
                    System.out.println("You guess is bigger than the random number select smaller number: ");
                    count+=1;
                }else if(num>guess){
                    System.out.println("You guess is smaller than the random number select bigger number: ");
                    count+=1;
                }
            }
            else if(c=='n'){
                return;
            }
        }
    }
}
