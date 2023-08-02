import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

class class8 extends SSLSocket {
   Certificate[] field50;
   // $FF: synthetic field
   final class21 this$0;
   // $FF: synthetic field
   final String val$host;
   // $FF: synthetic field
   final TlsClientProtocol val$tlsClientProtocol;

   class8(class21 var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   static int method163(int var0, class81 var1, boolean var2) {
      if (var0 == 6809) {
         int var4 = class63.field483[--class63.field479];
         class184 var5 = class98.method2042(var4);
         class63.field484[++class63.field486 - 1] = null != var5 ? var5.field1904 : "";
         return 1;
      } else {
         return 2;
      }
   }

   public InputStream getInputStream() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public OutputStream getOutputStream() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   public synchronized void close() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public boolean getEnableSessionCreation() {
      return false;
   }

   public String[] getEnabledCipherSuites() {
      return null;
   }

   public String[] getEnabledProtocols() {
      return null;
   }

   public boolean getNeedClientAuth() {
      return false;
   }

   public SSLSession getSession() {
      return new class2(this);
   }

   public String[] getSupportedProtocols() {
      return null;
   }

   public String[] getSupportedCipherSuites() {
      return null;
   }

   public boolean getUseClientMode() {
      return false;
   }

   public boolean getWantClientAuth() {
      return false;
   }

   public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public void setEnableSessionCreation(boolean var1) {
   }

   public void setEnabledCipherSuites(String[] var1) {
   }

   public void setEnabledProtocols(String[] var1) {
   }

   public void setNeedClientAuth(boolean var1) {
   }

   public void setUseClientMode(boolean var1) {
   }

   public void setWantClientAuth(boolean var1) {
   }

   public void startHandshake() throws IOException {
      this.val$tlsClientProtocol.connect(new class24(this));
   }
}
