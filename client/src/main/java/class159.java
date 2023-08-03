public class class159 extends class163 {
   public static class528 field1749;
   byte field1745;
   int field1746;
   int field1747;
   String field1748;
   // $FF: synthetic field
   final class175 this$0;

   class159(class175 var1) {
      this.this$0 = var1;
      this.field1747 = -1;
   }

   void method3248(PacketBuffer var1) {
      var1.readUnsignedByte();
      this.field1747 = var1.readUnsignedShort();
      this.field1745 = var1.readByte();
      this.field1746 = var1.readUnsignedShort();
      var1.readLong();
      this.field1748 = var1.readString();
      var1.readUnsignedByte();
   }

   void method3255(class164 var1) {
      class152 var3 = (class152)var1.field1772.get(this.field1747);
      var3.field1391 = this.field1745;
      var3.field1388 = this.field1746;
      var3.field1389 = new class526(this.field1748);
   }
}
