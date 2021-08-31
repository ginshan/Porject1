
public class ObjA {
	public int a;
	public int b;
	
	public static void func1(ObjA s) {
		int c =s.a;
		s.a =s.b;
		s.b =c ;
		double d = Math.sqrt(s.b)+2;
		System.out.println((int)d);
	}
	
	public static void func2(int[] array) {
		for(int i =array.length -2;i>0;--i) {
			for(int j =0;j<i;++j) {
				if(array[j]>array[j+1]){
					func3(array,j,j+1);
				}
			}
		}
	}
	
	private static void func3(int[] array, int indexA, int indexB) {
		int tmp =array[indexA];
		array[indexA] = array[indexB];
		array[indexB] =tmp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjA objA = new ObjA();
		objA.a=9;
		objA.b=100;
		
		func1(objA);
		System.out.println("a="+objA.a+",b="+objA.b);
		
		int[] numbers = {96,62,43,85,71};
		func2(numbers);
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
	}
}