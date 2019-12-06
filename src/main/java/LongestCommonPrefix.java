public class LongestCommonPrefix {

    public static void findPrefix(String[] arr){
        /*
          s="";
          p
           For i-->0 to str_length
             s = s+charAt(i);
             For j-->0 to arr.length
               if(arr[0].starts-with(s))
                 p = s

         */

        String s = arr[0];
        StringBuilder prefix = new StringBuilder();

        outerloop:
        for(int i=0;i<s.length();i++){
            prefix.append(s.charAt(i));
            int l = prefix.length()-1;
            String p = prefix.toString().substring(0,l);
            for(int j=1;j<arr.length;j++){
                if(i<arr[j].length()){
                    if(!arr[j].startsWith(prefix.toString())){
                        System.out.println(p);
                        break outerloop;
                    }

                }else{
                    System.out.println(p);
                    break outerloop;
                }

            }
        }
    }


    public static void main(String[] args){
        String[] arr = {"abcde","a","abcgh"};
        findPrefix(arr);
    }
}
