package youtube2022;


public class Search {

    public static void main(String[] args){
        int x = 5;
        int index =0;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Search  search = new Search();
        System.out.println("=======LinearSearch==========");
        long lStart = System.currentTimeMillis();
        System.out.println("linearSearch = "+search.linearSearch( x, arr,  index));
        long lEnd = System.currentTimeMillis();
        System.out.println("linearSearch time : "+ (lEnd - lStart));

        System.out.println("=======binarySearch==========");
        long bStart = System.currentTimeMillis();
        System.out.println("binarySearch = "+ search.binarySearch( x, arr,  index));
        long bEnd = System.currentTimeMillis();
        System.out.println("binarySearch time : "+ (bEnd - bStart));
    }

    public int linearSearch(int x, int[] arr, int index){
        for (int i=0;i<arr.length;i++){
            if(arr[i] == x){
                index=i;
                break;
            }
        }
        return index;
    }

    //Sorted Array
    public int binarySearch(int target, int[] arr, int index){
        //find median

        int l=0, r = arr.length-1;

        while(l<=r){
            int mid = (l+r)/2;

            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] > target){
                 r = mid-1;
            }else{
                l= mid+1;
            }
        }

       return  -1;

    }





}
