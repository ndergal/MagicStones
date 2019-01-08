import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {

    public static int Solution(int[] tab){
    
    List<Integer> list = Arrays.stream(tab).boxed().collect(Collectors.toList());
    Collections.sort(list);
    int i = 0;
    while( i < list.size()-1){
        if(list.get(i)==list.get(i+1)){
            list.remove(i+1);
            
            int a = list.remove(i);
            
            list.add(a+1);
            Collections.sort(list);
            i=0;
        }else{
            i++;}
    }
    
    return list.size();
    }
    
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] tab = new int[N];
        for (int i = 0; i < N; i++) {
            int level = in.nextInt();
            tab[i] = level;
        }

        // Write an action using System.out.println()

        System.out.println(Solution(tab));
    }
}
