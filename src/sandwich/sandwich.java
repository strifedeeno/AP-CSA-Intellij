package sandwich;

import java.util.*;

public class sandwich {
    private String name;
    private int numIngredients;
    private ArrayList<String> ingredientsList;

    public sandwich(){
        name=null;
        numIngredients=0;
        ingredientsList= new ArrayList<String>();
    }
    public sandwich(String name, int numIngredients, ArrayList<String> ingredientsList){
        this.name=name;
        this.numIngredients=numIngredients;
        this.ingredientsList=ingredientsList;
    }
    public sandwich(sandwich sandwich2){
        name=sandwich2.getName();
        numIngredients= sandwich2.getNumIngredients();
        ingredientsList= sandwich2.getIngredientsList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumIngredients() {
        return numIngredients;
    }

    public void setNumIngredients(int numIngredients) {
        this.numIngredients = numIngredients;
    }

    public ArrayList<String> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(ArrayList<String> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }
    public void addIngredient(String n){
        ingredientsList.add(n);
    }
    public void removeIngredient(String n){
        ingredientsList.remove(n);
    }
    public String toString() {
        return name+ " number of ingredients is "+ numIngredients+ " the ingredients are " + ingredientsList;
    }
}
