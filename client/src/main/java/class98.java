public class class98 implements class383 {
   static int field916;
   static int field917;
   static final class98 field907 = new class98(1, 2);
   static final class98 field908 = new class98(0, -1);
   static final class98 field909 = new class98(3, 4);
   static final class98 field910 = new class98(4, 5);
   static final class98 field911 = new class98(5, 6);
   static final class98 field915 = new class98(2, 3);
   final int field912;
   final int field913;

   class98(int var1, int var2) {
      this.field912 = var1;
      this.field913 = var2;
   }

   static class98[] method358() {
      return new class98[]{field907, field911, field910, field915, field908, field909};
   }

   public static class184 method2042(int var0) {
      class184 var2 = (class184)class184.field1907.method5643((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class184.field1908.method6381(6, var0);
         var2 = new class184();
         var2.field1912 = var0;
         if (var3 != null) {
            var2.method3460(new Buffer(var3));
         }

         var2.method3470();
         if (var2.field1911) {
            var2.field1922 = 0;
            var2.field1905 = false;
         }

         class184.field1907.method5640(var2, (long)var0);
         return var2;
      }
   }

   public int serialId() {
      return this.field913;
   }
}
