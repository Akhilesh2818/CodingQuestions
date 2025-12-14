package CodingQuestion;

public class SecondLargestNumArr {
    public static void main(String[] args) {
        int max=0;
        int secondmax=0;
        int [] input={1,5,4,3,2,6}; 
        for(int i=0;i<input.length;i++)
        {
            for (int j=i+1;j< input.length;i++)
            {
                if(input[i]<input[j])
                {
                    max=input[j];
                    secondmax=max;
                }
            }
        }
    }
}
