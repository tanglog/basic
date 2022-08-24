package class01;

public class Code03_Comp {

    /**
     * 选择排序
     * */
    public static void selectSort(int[] arr){
        if (arr == null || arr.length <2){
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N ; i++){
            int minValueIndex = i;
            for (int j = i+1;j < N; j++){
                minValueIndex = arr[j] > arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr,i,minValueIndex);

        }
    }

    public static void insertSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        int N = arr.length;
        for (int end = 1 ; end < N ;end++){
            int newNumIndex = end;
            while (newNumIndex-1 >= 0 && arr[newNumIndex-1] > arr[newNumIndex]){
                swap(arr,newNumIndex-1,newNumIndex);
                newNumIndex--;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    //返回一个数组arr,arr的长度[0,maxLen-1],arr中的每个值[0,maxValue]
    public static int[] lenRandomValueRandom(int maxLen,int maxValue){
        int len = (int) (Math.random() * maxLen);
        int[] ans = new int[len];
        for (int i = 0; i < len; i++){
            ans[i] = (int) (Math.random() * maxValue);
        }
        return ans;
    }

//  复制数组
    public static int[] copyArray(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    //arr1 与arr2 一定等长
    public static boolean isSorted(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                return false;
            }
            max = Math.max(max, arr[i]);
        }
        return true;
    }



    public static void main(String[] args) {
        int maxLen = 5;
        int maxValue = 1000;
        int testTime = 1000;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = lenRandomValueRandom(maxLen, maxValue);
            int[] tmp = copyArray(arr1);
            selectSort(arr1);
            if (!isSorted(arr1)){
                for (int j = 0; j < tmp.length; j++) {
                    System.out.print(tmp[j] + " ");
                }
                System.out.println();
                System.out.println("选择排序错了");
                break;
            }

        }


    }
}
