import java.util.*;

public class StringSetManager {
    public static void main(String[] args){
        Scanner command_scan = new Scanner(System.in);
        List<String> stringSet = new ArrayList<>();
        String[] command;
        do{ command = command_scan.nextLine().split(" ");
            if(stringSet.size()<100){
            switch (command[0].toUpperCase()){
                case "ADD": if(stringSet.indexOf(command[1])==-1){stringSet.add(command[1]);} break;
                case "SORT": if(command[1].equals("ASC")){Collections.sort(stringSet);}
                               else{Collections.sort(stringSet);
                        List new_string_set = new ArrayList();
                        for(int ind=0 ; ind<stringSet.size() ; ind++){
                            new_string_set.add(stringSet.get(stringSet.size()-ind-1));}
                        stringSet = new_string_set;} break;
                case "CLEAN": stringSet.clear(); break;
                case "REMOVE": stringSet.remove(command[1]); break;
                default : break;}
            if(!command[0].equalsIgnoreCase("quit")){System.out.println("Element Size: "+stringSet.size()+", Values = "+stringSet);}}}
        while(!command[0].toUpperCase(Locale.ROOT).equals("QUIT"));
    System.out.println("BYE!");}}