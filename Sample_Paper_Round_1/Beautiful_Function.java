import java.io.*;
import java.util.*;
import java.lang.Math;
class Solution {
	public static int beautifulFunction(int N) {
		HashMap<Integer,Integer>h = new HashMap<>();

		Integer count = h.get(N);
		if (count == null) {
			h.put(N, 1);
		} else{
			h.put(N, count+1);
		}

		while(!h.containsValue(2)){
			
			count = h.get(N);
			N++;
			
			count = h.get(N);
			if(count==null) {
				h.put(N, 1);
			} else{
				h.put(N, count+1);
			}

			if(N%10 == 0) {
				while(N%10 == 0){
					N /= 10;
				}
			}
			
		}
		return h.size() - 1;
	}

	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		int N;
		N = scan.nextInt();
		int result;
		result = beautifulFunction(N);
		System.out.print(result);
		return ;
	}
}
