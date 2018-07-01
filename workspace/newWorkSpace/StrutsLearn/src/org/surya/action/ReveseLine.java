package org.surya.action;

import java.util.ArrayList;
import java.util.List;

public class ReveseLine {

	public static void main(String[] args) {
String line="He is ugly";
String[] sarray=line.split(" ");

for(int i=sarray.length-1;i>=0;i--){
	System.out.print(sarray[i]+" ");
}
	}

}
