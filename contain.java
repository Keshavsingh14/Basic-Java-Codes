public class contain {
    public static boolean contain(int arr[], int item){
        for(int n : arr){
            if(item == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {10,15,20,25,30};
        System.out.println("So the results are:");
        System.out.println(contain(arr, 25));
        System.out.println(contain(arr, 50));
    }
}
