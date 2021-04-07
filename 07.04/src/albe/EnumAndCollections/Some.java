package albe.EnumAndCollections;
import java.util.Collection;
import java.util.*;

public enum Some {
    QUEQUE(new PriorityQueue()),
    LIST(new ArrayList()),
    DEQUE(new ArrayDeque()),
    SET(new HashSet());


    private Collection collection;
    private Some(Collection collection){
        this.collection = collection;
    }
}
