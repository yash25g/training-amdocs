package com.amdocs;

public class AlgorithmFactory {

	  public static IAlgorithm getAlgorithm(int algo1)
	  {
		  IAlgorithm algo=null;
		  
		  
		  if(algo1==1)
			  algo=new QuickSort();
		  else if(algo1==2)
			  algo=new BubbleSort();
		  else if(algo1==3)
			  algo=new HeapSort();
		  else 
			  algo=new NullSort();
		  
		  return algo;
	  }
}
