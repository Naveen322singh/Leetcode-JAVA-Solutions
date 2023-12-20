package LEETCODE;
public class Q1672
{
    public static void main(String[] args)
    {


    }

    public int maximumWealth(int[][] accounts)
    {
        int ans=0;
        for (int person=0;person<accounts.length;person++)
        {
            int sum=0;
            for (int account=0;account<accounts[person].length;account++)
            {
                sum=sum+accounts[person][account];
            }
            if (sum>ans)
            {
                ans=sum;
            }
        }
        return ans;

    }
}
