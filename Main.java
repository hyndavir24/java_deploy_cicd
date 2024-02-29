import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String args[]) {
		
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			
			System.out.println(entry.getKey()+" : "+ entry.getValue());
			
		}
		
		for(String entry: map.keySet()) {
			
			System.out.println(entry);
			
		}
		
		
		int[] msa = new int[] {-2,-3,4,-1,-2,1,5,-3};
	
		
	
		
		int[] st = new int[] {100,180,260,70,310,40,535,655};
		
		int min=st[0];
		int maxprofit=0;int totalprofit=0;
		
		for(int i = 1;i<st.length;i++) {
			
			
			if(min<st[i]) {
				maxprofit = Math.max(maxprofit, st[i]-min);
			}
			else {
				
				min = st[i];
				totalprofit+=maxprofit;
				maxprofit=0;
				
			}
			
		}
		totalprofit+=maxprofit;
		System.out.println(totalprofit);
		
	}

	
	

}
