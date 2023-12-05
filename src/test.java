import java.util.Arrays;

public class test {
    public static void main(String[] args){
        double val = -0.7;

        int roundedVal = (int) (val + 0.5);

        System.out.println(roundedVal);
    }
    public static int mystery(boolean a, boolean b, boolean c)

    {

        int answer = 7;



        if (!a)

        {

            answer += 1;

        }



        if (b)

        {

            answer += 2;

        }



        if (c)

        {

            answer += 4;

        }



        return answer;

    }
}
