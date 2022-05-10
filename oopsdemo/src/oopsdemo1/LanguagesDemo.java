package oopsdemo1;

class Language
{
	private String s;
	private int version;
	
	Language() // Impicit/ No- Args constructor
	{
		System.out.println(" Iam a Impilit constructor");
		s="python";
		System.out.println("Hello from :"+s);
	}
	
	Language(String lang)
	{
		System.out.println("Iam a paramaterized constructor");
		this.s=lang;
		System.out.println("Hello from : "+s);
	}
	Language(String lang,int ver)  // parameterized constructor with 1 Args
	{
		System.out.println("Iam a parameterized constructor with 2 Arguments");
		this.s=lang;
		this.version=ver;
		System.out.println("Hello from :"+s+" v."+ver);
	}
}
public class LanguagesDemo {

	public static void main(String[] args) {
		Language l1=new Language(); // automatically invokes impicit constructor
		Language l2=new Language("Ruby");
		Language l3=new Language("Scala");
		Language l4=new Language();
		Language l5=new Language("Java",2);//automatically invokes 2 Args parameterized constructor

		

	}

}
