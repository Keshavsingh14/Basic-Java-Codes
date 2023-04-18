public class index {
    public static void main(String args[]){
        int arr[] = {5,10,15,20,25,30};
        int index =-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 15){
                index = i;
            }
        }
        System.out.println("Index is : "+index);
    }
}
