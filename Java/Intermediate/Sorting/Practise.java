public class Practise{
    public static void buyandSellStock(int arr[])
    {
        int buy = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(buy<arr[i])
            {
                int profit = arr[i]-buy;
                maxProfit=Math.max(maxProfit, profit);
            }
            else {
                buy=arr[i];
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int arr[] ={7,1,3,6,5,4};
        buyandSellStock(arr);
    }
}