public class Ch6_3 {
    public static void main(String[] args) {
        int arr[]={17,48,38,74,62};
        int max=arr[0];

        for(int i:arr){
            if(i>max)
                max=i;
        }
        System.out.printf("Maximum is %d",max);
    }
    
}