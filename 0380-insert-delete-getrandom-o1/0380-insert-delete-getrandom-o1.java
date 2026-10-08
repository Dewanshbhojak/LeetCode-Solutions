class RandomizedSet {
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int ind = map.get(val);
        int last = list.get(list.size() - 1);

        map.put(last, ind);

        list.set(ind, last);
        list.remove(list.size() - 1);

        map.remove(val);

        return true;
    }

    public int getRandom() {
        int size = list.size();
        int ind = new Random().nextInt(size);
        return list.get(ind);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */