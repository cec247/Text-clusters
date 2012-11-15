import java.util.ArrayList;


public class Cluster {
	private ArrayList<SubCluster> subClusters;
	
	public Cluster(){
		subClusters = null;
	}
	
	public Cluster(ArrayList<SubCluster> cl){
		subClusters = cl;
	}
	
	public void setSubClusters(ArrayList<SubCluster> cl){
		subClusters = cl;
	}
	
	public void printSubClusters(){
		SubCluster sub;
		for (int i =0; i < subClusters.size(); i++){
			sub = subClusters.get(i);
			sub.printSubCluster();
		}
	}

}
