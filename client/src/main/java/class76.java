public class class76 extends class476 {
   static boolean field635;
   static class537 field633;
   class426 field630;
   class426 field631;
   class526 field629;
   int field625;
   int field627;
   int field634;
   String field626;
   String field628;
   String field632;

   class76(int var1, String var2, String var3, String var4) {
      this.field630 = class426.field4610;
      this.field631 = class426.field4610;
      this.method1555(var1, var2, var3, var4);
   }

   static void method1563(Buffer var0, long var1) {
      var1 /= 10L;
      if (var1 < 0L) {
         var1 = 0L;
      } else if (var1 > 65535L) {
         var1 = 65535L;
      }

      var0.writeShort((int)var1);
   }

   void method1555(int var1, String var2, String var3, String var4) {
      this.field625 = class119.method7714();
      this.field634 = Client.field1445;
      this.field627 = var1;
      this.field628 = var2;
      this.method1550();
      this.field632 = var3;
      this.field626 = var4;
      this.method1544();
      this.method1542();
   }

   void method1544() {
      this.field630 = class426.field4610;
   }

   final boolean method1545() {
      if (this.field630 == class426.field4610) {
         this.method1556();
      }

      return class426.field4611 == this.field630;
   }

   void method1556() {
      this.field630 = class165.field1782.field401.method7720(this.field629) ? class426.field4611 : class426.field4612;
   }

   void method1542() {
      this.field631 = class426.field4610;
   }

   final boolean method1548() {
      if (this.field631 == class426.field4610) {
         this.method1549();
      }

      return this.field631 == class426.field4611;
   }

   void method1549() {
      this.field631 = class165.field1782.field402.method7720(this.field629) ? class426.field4611 : class426.field4612;
   }

   final void method1550() {
      if (null != this.field628) {
         this.field629 = new class526(Client.method7581(this.field628), class454.field4743);
      } else {
         this.field629 = null;
      }

   }
}
