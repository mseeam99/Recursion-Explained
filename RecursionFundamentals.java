import java.util.*;

class RecursionFundamentals {



    public static void main(String[] args) {
        int first = 0;
        recursion(first);
    }




    public static void recursion(int value) {
        if(value>9){
            return;
        }
        System.out.println("From inside recursion: " + value);
        value++;
        recursion(value);
        

        print(value);
    }
    



    public static void print(int val) {
        System.out.println("After recursion: " + val);
    }


}

/*
From inside recursion: 0
From inside recursion: 1
From inside recursion: 2
From inside recursion: 3
From inside recursion: 4
From inside recursion: 5
From inside recursion: 6
From inside recursion: 7
From inside recursion: 8
From inside recursion: 9
After recursion: 10
After recursion: 9
After recursion: 8
After recursion: 7
After recursion: 6
After recursion: 5
After recursion: 4
After recursion: 3
After recursion: 2
After recursion: 1
*/