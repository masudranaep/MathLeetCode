       public int findNthDigit(int n) {
        long i = 1, s = 9, base = 1;
        while(n > i*s){
            n -= i * s;
            i++;
            s *= 10;
            base *= 10;
        }
        long number = base + (n + i - 1)/ i -1;
        long r = n % i == 0 ? i : n % i;
        for(int j = 0; j < i - r; ++j){
            number /= 10;
        }
        return (int) number % 10;
    }