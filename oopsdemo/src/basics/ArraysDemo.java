package basics;


public class ArraysDemo {

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50,77,222}; // declare & initialize array
        int i;
       
        System.out.println("********** Array Contents **********");
        for(i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
        System.out.println("The Size of Array is : "+num.length);
        System.out.println("First Element of Array is :"+num[0]);
        System.out.println("Last Element of Array is :"+num[num.length-1]);

	}

}
