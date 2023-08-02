public class class143 {
   static int field1342;
   boolean field1319;
   boolean field1320;
   boolean field1330;
   boolean field1335 = true;
   class125 field1321;
   class125 field1334;
   class126[] field1323;
   float field1322;
   float field1324;
   float field1325;
   float field1326;
   float field1327;
   float field1328;
   float field1329;
   float field1331;
   float field1333;
   float field1337;
   float field1340;
   float field1341;
   float[] field1332;
   int field1336 = 0;
   int field1338;
   int field1339;

   class143() {
   }

   int method2521(class519 var1, int var2) {
      int var4 = var1.method8750();
      class140.method2062(var1.method8748());
      this.field1321 = class125.method1191(var1.method8748());
      this.field1334 = class125.method1191(var1.method8748());
      this.field1319 = var1.method8748() != 0;
      this.field1323 = new class126[var4];
      class126 var5 = null;

      for(int var6 = 0; var6 < var4; ++var6) {
         class126 var7 = new class126();
         var7.method2356(var1, var2);
         this.field1323[var6] = var7;
         if (null != var5) {
            var5.field1196 = var7;
         }

         var5 = var7;
      }

      return var4;
   }

   void method2522() {
      this.field1338 = this.field1323[0].field1194;
      this.field1339 = this.field1323[this.method2529() - 1].field1194;
      this.field1332 = new float[this.method2526() + 1];

      for(int var2 = this.method2539(); var2 <= this.method2525(); ++var2) {
         this.field1332[var2 - this.method2539()] = class130.method1416(this, (float)var2);
      }

      this.field1323 = null;
      this.field1326 = class130.method1416(this, (float)(this.method2539() - 1));
      this.field1341 = class130.method1416(this, (float)(this.method2525() + 1));
   }

   public float method2523(int var1) {
      if (var1 < this.method2539()) {
         return this.field1326;
      } else {
         return var1 > this.method2525() ? this.field1341 : this.field1332[var1 - this.method2539()];
      }
   }

   int method2539() {
      return this.field1338;
   }

   int method2525() {
      return this.field1339;
   }

   int method2526() {
      return this.method2525() - this.method2539();
   }

   int method2527(float var1) {
      if (this.field1336 < 0 || !((float)this.field1323[this.field1336].field1194 <= var1) || null != this.field1323[this.field1336].field1196 && !((float)this.field1323[this.field1336].field1196.field1194 > var1)) {
         if (!(var1 < (float)this.method2539()) && !(var1 > (float)this.method2525())) {
            int var3 = this.method2529();
            int var4 = this.field1336;
            if (var3 > 0) {
               int var5 = 0;
               int var6 = var3 - 1;

               do {
                  int var7 = var5 + var6 >> 1;
                  if (var1 < (float)this.field1323[var7].field1194) {
                     if (var1 > (float)this.field1323[var7 - 1].field1194) {
                        var4 = var7 - 1;
                        break;
                     }

                     var6 = var7 - 1;
                  } else {
                     if (!(var1 > (float)this.field1323[var7].field1194)) {
                        var4 = var7;
                        break;
                     }

                     if (var1 < (float)this.field1323[var7 + 1].field1194) {
                        var4 = var7;
                        break;
                     }

                     var5 = var7 + 1;
                  }
               } while(var5 <= var6);
            }

            if (this.field1336 != var4) {
               this.field1336 = var4;
               this.field1335 = true;
            }

            return this.field1336;
         } else {
            return -1;
         }
      } else {
         return this.field1336;
      }
   }

   class126 method2528(float var1) {
      int var3 = this.method2527(var1);
      return var3 >= 0 && var3 < this.field1323.length ? this.field1323[var3] : null;
   }

   int method2529() {
      return this.field1323 == null ? 0 : this.field1323.length;
   }
}
