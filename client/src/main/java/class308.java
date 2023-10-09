public class class308 extends class470 {
   static class154 field3359;
   static class308[] field3355 = new class308[300];
   static int field3354 = 0;
   public ClientPacket field3360;
   public PacketBuffer buffer;
   public int field3352;
   public int field3353;

   class308() {
   }

   public static class308 method2535() {
      return 0 == field3354 ? new class308() : field3355[--field3354];
   }

   public static class308 createPacket(ClientPacket var0, class540 var1) {
      class308 var3 = method2535();
      var3.field3360 = var0;
      var3.field3352 = var0.opcode;
      if (-1 == var3.field3352) {
         var3.buffer = new PacketBuffer(260);
      } else if (-2 == var3.field3352) {
         var3.buffer = new PacketBuffer(10000);
      } else if (var3.field3352 <= 18) {
         var3.buffer = new PacketBuffer(20);
      } else if (var3.field3352 <= 98) {
         var3.buffer = new PacketBuffer(100);
      } else {
         var3.buffer = new PacketBuffer(260);
      }

      var3.buffer.method8474(var1);
      var3.buffer.method8477(var3.field3360.length);
      var3.field3353 = 0;
      return var3;
   }

   public void method5744() {
      if (field3354 < field3355.length) {
         field3355[++field3354 - 1] = this;
      }
   }
}
