package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrainNames {

	public static void main(String[] args) {
		
		List<String> trainNames = new ArrayList<String>();
		trainNames.add("Shatabdi");
		trainNames.add("Duronto");
		trainNames.add("Humsafar");
		trainNames.add("Jan Shatabdi");
		trainNames.add("dhadar");
		
		System.out.println(trainNames);
		Collections.sort(trainNames);
		System.out.println(trainNames);
		Collections.reverse(trainNames);
		System.out.println(trainNames);
		
		System.out.println(trainNames.get(0));
		
		int size = trainNames.size();
		System.out.println(trainNames.get(size-1));
		
	}
}
