import java.util.ArrayList;


public class SubCluster {
	
	private ArrayList<Word> words;
	private Cluster superCl;
	
	public SubCluster(ArrayList<Word> w, Cluster sc){
		words = w;
		superCl = sc;
	}
	
	public void printSubCluster(){
		Word w;
		for (int i =0; i < words.size(); i++){
			w = words.get(i);
			System.out.print("{\"name\": \"" + w.getName() + "\", \"size\": " + w.getCount() + "}");
		}
		System.out.print("\n");
	}
}
