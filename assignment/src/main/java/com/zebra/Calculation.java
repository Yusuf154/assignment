package com.zebra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Calculation {

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Calculation calculation = new Calculation();
		List satisfactions = new ArrayList();
		  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		  
		  InputStream is = Calculation.class.getResourceAsStream("/data.txt");
	        BufferedReader in = new BufferedReader(new InputStreamReader(is));
	        String line = "";
	        while ((line = in.readLine()) != null) {
	            String parts[] = line.split(" ");
	            map.put(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
	        }
	        in.close();
	        //System.out.println(map);
	        Iterator<Entry<Integer,Integer>> iterator = map.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>) iterator.next();
				//System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
				
				int quotients = entry.getKey()/entry.getValue();
				satisfactions.add(quotients);
				//System.out.println(satisfactions);
				
			}
			Integer i = (Integer)Collections.max(satisfactions);
			//Collections.max(satisfactions);
			System.out.println(i);
			
	       	        
	    }*/

	

}
