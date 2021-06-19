    public int nthUglyNumber(int n) {
        int[] dep = new int [1690];
        dep[0] = 1;
        int i2 = 0,i3 = 0, i5 = 0;
        for(int i = 1; i < 1690; i++){
          int temp2 = dep[i2] * 2, temp3 = dep[i3] * 3, temp5 = dep[i5] * 5;
            dep[i] = temp2;
            if(temp3 < dep[i]){
                dep[i] = temp3;
            }
            if(temp5 < dep[i]){
                dep[i] = temp5;
            }
            if(dep[i] == temp2){
                i2++;
            }
            if(dep[i] == temp3){
             i3++;
            }
            if(dep[i] == temp5){
                i5++;
            }
        }
        return dep[n -1];
    }
}