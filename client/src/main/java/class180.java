public class class180 extends class163 {
   byte field1879;
   byte field1880;
   String field1878;
   // $FF: synthetic field
   final class175 this$0;

   class180(class175 var1) {
      this.this$0 = var1;
   }

   void method3248(PacketBuffer var1) {
      this.field1878 = var1.method8758();
      if (null != this.field1878) {
         var1.readUnsignedByte();
         this.field1880 = var1.readByte();
         this.field1879 = var1.readByte();
      }

   }

   void method3255(class164 var1) {
      var1.field1775 = this.field1878;
      if (null != this.field1878) {
         var1.field1776 = this.field1880;
         var1.field1778 = this.field1879;
      }

   }
}
