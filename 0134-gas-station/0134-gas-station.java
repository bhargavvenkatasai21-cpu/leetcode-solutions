class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0, totalcost=0;
        for(int num : gas){
            totalgas+=num;
        }
        for(int num2 : cost){
            totalcost+=num2;
        }

        if(totalgas<totalcost) return -1;
        int stat=0, cur=0;
        for(int i=0; i<gas.length; i++){
            cur+=(gas[i]-cost[i]);
            if(cur<0){
                stat=i+1;
                cur=0;
            }
        }
        return stat;
    }
}