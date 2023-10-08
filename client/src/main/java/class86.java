public final class class86 extends class102 {
   static int field779 = 1;
   static int field781 = 1;
   class191 field776;
   class201 field778;
   class201 field780;
   class512 field777;
   int field782 = 31;
   String field774 = "";

   class86() {
   }

   void method1842(String var1) {
      this.field774 = null == var1 ? "" : var1;
   }

   void method1855(int var1) {
      this.field782 = var1;
   }

   boolean method1844(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (this.field782 & 1 << var1);
      } else {
         return true;
      }
   }

   final String method1845() {
      if (!this.field774.isEmpty()) {
         return this.field774;
      } else {
         class191 var2 = this.field776;
         if (null != var2.field2066) {
            var2 = var2.method3652();
            if (null == var2) {
               var2 = this.field776;
            }
         }

         return var2.field2080;
      }
   }

   final void method1846(int var1, class223 var2) {
      int var4 = super.pathX[0];
      int var5 = super.pathY[0];
      if (var1 == 0) {
         --var4;
         ++var5;
      }

      if (var1 == 1) {
         ++var5;
      }

      if (var1 == 2) {
         ++var4;
         ++var5;
      }

      if (var1 == 3) {
         --var4;
      }

      if (var1 == 4) {
         ++var4;
      }

      if (var1 == 5) {
         --var4;
         --var5;
      }

      if (var1 == 6) {
         --var5;
      }

      if (var1 == 7) {
         ++var4;
         --var5;
      }

      if (-1 != super.field968 && class215.method2582(super.field968).field2356 == 1) {
         super.field968 = -1;
      }

      if (super.field1010 < 9) {
         ++super.field1010;
      }

      for(int var6 = super.field1010; var6 > 0; --var6) {
         super.pathX[var6] = super.pathX[var6 - 1];
         super.pathY[var6] = super.pathY[var6 - 1];
         super.field998[var6] = super.field998[var6 - 1];
      }

      super.pathX[0] = var4;
      super.pathY[0] = var5;
      super.field998[0] = var2;
   }

   final void method1847(int var1, int var2, boolean var3) {
      if (super.field968 != -1 && class215.method2582(super.field968).field2356 == 1) {
         super.field968 = -1;
      }

      if (!var3) {
         int var5 = var1 - super.pathX[0];
         int var6 = var2 - super.pathY[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if (super.field1010 < 9) {
               ++super.field1010;
            }

            for(int var7 = super.field1010; var7 > 0; --var7) {
               super.pathX[var7] = super.pathX[var7 - 1];
               super.pathY[var7] = super.pathY[var7 - 1];
               super.field998[var7] = super.field998[var7 - 1];
            }

            super.pathX[0] = var1;
            super.pathY[0] = var2;
            super.field998[0] = class223.field2457;
            return;
         }
      }

      super.field1010 = 0;
      super.field1015 = 0;
      super.field1014 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.field949 = 128 * super.pathX[0] + super.field981 * 64;
      super.field963 = 128 * super.pathY[0] + super.field981 * 64;
   }

   protected final class249 method4273() {
      if (null == this.field776) {
         return null;
      } else {
         class215 var2 = super.field968 != -1 && super.field988 == 0 ? class215.method2582(super.field968) : null;
         class215 var3 = -1 != super.field1013 && (super.field1013 != super.field989 || var2 == null) ? class215.method2582(super.field1013) : null;
         class249 var4 = null;
         if (this.field778 != null && this.field778.field2188) {
            var4 = class146.field1362.field764.method5801(var2, super.field986, var3, super.field1011);
         } else {
            var4 = this.field776.method3614(var2, super.field986, var3, super.field1011, this.field778);
         }

         if (var4 == null) {
            return null;
         } else {
            var4.method4763();
            super.field1000 = var4.field2507;
            int var5 = var4.field2750;
            var4 = this.method2072(var4);
            if (1 == this.field776.field2049) {
               var4.field2749 = true;
            }

            if (super.field1006 != 0 && Client.field1445 >= super.field941 && Client.field1445 < super.field1002) {
               var4.field2761 = super.field1003;
               var4.field2792 = super.field996;
               var4.field2793 = super.field1005;
               var4.field2720 = super.field1006;
               var4.field2730 = (short)var5;
            } else {
               var4.field2720 = 0;
            }

            return var4;
         }
      }
   }

   final boolean method2065() {
      return this.field776 != null;
   }

   int[] method1850() {
      return null != this.field777 ? this.field777.method8647() : this.field776.method3630();
   }

   short[] method1875() {
      return this.field777 != null ? this.field777.method8648() : this.field776.method3660();
   }

   void method1851(int var1, int var2, short var3) {
      if (null == this.field777) {
         this.field777 = new class512(this.field776);
      }

      this.field777.method8649(var1, var2, var3);
   }

   void method1848(int[] var1, short[] var2) {
      if (null == this.field777) {
         this.field777 = new class512(this.field776);
      }

      this.field777.method8657(var1, var2);
   }

   void method1879() {
      this.field777 = null;
   }

   void method1859(class201 var1) {
      this.field780 = var1;
   }

   class201 method1856() {
      return this.field780;
   }

   void method1857(class201 var1) {
      this.field778 = var1;
   }

   void method1858() {
      this.field780 = null;
   }

   void method1852() {
      this.field778 = null;
   }
}
