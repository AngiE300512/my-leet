class Solution{
    public String longestCommonPrefix(String[]strs){
        if(strs==null)return "";
        if(strs.length==1)return strs[0];
        //assume the first word as result
        String res=strs[0];
        for(int i=1;i<strs.length;i++){
            String currentword=strs[i];
            //j is like a counter like u can keep incrementing j as long as 
            // the letters in the same position match 
            int j=0;
           //if i dont put this ill get StringOutOfBoundsException
           //like between flower and flow , flow has less no.of letter so i cant go past that na
            int limit=Math.min(res.length(),currentword.length());
            while(j<limit&&res.charAt(j)==currentword.charAt(j)){
                j++;
            }
            res=res.substring(0,j);
            if(res.equals(""))return "";
        }
        return res;
    }
}
