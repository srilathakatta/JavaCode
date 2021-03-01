package JavaProgram;

public class SwapTwoNumUsingTemp {

	public static void main(String[] args) {
	//4.	WAP to swap two numbers using temp variable?
		int a=25;
		int b=10;
	int temp=a;//25
	a=b;//10
	b=temp;//25
	
System.out.println("a value is:"+a+"\n"+"b value is:"+b);


//6.	WAP to swap two numbers using w/o operator?
int x=10;
int y=25;
x=x+y;//35
y=x-y;//35-25=10
x=x-y;//35-10=25
System.out.println("x="+x+"\n"+"y="+y);

//6.	WAP to swap two numbers using bitwise operator?
int p=4;
int q=2;
p=p^q;
q=p^q;
p=p^q;
System.out.println("p="+p+"\n"+"q="+q);



	}

}
