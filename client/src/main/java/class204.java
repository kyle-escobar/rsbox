import java.security.SecureRandom;

public class class204 {
   public static int field2196;
   static int field2200;
   static SecureRandom secureRandom;
   public short[] field2198;
   public short[] field2201;

   public class204(int var1) {
      class185 var2 = class185.method2355(var1);
      if (var2.method3518()) {
         this.field2198 = new short[var2.field1966.length];
         System.arraycopy(var2.field1966, 0, this.field2198, 0, this.field2198.length);
      }

      if (var2.method3511()) {
         this.field2201 = new short[var2.field1968.length];
         System.arraycopy(var2.field1968, 0, this.field2201, 0, this.field2201.length);
      }

   }
}
