public class Combination {

    static void combine(String instr, StringBuffer outstr, int index)
    {
        System.out.println("combine("+instr+","+outstr+","+index+")");
        for (int i = index; i < instr.length(); i++)
        {
            outstr.append(instr.charAt(i));
            System.out.println(outstr);
            combine(instr, outstr, i + 1);
            outstr.deleteCharAt(outstr.length() - 1);
        }
    }


    // print all subsets of the characters in s
    public static void comb1(String s) { comb1("", s); }

    // print all subsets of the remaining elements, with given prefix
    private static void comb1(String prefix, String s) {
        if (s.length() > 0) {
            System.out.println(prefix + s.charAt(0));
            comb1(prefix + s.charAt(0), s.substring(1));
            comb1(prefix,               s.substring(1));
        }
    }


//    A,BC
//    A
//    AB,C
//    AB
//    ABC,
//    ABC
//    AC,
//    AC
//    B,C
//    B
//    BC,
//    BC
//    C,
//    C

    // alternate implementation
    public static void comb2(String s) { comb2("", s); }
    private static void comb2(String prefix, String s) {
        System.out.println(prefix);
        for (int i = 0; i < s.length(); i++){
            System.out.println(prefix + s.charAt(i)+","+ s.substring(i + 1));
            comb2(prefix + s.charAt(i), s.substring(i + 1));
        }
    }


    public static void main(String[] args){
        combine("ABC",new StringBuffer(),0);
//		comb2("ABC");
    }

}