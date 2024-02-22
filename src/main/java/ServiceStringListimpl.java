import ru.skypro.FundamentalsOfAlgorithms.exception.NotEmptyException;
import ru.skypro.FundamentalsOfAlgorithms.exception.OutsideTheArrayException;
import ru.skypro.FundamentalsOfAlgorithms.exception.ThereIsNoSuchElementException;

import java.util.Arrays;

public class ServiceStringListimpl implements StringList {

    private final String[] array;
    public int size;


    public ServiceStringListimpl(int sizeArray) {
        this.array = new String[sizeArray];
    }

    @Override
    public String add(String item) {
        if (item == null) {
            throw new NotEmptyException("не должно быть пусто");
        }
        array[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        if (index == size) {
            return add(item);
        }
        checkRange(index);
        System.arraycopy(array, index, array, index + 1, size - index); //сдвигается вправо
        array[index] = item;
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        checkRange(index);
        array[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        int index = indexOf(item);
        if (index == -1) {
            throw new ThereIsNoSuchElementException("такого элемента не существует");
        }
        return remove(index);
    }

    @Override
    public String remove(int index) {
        checkRange(index);
        String del = array[index];
        if (index != size - 1) {
            System.arraycopy(array, index, array, index - 1, size - index - 1); // сдвигается влево
        }
        array[size - 1] = null;
        size--;
        return del;
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        checkRange(index);
        return array[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (this == otherList) {
            return true;
        }
        if (otherList == null) {
            throw new NotEmptyException("не может быть равным нулю");
        }
        if (size != otherList.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!array[i].equals(otherList.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);

    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(array, array.length);

    }

    private void checkRange(int index) {
        if (index < 0 || index >= size) {
            throw new OutsideTheArrayException("за пределами массива");
        }
    }
}

