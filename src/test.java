import java.util.Arrays;

public class test {
    public static void main(String args[]){
        int[][] box= evenBox(5);
        for(int i =0; i<box.length;i++){
            System.out.println(Arrays.toString(box[i]));
        }
    }
    public static int[][] evenBox(int num){
        int[][] box= new int[num][num];
        int count=0;
        for(int i =0;i<box.length;i++){
            for(int j =0;j< box[i].length;j++){
                if(count%2==0){
                    box[i][j]=count;
                }
                count++;
            }
        }
        return box;
    }
}
