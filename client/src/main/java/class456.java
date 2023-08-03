public abstract class class456 extends class270 implements class529 {
   static int field4751;

   protected class456(class359 var1, class384 var2, int var3) {
      super(var1, var2, var3);
   }

   protected abstract class445 method8012(int var1);

   public int method8015() {
      return super.field2985;
   }

   public Object method9197(int var1) {
      class445 var3 = this.method8012(var1);
      return var3 != null && var3.method7832() ? var3.method7833() : null;
   }

   public class525 method8013(Buffer var1) {
      int var3 = var1.readUnsignedShort();
      class445 var4 = this.method8012(var3);
      class525 var5 = new class525(var3);
      Class var6 = var4.field4696.field5070;
      if (var6 == Integer.class) {
         var5.field5162 = var1.readInt();
      } else if (var6 == Long.class) {
         var5.field5162 = var1.readLong();
      } else if (var6 == String.class) {
         var5.field5162 = var1.readJagString();
      } else {
         if (!class506.class.isAssignableFrom(var6)) {
            throw new IllegalStateException();
         }

         try {
            class506 var7 = (class506)var6.newInstance();
            var7.method8589(var1);
            var5.field5162 = var7;
         } catch (InstantiationException var8) {
         } catch (IllegalAccessException var9) {
         }
      }

      return var5;
   }
}
