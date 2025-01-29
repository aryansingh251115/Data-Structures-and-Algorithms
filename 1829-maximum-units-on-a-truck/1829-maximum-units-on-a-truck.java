class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int i = 0;
        while (truckSize > 0 && i <boxTypes.length) {
            if (truckSize >= boxTypes[i][0]) {
                ans += boxTypes[i][0] * boxTypes[i][1];
                truckSize = truckSize - boxTypes[i][0];
            } else {
                ans += (truckSize * boxTypes[i][1]);
                truckSize = 0;
            }
            i++;
        }
        return ans;
    }
}