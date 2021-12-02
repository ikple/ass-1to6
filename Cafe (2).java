package edu.pnu.admin;
import edu.pnu.collection.GenericList;
import java.util.ArrayList;
import java.util.List;



public class Cafe {
    
    private final String name;
    private final GenericList<Beverage> students = new GenericList<>();
    public Cafe(String cafe_name){this.name = cafe_name;}

    public void addBeverage(Beverage newBeverage) {students.add(newBeverage);}
    public GenericList<Beverage> getBeverages(){return students;}

    public Beverage findBeverage(String name, String type) {
        for(Beverage beverage:students.data){
            boolean name_equal = beverage.getBeverageName().equals(name);
            boolean type_equal = beverage.getBeverageType().equals(type);
            if(name_equal && type_equal){return beverage;}}
        return null;
    }

    public void removeAllBeverage() { students.clear();}

    @Override
    public String toString(){
        StringBuilder msg = new StringBuilder("Cafe Name: " + name + " Beverage Count: " + students.data.size() + "\n");
        for (Beverage beverage : students.data) {
            msg.append("\t").append(beverage).append("\n");
        }
        return msg.toString();}

        public boolean equals(Cafe new_cafe){
        if(this.students.data.size()==new_cafe.getBeverages().size()){
            GenericList<Boolean> beverage_equal_list = new GenericList<>();
            for(Beverage beverage:students.data){
                boolean true_flag = false;
                for(Beverage new_beverage: new_cafe.getBeverages().data){
                    if(beverage.equals(new_beverage)){true_flag = true;}}
                beverage_equal_list.add(true_flag);}
            return !beverage_equal_list.contains(false);}
        else{return false;}}
}