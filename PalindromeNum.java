class PalindromeNum {
    public boolean isPalindrome(int x) {
        int p = x;
        int rev = 0;
        while(x>0){
            int digit = x%10;
            rev = rev*10+digit;
            x/=10;
        }
      return rev==p;
    }
    public static void main(String[] args){
        PalindromeNum s = new PalindromeNum();
        System.out.println(s.isPalindrome(121));
    }
}