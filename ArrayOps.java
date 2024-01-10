public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {7, 5, 4, 3, -12}));
        System.out.println(isSorted(new int[] {1, 2, 3}));
        System.out.println(isSorted(new int[] {1, -2, 3}));
        System.out.println(isSorted(new int[] {1, 1, 500}));
        System.out.println(isSorted(new int[] {1, 3, 2}));
        
    }
    
    public static int findMissingInt (int [] array) {
        boolean flag = false;
        for (int i = 0; i <= array.length; i++) {
            //System.out.println("finding: " + i);
            for (int j = 0; j < array.length; j++) {
                flag = false;
                //System.out.println("Array in j: " + array[j]);
                if(array[j] == i){
                    flag = true;
                    break;
                }
                
            }
            if (!flag) {
                    return i;
                }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int secondmax = 0, max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                secondmax = max;
                max = array[i];
            }else if (array[i] > secondmax) {
                secondmax = array[i];
            }
        }
        return secondmax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean flag = false;
        for (int i = 0; i < array1.length; i++) {
            flag = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                    return false;
                }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean isIncrease = true; // true for increaseing and false if decreasing
        boolean flag = false;
        int pointer = array[0];
        if (array[0] > array[1]) 
            isIncrease = false;
        for (int i = 0; i < array.length; i++) {
            flag = false;
            if (array[i]>=pointer && isIncrease) {
                flag = true;
                pointer = array[i];
            }
            if (array[i]<=pointer && !isIncrease) {
                flag = true;
                pointer = array[i];
            }
            if (!flag) {
                break;
            }
            if (i == array.length - 1) {
                return true;
            }
        }
        return false;        
    }

}
