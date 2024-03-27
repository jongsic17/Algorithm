import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();

        for(int i=0; i< q; i++){
            int[] arr = new int[str.length()+1];
            arr[0] = 0;
            String n  = sc.next();
            int l = sc.nextInt();
            int r = sc.nextInt();

            for(int j = 0 ; j < str.length(); j++){
                String ch = str.charAt(j) + "";
                if(ch.equals(n)){
                  arr[j+1] = arr[j] + 1;
                }else arr[j+1] = arr[j];
            }
            if(l!=0){
                System.out.println(arr[r+1]-arr[l]);
            }else System.out.println(arr[r+1]);

        }

    }
}