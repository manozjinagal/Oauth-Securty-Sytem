import java.util.*;
class T1{
    public static void main(String[] args)
    {
        int[] ={-10, -1, 46, -27, -32, -5, -4, 1, -29, 5, 29, 38, 14, -22, -9, 0};
        System.out.println(" "+Ft1(arr));
    }
    static boolean Ft1(int[] arr)
    {
        int count,sum=0;;
        for(int i=0;i<arr.length;i++)
        {
            sum=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==0)
                    return true;
            }
            System.out.println(" "+sum);
            sum=0;
        }
        return false;
    }
}