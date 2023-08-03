public class class172 extends class133 {
   static int field1822;
   static int field1823;
   static String[] field1825;
   int field1824;
   // $FF: synthetic field
   final class148 this$0;

   class172(class148 var1) {
      this.this$0 = var1;
      this.field1824 = -1;
   }

   void method2457(PacketBuffer var1) {
      this.field1824 = var1.readUnsignedShort();
   }

   void method2458(class154 var1) {
      var1.method2595(this.field1824);
   }
}
