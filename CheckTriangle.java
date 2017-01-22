
public class CheckTriangle {
	public static final int ACUTE_TRI = 2;
	public static final int RIGHT_ANGLED_TRI = 1;
	public static final int OBTUSE_TRI = 3;
	public static final double TINY_DIFF = 0.0001;
	public static final int NOT_TRI = 0;

	public static boolean form_triangle(double[] ls)
	{
		sort(ls);
		if(2*max(ls) < sum(ls))
			return true;
		return false;
	}

	//takes in a double array and outputs a new array in order
	public static void sort(double [] ls){
		int i;
		double temp;
		for(int j=1;j<ls.length;j++){
			i=j-1;
			while(i>=0&&ls[i]>ls[i+1]){
				temp=ls[i];
				ls[i]=ls[i+1];
				ls[i+1]=temp;
				i-=1;	
			}
		}
	}
	public static int kind_triangle(double[] ls)
	{
		if(!form_triangle(ls))
			return NOT_TRI;
		else{
			sort(ls);
			double sum= Math.pow(max(ls),2)-(Math.pow(min(ls),2)+Math.pow(ls[1], 2));
			if(sum==0)
				return RIGHT_ANGLED_TRI;
			else if(sum>0)
				return OBTUSE_TRI;
			else 
				return ACUTE_TRI;
		}
	}

	//calculate the sum of arr
	public static double sum(double[] arr)
	{
		return (arr[0]+arr[1]+arr[2]);
	}
	//returns the maximum element of arr
	public static double max(double[] arr)
	{
		sort(arr);
		return arr[2];
//		if(arr[0]>=arr[1]){//if 1st index is greater than the second
//			if(arr[0]>=arr[2])// then if the first index is greater than the last
//				return arr[0]; //return the first
//			else 
//				return arr[2]; //otherwise return the last
//		}
//		else if(arr[1]>=arr[2])//if the second index is greater than the last
//			return arr[1]; //return the second
//		else
//			return arr[2]; //otherwise return the last
	}

	//returns the minimum element of arr
	public static double min(double[] arr)
	{
		sort(arr);
		return arr[0];
//		if(arr[0]<=arr[1]){//if 1st index is less than the second
//			if(arr[0]<=arr[2])// then if the first index is less than the last
//				return arr[0]; //return the first
//			else 
//				return arr[2]; //otherwise return the last
//		}
//		else if(arr[1]<=arr[2])//if the second index is less than the last
//			return arr[1]; //return the second
//		else
//			return arr[2]; //otherwise return the last
//	}
	}
}

