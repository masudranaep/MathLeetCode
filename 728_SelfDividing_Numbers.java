  public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDiv = new ArrayList();
        for(int i = left; i <= right; i++){
            if(isSelfDiv(i)) selfDiv.add(i);
        }
        return selfDiv;
        
    }
    private boolean isSelfDiv(int nums){
        for(char c : String.valueOf(nums).toCharArray()){
            if(c == '0' || nums % (c - '0') > 0){
                return false;
            }
        }
        return true;
    }
}