public class Day32 {
    public int maxProfit(int[] prices) {
        int min = prices[0], maxP = 0;
        for(int i = 0; i<prices.length; i++){
            if((prices[i] - min) > maxP){
                maxP = prices[i]-min;
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }
        return maxP;
    }
    public static void main(String[] args) {
        Day32 obj = new Day32();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}
