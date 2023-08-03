import java.io.IOException;
import java.net.Socket;

public class class433 extends class424 {
   static int[][][] field4647;
   class441 field4645;
   class450 field4644;
   Socket field4646;

   class433(Socket var1, int var2, int var3) throws IOException {
      this.field4646 = var1;
      this.field4646.setSoTimeout(30000);
      this.field4646.setTcpNoDelay(true);
      this.field4646.setReceiveBufferSize(65536);
      this.field4646.setSendBufferSize(65536);
      this.field4645 = new class441(this.field4646.getInputStream(), var2);
      this.field4644 = new class450(this.field4646.getOutputStream(), var3);
   }

   public boolean method7597(int var1) throws IOException {
      return this.field4645.method7814(var1);
   }

   public int available() throws IOException {
      return this.field4645.method7803();
   }

   public int readUnsignedByte() throws IOException {
      return this.field4645.method7797();
   }

   public int readBytes(byte[] var1, int var2, int var3) throws IOException {
      return this.field4645.method7798(var1, var2, var3);
   }

   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.field4644.method7873(var1, var2, var3);
   }

   public void method7589() {
      this.field4644.method7874();

      try {
         this.field4646.close();
      } catch (IOException var3) {
      }

      this.field4645.method7799();
   }

   protected void finalize() {
      this.method7589();
   }
}
