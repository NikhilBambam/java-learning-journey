public class Question17 {
    public static  int buyAndSellStocks(int arr[])
    {
        int Bp =Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(Bp<arr[i])
            {
               int  profit = arr[i]-Bp;
                maxProfit=Math.max(maxProfit,profit);
            } else {
                Bp = arr[i];
            }
            
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
}
 