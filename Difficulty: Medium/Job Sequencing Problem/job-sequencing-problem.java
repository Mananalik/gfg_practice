class Jobs{
    int dead;
    int profit;
public Jobs(int dead, int profit){
    this.dead = dead;
    this.profit = profit;
}
}
class profitComparator implements Comparator<Jobs>{
    @Override
    public int compare (Jobs a, Jobs b){
        int x = a.profit;
        int y = b.profit;
        if(x<y) return 1;
        else if(x>y) return -1;
        else return 0;
    }
}

class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = profit.length;
        Jobs arr[] = new Jobs[n];
        for(int i=0;i<n;i++){
            arr[i] = new Jobs(deadline[i],profit[i]);
        }
        int maxDead = -1;
        for(int i=0;i<n;i++){
            maxDead = Math.max(maxDead,deadline[i]);
        }
        int hash[] = new int[maxDead+1];
        for(int i=0;i<maxDead+1;i++){
            hash[i] = -1;
        }
        Arrays.sort(arr,new profitComparator());
        ArrayList<Integer> list = new ArrayList<>();
        int cnt=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].dead;j>0;j--){
                if(hash[j]==-1){
                    hash[j] = i;
                    cnt++;
                    sum+=arr[i].profit;
                    break;
                }
            }
        }
        list.add(cnt);
        list.add(sum);
        return list;
    }
}