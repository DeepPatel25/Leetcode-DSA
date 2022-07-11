class problem_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        for (int i=0; i<nums.length; i++){
            if(target != nums[i])
                continue;
            if(result[0]==-1)
                result[0]=i;
            result[1]=i;
        }
        return result;
    }
}