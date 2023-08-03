public class class148 {
   class382 field1370 = new class382();
   int field1373 = -1;
   long field1374;

   public class148(PacketBuffer var1) {
      this.method2559(var1);
   }

   void method2559(PacketBuffer var1) {
      this.field1374 = var1.readLong();
      this.field1373 = var1.readInt();

      for(int var3 = var1.readUnsignedByte(); var3 != 0; var3 = var1.readUnsignedByte()) {
         Object var4;
         if (var3 == 3) {
            var4 = new class169(this);
         } else if (var3 == 1) {
            var4 = new class134(this);
         } else if (var3 == 13) {
            var4 = new class157(this);
         } else if (var3 == 4) {
            var4 = new class141(this);
         } else if (var3 == 6) {
            var4 = new class172(this);
         } else if (var3 == 5) {
            var4 = new class138(this);
         } else if (var3 == 2) {
            var4 = new class149(this);
         } else if (var3 == 7) {
            var4 = new class142(this);
         } else if (var3 == 14) {
            var4 = new class151(this);
         } else if (var3 == 8) {
            var4 = new class161(this);
         } else if (var3 == 9) {
            var4 = new class174(this);
         } else if (var3 == 10) {
            var4 = new Js5NetQueue(this);
         } else if (var3 == 11) {
            var4 = new class144(this);
         } else if (var3 == 12) {
            var4 = new class135(this);
         } else {
            if (var3 != 15) {
               throw new RuntimeException("");
            }

            var4 = new class171(this);
         }

         ((class133)var4).method2457(var1);
         this.field1370.method6874((class470)var4);
      }

   }

   public void method2563(class154 var1) {
      if (this.field1374 == var1.field1395 && this.field1373 == var1.field1398) {
         for(class133 var3 = (class133)this.field1370.method6847(); var3 != null; var3 = (class133)this.field1370.method6849()) {
            var3.method2458(var1);
         }

         ++var1.field1398;
      } else {
         throw new RuntimeException("");
      }
   }
}
