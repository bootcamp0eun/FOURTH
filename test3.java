class One{
    private One() {
    }
    public static One produceOneInstance(){
        return new One(); // 같은 클래스에서는 private에 접근 가능
    }  // static이 반드시 필요, return 타입 One
}

public class test3 {
    public static void main(String[] args) {
        // One o = new One();   //=> 안된다.
        One o1 = One.produceOneInstance();
        One o2 = One.produceOneInstance();

    }
}
