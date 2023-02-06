public class Node {
    public String data ;
    public Node link ;
    // 포인터가 없으니까 참조 형식으로 가야한다. -> 타입은 node

    @Override
    public String toString(){
        return "노드의 데이터 값은 " + data + "입니다";
    }
}
