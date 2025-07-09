class Solution {
    public int[] getOrder(int[][] tasks) {
        int ans[] = new int[tasks.length];
        int arr[][] = new int[tasks.length][3];
        // 0 - index
        // 1 - enqueue time
        // 2 - processing time 

        //this will create an array of 3 elements.
        for (int i = 0; i < tasks.length; i++) {
            arr[i][0] = i;
            arr[i][1] = tasks[i][0]; //enqueue time
            arr[i][2] = tasks[i][1]; //processing time
        }
        //sort array of that 3 elements on the basis of enqueue time.
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int timer = arr[0][1];

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a[1] == b[1]) {
                        return Integer.compare(a[0], b[0]);
                    }
                    return Integer.compare(a[1], b[1]);
                });
        int idx = 0;
        int i =0;
        while (idx < ans.length) {
            while(i< ans.length && arr[i][1] <= timer){
                pq.add(new int[] { arr[i][0], arr[i][2] });
                i++;
            }
            if (pq.isEmpty() && i < tasks.length) {
                timer = Math.max(timer, arr[i][1]);
            }
            if (!pq.isEmpty()) {

                int pair[] = pq.poll();
                ans[idx] = pair[0];
                timer += pair[1];
                idx++;
            }
            }
        return ans;
        }

    }



// class Solution {
//     public int[] getOrder(int[][] tasks) {
//         int ans = new int[tasks.length];
//         int timer = 0;
//         int arr[][] = new int[tasks.length][3];

//         int minTime = minTask(tasks);   //calculates from which the min task starts

//         //this will create an array of 3 elements.
//         for(int i=0;i<tasks.length;i++){
//             arr[i][0] = i;
//             arr[i][1] = tasks[i][0];  //enqueue time
//             arr[i][2] = tasks[i][1];  //processing time
//         }
//         //sort array of that 3 elements on the basis of enqueue time.
//         Arrays.sort(arr , (a,b) -> Integer.compare(a[1],b[1]));

//         List<Integer> temp = new ArrayList<>();

//         // int temp[][] = new int[tasks.length][3];
//         int idx = 0;
//         while(idx < ans.length){
//             if(temp.size >0){

//             }
//             timer++;
//         }
//     }

//     private int

//     private int minTask(int tasks[][]){
//         int min = 0;
//         for(int i = 0;i<tasks.length;i++){
//             min = Math.min(tasks[i][0]);
//         }

//     return min;
//     }
// }