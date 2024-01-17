package CustomClassesProject;

public class iPhone extends computer{
    private String typeOfIphone;
    private int numCameras;
    public iPhone(){
        super();
        typeOfIphone="";
        numCameras=0;
    }
    public iPhone(String typeOfChip,int numCores,boolean GpuorNot, String operatingSystem,String typeOfIphone, int numCameras){
        super(typeOfChip,numCores,GpuorNot,operatingSystem);
        this.typeOfIphone=typeOfIphone;
        this.numCameras=numCameras;
    }

    public String getTypeOfIphone() {
        return typeOfIphone;
    }

    public void setTypeOfIphone(String typeOfIphone) {
        this.typeOfIphone = typeOfIphone;
    }

    public int getNumCameras() {
        return numCameras;
    }

    public void setNumCameras(int numCameras) {
        this.numCameras = numCameras;
    }

    public String toString() {
        return "iPhone type is "+typeOfIphone+". The phone has "+numCameras+" cameras.";
    }
}
