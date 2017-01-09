package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

public class SingleContainer<T, S> implements Containers<T, S> {
    public Set<T> initSet(T[] tArray) {
        Set<T> set = new HashSet<T>();
        return set;
    }

    public List<T> initList(T[] tArray) {
        List<T> list = new ArrayList<T>();
        return list;
    }

    public Map<S, T> initEmptyMap() {
        Map<S, T> map = new HashMap<S, T>();
        return map;
    }

    public void storeMap(Map<S, T> mapToStoreInClass) {
        return;
    }

    public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
        return false;
    }

    public T getValueFromMap(S key) {
        T value = null;
        return value;
    }

    public T getValueFromMap(S key, T defaultValue) {
        return defaultValue;
    }
}
