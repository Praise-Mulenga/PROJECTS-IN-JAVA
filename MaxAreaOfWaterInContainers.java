public class maxAreaOfWaterInContainers {
    public int maxArea(int[] height) {
        	int finalMaximumArea = 0, temp = -1, max = 0;
		
		for (int i = 0; i < height.length; i++) {
			
			for (int j = i + 1; j < height.length; j++) {
				
				if (max >= temp) temp = max;
				
				if (height[i] >= height[j]) max = height[j] * (j - i);
				else max = height[i] * (j - i);
				
				if (max >= temp) finalMaximumArea = max;
				else finalMaximumArea = temp;
				
			}
			
		}
		
		return finalMaximumArea;
    }
}