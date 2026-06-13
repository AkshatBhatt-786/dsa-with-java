
package arrays;


public class ArrayBasics
{
	static double getAverage(int[] arr)
	{
		double sum = 0;
		for(int i: arr)
		{
			sum += i;
		}
		int size = arr.length;
		double avg = sum / size;
		return avg;
	}	
	
	static int[] multiplyX(int[] arr, int x)
	{
		int[] newArr = new int[arr.length];
		int index = 0;
		for(int i: arr)
		{
			int newValue = i * x;
			newArr[index] = newValue;
			index++;
		}
		return newArr;
	}

	static boolean contains(int[] arr, int target)
	{
		for(int i: arr)
		{
			if(i == target)
				return true;
		}
		return false;
	}

	static int indexOf(int[] arr, int target)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == target)
				return i;
		}
		return -1;
	}	

	static int getMax(int [] arr)
	{
		int max = arr[0];
		for(int i: arr)
		{
			if(i > max)
				max = i;
		}
		return max;
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		for(int i: arr)
			System.out.print(i + " ");
		System.out.println();
		System.out.printf("Average: %f", getAverage(arr));
		int[] newArr = multiplyX(arr, 2);
		System.out.println();
		for(int i: newArr)
			System.out.print(i + " ");
		System.out.println();
		System.out.println(contains(arr, 3));
		System.out.println(contains(arr, 6));
		System.out.println(indexOf(arr, 3));
		System.out.println(indexOf(arr, 6));
		System.out.println(getMax(arr));
	}
}