class Item{
    int value;
    int weight;
    public Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
class itemComparator implements Comparator<Item>{
    @Override
    public int compare(Item a, Item b){
        double x = (double) a.value/(double)a.weight;
        double y = (double) b.value/(double)b.weight;
        if(x<y){
            return 1;
        }
        else if(x>y){
            return -1;
        }else{
            return 0;
        }
    }
}
class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int w) {
        // code here
        int m = values.length;
        double sum = 0;
        Item arr[] = new Item[m];
        for(int i=0;i<m;i++){
            arr[i] = new Item(values[i],weights[i]);
        }
        Arrays.sort(arr,new itemComparator());
        for(int i=0;i<m;i++){
            if(w-arr[i].weight>0){
                sum = sum+arr[i].value;
                w = w-arr[i].weight;
            }else{
                sum = sum+((double)arr[i].value/(double)arr[i].weight)*w;
                break;
            }
        }
        return sum;
    }
}