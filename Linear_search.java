package Problems;
import java.util.Scanner;
public class Linear_search
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int x=in.nextInt();
        int[] arr=new int[x];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the elements to be found in the array");
        int target=in.nextInt();
        int ans=linear_search(arr,target);
        System.out.println(ans);
    }
    static int linear_search(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.print("The element is found at index : ");
                return i;
            }
        }
        return -1;
    }
}
