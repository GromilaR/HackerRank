package Java_Dequeue;

import java.util.*;

/*
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.

In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .

Note: Time limit is  second for this problem.

Input Format

The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int subArray = in.nextInt();
        Deque<Integer> array = new ArrayDeque();
   //     Set<Integer> sArray = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        int count=arraySize;
        int max=0,i=0,num;
        while (count-- > 0) {
            num=in.nextInt();
            array.add(num);
            if (map.containsKey(num)) {map.put(num,map.get(num).intValue()+1);}
                else map.put(num,1);

            if (array.size()==subArray+1) {
                int n = array.removeFirst();
                int m = map.get(n).intValue();
                if (m==1) map.remove(n);
                else map.put(n,m-1);
          // Second Solution
            }
            if (max<map.size()) max=map.size();
        }
    //First solution
   /*     for (int i=0;i<=arraySize-subArray;i++){
            Iterator<Integer> iterator = array.iterator();
            int iterateCount = subArray;
            while (iterateCount-- >0)
                sArray.add(iterator.next());
            if (max<sArray.size()) max=sArray.size();
            array.removeFirst();
            sArray.clear();
        }*/
        System.out.println(max);
    }
}
