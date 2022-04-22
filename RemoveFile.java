class Solution {
    public int removeElement(int[] nums, int val) {
        
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
                continue;
            }     a
            nums[j] = nums[i];
            j++;
              
            
        
        
        for(int i=0;i<nums.length;i++){
            System.out.println("here" + nums[i]);
        }
        
        return nums.length-count;
        
    }
}
