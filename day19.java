import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class day19 {
    public static void main(String[] args) {  // psv 치고 엔터
        List<Integer> dataArray = new ArrayList<>();
        dataArray.add(188);
        dataArray.add(162);
        dataArray.add(168);
        for(Integer data : dataArray)
            System.out.print(data + " ");
        dataArray.sort(Comparator.naturalOrder());
        System.out.println();
        for(Integer data : dataArray)
            System.out.print(data + " ");
    }
}
