


public class Hw {
    public static int search(int[] arr,int key) {
        int left = 0, right = arr.length-1;
        int mid=0;
        int flag = 0;
        while (left <= right) {
            mid = left + ((right - left) >> 1);//>> ????+?
            if (arr[mid] == key) {
                flag=1;
                break;
            }
            else if (arr[mid] > key) right = mid - 1;
            else left = mid + 1;
        }
        System.out.println("left="+left+" right="+right);
        if (flag==1) return mid;
        else return -1;
    }


    public static void main(String[] args) {
        System.out.println("Hw");
        int[] a=new int[]{0, 1, 2, 3, 4};
        System.out.println(search(a,1));

        ExtendeBinarySearch BS=new ExtendeBinarySearch();
        int arr[] = new int[] {1,
                2, 2, 5, 5, 5,
                5, 5, 5, 5, 5,
                5, 5, 6, 6, 7};
        System.out.println("First Equal           :"+BS.searchFirstEqual(arr, 5));
        System.out.println("Last Equal            :"+BS.searchLastEqual(arr, 5));
        System.out.println("First Equal or Larger :"+BS.searchFirstEqualorLarger(arr,  5));
        System.out.println("First Larger          :"+BS.searchFirstLarger(arr,  5));
        System.out.println("Last Equal or Smaller :"+BS.searchLastEqualorSmaller(arr,  5));
        System.out.println("Last Smaller          :"+BS.searchLastSmaller(arr,  5));



    }


}
