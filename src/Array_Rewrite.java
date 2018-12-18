public class Array_Rewrite<E> {
    private E[] data;
    private int size;//这里的size指的是当前最近的空的元素，也就是下一个元素

    public Array_Rewrite(E[] arr) {
        data = (E[]) new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }
        size = arr.length;
    }

    public Array_Rewrite(int capacity) {
        data = (E[]) new Object[capacity];
        size = capacity;
    }

    public Array_Rewrite() {
        this(10);
    }
    public int getSize(){
        return size;
    }
    public int getCapacity(){
        return data.length;
    }
    public void addLast(E e) {
        add(size, e);
    }
    public void addFirst(E e){
        add(0,e);
    }
    private void resize(int capacity) {
        E[] newData = (E[]) new Object[capacity];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void add(int index, E e) {
        //这里可以 index = size 的原因是，可能数组已经满了所以size指的数组的长度
        if (index < 0 && index > size) throw new IllegalArgumentException("非法插入");
        if (size == data.length) resize(data.length * 2);
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("size = %d, capacity = %d\n",size,data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if(i != size-1)res.append(",");
        }
        res.append("]");
        return res.toString();
    }

    public static void main(String[] args) {
        Integer[] arrs = {1,2,3,4,5,6,7,8};
        Array_Rewrite<Integer> newArr = new Array_Rewrite<>(arrs);
        newArr.add(0,10);
        System.out.println(newArr);
    }
}
