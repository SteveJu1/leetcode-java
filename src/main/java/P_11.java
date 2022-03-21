public class P_11 {
    /*
    思路：左右边界，谁小往中间移动
    O（N）
     */
    public int maxArea(int[] h) {
        int max = 0;
        int left = 0;
        int right = h.length - 1;
        while (left < right) {
            int minHeight = h[left] < h[right] ?
                    h[left++] : h[right--];
            int area = (right - left + 1) * minHeight;
            max = Math.max(max, area);
        }
        return max;
    }

    public int maxArea1(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[j], height[i]);
                max = Math.max(max, area);
            }
        }
        return max;
    }

}
