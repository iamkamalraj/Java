package DSA;

public class BinarySearch {
	public static void main(String args[]) {
        int[] num = {-500,-65,-4,0, 1, 4, 7, 44, 66, 78};
        int target = 4;
//        int ans = binarySearch(num, target);
//        System.out.println(ans);
        int []q1 = {10,20,30,40,50};
		for(int j:q1) {
			System.out.println(q1[j]+" ");
		}
    }

    static int binarySearch(int[] num, int target) {
        int start = 0;
        int end = num.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < num[mid]) {
                end = mid - 1;
            }else if (target > num[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        } return - 1;
    }
}
