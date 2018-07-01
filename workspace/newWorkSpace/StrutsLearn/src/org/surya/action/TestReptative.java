package org.surya.action;import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class TestReptative {

	public static void main(String[] args) {
	
		String infy="aaabbgggg";
		char[] aray=infy.toCharArray();
		
		for(int i=0;i<=aray.length-1;i++){
			int a=1;
			Map<Character,Integer> mapsave = null;
			for(int j=0;j<=i;j++){
				
				if(i!=j &&  (aray[i]==aray[j])){
					a++;
					mapsave	= new HashMap<>();
					mapsave.put(aray[i],a );
					System.out.println(mapsave);
				}
				
			}
			System.out.println(mapsave.get(aray[i]));
					
			}
			
		}

	}


