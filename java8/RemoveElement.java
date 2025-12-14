package java8;

import javax.swing.*;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int b[]={1,2,3,4,5,5};
        int elem=5;
        int i=0;
        int j=0;
        while (j<b.length)
        {
            if (b[j]!=elem)
            {
                b[i]=b[j];
                i++;
            }
            j++;
        }
        System.out.println(i);
    }


}
