class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int k = nums1.length-1;
        
        int i =nums1.length-1;
            
            while(i>=0 &&nums1[i]==0 ){
                
                i--;
                
            }
        
        if(i<0){
           for(int f = 0 ;f<nums1.length;f++ ){
               nums1[f]=nums2[f];
           }
        }
        
        else{
            int j = nums2.length-1;
        while(j>=0 ){
            
            if (i>=0&&k>=0&&j>=0&&nums2[j]>nums1[i]){
                nums1[k] = nums2[j];
                
                k--;
                j--;
                
                
            }else{
                if(j>=0){
                nums1[k]=nums1[i];
                k--;
                i--;
                    
                if(i<0) {
                    while(j>=0){
                        nums1[k] = nums2[j];
                        k--;
                        j--;
                    }
                    
                }
                
            }
            
            }
        
        
        }
    
 
    }
}
}