import java.util.Iterator;

public class class510 extends class456 implements class262 {
   final class296 field5092 = new class296(64);
   final class342 field5094;
   final int field5093;

   public class510(class359 var1, int var2, class384 var3, class342 var4) {
      super(var1, var3, null != var4 ? var4.method6393(var2) : 0);
      this.field5094 = var4;
      this.field5093 = var2;
   }

   protected class445 method8012(int var1) {
      synchronized(this.field5092) {
         class454 var3 = (class454)this.field5092.method5665((long)var1);
         if (null == var3) {
            var3 = this.method8632(var1);
            this.field5092.method5663(var3, (long)var1);
         }

         return var3;
      }
   }

   class454 method8632(int var1) {
      byte[] var3 = this.field5094.method6381(this.field5093, var1);
      class454 var4 = new class454(var1);
      if (var3 != null) {
         var4.method7840(new PacketBuffer(var3));
      }

      return var4;
   }

   public void method8631() {
      synchronized(this.field5092) {
         this.field5092.method5666();
      }
   }

   public Iterator iterator() {
      return new class514(this);
   }
}
