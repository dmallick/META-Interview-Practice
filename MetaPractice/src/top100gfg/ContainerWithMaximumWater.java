package top100gfg;
/* https://leetcode.com/problems/container-with-most-water/description/
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints 
of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store. */

public class ContainerWithMaximumWater {
    public static void main(String[] args) {
        int[] height = {0,1};
        int max_area= maxArea(height);
        System.out.println(max_area);
    }
    public static int maxArea(int[] height) {
        int area=0, max_area=0, len= height.length;
        int start = 0, end = len-1;
        int dist=1;

        while ( start <= end ) {
            dist = end - start;            
            area = dist * (Math.min(height[start], height[end]));
            max_area= Math.max(max_area, area);
            if (height[start] > height[end]) {
                end--;
            }else{
                start++;
            }
        }
        return max_area;
    } 
}
