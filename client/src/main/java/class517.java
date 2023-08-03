final class class517 implements class498 {
   void method8717(String var1, PacketBuffer var2) {
      var2.writeString(var1);
   }

   public Object method8512(PacketBuffer var1) {
      return var1.readString();
   }

   public void method8513(Object var1, PacketBuffer var2) {
      this.method8717((String)var1, var2);
   }
}
