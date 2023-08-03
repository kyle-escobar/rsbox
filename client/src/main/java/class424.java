import java.io.IOException;
import java.net.Socket;

public abstract class class424 {
   class424() {
   }

   public static class424 newSocketStream(Socket var0, int var1, int var2) throws IOException {
      return new class433(var0, var1, var2);
   }

   public static int method7607(int var0) {
      return class467.field4797[var0 & 16383];
   }

   public abstract boolean method7597(int var1) throws IOException;

   public abstract int available() throws IOException;

   public abstract int readUnsignedByte() throws IOException;

   public abstract int readBytes(byte[] var1, int var2, int var3) throws IOException;

   public abstract void method7589();

   public abstract void write(byte[] var1, int var2, int var3) throws IOException;
}
