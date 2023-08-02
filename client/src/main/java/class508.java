import java.io.*;

public final class class508 {
    final long field5082;
    RandomAccessFile field5081;
    long field5080;

    public class508(File var1, String var2, long var3) throws IOException {
        if (var3 == -1L) {
            var3 = Long.MAX_VALUE;
        }

        if (var1.length() > var3) {
            var1.delete();
        }

        this.field5081 = new RandomAccessFile(var1, var2);
        this.field5082 = var3;
        this.field5080 = 0L;
        int var5 = this.field5081.read();
        if (var5 != -1 && !var2.equals("r")) {
            this.field5081.seek(0L);
            this.field5081.write(var5);
        }

        this.field5081.seek(0L);
    }

    void method8608(long var1) throws IOException {
        this.field5081.seek(var1);
        this.field5080 = var1;
    }

    public void method8610(byte[] var1, int var2, int var3) throws IOException {
        if (this.field5080 + (long) var3 > this.field5082) {
            this.field5081.seek(this.field5082);
            this.field5081.write(1);
            throw new EOFException();
        } else {
            this.field5081.write(var1, var2, var3);
            this.field5080 += var3;
        }
    }

    public void method8611() throws IOException {
        this.method8624(false);
    }

    public void method8624(boolean var1) throws IOException {
        if (this.field5081 != null) {
            if (var1) {
                try {
                    this.field5081.getFD().sync();
                } catch (SyncFailedException var4) {
                }
            }

            this.field5081.close();
            this.field5081 = null;
        }

    }

    public long method8613() throws IOException {
        return this.field5081.length();
    }

    public int method8615(byte[] var1, int var2, int var3) throws IOException {
        int var5 = this.field5081.read(var1, var2, var3);
        if (var5 > 0) {
            this.field5080 += var5;
        }

        return var5;
    }

    protected void finalize() throws Throwable {
        if (null != this.field5081) {
            System.out.println();
            this.method8611();
        }

    }
}
