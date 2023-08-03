public class class150 extends class163 {
   static class363 field1383;
   static int field1382;
   int field1380;
   // $FF: synthetic field
   final class175 this$0;

   class150(class175 var1) {
      this.this$0 = var1;
      this.field1380 = -1;
   }

   void method3248(PacketBuffer var1) {
      this.field1380 = var1.readUnsignedShort();
      var1.readUnsignedByte();
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.readLong();
      }

   }

   void method3255(class164 var1) {
      var1.method3261(this.field1380);
   }
}
