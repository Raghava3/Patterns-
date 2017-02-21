package com.br;

public class OrderedPair <K,V> implements Pair <K,V> 
{
	   private K key;
	    private V value;

	    public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	    }

	    public K getKey()	{ return key; }
	    public V getValue() { return value; }
	    public int exp(){return 10;}
	  
	    public static void main(String[] args)
	    {
	    	
	   
	    
	    	OrderedPair o=new OrderedPair(11, "raghav");
	    	Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
	    	Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
	    	OrderedPair<String, String>  p3 = new OrderedPair("hello", "world");
System.out.println(o.getKey());
System.out.println(o.getValue());
System.out.println(p1.getKey());
	 System.out.println(p1.getValue());
	 System.out.println(p2.getKey());
	 System.out.println(p2.getValue());
	 System.out.println(p3.getKey());
	 System.out.println(p3.getValue());
	    	
	    }

}
