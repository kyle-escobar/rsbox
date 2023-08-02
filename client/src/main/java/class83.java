public class class83 implements Runnable {
    static short[] field730;
    boolean field736 = true;
    int field731 = 0;
    int[] field729 = new int[500];
    int[] field732 = new int[500];
    Object field735 = new Object();
    long[] field734 = new long[500];

    class83() {
    }

    public void run() {
        for (; this.field736; class292.method354(50L)) {
            synchronized (this.field735) {
                if (this.field731 < 500) {
                    this.field732[this.field731] = class41.field249;
                    this.field729[this.field731] = class41.field250;
                    this.field734[this.field731] = class41.field251;
                    ++this.field731;
                }
            }
        }

    }
}
