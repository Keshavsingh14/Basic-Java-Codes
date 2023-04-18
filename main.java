public class main {
    public static void findpair(int nums[], int target){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("pair found ("+nums[i]+","+nums[j]+")");
                    return;
                }
            }
        }
        System.out.println("pair not found");
    }
    public static void main(String args[]){
        int nums[] = {8,7,1,2,5,3};
        int target = 10;
        findpair(nums, target);
    }
}
