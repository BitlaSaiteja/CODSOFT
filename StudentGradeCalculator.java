import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

  float total=0,percentage;
  int n;
        System.out.println("Enter the number of subjects");
        n= scanner.nextInt();
        int subject[] = new int[n];
      for(int i=0;i<n;i++){
          System.out.println("Enter the subject "+(i+1)+" marks");
          subject[i]=scanner.nextInt();
      }
for(int i=0;i<subject.length;i++){
    total+=subject[i];
}
String grade;
percentage=total/n;
if(percentage>=90&&percentage<=100){
 grade="A";
    System.out.println("Your total marks = "+total+" / "+n*100);
    System.out.println("Your Percentage is "+percentage+" and grade is "+grade);
} else if (percentage>=80&&percentage<90) {
    grade="B";
    System.out.println("Your total marks = "+total+" / "+n*100);
    System.out.println("Your Percentage is "+percentage+" and grade is "+grade);
}else  if(percentage>=70&&percentage<80){
    grade="C";
    System.out.println("Your total marks = "+total+" / "+n*100);
    System.out.println("Your Percentage is "+percentage+" and grade is "+grade);
}else if(percentage>=40&&percentage<70){
    grade="D";
    System.out.println("Your total marks = "+total+" / "+n*100);
    System.out.println("Your Percentage is "+percentage+" and grade is "+grade);
}else if(percentage>=0&&percentage<40){
    grade="F";
    System.out.println("Your total marks = "+total+" / "+n*100);
    System.out.println("Your Percentage is "+percentage+" and grade is "+grade);
}

    }
}
