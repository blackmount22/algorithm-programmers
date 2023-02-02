import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pg1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
		String result ="";
		
		List<String> alpha = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i","j", "k", "l", "m", "n", "o","p", "q","r", "s", "t", "u", "v", "w","x","y","z"));
		int alphaSize = alpha.size();
		
		for(int i=0;i<skip.length();i++) {
			for(int j=0;j<alpha.size();j++) {
				if(alpha.get(j).equals(Character.toString(skip.charAt(i)))) {
					alpha.remove(j);
					alphaSize = alpha.size();
				}
			}
		}
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<alphaSize;j++) {
				if(Character.toString(s.charAt(i)).equals(alpha.get(j))) {
					if(j + index >= alphaSize) {
						int idx = j + index - alphaSize;
						result += alpha.get(idx);
					} else {
						result += alpha.get(j + index); 
					}
					
				}
			}
		}
		
		System.out.println(result);
	}

}
