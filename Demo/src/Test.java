
public class Test {

	public static void main(String[] args) {
//		double y=232.675;
//		int x=(int) (y+0.5);
//		System.out.println("Hi there!!!!!!!!"+x);
		
		int[] m1,m2= {90,91,92,93};
		m1=f2(m2);
		System.out.println(m1[3]);
		for (int i = m2.length-2; i >=0; i--) {
			System.out.println(" "+m1[i]);
			
		}
	}
	public static void f1(int[] matrix) {
		matrix[2]=matrix[0];
	}
	public static int[] f2(int[] matrix1) {
		int[] matrix2=new int[matrix1.length];
		for (int i = 0; i < matrix2.length; i++) {
			matrix2[i]=matrix1[i]+i;
			
		}
		return matrix2;
	}

}
