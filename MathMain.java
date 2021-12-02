import java.util.Arrays;
import java.util.Scanner;

public class MathMain {
    private static int get_max_value(Integer[] array_input)
    {int M=array_input[0];
     for(int ind=1, size=array_input.length ; ind<=size-1 ; ind++){
         if(array_input[ind]>M){M=array_input[ind];}}
     return M;}

    private static int get_min_value(Integer[] array_input)
    {int m=array_input[0];
     for(int ind=1, size=array_input.length ; ind<=size-1 ; ind++){
         if(array_input[ind]<m){m=array_input[ind];}}
    return m;}

    public static void main(String[] args){
    System.out.println("Enter N");
    Scanner data_scan= new Scanner(System.in);
    Integer N=data_scan.nextInt();
    data_scan.nextLine();
    String[] data_str= data_scan.nextLine().split(" ");
    Integer[] data_int= new Integer[data_str.length];
    for(int ind=0, size=data_int.length ; ind<size ; ind++){
        data_int[ind]=Integer.valueOf(data_str[ind]);}
    data_scan.close();
    System.out.println("Max element: "+get_max_value(data_int)+" in "+Arrays.toString(data_int));
    System.out.println("Min element: "+get_min_value(data_int)+" in "+Arrays.toString(data_int));}
}