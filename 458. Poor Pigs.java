    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int num = minutesToTest/ minutesToDie +1;
        return(int) Math.ceil(Math.log(buckets)/ Math.log(num));
    }
    public int poorPige2(int buckets, int minutesToDie, int minutesToTest){
        int res = 0;
        while(Math.pow(minutesToTest/ minutesToDie + 1, res)<buckets){
            res += 1;
        }
        return res;
    }
}