class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<f.length;i++){
            for(int j=0;j<b.length;j++){
                if(f[i]<=b[j] && !s.contains(j)){
                    s.add(j);
                    break;
                }
            }
        }
        return f.length-s.size();
    }
}