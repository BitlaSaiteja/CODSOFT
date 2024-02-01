import java.util.Scanner;

class bank{
    static int balance=0,deposit,withdraw;
    public void setDeposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount Credited Successfully! ");
            System.out.println();
        }
        else{
            System.out.println("Amount not credited");
            System.out.println();
        }
    }
    public void setWithdraw(int amount){
        if(amount>0){
            balance-=amount;
            System.out.println("Amount debited Successfully! \n");
            System.out.println();
        }
        else{
            System.out.println("Amount not debited\n");
            System.out.println();
        }
            }
            public void setBalance(){
                System.out.println("Your current balance is "+balance+"\n");
                System.out.println();
            }
}
class _Interface extends bank{
    bank obj=new bank();
    public void Interface(){
        int amount;
        while(true){
            Scanner s=new Scanner(System.in);
            System.out.println("**********Welcome to ATM**********");
            System.out.println("1.Deposit Money\n2.Withdrawl Money\n3.Check Balance\n4.Exit\nEnter your choice: ");
            int choice=s.nextInt();
            switch (choice){
                case 1:
                    ;
                    System.out.println("Your choice is Deposit");
                    System.out.println("Enter the amount you want to deposit ");
                    amount=s.nextInt();
                    obj.setDeposit(amount);
                    break;
                case 2:
                    System.out.println("Your choice is Withdrawl");
                    System.out.println("Enter the amount you want to withdrawl ");
                    amount=s.nextInt();
                    if(amount>obj.balance){
                        System.out.println("No sufficient balance! ");
                    }else {
                        obj.setWithdraw(amount);
                    }
                    break;
                case 3:
                    System.out.println("Your choice is check balance");
                    obj.setBalance();
                    break;
                case 4:
                    System.out.println("Thanks for visiting! have a nice day.....");
                    return;
                default:
                    System.out.println("Enter valid option!");
            }
        }
    }
}
public class ATM_Interface{
    public static void main(String[] args) {
        _Interface obj2=new _Interface();
        obj2.Interface();
    }
}