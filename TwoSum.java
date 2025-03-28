class TwoSum{
   public int[] two(int[] nums, int target) {
       for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                  System.out.println(i+" "+j);
                    return new int[] {i, j};
                }
            }
          }
      return new int[] {};
    }
  public static void main(String[] args){
    TwoSum s = new TwoSum();
        int[] a = {11,15,7,2};
        int target = 9;
        int[] p=s.two(a, target);
  }
}