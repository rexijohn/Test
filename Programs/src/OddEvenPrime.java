import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
//import java.util.HashMap;
//import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OddEvenPrime {
	
	

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<String>();
		HashMap<String,ArrayList<String>> s=new HashMap<String,ArrayList<String>>();
		String [] Value={"act","silent","apple","eappl","cat","listen","tac"};
		for(int i=0;i<Value.length;i++){
			String S=Value[i];			
			char [] c=S.toCharArray();
			Arrays.sort(c);
			S=String.valueOf(c);
		if(!s.containsKey(S)){
			l1=new ArrayList<String>();
			l1.add(Value[i]);
			s.put(S, l1);
		}else{
			l1=s.get(S);
			l1.add(Value[i]);
			s.put(S, l1);
		}
	}
		for(Map.Entry<String,ArrayList<String>> entry:s.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}		
	}	
}
	
