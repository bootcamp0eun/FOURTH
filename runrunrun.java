
public class runrunrun {
    public static void main(String[] args) {
        String s1 = "오버워치";
        String s2 = "오리사";
        String s3 = "에피";
        String s4 = "오리사";
        String s5 = "Orisa";

        System.out.println("s1.equals(\"오버워치\") --> " + s1.equals("오버워치"));
        System.out.println("s1.equals(\"오리사\") --> " + s1.equals("오리사"));
        System.out.println("s5.equalsIgnoreCase(\"orisa\") --> " + s5.equalsIgnoreCase("orisa"));
        System.out.println(s2.compareTo(s1));
        System.out.println(s2.compareTo(s4));
        System.out.println(s5.compareTo("orisa"));
        System.out.println(s5.compareToIgnoreCase("orisa"));

        System.out.println(s1.charAt(0));
        System.out.println(s2.charAt(1));
        System.out.println(s4.charAt(2));
        System.out.println("s4 -> "+ s4);
        System.out.println(s4.concat(" 사랑해"));
        System.out.println(s4.contains("리"));
        System.out.println(s3.contains("리"));
        System.out.println(s5.startsWith("o"));

        String s6 = "아나 아마리";
        System.out.println(s6.indexOf("리"));
        System.out.println(String.valueOf(s6.isEmpty()) + "\t" + String.valueOf(s6.isBlank()));
        System.out.println(s6.length());
        System.out.println(s6.repeat(3));
        System.out.println(s6.substring(3));

        String s7 = "spArkLe";

        System.out.printf("%s\t%s\t%s\n", s7, s7.toLowerCase(), s7.toUpperCase());
        System.out.println("s7의 마지막 문자 추출 --> " + s7.charAt(s7.length()-1));

        System.out.println(String.join("\t", "윈스턴", "레킹볼", "오리사"));
        System.out.println(String.format("%s, %s, %s, %s, %d", s1, s2, s3, s4, 52));




    }
}

