import java.util.Scanner;
public class division {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int start, end;
        
        System.out.print("Enter start number : ");
        start = scan.nextInt();
        System.out.print("Enter end number : ");
        end = scan.nextInt();
        
        System.out.print("======================\n");
        System.out.print(diviFun(start, end));
    }

    public static int diviFun(int min, int max){       
        while(min < max){
            min = min + 1;
            divifFun(min);
        }
        return min;
    }
    public static int divifFun(int num){
        if(num%3 == 0 && num%5 == 0){ // == 0 เศษ 0
            System.out.print(+num +" ");
        }
        return num;
    }

}
