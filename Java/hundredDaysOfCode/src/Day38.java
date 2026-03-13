public class Day38 {
    public int addRungs(int[] rungs, int dist) {
        int count=0;
        if(rungs[0] > dist){
            count += (rungs[0]-1)/dist;
        }
        for(int i=1; i<rungs.length; i++){
            if((rungs[i]-rungs[i-1])>dist){
                count += (rungs[i]-rungs[i-1]-1)/dist;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Day38 day38 = new Day38();
        int[] rungs = {1, 3, 5, 10};
        int dist = 2;
        int result = day38.addRungs(rungs, dist);
        System.out.println(result);
    }
}
