final class class503 implements class498 {
   static boolean field5055;

   void method8540(Long var1, PacketBuffer var2) {
      var2.writeLong(var1);
   }

   public Object method8512(PacketBuffer var1) {
      return var1.readLong();
   }

   public void method8513(Object var1, PacketBuffer var2) {
      this.method8540((Long)var1, var2);
   }
}
