import java.util.Scanner;
public class Calci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,sum=0;
		char opt;
		System.out.println("*****WELCOME TO CALCULATOR APPLICATION*****");
		Scanner k=new Scanner(System.in);
		System.out.println("Enter number(num1)");
		a=k.nextDouble();
		System.out.println("Enter number(num2)");
		b=k.nextDouble();
		System.out.println("Enter the Operator(+,-,*,/) to compute operation");
		opt=k.next().charAt(0);
		switch(opt){
			case '+':sum=a+b;
					 System.out.println(a+" "+ opt +" "+ b + " = " + sum);
				 	 break;
			case '-':sum=a-b;
					 System.out.println(a+" "+opt+" "+b+" = "+sum);
					 break;
			case '*':sum=a*b;
					 System.out.println(a+" "+opt+" "+b+" = "+sum);
					 break;
			case '/':if(b==0){
						System.out.println("ERROR:Division with Zero is not possible");
					}
					else
					{
						sum=a/b;
						System.out.println(a+" "+opt+" "+b+" = "+sum);
					}
					break;
			default:System.out.println("Invalid Operation");
		}
		
	}

}
