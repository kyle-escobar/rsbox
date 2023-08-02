import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;

public class class112 extends class114 {
    static class236 field1080;
    static class393 field1079;
    final boolean field1082;

    public class112(boolean var1, int var2) {
        super(var2);
        this.field1082 = var1;
    }

    void method2211(class113 var1) throws IOException {
        URLConnection var3 = null;
        boolean var10 = false;

        label124:
        {
            HttpURLConnection var13;
            label125:
            {
                try {
                    var10 = true;
                    String var4 = var1.field1085.getProtocol();
                    if (var4.equals("http")) {
                        var3 = this.method2186(var1);
                    } else {
                        if (!var4.equals("https")) {
                            var1.field1086 = class113.field1090;
                            var10 = false;
                            break label124;
                        }

                        var3 = this.method2187(var1);
                    }

                    this.method2214(var3, var1);
                    var10 = false;
                    break label125;
                } catch (IOException var11) {
                    var1.field1086 = class113.field1090;
                    var10 = false;
                } finally {
                    if (var10) {
                        if (var3 != null && var3 instanceof HttpURLConnection) {
                            HttpURLConnection var7 = (HttpURLConnection) var3;
                            var7.disconnect();
                        }

                    }
                }

                if (var3 != null && var3 instanceof HttpURLConnection) {
                    var13 = (HttpURLConnection) var3;
                    var13.disconnect();
                }

                return;
            }

            if (var3 != null && var3 instanceof HttpURLConnection) {
                var13 = (HttpURLConnection) var3;
                var13.disconnect();
            }

            return;
        }

        if (var3 != null && var3 instanceof HttpURLConnection) {
            HttpURLConnection var5 = (HttpURLConnection) var3;
            var5.disconnect();
        }

    }

    URLConnection method2186(class113 var1) throws IOException {
        URLConnection var3 = var1.field1085.openConnection();
        this.method2213(var3);
        return var3;
    }

    URLConnection method2187(class113 var1) throws IOException {
        HttpsURLConnection var3 = (HttpsURLConnection) var1.field1085.openConnection();
        if (!this.field1082) {
            if (null == class21.field116) {
                class21.field116 = new class21();
            }

            class21 var5 = class21.field116;
            var3.setSSLSocketFactory(var5);
        }

        this.method2213(var3);
        return var3;
    }
}
