class Solution {
    public  String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        // s=s.trim();
        String ar[] = s.split(" ");
        for (int i=ar.length - 1; i>=0; i--){
            if(ar[i]==""){
                continue;
            }else{
                sb.append(ar[i]+" ");
            }
        }
        String result =sb.toString().trim();
       return result; 
    }
}