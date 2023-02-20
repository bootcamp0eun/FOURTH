package DAY26;

public class day26 {
    private String secret = "캡슐화된 변수";  // --> 캡슐화. 외부에서 못본다.
    String s = "day26의 인스턴스 변수";  // --> 같은 패키지 안에서만. private 보다는 약하고 protected 보다는 강한 접근 제한.

    class MemberClass {
        String s = "day26의 MemberClass의 인스턴스 변수";

        public void show1() {
            System.out.println("Inner Class");
            System.out.println(secret);  // MemberClass 안에 secret 변수가 존재하지 않아 바깥 스코프.....
            System.out.println(s);   // MemberClass 안에 s 변수가 존재
            System.out.println(day26.this.s);  // day26의 인스턴스 변수 s의 값을 출력
        }

        static String s3 = "정적 멤버 필드";
        static void show2() {}
        static void info(){
            System.out.println("static member method~!");
        }
    }

    public static void main(String[] args) {
        // MemberClass mc = new MemberClass();  // --> 에러 ! 이건 안된다
        day26 m = new day26();
        day26.MemberClass m1 = m.new MemberClass();

        System.out.println(m1.s);
        m1.show1();

        System.out.println(day26.MemberClass.s3);
        day26.MemberClass.info();
    }
}
