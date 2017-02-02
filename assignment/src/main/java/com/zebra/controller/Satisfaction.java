package com.zebra.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/satisfaction")
public class Satisfaction {

	@RequestMapping(path = "/amount", method = RequestMethod.GET)
	public Integer amountOfSatisfaction() throws NumberFormatException, IOException {

		List<Integer> satisfactions = new ArrayList<Integer>();
		Map<Integer, Integer> dataMap = new HashMap<Integer, Integer>();

		InputStream inputStream = Satisfaction.class.getResourceAsStream("/data.txt");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		String line = "";
		while ((line = bufferedReader.readLine()) != null) {
			String parts[] = line.split(" ");
			dataMap.put(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
		}
		bufferedReader.close();
		Iterator<Entry<Integer, Integer>> iterator = dataMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) iterator.next();
			int quotients = entry.getKey() / entry.getValue();
			satisfactions.add(quotients);
		}
		Integer maxSatisfaction = (Integer) Collections.max(satisfactions);

		return maxSatisfaction;

	}

}
