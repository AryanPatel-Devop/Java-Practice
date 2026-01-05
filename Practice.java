import java.util.*;

class power{
    int num;
    int pow;

    int calcPower(power p){
        int mult = p.num;
        for(int i = 0 ; i<(p.pow - 1) ; i++){
            mult = mult*p.num;
        }
        return mult;
    }
}
class Main{
    public static void main(String[] args) {
        power p = new power();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num");
        p.num = sc.nextInt();// it is just testing 

        System.out.println("Enter power");
        p.pow = sc.nextInt();

        int result = p.calcPower(p);
        System.out.println("Result: " + result);
    }
}
