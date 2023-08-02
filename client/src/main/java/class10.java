import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class class10 implements class18 {
   final MessageDigest field57 = this.method195();

   class10(class22 var1) {
   }

   static int method203(byte[] var0) {
      int var1 = 0;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         byte var4 = var0[var3];
         int var5 = method207(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   static int method207(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for(int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
            ++var1;
         }
      }

      return var1;
   }

   boolean method191(int var1, String var2, long var3) {
      byte[] var5 = this.method194(var2, var3);
      return method203(var5) >= var1;
   }

   byte[] method194(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field57.reset();

      try {
         this.field57.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field57.digest();
   }

   MessageDigest method195() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }
}
