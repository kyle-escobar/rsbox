import java.util.LinkedList;

public abstract class class273 {
   boolean field3009;
   boolean field3010;
   byte[][][] field2996;
   byte[][][] field3007;
   class271[][][][] field3008;
   int field2997;
   int field2998;
   int field2999 = -1;
   int field3000;
   int field3001;
   int field3002 = -1;
   int field3003;
   int field3006;
   short[][][] field3004;
   short[][][] field3005;

   class273() {
      new LinkedList();
      this.field3009 = false;
      this.field3010 = false;
   }

   abstract void method5304(class519 var1);

   boolean method5301() {
      return this.field3009 && this.field3010;
   }

   void method5302(class342 var1) {
      if (!this.method5301()) {
         byte[] var3 = var1.method6381(this.field3002, this.field2999);
         if (var3 != null) {
            this.method5304(new class519(var3));
            this.field3009 = true;
            this.field3010 = true;
         }

      }
   }

   void method5303() {
      this.field3004 = (short[][][])null;
      this.field3005 = (short[][][])null;
      this.field2996 = (byte[][][])null;
      this.field3007 = (byte[][][])null;
      this.field3008 = (class271[][][][])null;
      this.field3009 = false;
      this.field3010 = false;
   }

   void method5300(int var1, int var2, class519 var3) {
      int var5 = var3.method8748();
      if (var5 != 0) {
         if (0 != (var5 & 1)) {
            this.method5305(var1, var2, var3, var5);
         } else {
            this.method5306(var1, var2, var3, var5);
         }

      }
   }

   void method5305(int var1, int var2, class519 var3, int var4) {
      boolean var6 = (var4 & 2) != 0;
      if (var6) {
         this.field3005[0][var1][var2] = (short)var3.method8750();
      }

      this.field3004[0][var1][var2] = (short)var3.method8750();
   }

   void method5306(int var1, int var2, class519 var3, int var4) {
      int var6 = ((var4 & 24) >> 3) + 1;
      boolean var7 = (var4 & 2) != 0;
      boolean var8 = 0 != (var4 & 4);
      this.field3004[0][var1][var2] = (short)var3.method8750();
      int var9;
      int var10;
      int var12;
      if (var7) {
         var9 = var3.method8748();

         for(var10 = 0; var10 < var9; ++var10) {
            int var11 = var3.method8750();
            if (var11 != 0) {
               this.field3005[var10][var1][var2] = (short)var11;
               var12 = var3.method8748();
               this.field2996[var10][var1][var2] = (byte)(var12 >> 2);
               this.field3007[var10][var1][var2] = (byte)(var12 & 3);
            }
         }
      }

      if (var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var3.method8748();
            if (var10 != 0) {
               class271[] var15 = this.field3008[var9][var1][var2] = new class271[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  int var13 = var3.method8814();
                  int var14 = var3.method8748();
                  var15[var12] = new class271(var13, var14 >> 2, var14 & 3);
               }
            }
         }
      }

   }

   int method5308() {
      return this.field2998;
   }

   int method5309() {
      return this.field3003;
   }
}
