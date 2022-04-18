
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getCombo(0 , candidates , target , new ArrayList<Integer>() , result);
        return result;
    }
    
    public void getCombo(int current , int[] candidates, int target ,List<Integer> ds , List<List<Integer>> result )    {
        if(current==candidates.length){
             if(target == 0){
            result.add(new ArrayList<Integer>(ds));
        }
            return;
        }
        
       
        if(candidates[current]<=target){
            ds.add(candidates[current]);
            getCombo(current, candidates , target-candidates[current],ds,result);
            ds.remove(ds.size()-1);
        }
        
        getCombo(current+1 , candidates , target , ds , result);
    }
}
