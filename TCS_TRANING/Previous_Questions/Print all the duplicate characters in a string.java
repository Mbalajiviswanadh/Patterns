package TCS_TRANING.Previous_Questions;

import java.util.*;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str=sc.nextLine();
        
        Map<Character, Integer> map= new HashMap<>();
        
        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        
        for(Character c : map.keySet()){
            
            if(map.get(c)>1)
            System.out.println(c+", count= "+map.get(c));
        }
        
    }
}