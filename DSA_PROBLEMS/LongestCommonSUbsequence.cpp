#include <iostream>
#include <vector>
#include <string>

using namespace std;

// Function to find the length of the Longest Common Subsequence
int longestCommonSubsequence(string text1, string text2) {
    int m = text1.length();
    int n = text2.length();

    // Initializing a 2D vector for dynamic programming
    vector<vector<int>> dp(m + 1, vector<int>(n + 1, 0));

    // Computing the length of the LCS
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (text1[i - 1] == text2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1;
            } else {
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }

    return dp[m][n];
}

// Main function for testing
int main() {
    string text1 = "abcde";
    string text2 = "ace";

    // Calling the function and printing the result
    cout << "Length of the Longest Common Subsequence: " << longestCommonSubsequence(text1, text2) << endl;

    return 0;
}
