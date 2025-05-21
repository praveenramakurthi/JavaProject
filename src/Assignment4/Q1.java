package Assignment4;

public class Q1 {
    public static <T> void printArray(T[] array) {
        for(T i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray={1,2,3,4,5};
        Double[] doubleArray={1.2,1.3,1.4};
        Character[] charArray={'a','b','c'};
        System.out.print("Integer Array: ");
        printArray(intArray);
        System.out.print("Double Array: ");
        printArray(doubleArray);
        System.out.print("Character Array: ");
        printArray(charArray);
    }
}
