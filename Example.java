class A{
	int a;
	public void printA(){
		System.out.println("A : "+a);
	}
}
class B extends A{
	int b;
	public void printB(){
		System.out.println("B : "+b);	
	}
	public void printAB(){
		System.out.println("A : "+a);
		System.out.println("B : "+b);	
	}
	public void callPrint(){
		printA();
		printB();
	}
}

class Example{
	public static void main(String args[]){
		B b1=new B();
		b1.a=100;
		b1.b=200; 
		b1.printA();
		b1.printB(); 
	}
}
