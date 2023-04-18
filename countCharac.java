public class countCharac {
    public static void main(String args[]){
        String str = "Hello Keshav";
        int count = 0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Total Characters ="+count);
    }
}
