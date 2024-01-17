package CustomClassesProject;

public class main {
    public static void main(String[] args) {
        chip chip=new chip("intel", 13);
        iPhone iPhone=new iPhone("intel",12,true,"MacOs", "iphone 22", 22);
        computer computer=new computer("intel",13, true, "Macos");
        chip[] things= {chip, iPhone, computer};
        for(chip lol:things){
            System.out.println(lol);
        }
    }
}
