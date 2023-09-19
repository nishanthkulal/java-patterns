import java.util.Scanner;
public class RectanglePattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height and width");
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
            System.out.print("*");
        }
         System.out.println();
        }

    }
}
