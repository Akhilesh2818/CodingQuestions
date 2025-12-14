package CodingQuestion;

public class RotateArr {
    public static void main(String[] args) {
        int []b={1,2,3,4,5,6,7,8};
        int rotate=4;
        rotateArray(b,rotate);

    }
    public  static void rotateArray(int []nums,int k)
    {
        int len=nums.length;
        int [] result=new int[len];
        for (int i=0;i<k;i++)
        {
            result[i]=nums[len-k+i];
        }
        int z=0;
        for (int j=k;j<len;j++)
        {
            result[j]=nums[z];
            z++;
        }
        for (int i=0;i<len;i++){
            System.out.println(result[i]);
        }
    }
}
