import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cafe {
    
    private final String name;
    Cafe(String cafe_name){
        this.name = cafe_name;
    }
    private final List<Beverage> beverages = new ArrayList<>();
    private final HashMap<String,Beverage> menus = new HashMap<>();

    public void addBeverage(Beverage newBeverage) {beverages.add(newBeverage);}
    public List<Beverage> getBeverages(){return beverages;}

    public Beverage findBeverage(String name, String type) {
        for(Beverage beverage:beverages){
            boolean name_equal = beverage.getBeverageName().equals(name);
            boolean type_equal = beverage.getBeverageType().equals(type);
            if(name_equal && type_equal){return beverage;}}
        return null;
    }

    public void removeAllBeverage() { beverages.clear();menus.clear();}

    @Override
    public String toString(){
        StringBuilder msg = new StringBuilder("Cafe Name: " + name + " Beverage Count: " + beverages.size() + "\n");
        for (Beverage beverage : beverages) {
            msg.append("\t").append(beverage).append("\n");
        }
        return msg.toString();}

    public boolean equals(Cafe new_cafe){
        if(this.beverages.size()==new_cafe.getBeverages().size()){
            List<Boolean> beverage_equal_list = new ArrayList<>();
            for(Beverage beverage:beverages){
                boolean true_flag = false;
                for(Beverage new_beverage: new_cafe.getBeverages()){
                    if(beverage.equals(new_beverage)){true_flag = true;}}
                beverage_equal_list.add(true_flag);}
            return !beverage_equal_list.contains(false);}
        else{return false;}}

    @Override
    public int hashCode(){
        int hash_sum = 0;
        for(Beverage beverage:beverages){
            hash_sum += beverage.hashCode();}
        return hash_sum/beverages.size();}
}