public class weeka8{
    public static void main(String[] args){
        int x =4;
        int y=5;
        int sum = 0;
        for(int i=0; i<4; i++){
            for(int j=i; j<5; j++){
                sum = sum+j;
            }
        }
        System.out.println(sum);
    }
}