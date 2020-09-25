public class BinarySearch {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
    public static int search1(int[] array,int key){
        int low =0;
        int hight = array.length-1;
        while (hight >= low){
            int mid = (low+hight)/2;
            if(key == array[mid]){
                return mid;
            } else  if(key >array[mid]){
                low = mid +1;
            } else if(key <array[mid]){
                hight = mid-1;
            }
        } return -1;
    }

    public static int search2(int[] array,int low, int hight,int value ){
        low = 0;
        hight = array.length -1;
        int mid = (low+hight)/2;
        if(hight >=low){
            if (array[mid] == value){
                return mid;
            } else if(value < array[mid]){
                return search2(array,low, mid-1,value);
            }else if (value >array[mid]){
                return search2(array,mid+1, hight,value);
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        System.out.println(search1(list, 2));
        System.out.println(search1(list, 11));
        System.out.println(search1(list, 79));
        System.out.println(search1(list, 1));
        System.out.println(search1(list, 5));
        System.out.println(search1(list, 80));
    }
}
