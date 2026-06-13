package arrays;

public class RightShiftByOne
{
    static void rightShiftByOne(int[] arr)
    {
        // step1: store the last element in a variable
        int n = arr.length;
        int temp = arr[n - 1];

        // step2: shift all the elements to the right by one position
        for (int i = n - 1; i > 0; i--)
            arr[i] = arr[i - 1];

        // step3: put the last element at the first position
        arr[0] = temp;
    }    

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i: arr)
            System.out.print(i + " ");
        System.out.println();
        rightShiftByOne(arr);
        for(int i: arr)
            System.out.print(i + " ");
    }
}
