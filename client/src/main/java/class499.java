final class class499 implements class498 {
   void method8521(Integer var1, PacketBuffer var2) {
      var2.writeInt(var1);
   }

   public Object method8512(PacketBuffer var1) {
      return var1.readInt();
   }

   public void method8513(Object var1, PacketBuffer var2) {
      this.method8521((Integer)var1, var2);
   }
}
