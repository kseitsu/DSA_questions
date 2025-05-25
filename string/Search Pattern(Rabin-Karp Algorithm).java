 // Search Pattern (Rabin-Karp Algorithm) 

// https://www.geeksforgeeks.org/problems/search-pattern-rabin-karp-algorithm--141631/1

// bruteforce aprpaoch 

 ArrayList<Integer> search(String pattern, String text) {
        // your code here
        
        TreeSet<Integer> st = new TreeSet<>();
        int n = text.length();
        int m = pattern.length();
        
        int i=0;
        while(i<n){
            
            int idx = text.indexOf(pattern,i);
            if(idx !=-1){
                st.add(idx+1);
            }
            i++;
        }
       
       ArrayList<Integer> list = new ArrayList<>();
       list.addAll(st);
       return list;
    }


//using
