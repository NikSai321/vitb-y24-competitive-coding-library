class BitManipulation {
    public static long getBit(long n, int k) {
        // return 1 if the k-th bit of n is set, otherwise 0
        return (n & (1L << k)) != 0 ? 1 : 0;
    }

    public static long setBit(long n, int k) {
        return n | (1L << k);
    }

    public static long clearBit(long n, int k) {
        return n & ~(1L << k);
    }

    public static long toggleBit(long n, int k) {
    
        return n ^ (1L << k);
    }
}