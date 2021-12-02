public class Beverage {
    private String name;
    private String type;

    Beverage(String beverage_name, String beverage_type){
        this.type = beverage_type;
        this.name = beverage_name;
    }

    public String getBeverageName() {return this.name;}
    public String getBeverageType() {return this.type;}

    public boolean equals(Beverage new_beverage){
        boolean name_equal = this.name.equals(new_beverage.getBeverageName());
        boolean type_equal = this.type.equals(new_beverage.getBeverageType());
        return name_equal && type_equal;}
    
    public String toString(){
        return String.format("[%s, %s]",this.name, this.type);
    }    

    @Override
    public int hashCode(){
        return (this.name.hashCode()+this.type.hashCode())/2;
    }
}
