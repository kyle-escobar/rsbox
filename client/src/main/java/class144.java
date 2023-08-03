public class class144 extends class133 {
   static class363 field1347;
   static int field1352;
   int field1343;
   int field1344;
   int field1345;
   int field1346;
   // $FF: synthetic field
   final class148 this$0;

   class144(class148 var1) {
      this.this$0 = var1;
   }

   void method2457(PacketBuffer var1) {
      this.field1346 = var1.readInt();
      this.field1344 = var1.readInt();
      this.field1343 = var1.readUnsignedByte();
      this.field1345 = var1.readUnsignedByte();
   }

   void method2458(class154 var1) {
      var1.method2597(this.field1346, this.field1344, this.field1343, this.field1345);
   }
}
