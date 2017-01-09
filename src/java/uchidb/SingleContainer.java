package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

public class SingleContainer<T, S> implements Containers<T, S> {
    private Map<S, T> innerMap;

    public Set<T> initSet(T[] tArray) {
        Set<T> set = new HashSet<T>();
        for (int i = 0; i < tArray.length; i++) {
            set.add(tArray[i]);
        }
        return set;
    }

    public List<T> initList(T[] tArray) {
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < tArray.length; i++) {
            list.add(tArray[i]);
        }
        return list;
    }

    public Map<S, T> initEmptyMap() {
        Map<S, T> map = new HashMap<S, T>();
        return map;
    }

    public void storeMap(Map<S, T> mapToStoreInClass) {
        innerMap = mapToStoreInClass;
    }

    public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
        if (innerMap.containsKey(key) && !overwriteExistingKey) {
            return false;
        }

        innerMap.put(key, value);
        return true;
    }

    public T getValueFromMap(S key) {
        return innerMap.get(key);
    }

    public T getValueFromMap(S key, T defaultValue) {
        if (innerMap.get(key) != null) {
            return innerMap.get(key);
        }
        return defaultValue;
    }
}
