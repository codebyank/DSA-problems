import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> ans = findZeroSum(arr);
        if (ans.size() == 0) {
            System.out.println("No Elements found");
        } else {
            System.out.println("Elements is : " + ans);
        }

    }

    public static List<Integer> findZeroSum(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                for(int j=0; j<=i; j++){
                    ans.add(arr[j]);
                }
                break;
            }
            if (map.containsKey(sum)) {
                for(int j=map.get(sum)+1; j<=i; j++){
                    ans.add(arr[j]);
                }
                break;
            }
            map.put(sum, i);
        }
        return ans;
    }

}
