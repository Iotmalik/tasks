public class Chars {
    public static void main(String[] args) {
        char[] chars = {'A', 'A', 'a', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'o', 'o'};
        System.out.println(count(chars));
    }

    public static String count(char[] chars) {
        String a = new String(chars);
        int c = 1;
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                c++;
            } else {
                res.append(a.charAt(i - 1)).append(c > 0 ? c : "");
                c = 1;
            }
        }
        res.append(a.charAt(a.length() - 1)).append(c > 0 ? c : "");
        return res.toString();
    }
}


