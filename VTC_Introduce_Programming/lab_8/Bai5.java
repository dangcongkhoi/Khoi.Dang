package VTC_Introduce_Programming.lab_8;

public class Bai5 {
    public static StringBuilder convertUpper(String s) {
        StringBuilder strblder = new StringBuilder();
        //Loai bo ki tu dac biet
        s = s.replaceAll("[!@#$%^&*]", "");

        //cat bo Khoang trang o dau va o cuoi
        s = s.trim();

        //cat bo KHoang trang thừa ở giữa
        while (s.indexOf("  ") != -1) s = s.replaceAll("  "," ");


        //Viet Hoa chữ cái đầu tiên
        String char_prev = "", char_current = "", key = " ,.";
        strblder.append(String.valueOf(s.charAt(0)).toUpperCase());

        for (int i = 1; i < s.length(); i++) {
            char_prev = String.valueOf(s.charAt(i - 1));
            char_current = String.valueOf(s.charAt(i));
            if (key.contains(char_prev)) {
                char_current = char_current.toUpperCase();
            }
            strblder.append(char_current);
        }

        return strblder;
    }

    public static void main(String[] args) {
        System.out.println(convertUpper("     co%#ng, hoa     xa. hoi chu nghia viet nam  "));

    }
}
