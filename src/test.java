import java.util.Arrays;

public class test {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        doSome(arr,5);
    }
    public static void doSome (int [] arr, int lim){
        int v=0;
        int k=0;
        while(k<arr.length && arr[k]<lim){
            if(arr[k]>v){
                v=arr[k];
            }
            k++;
        }
        System.out.println(k);
    }
    public static int methodOne(int a, int b)
    {

        int loopCount = 0;

        for (int i = 0; i < a / b; i++)

        {

            loopCount++;

        }

        return loopCount;

    }
    public static int methodTwo(int a, int b)
    {

        int loopCount = 0;

        int i = 0;

        while (i < a)

        {

            loopCount++;

            i += b;

        }

        return loopCount;

    }
}