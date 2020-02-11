package calculator;
import java.util.Scanner;


public class calculator 
{
	int a,b;
	void Add(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	void Divide(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a/b);
	}
	void Multiply(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a*b);
	}
	void Subtract(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a-b);
	}

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.print("enter two numbers: ");
		int first=reader.nextInt();
		int second=reader.nextInt();
		System.out.print("enter an operator(+,-,*,/)");
		char operator=reader.next().charAt(0);
		calculator obj=new calculator();
		switch(operator)
		{
		case '+':
			obj.Add(first,second);
			break;
		case '-':
			obj.Subtract(first,second);
			break;
		case '*':
			obj.Multiply(first,second);
			break;
		case '/':
			obj.Divide(first,second);
			break;
			default:
				System.out.printf("error !operator is not correct");
				return;
		}

	}

}
