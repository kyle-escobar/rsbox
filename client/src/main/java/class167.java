import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class class167 {
    public static Hashtable field1796 = new Hashtable(16);
    static boolean field1795 = false;
    static File field1794;

    class167() throws Throwable {
    }

    static File method374(String var0) {
        if (!field1795) {
            throw new RuntimeException("");
        } else {
            File var2 = (File) field1796.get(var0);
            if (null != var2) {
                return var2;
            } else {
                File var3 = new File(field1794, var0);
                RandomAccessFile var4 = null;

                try {
                    File var5 = new File(var3.getParent());
                    if (!var5.exists()) {
                        throw new RuntimeException("");
                    } else {
                        var4 = new RandomAccessFile(var3, "rw");
                        int var6 = var4.read();
                        var4.seek(0L);
                        var4.write(var6);
                        var4.seek(0L);
                        var4.close();
                        field1796.put(var0, var3);
                        return var3;
                    }
                } catch (Exception var8) {
                    try {
                        if (null != var4) {
                            var4.close();
                            var4 = null;
                        }
                    } catch (Exception var7) {
                    }

                    throw new RuntimeException();
                }
            }
        }
    }
}
