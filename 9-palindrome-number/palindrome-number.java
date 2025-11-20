class Solution {
    public boolean isPalindrome(int x) {
        int expectednum = x;
        int reversenum = 0;
        int[] nums = new int[5000];
        if(x < 0){
            return false;
        }
        for(int i = 0; x != 0; i++)
        {
            nums[i] = (x % 10);
             System.out.println(nums[i]);
             reversenum = reversenum * 10 + nums[i];
            x = x/10;
        }
       
            if(reversenum != expectednum ){
                return false;
            }
         
        System.out.println(reversenum + " "   + expectednum);
return true;
    }
}

        

    //     int n = nums.length;
    //     for(int i=0; i<=n/2 ; i++){
    //         if(nums[i] != nums[n-1-i]){
    //             return false;
    //         }
            
    //     }
    //     return true;
    // }
    
