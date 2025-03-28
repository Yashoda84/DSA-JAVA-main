class LongestCommonPrefix {
    public String lcp(String[] strs) {
       String ans=strs[0];
       for(int i=1;i<strs.length;i++){
           ans=check(ans, strs[i]); 
       }
       System.out.println(ans);
       return ans;
    }
    public String check(String str1, String str2){
        int num = Math.min(str1.length(), str2.length());
        StringBuilder sbi = new StringBuilder();

        for(int i=0;i<num;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                sbi.append(str1.charAt(i));
            }else{
                break;
            }
        }
        return sbi.toString();
    }

  public static void main(String[] args){
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String[] str = {"flower","flow","fly"};
    longestCommonPrefix.lcp(str);
  }

}