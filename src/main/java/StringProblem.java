public class StringProblem {

    private static Object[][] getAns(String s){
        Object[][] o = new Object[s.length()][2];
        char[] ch = s.toCharArray();
        String temp = "";
        int c = 1;
        int j=0;
        for(int i=1;i<ch.length;i++){

            if(ch[i]==ch[i-1]){
                c++;
                temp = temp +ch[i-1];

            }else {
                temp = temp +ch[i-1];
                o[j][0] = temp;
                o[j][1] = c;
                j++;
                temp = "";
                c = 1;
            }
        }

        return o;

    }

    public static void main(String[] args){
        String s="aaabbccdebaabn";
        Object[][] ans = getAns(s);
        for(int i=0;i<ans.length;i++){
            if(ans[i][0] != null)
            System.out.println(ans[i][0].toString()+"="+ans[i][1].toString());
        }
    }
}
