public class class125 implements class383 {
   static final class125 field1184 = new class125(1, 1);
   static final class125 field1185 = new class125(2, 2);
   static final class125 field1186 = new class125(3, 3);
   static final class125 field1189 = new class125(4, 4);
   static final class125 field1192 = new class125(0, 0);
   final int field1188;
   final int field1191;

   class125(int var1, int var2) {
      this.field1188 = var1;
      this.field1191 = var2;
   }

   static class125 method1191(int var0) {
      class125[] var2 = new class125[]{field1192, field1184, field1185, field1186, field1189};
      class125 var3 = (class125)class373.method1724(var2, var0);
      if (var3 == null) {
         var3 = field1192;
      }

      return var3;
   }

   public int serialId() {
      return this.field1191;
   }
}
