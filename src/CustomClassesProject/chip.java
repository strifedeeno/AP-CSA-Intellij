package CustomClassesProject;

public class chip {
    private String typeOfChip;
    private int numCores;
    public chip(){
        typeOfChip="";
        numCores=1;
    }
    public chip(String typeOfChip,int numCores){
        this.typeOfChip=typeOfChip;
        this.numCores=numCores;
    }

    public String getTypeOfChip() {
        return typeOfChip;
    }

    public void setTypeOfChip(String typeOfChip) {
        this.typeOfChip = typeOfChip;
    }

    public int getNumCores() {
        return numCores;
    }

    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }

    public String toString() {
        return "The chip is a "+typeOfChip+" and the num of cores is "+ numCores+".";
    }
}
