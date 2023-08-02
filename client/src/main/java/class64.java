public final class class64 extends class228 {
   boolean field510 = false;
   class215 field507;
   int field501;
   int field502 = 0;
   int field503;
   int field504;
   int field505;
   int field506;
   int field508;
   int field509 = 0;

   class64(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field501 = var1;
      this.field503 = var2;
      this.field504 = var3;
      this.field505 = var4;
      this.field506 = var5;
      this.field508 = var6 + var7;
      int var8 = class205.method3634(this.field501).field2204;
      if (var8 != -1) {
         this.field510 = false;
         this.field507 = class215.method2582(var8);
      } else {
         this.field510 = true;
      }

   }

   final void method1384(int var1) {
      if (!this.field510) {
         this.field509 += var1;
         if (!this.field507.method4058()) {
            while(this.field509 > this.field507.field2344[this.field502]) {
               this.field509 -= this.field507.field2344[this.field502];
               ++this.field502;
               if (this.field502 >= this.field507.field2336.length) {
                  this.field510 = true;
                  break;
               }
            }
         } else {
            this.field502 += var1;
            if (this.field502 >= this.field507.method4059()) {
               this.field510 = true;
            }
         }

      }
   }

   protected final class249 method4273() {
      class205 var2 = class205.method3634(this.field501);
      class249 var3;
      if (!this.field510) {
         var3 = var2.method3857(this.field502);
      } else {
         var3 = var2.method3857(-1);
      }

      return var3 == null ? null : var3;
   }
}
