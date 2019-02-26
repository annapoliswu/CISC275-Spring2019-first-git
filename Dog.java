abstract class Animal{
    String name;
    int legs;

    @Override
    public String toString(){
	return "Name: " +name + " - Legs: " + legs;
    }
    
    public int getLegs(){
	return legs;
    }
    
}


public class Dog extends Animal{
    Dog(String n, int l){
	name = n;
	legs = l;
    }


}
