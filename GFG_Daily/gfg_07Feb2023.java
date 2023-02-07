class Solution {
    /*
     * Function to return the length of the
     * longest subarray with ppositive product
     */
    int maxLength(int arr[], int n) {
        int pos = 0, neg = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                pos = 0;
                neg = 0;
            } else if (arr[i] > 0) {
                pos += 1;
                if (neg > 0) {
                    neg += 1;
                }
            } else if (arr[i] < 0) {
                int temp = pos;
                if (neg > 0) {
                    pos = 1 + neg;
                } else {
                    pos = 0;
                }
                neg = 1 + temp;
            }
            ans = Math.max(ans, pos);
        }
        return ans;
    }

}