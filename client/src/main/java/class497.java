public class class497 extends PacketBuffer {
   static final int[] field5039 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   class540 field5040;
   int field5041;

   public class497(int var1) {
      super(var1);
   }

   public void method8475(int[] var1) {
      this.field5040 = new class540(var1);
   }

   public void method8474(class540 var1) {
      this.field5040 = var1;
   }

   public void method8477(int var1) {
      super.data[++super.offset - 1] = (byte)(var1 + this.field5040.method9368());
   }

   public int method8478() {
      return super.data[++super.offset - 1] - this.field5040.method9368() & 255;
   }

   public boolean method8479() {
      int var2 = super.data[super.offset] - this.field5040.method9370() & 255;
      return var2 >= 128;
   }

   public int method8480() {
      int var2 = super.data[++super.offset - 1] - this.field5040.method9368() & 255;
      return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.data[++super.offset - 1] - this.field5040.method9368() & 255);
   }

   public void method8505(byte[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var1[var2 + var5] = (byte)(super.data[++super.offset - 1] - this.field5040.method9368());
      }

   }

   public void method8476() {
      this.field5041 = super.offset * 8;
   }

   public int method8483(int var1) {
      int var3 = this.field5041 >> 3;
      int var4 = 8 - (this.field5041 & 7);
      int var5 = 0;

      for(this.field5041 += var1; var1 > var4; var4 = 8) {
         var5 += (super.data[var3++] & field5039[var4]) << var1 - var4;
         var1 -= var4;
      }

      if (var1 == var4) {
         var5 += super.data[var3] & field5039[var4];
      } else {
         var5 += super.data[var3] >> var4 - var1 & field5039[var1];
      }

      return var5;
   }

   public void method8482() {
      super.offset = (7 + this.field5041) / 8;
   }

   public int method8485(int var1) {
      return var1 * 8 - this.field5041;
   }
}
