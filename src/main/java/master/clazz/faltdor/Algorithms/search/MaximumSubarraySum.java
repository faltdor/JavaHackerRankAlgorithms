package main.java.master.clazz.faltdor.Algorithms.search;
import java.io.Serializable;
import java.util.*;
import java.io.IOException;
import java.util.stream.Collectors;

class Any extends Thread implements Serializable {
    private transient String c;

 }



public class MaximumSubarraySum extends Thread{

    static long maximumSum(long[] arr, long m) {
        long maxSum=0;

        TreeSet<Long> prefix = new TreeSet<Long>();
        long currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum=(currentSum+arr[i]%m)%m;
            SortedSet<Long> set = prefix.tailSet(currentSum+1);
            Iterator<Long> itr = set.iterator();
            if(itr.hasNext()){

                maxSum= Math.max(maxSum, (currentSum-itr.next()+m)%m);
            }

            maxSum=Math.max(maxSum, currentSum);
            prefix.add(currentSum);
        }

        return maxSum;
    }
    static long maximumSumv1(long[] a, long module) {
        Long min = Long.MIN_VALUE;
        List<Long> list = Arrays.stream(a)
                            .boxed()
                            .collect(Collectors.toList());
        return loopSegment(list, min, module, 1, list.size());
    }

    private static long loopSegment( List<Long> list, long min, long module, int subArraySize, int listSize){
        if(subArraySize > listSize){
            return  min;
        }
        min = findSegment(0, list, min, module, subArraySize, listSize);
        return loopSegment(list, min, module, ++subArraySize, listSize);
    }

    private static long findSegment(int index, List<Long> list, long min, long module, int subArraySize, int listSize) {
        if(listSize < subArraySize + index){
            return  min;
        }
        //List<Long> sub = new ArrayList<>(list.subList(index, subArraySize + index));
        //Long sum = sub.stream().mapToLong(Long::longValue).sum();
        Long sum = sum(index, (subArraySize + index), list, 0);
        int resultModule = (int) (sum % module);

        if(resultModule > min){
            min = resultModule;
        }
        return findSegment(++index, list, min, module, subArraySize, listSize);
    }

    private static long sum(int start, int end, List<Long> sub, long sum){
        if(start >= end){
            return sum;
        }
        sum = sum + sub.get(start);
        return sum(++start, end, sub, sum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            long m = Long.parseLong(nm[1]);
            long[] a = new long[n];

            /*String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                long aItem = Long.parseLong(aItems[i]);
                a[i] = aItem;
            }*/
            for (int i = 0; i < n; i++) {
                long aItem = scanner.nextLong();
                a[i] = aItem;
            }

            long result = maximumSum(a, m);
            System.out.println(result);
        }
        scanner.close();
    }
}
