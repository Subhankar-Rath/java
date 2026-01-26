import java.util.Scanner;

public class Averageno {
    public static float avgNo(float x, float y,float z){
        float avg=(x+y+z)/3;
            return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1st:");
        float x=sc.nextFloat();
        System.out.println("2nd");
        float y=sc.nextFloat();
        System.out.println("3rd");
        float z=sc.nextFloat();
        System.out.println(avgNo(x, y, z));
    }
    
}
