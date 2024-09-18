class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String ,String> hm = new HashMap<>();
          // Loop through the paths and populate the HashMap
        for (int i = 0; i < paths.size(); i++) {
            // The first element is the departure city and the second is the destination city
            String departure = paths.get(i).get(0);
            String destination = paths.get(i).get(1);

            hm.put(departure, destination);
        }

        HashMap<String,String> revhm = new HashMap<>();
        for(String key : hm.keySet()){
            revhm.put(hm.get(key),key);
        }
        
        for(String key : revhm.keySet()){
            if(!hm.containsKey(key)){
                return key;
            }
        }
    return " ";
    }
}