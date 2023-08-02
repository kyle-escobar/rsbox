import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;

public class class21 extends SSLSocketFactory {
    public static class21 field116;

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }

    }

    SecureRandom field117 = new SecureRandom();

    public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
        if (var1 == null) {
            var1 = new Socket();
        }

        if (!var1.isConnected()) {
            var1.connect(new InetSocketAddress(var2, var3));
        }

        TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field117);
        return this.method321(var2, var5);
    }

    public String[] getDefaultCipherSuites() {
        return null;
    }

    public String[] getSupportedCipherSuites() {
        return null;
    }

    public Socket createSocket(String var1, int var2) throws IOException {
        return null;
    }

    public Socket createSocket(InetAddress var1, int var2) throws IOException {
        return null;
    }

    public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException {
        return null;
    }

    public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
        return null;
    }

    SSLSocket method321(String var1, TlsClientProtocol var2) {
        return new class8(this, var2, var1);
    }
}
