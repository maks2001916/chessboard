import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i = i + 2) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j = j + 2) {
                biDemArrList.get(i).add(j, "●");
                biDemArrList.get(i).add(j, "◯");
            }
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j = j + 2) {
                biDemArrList.get(i).add(j, "◯");
                biDemArrList.get(i).add(j, "●");
            }
        }
        for (int i = 0; i < 8; i++) {
                System.out.println(biDemArrList.get(i) + " ");
        }
    }
}