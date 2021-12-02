import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberMain {
    private static int input_integer(){
        //주어진 정수를 입력 받는 함수
        Scanner scan= new Scanner(System.in);
        int put_integer=scan.nextInt();
        scan.close();
        return put_integer;}

    private static List primes_under(int n){
        //주어진 정수 n보다 작거나 같은 소수를 구하는 함수
        List primes= new ArrayList();
        primes.add(2);
        for(int test_num=3 ; test_num<=n ; test_num++){
            boolean prime_sign=true;
            for(int p=0, s=primes.size(); p<s; p++){
                int u=(int) primes.get(p);
                //Object 형식으로 되어 있어서 강제로 int 형식으로 변환해버린다.
                if(test_num%u==0){
                    prime_sign=false;
                    break;}}
            if(prime_sign){
                primes.add(test_num);}
            }
        return primes;}

    private static void print_primes(int n, List prime_list){
        //각 원소가 정수인 배열이 주어지면, n 이하의 자연수 k에 대해서 "k보다 작은 소수는 [...]다" 형식으로 출력하는 함수
        for(int i=0, s=prime_list.size(); i<s-1 ; i++){
            int x1=(int)prime_list.get(i);
            int x2=(int)prime_list.get(i+1);
            List primes= new ArrayList();
            for(int j=0;j<=i;j++){
                primes.add(prime_list.get(j));}
            for(int a=x1 ; a<x2 ; a++){
                System.out.println("Prime Numbers less than or equal to "+a+" = "+primes);}}
        int last_prime=(int)prime_list.get(prime_list.size()-1);
        for(int y=last_prime ; y<=n ; y++){
            System.out.println("Prime Numbers less than or equal to "+y+" = "+prime_list);}
    }
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        int inputs=input_integer();
        print_primes(inputs,primes_under(inputs));}
}
