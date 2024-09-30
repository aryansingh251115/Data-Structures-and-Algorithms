// Checking if a number is a power of 2 using different approaches

// 1. Bit Manipulation Approach (Optimal)
class Solution {
    public boolean isPowerOfTwo(int n) {
        // If a number is a power of 2, its binary form contains only one set bit (1)
        // Example: 4 -> 100, 8 -> 1000, 16 -> 10000 (only one bit is set)
        
        // Taking a bitwise AND between n and n-1 will give 0 if n is a power of 2
        // Example: 
        // 4 (100) & 3 (011) = 000
        // This works because for powers of 2, subtracting 1 flips all bits from the rightmost set bit.
        
        // We also check if n is greater than 0 because negative numbers cannot be powers of 2.
        return n > 0 && (n & (n - 1)) == 0;
    }
}

// 2. Using Mathematical Power Approach (Not Preferable)
// class Solution{
//     public boolean isPowerOfTwo(int n){
//         // 2^30 is the largest power of 2 that fits within the range of a 32-bit signed integer.
//         // If 2^30 is divisible by n, then n is a power of 2.
        
//         // This approach is not optimal due to floating-point operations and potential precision issues.
//         return Math.pow(2,30) % n == 0 ? true : false;
//     }
// }

// 3. Using Conditionals (Iterative Approach)
// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         // Continuously divide the number by 2 if it's even
//         while(n > 1){
//             // If n is not divisible by 2 at any step, it's not a power of 2
//             if(n % 2 != 0){
//                 return false;
//             }
//             n = n / 2; // Divide by 2
//         }
//         // If the loop completes, the number is a power of 2
//         return n == 1; // Handles the case where n is 1 (2^0)
//     }
// }

// 4. Using Inbuilt Functions (Math.pow)
// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         int i = 0;
//         // Loop through powers of 2 (2^i) and check if it matches n
//         while(Math.pow(2, i) <= n){
//             if(Math.pow(2, i) == n){
//                 return true; // If we find a power of 2 equal to n, return true
//             }
//             i++;
//         }
//         return false; // If no power of 2 matches, return false
//     }
// }

// Notes:
// 1. Bit Manipulation Approach is the most efficient and is preferred for checking if a number is a power of 2.
// 2. The mathematical approach using `Math.pow()` is not recommended due to potential precision errors.
// 3. The iterative approach works but is slower than bit manipulation.
// 4. Using `Math.pow()` to iterate through powers of 2 is also less efficient and involves floating-point operations.
