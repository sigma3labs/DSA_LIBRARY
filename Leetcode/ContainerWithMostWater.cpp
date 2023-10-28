/*Problem Statement:
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 'n' vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis, forms a container, such that the container contains the most water.
*/

#include <iostream>
#include <vector>

using namespace std;

int maxArea(vector<int>& height) {
    int maxArea = 0;
    int left = 0;
    int right = height.size() - 1;

    while (left < right) {
        int h = min(height[left], height[right]);
        maxArea = max(maxArea, h * (right - left));
        while (height[left] <= h && left < right) left++;
        while (height[right] <= h && left < right) right--;
    }

    return maxArea;
}

int main() {
    vector<int> heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    cout << "Maximum Water that can be contained: " << maxArea(heights) << endl;

    return 0;
}

