import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args)
    {
        int[] arr = {4,1,7,5,2,8,3,9,6};
        bubblesort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr)
    {
        //run the step n- 1 times
        for (int i = 0 ; i < arr.length; i++)
        {
            // for each step , max item will come to last respective index
            for(int j = 1 ; j < arr.length - i ; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp ;
                }
            }
        }

    }


}
