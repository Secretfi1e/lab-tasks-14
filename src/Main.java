import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] array = {3, 6, 8, 2, 9, 1, 5, 7, 4};


        int sum1=0;
        int sum2=0;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;


        for (int num : array) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        System.out.println("En büyük iki rakam: " + max1 + ", " + max2);

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int nums : array) {

            if (nums<min1){
                min2=min1;
                min1=nums;

            } else if (nums < min2 && nums != min1) {
                min2 = nums;
            }
        }
        System.out.println("En küçük iki rakam: " + min1 + ", " + min2);

        sum1+=min1+min2;

        System.out.println("En kicik 2 ededin cemi: " + sum1);

        sum2+=max1+max2;
        System.out.println("En buyuk 2 ededin cemi: " + sum2);


        Scanner scanner = new Scanner(System.in);
        System.out.println("emeliyyat daxil edin:");
        String name = scanner.nextLine();

        switch (name){

            case "vurma" :
                System.out.println(sum2*sum1);

                break;
            case "bolme" :
                System.out.println(sum2/sum1);

                break;
            case "cixma" :
                System.out.println(sum2-sum1);

                break;
            case "toplama" :
                System.out.println(sum2+sum1);

                break;
            default:

        }
    }}

 