import javax.net.ssl.HttpsURLConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;

public class class17 {
    static class523 field95;
    final class16 field89;
    final class418 field96;
    final HttpsURLConnection field90;
    boolean field88;
    boolean field92;
    class459 field91;
    int field94;

    public class17(URL var1, class16 var2, boolean var3) throws IOException {
        this(var1, var2, new class418(), var3);
    }

    public class17(URL var1, class16 var2, class418 var3, boolean var4) throws IOException {
        this.field92 = false;
        this.field88 = false;
        this.field94 = 300000;
        if (!var2.method268()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + var2.method272());
        } else {
            this.field90 = (HttpsURLConnection) var1.openConnection();
            if (!var4) {
                HttpsURLConnection var5 = this.field90;
                if (null == class21.field116) {
                    class21.field116 = new class21();
                }

                class21 var6 = class21.field116;
                var5.setSSLSocketFactory(var6);
            }

            this.field89 = var2;
            this.field96 = null != var3 ? var3 : new class418();
        }
    }

    static final void method297(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (class332.method1200(var0)) {
            Client.method2579(class96.field884[var0], -1, var1, var2, var3, var4, var5, var6);
        }
    }

    public class418 method284() {
        return this.field96;
    }

    public void method285(class459 var1) {
        if (!this.field92) {
            if (null == var1) {
                this.field96.method7477("Content-Type");
                this.field91 = null;
            } else {
                this.field91 = var1;
                if (this.field91.method8032() != null) {
                    this.field96.method7481(this.field91.method8032());
                } else {
                    this.field96.method7482();
                }

            }
        }
    }

    void method301() throws ProtocolException {
        if (!this.field92) {
            this.field90.setRequestMethod(this.field89.method272());
            this.field96.method7474(this.field90);
            if (this.field89.method270() && null != this.field91) {
                this.field90.setDoOutput(true);
                ByteArrayOutputStream var2 = new ByteArrayOutputStream();

                try {
                    var2.write(this.field91.method8031());
                    var2.writeTo(this.field90.getOutputStream());
                } catch (IOException var12) {
                    var12.printStackTrace();
                } finally {
                    try {
                        var2.close();
                    } catch (IOException var11) {
                        var11.printStackTrace();
                    }

                }
            }

            this.field90.setConnectTimeout(this.field94);
            this.field90.setInstanceFollowRedirects(this.field88);
            this.field92 = true;
        }
    }

    boolean method287() throws IOException {
        if (!this.field92) {
            this.method301();
        }

        this.field90.connect();
        return this.field90.getResponseCode() == -1;
    }

    class3 method288() {
        try {
            if (!this.field92 || this.field90.getResponseCode() == -1) {
                return new class3("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field90.disconnect();
            return new class3("Error decoding REST response code: " + var11.getMessage());
        }

        class3 var4;
        try {
            class3 var2 = new class3(this.field90);
            return var2;
        } catch (IOException var9) {
            var4 = new class3("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field90.disconnect();
        }

        return var4;
    }
}
