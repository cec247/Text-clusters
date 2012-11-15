
public class Word {
	private int id;
	private int count;
	private String name;
	private Cluster cluster;
	
	public Word(int s, int c, String n, Cluster cl){
		id = s;
		count = c;
		name = n;
		cluster = cl;
		
	}
	
	public String getName(){
		return name;
	}
	public int getCount(){
		return count;
	}

}


