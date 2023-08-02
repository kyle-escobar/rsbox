import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;

class class24 extends DefaultTlsClient {
    static class363 field121;
    // $FF: synthetic field
    final class8 this$1;

    class24(class8 var1) {
        this.this$1 = var1;
    }

    public Hashtable getClientExtensions() throws IOException {
        Hashtable var1 = super.getClientExtensions();
        if (var1 == null) {
            var1 = new Hashtable();
        }

        byte[] var2 = this.this$1.val$host.getBytes();
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var3);
        var4.writeShort(var2.length + 3);
        var4.writeByte(0);
        var4.writeShort(var2.length);
        var4.write(var2);
        var4.close();
        var1.put(0, var3.toByteArray());
        return var1;
    }

    public TlsAuthentication getAuthentication() throws IOException {
        return new class20(this);
    }
}
