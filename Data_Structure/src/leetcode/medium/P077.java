package leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class P077 {

	private ArrayList<List<Integer>> res;
	public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<List<Integer>>();
        if(n <=0 || k <= 0 || k > n){
        	return res;
        }
        LinkedList<Integer> c = new LinkedList<>();
        generateCombinations(n,k,1,c);
        return res;
    }
	//求解C(n,k), 当前已经找到的组合存储在c中, 需要从start开始搜索新的元素
	private void generateCombinations(int n, int k, int start, LinkedList<Integer> c) {
		// TODO Auto-generated method stub
		if(c.size() == k){
			res.add((List<Integer>) c.clone());
			return;
		}
		
		
		for(int i = start; i <= n ;i++){
			c.addLast(i);
			generateCombinations(n, k, i + 1, c);
			c.removeLast();
		}
		return ;
	}
	
	
	@Test
	public void test(){
		combine(4,2);
	}
	
}
