import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class testt {
    public static void main(String[] args) {//选择题答案    1.B    2.A   3.C   4.B     谭泽豪
        String s="afASD1`FD/SA.sSDS?ASDF*DzADFA,SFw;GGF--";
        char[] cs= s.toCharArray();
        Map<Character,Integer> map =new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char c:cs){
            if(c==','||c=='`'||c=='.'||c=='?'||c==';'||c=='*'||c=='/'||c=='-'){//排除掉符号
                continue;
            }else {
                if (map.containsKey(c)){
                    Integer i=  map.get(c);
                    map.put(c,i+1);
                }else {
                    map.put(c,1);
                }
            }

        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            sb.append(entry.getKey()+"("+entry.getValue()+"),");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }

}
