package CodingQuestion;

public class MovingZeros {
    public static void main(String[] args) {
        int []ele = {0,10,0,3,12};
        int i=0;
        int j=0;
        while (i<ele.length)
        {
            if(ele[i]!=0)
            {
                ele[i]=ele[j];
                i++;
            }
            j++;
        }
    }
}
