import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.*;

@JsonAutoDetect
public class Cat
{
    public String name;
    private Set<Integer> age;
    private Map<UUID, Integer> weight;
    public Cat(String name){
        this.name = name;
        this.age = new HashSet<Integer>();
        this.weight = new HashMap<UUID, Integer>();
    }

    public Set<Integer> getAge(){
        return age;
    }
    public Map<UUID, Integer> getWeight(){
        return weight;
    }
    public void addAge(Integer a){
        age.add(a);
    }
    public void addWeight(UUID id, int a){
        weight.put(id, a);
    }
}
