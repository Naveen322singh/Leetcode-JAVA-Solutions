package Problems;

public class Binarysearchadv {
    public static void main(String[] args)
    {
        int[] arr={-18,-12,-4,0,1,2,3,15,16,18,22};
        int target=22;
        int ans= binary_search(arr,target);
        System.out.println(ans);
    }
    static int binary_search(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean sort_type;
        if (arr[start] < arr[end])
        {
            sort_type = true;
        }
        else {
            sort_type=false;
        }

        while (start<=end)
        {
            int mid=start+((end-start)/2);
            if (target==arr[mid])
            {
                return mid;
            }
            if (sort_type)
            {
                if (target<arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if (target<arr[mid])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}

