import java.util.Scanner;
public class p7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int s = 0; s <i; s++){
                System.out.print("  ");
            }
            for(int j = n-i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
