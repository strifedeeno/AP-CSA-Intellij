package CustomClassesProject;

public class computer extends chip{
    private boolean GpuorNot;
    private String operatingSystem;
    public computer(){
        super();
        GpuorNot=false;
        operatingSystem="0";
    }
    public computer(String typeOfChip,int numCores,boolean GpuorNot, String operatingSystem){
        super(typeOfChip,numCores);
        this.GpuorNot=GpuorNot;
        this.operatingSystem=operatingSystem;
    }
    public String toString() {
        if(GpuorNot==true){
            return "There is a gpu. The OS is "+ operatingSystem+".";
        }
        else{
            return "There is not a gpu. The OS is "+ operatingSystem+".";
        }
    }
}
