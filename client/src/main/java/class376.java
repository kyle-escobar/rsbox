public class class376 {
   String field4364;
   String field4367;
   public final class367 field4366;
   public final int field4365;
   public final long field4368;

   class376(PacketBuffer var1, byte var2, int var3) {
      this.field4367 = var1.readString();
      this.field4364 = var1.readString();
      this.field4365 = var1.readUnsignedShort();
      this.field4368 = var1.readLong();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.field4366 = new class367();
      this.field4366.method6663(2);
      this.field4366.method6653(var2);
      this.field4366.field4340 = var4;
      this.field4366.field4339 = var5;
      this.field4366.field4338 = 0;
      this.field4366.field4341 = 0;
      this.field4366.field4337 = var3;
   }

   public String method6742() {
      return this.field4367;
   }

   public String method6741() {
      return this.field4364;
   }
}
