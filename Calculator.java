import java.util.Scanner;
public class calcutor
{
    public static void main(String[] args) {

        while(true){
            Scanner take= new Scanner(System.in);
            System.out.print("Enter operator: ");
            String s=take.nextLine();
            System.out.print("Enter the number1: ");
            int num1=take.nextInt();
            System.out.print("Enter the number2: ");
            int num2=take.nextInt();

            int ans=0;
            switch(s){

                case "+":{
                    ans=num1+num2;
                    System.out.print("Sum is: "+ ans+'\n');
                    break;}
                case "-":{
                    ans=num1-num2;
                    System.out.print("Sub is: "+ans+'\n');
                    break;}
                case "*":{
                    ans=num1*num2;
                    System.out.print("Multiply is: "+ans+'\n');
                    break;}
                case "/":{
                    ans=num1/num2;
                    System.out.print("Divide is: "+ans+'\n');
                    break;}
                case "ctrl+c":
                    return;
                default:
                {
                    System.out.print("You have enter wrong operator!!!"+'\n');
                }
            }
        }
    }
}

//
/*public class calcutor{
    public static void main(String[] args)
    {
        while(true)
        {
            Scanner sb=new Scanner(System.in);
            System.out.print("enter a opearter:");
            String s=sb.nextLine();
            System.out.print("enter a first number:");
            int a=sb.nextInt();
            System.out.print("enter a second number");
            int b=sb.nextInt();
            int ans=0;
            switch (s){
                case "+":
                    ans=a+b;
                    System.out.println("sum is:"+ans);
                    break;
                case "-":
                    ans=a-b;
                    System.out.println("sub is:"+ans);
                    break;
                case "*":
                    ans=a*b;
                    System.out.println("multipication is:"+ans);
                    break;
                case "/":
                    ans=a/b;
                    System.out.println("division is :"+ ans);
                    break;
                case "ctrl+c":
                    return;
                default:
                    System.out.println("invalid input ");
            }
        }
    }
}*/