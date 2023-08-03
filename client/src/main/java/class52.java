public class class52 {
   int field374;
   int field377;
   int field378;
   int field379;
   int field380 = 2;
   int field381;
   int field382;
   int field383;
   int field384;
   int[] field375 = new int[2];
   int[] field376 = new int[2];

   class52() {
      this.field375[0] = 0;
      this.field375[1] = 65535;
      this.field376[0] = 0;
      this.field376[1] = 65535;
   }

   final void method1064(Buffer var1) {
      this.field381 = var1.readUnsignedByte();
      this.field377 = var1.readInt();
      this.field378 = var1.readInt();
      this.method1065(var1);
   }

   final void method1065(Buffer var1) {
      this.field380 = var1.readUnsignedByte();
      this.field375 = new int[this.field380];
      this.field376 = new int[this.field380];

      for(int var2 = 0; var2 < this.field380; ++var2) {
         this.field375[var2] = var1.readUnsignedShort();
         this.field376[var2] = var1.readUnsignedShort();
      }

   }

   final void method1066() {
      this.field379 = 0;
      this.field374 = 0;
      this.field382 = 0;
      this.field383 = 0;
      this.field384 = 0;
   }

   final int method1067(int var1) {
      if (this.field384 >= this.field379) {
         this.field383 = this.field376[this.field374++] << 15;
         if (this.field374 >= this.field380) {
            this.field374 = this.field380 - 1;
         }

         this.field379 = (int)((double)this.field375[this.field374] / 65536.0 * (double)var1);
         if (this.field379 > this.field384) {
            this.field382 = ((this.field376[this.field374] << 15) - this.field383) / (this.field379 - this.field384);
         }
      }

      this.field383 += this.field382;
      ++this.field384;
      return this.field383 - this.field382 >> 15;
   }
}
