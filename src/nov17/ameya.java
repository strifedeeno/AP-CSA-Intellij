package nov17;

public class ameya {
    private int weight;
    private boolean nerd;
    private int height;
    private String grade;
    public ameya(int weight){
        this.weight = weight;
    }
    public ameya(boolean nerd){
        this.nerd = nerd;
    }
    public ameya(){
    weight=20;
            nerd=true;
    height=5;
    grade="A";
    }
    public ameya(String grade){
        this.grade = grade;
    }
    public String toString(){
        return "weight: "+weight+" nerd: "+nerd+" height: "+height+" grade: "+grade;
    }

}
