package liveStudy.ShinsegaeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Hobbies2 {

    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findAllHobbyists(String hobby) {
        List<String> result = new ArrayList<>();

        hobbies.entrySet().stream()
                .forEach(a -> {
                    List<String> list = Arrays.asList(a.getValue());
                    for(String o : list){
                        if(o.equals(hobby))
                        result.add(a.getKey());
                    }
                });

        return result;
    }

    public static void main(String[] args) {
        Hobbies2 hobbies = new Hobbies2();
        hobbies.add("Steve", "Fashion", "Piano", "Reading");
        hobbies.add("Patty", "Drama", "Magic", "Pets");
        hobbies.add("Chad", "Puzzles", "Pets", "Yoga");

        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));
    }

}
