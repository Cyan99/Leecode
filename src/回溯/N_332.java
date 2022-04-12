package 回溯;

import java.util.*;

public class N_332 {
    private Map<String, Map<String, Integer>> map; // <出发机场， <可到达的机场，可到达的次数>>
    List<String> result = new ArrayList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        //初始化map
        map = new HashMap<>();
        Map<String, Integer> temp;
        for (List<String> list : tickets) {
            if (map.containsKey(list.get(0))) {
                temp = map.get(list.get(0));
                temp.put(list.get(1), temp.getOrDefault(list.get(1), 0) + 1);
            } else {
                temp = new TreeMap<>();
                temp.put(list.get(1), 1);
            }
            map.put(list.get(0), temp);
        }
        // ”JFK“开头
        result.add("JFK");
        backTrack(map, tickets.size()+1);
        return result;
    }

    public boolean backTrack(Map<String, Map<String, Integer>> map, int target) {
        if (result.size() == target) {
            return true;
        }
        String last = result.get(result.size() - 1);

        if (map.containsKey(last)) {
            for (Map.Entry<String, Integer> m : map.get(last).entrySet()) {
                if (m.getValue() > 0) {
                    result.add(m.getKey());
                    m.setValue(m.getValue() - 1);
                    if (backTrack(map, target)) {
                        return true;
                    } else {
                        result.remove(result.size() - 1);
                        m.setValue(m.getValue()+1);
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        N_332 test = new N_332();
        List<List<String>> list = new ArrayList<>();
        List<String> temp1 = new ArrayList<>();
        temp1.add("JFK");
        temp1.add("KUL");
        list.add(temp1);
        List<String> temp2 = new ArrayList<>();
        temp2.add("JFK");
        temp2.add("NRT");
        list.add(temp2);
        List<String> temp3 = new ArrayList<>();
        temp3.add("NRT");
        temp3.add("JFK");
        list.add(temp3);
        System.out.println(test.findItinerary(list));
//        test.findItinerary(list);
    }
}
