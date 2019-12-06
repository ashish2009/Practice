public class CharCount {

    public static void main(String[] args){
        String str = "aabbccddaae";
        char[] ch = str.toCharArray();
        String s = "";
        int c = 0;

        for (int i=0;i<ch.length;i++){
            c++;
            s = s+ch[i];
            if(i<ch.length-1){
                if(!(ch[i]==ch[i+1])){
                    System.out.println(s+" : "+c);
                    c=0;
                    s="";
                }
            }

//            if(ch[i]==ch[i+1]){
//                c++;
//                s = s+ch[i];
//            }else {
//                c++;
//                s = s+ch[i];
//                System.out.println(s+" : "+c);
//                c=0;
//                s="";
//            }
//
//            if(i==ch.length-2){
//                s=s+ch[ch.length-1];
//                c++;
//                System.out.println(s+" : "+c);
//            }
        }
        System.out.println(s+" : "+c);

    }
}
