import java.util.*;
public class Arrays{
    public static void main(String[] args) {
        // int[] marks = new int[5]; isse bhi likh skte hai
        int marks[] = new int[5];
        marks[0] = 88; //hindi
        marks[1] = 82; //english
        marks[2] = 82; //maths
        marks[3] = 85; //physics
        marks[4] = 76; //chemistry

        for(int i=0; i<5; i++){
            System.out.println(marks[i]);
        }
}
}
