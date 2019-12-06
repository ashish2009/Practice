public class RemoveAdjucent {

    public static void main(String[] args){
        String s = "aabcde";
        String res = "";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            res = res+ch[i];
            if (!(i==ch.length-1))
            if(ch[i+1]-ch[i]==1)  i++;


        }

        System.out.println(res);
    }
}