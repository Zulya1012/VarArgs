package varargs;
public class Dispatcher {
	public static void main(String[] args) {
		int[] x = {3,8,5,2};
		noVarArgs(x);
		varArgs(3,8,5,2);
		varArgsWithOtherArgs(false, 3,8,5,2);
		varArgs(true, false, true);
		wideVSbox(5);
		byte b = 5;
		wideVSbox(b);
		boxVSvarArgs(5,7);
		 
	}
	static void boxVSvarArgs(Integer i1, Integer i2) {
		System.out.println("Box");
	}
	static void boxVSvarArgs(int...x) {
		System.out.println("VarArgs");
	}
	static void wideVSbox(Integer i) {
		System.out.println("Box");
	}
	static void wideVSbox(Number d) {
		System.out.println("Wide");
	}
	static void varArgs(boolean...b) {
		for(boolean temp : b) {
			System.out.println(temp);
		}
	}
	static void varArgs(int...x) {
		int sum = 0;
		for(int temp : x) {
			sum += temp;
		}
		System.out.println(sum);
	}
		
	static void varArgsWithOtherArgs(boolean isSum, int...x) {
		int sum = 0, mul =1;
		if (isSum) {
			for (int temp : x) {
				sum += temp;
			}
		}
			else {
				for(int temp : x) {
					mul *= temp;
				}
			}
//		System.out.println(sum + " " + mul);
	}
	static void noVarArgs(int[] x) {
		int sum = 0;
		for(int temp : x) {
			sum += temp;
		}
//		System.out.println(sum);
	}

}
