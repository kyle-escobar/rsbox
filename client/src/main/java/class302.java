public final class class302 {
    public static class513[] field3191;
    static class537[] field3190;
    static long field3187;
    static long field3188;

    class302() throws Throwable {
    }

    public static synchronized long method2194() {
        long var1 = System.currentTimeMillis();
        if (var1 < field3187) {
            field3188 += field3187 - var1;
        }

        field3187 = var1;
        return field3188 + var1;
    }
}
