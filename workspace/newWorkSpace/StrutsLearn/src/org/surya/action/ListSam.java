package org.surya.action;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListSam {
	
	
	

	public static void main(String[] args) {
		
		int a=0;
		
List<String> slist= new ArrayList<>();
slist.add("Surya");
slist.add("pavan");
slist.add("hero");

List<String> slistTest= new ArrayList<>();
slistTest.add("Surya");
slistTest.add("pavan");
slistTest.add("test");
String s="ntr";
System.out.println(s.split("").toString());

Map<String, String> mymap = new HashMap<String, String>();
mymap.put("1","one");
mymap.put("1","not one");
mymap.put("1","surely not one");
System.out.println(mymap.get("1"));
//char[] aaa=new char[];

char[] charArray=s.toCharArray();
System.out.println(charArray);
for(int i=0;i<=slist.size()-1;i++){
		if(	slist.get(i)!=slistTest.get(i)){
			a++;
		}
	if(a==1){
		System.out.println(slistTest.get(i));
	}

	
}
	}

}
