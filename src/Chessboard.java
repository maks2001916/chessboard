import java.util.ArrayList;
import java.util.List;

public class Chessboard {
    void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, "◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(biDemArrList.get(i) + " ");
        }
    }
}
