public final class Player extends class102 {
   boolean teleporting;
   boolean field756;
   boolean field760;
   class249 field751;
   class314 field764;
   class426 field738;
   class426 field746;
   class426 field762;
   class526 field740;
   int field737;
   int field739 = -1;
   int field743;
   int field745;
   int field747;
   int field748;
   int field749;
   int field750;
   int field752 = -1;
   int field753;
   int field754;
   int field755;
   int field757;
   int field758;
   int plane;
   int field761;
   int field763;
   int field765;
   int field766;
   String[] field742 = new String[3];

   Player() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.field742[var1] = "";
      }

      this.field743 = 0;
      this.field761 = 0;
      this.field737 = 0;
      this.field747 = 0;
      this.field756 = false;
      this.field757 = 0;
      this.field760 = false;
      this.field738 = class426.field4610;
      this.field746 = class426.field4610;
      this.field762 = class426.field4610;
      this.teleporting = false;
   }

   final void updateAppearance(Buffer buf) {
      buf.offset = 0;
      int var3 = buf.readUnsignedByte();
      boolean var4 = true;
      this.field739 = buf.readByte();
      this.field752 = buf.readByte();
      int var5 = -1;
      this.field757 = 0;
      int[] var6 = new int[12];

      int i;
      int var9;
      int var10;
      for(int var7 = 0; var7 < 12; ++var7) {
         i = buf.readUnsignedByte();
         if (i == 0) {
            var6[var7] = 0;
         } else {
            var9 = buf.readUnsignedByte();
            var6[var7] = (i << 8) + var9;
            if (var7 == 0 && 65535 == var6[0]) {
               var5 = buf.readUnsignedShort();
               break;
            }

            if (var6[var7] >= 512) {
               var10 = class185.method2355(var6[var7] - 512).field2005;
               if (var10 != 0) {
                  this.field757 = var10;
               }
            }
         }
      }

      int[] var28 = null;
      if (Client.revision >= 213) {
         var28 = new int[12];

         for(i = 0; i < 12; ++i) {
            var9 = buf.readUnsignedByte();
            if (var9 == 0) {
               var28[i] = 0;
            } else {
               var10 = buf.readUnsignedByte();
               var28[i] = (var9 << 8) + var10;
            }
         }
      }

      int[] var29 = new int[5];

      for(var9 = 0; var9 < 5; ++var9) {
         var10 = buf.readUnsignedByte();
         if (var10 < 0 || var10 >= class164.field1774[var9].length) {
            var10 = 0;
         }

         var29[var9] = var10;
      }

      super.field989 = buf.readUnsignedShort();
      if (super.field989 == 65535) {
         super.field989 = -1;
      }

      super.field995 = buf.readUnsignedShort();
      if (65535 == super.field995) {
         super.field995 = -1;
      }

      super.field948 = super.field995;
      super.field993 = buf.readUnsignedShort();
      if (65535 == super.field993) {
         super.field993 = -1;
      }

      super.field1004 = buf.readUnsignedShort();
      if (super.field1004 == 65535) {
         super.field1004 = -1;
      }

      super.field1001 = buf.readUnsignedShort();
      if (super.field1001 == 65535) {
         super.field1001 = -1;
      }

      super.field984 = buf.readUnsignedShort();
      if (65535 == super.field984) {
         super.field984 = -1;
      }

      super.field953 = buf.readUnsignedShort();
      if (65535 == super.field953) {
         super.field953 = -1;
      }

      this.field740 = new class526(buf.readString(), class454.field4743);
      this.method1812();
      this.method1785();
      this.method1805();
      if (class146.field1362 == this) {
         class524.field5155 = this.field740.method9155();
      }

      this.field743 = buf.readUnsignedByte();
      this.field761 = buf.readUnsignedShort();
      this.field760 = buf.readUnsignedByte() == 1;
      if (Client.field1434 == 0 && Client.privilege >= 2) {
         this.field760 = false;
      }

      class204[] var30 = null;
      boolean var31 = false;
      int var11 = buf.readUnsignedShort();
      var31 = 1 == (var11 >> 15 & 1);
      int var12;
      if (var11 > 0 && var11 != 32768) {
         var30 = new class204[12];

         for(var12 = 0; var12 < 12; ++var12) {
            int var13 = var11 >> 12 - var12 & 1;
            if (var13 == 1) {
               int var17 = var6[var12] - 512;
               int var18 = buf.readUnsignedByte();
               boolean var19 = 0 != (var18 & 1);
               boolean var20 = (var18 & 2) != 0;
               class204 var21 = new class204(var17);
               int var22;
               int[] var23;
               boolean var24;
               int var25;
               short var26;
               if (var19) {
                  var22 = buf.readUnsignedByte();
                  var23 = new int[]{var22 & 15, var22 >> 4 & 15};
                  var24 = var21.field2198 != null && var23.length == var21.field2198.length;

                  for(var25 = 0; var25 < 2; ++var25) {
                     if (15 != var23[var25]) {
                        var26 = (short)buf.readUnsignedShort();
                        if (var24) {
                           var21.field2198[var23[var25]] = var26;
                        }
                     }
                  }
               }

               if (var20) {
                  var22 = buf.readUnsignedByte();
                  var23 = new int[]{var22 & 15, var22 >> 4 & 15};
                  var24 = null != var21.field2201 && var21.field2201.length == var23.length;

                  for(var25 = 0; var25 < 2; ++var25) {
                     if (15 != var23[var25]) {
                        var26 = (short)buf.readUnsignedShort();
                        if (var24) {
                           var21.field2201[var23[var25]] = var26;
                        }
                     }
                  }
               }

               var30[var12] = var21;
            }
         }
      }

      for(var12 = 0; var12 < 3; ++var12) {
         this.field742[var12] = buf.readString();
      }

      int var27 = buf.readUnsignedByte();
      if (null == this.field764) {
         this.field764 = new class314();
      }

      this.field764.method5794(var28, var6, var30, var31, var29, var3, var5, var27);
   }

   boolean method1779() {
      if (class426.field4610 == this.field738) {
         this.method1781();
      }

      return class426.field4611 == this.field738;
   }

   void method1812() {
      this.field738 = class426.field4610;
   }

   void method1781() {
      this.field738 = class165.field1782.method1103(this.field740) ? class426.field4611 : class426.field4612;
   }

   boolean method1790() {
      if (class426.field4610 == this.field746) {
         this.method1818();
      }

      return this.field746 == class426.field4611;
   }

   void method1785() {
      this.field746 = class426.field4610;
   }

   void method1818() {
      this.field746 = null != Js5Index.field42 && Js5Index.field42.method7720(this.field740) ? class426.field4611 : class426.field4612;
   }

   void method1780() {
      for(int var2 = 0; var2 < 4; ++var2) {
         if (Client.field1628[var2] != null && Client.field1628[var2].method2601(this.field740.method9155()) != -1 && var2 != 2) {
            this.field762 = class426.field4611;
            return;
         }
      }

      this.field762 = class426.field4612;
   }

   void method1805() {
      this.field762 = class426.field4610;
   }

   boolean method1787() {
      if (this.field762 == class426.field4610) {
         this.method1780();
      }

      return this.field762 == class426.field4611;
   }

   int method1788() {
      return null != this.field764 && this.field764.field3495 != -1 ? class191.method4208(this.field764.field3495).field2049 : 1;
   }

   protected final class249 method4273() {
      if (this.field764 == null) {
         return null;
      } else {
         class215 var2 = -1 != super.field968 && super.field988 == 0 ? class215.method2582(super.field968) : null;
         class215 var3 = -1 != super.field1013 && !this.field756 && (super.field989 != super.field1013 || null == var2) ? class215.method2582(super.field1013) : null;
         class249 var4 = this.field764.method5801(var2, super.field986, var3, super.field1011);
         if (var4 == null) {
            return null;
         } else {
            var4.method4763();
            super.field1000 = var4.field2507;
            int var5 = var4.field2750;
            if (!this.field756) {
               var4 = this.method2072(var4);
            }

            if (!this.field756 && this.field751 != null) {
               if (Client.field1445 >= this.field747) {
                  this.field751 = null;
               }

               if (Client.field1445 >= this.field737 && Client.field1445 < this.field747) {
                  class249 var6 = this.field751;
                  var6.method4830(this.field748 - super.field949, this.field749 - this.field765, this.field745 - super.field963);
                  if (512 == super.field1007) {
                     var6.method4774();
                     var6.method4774();
                     var6.method4774();
                  } else if (super.field1007 == 1024) {
                     var6.method4774();
                     var6.method4774();
                  } else if (1536 == super.field1007) {
                     var6.method4774();
                  }

                  class249[] var7 = new class249[]{var4, var6};
                  var4 = new class249(var7, 2);
                  if (super.field1007 == 512) {
                     var6.method4774();
                  } else if (super.field1007 == 1024) {
                     var6.method4774();
                     var6.method4774();
                  } else if (super.field1007 == 1536) {
                     var6.method4774();
                     var6.method4774();
                     var6.method4774();
                  }

                  var6.method4830(super.field949 - this.field748, this.field765 - this.field749, super.field963 - this.field745);
               }
            }

            var4.field2749 = true;
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

   final void method1786(int var1, int var2, class223 var3) {
      if (-1 != super.field968 && class215.method2582(super.field968).field2356 == 1) {
         super.field968 = -1;
      }

      this.method2073();
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
            if (var3 == class223.field2450) {
               Client.method1483(this, var1, var2, class223.field2450);
            }

            this.method1792(var1, var2, var3);
         } else {
            this.method1795(var1, var2);
         }
      } else {
         this.method1795(var1, var2);
      }

   }

   void method1795(int var1, int var2) {
      super.field1010 = 0;
      super.field1015 = 0;
      super.field1014 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      int var4 = this.method1788();
      super.field949 = super.pathX[0] * 128 + var4 * 64;
      super.field963 = super.pathY[0] * 128 + var4 * 64;
   }

   final void method1792(int var1, int var2, class223 var3) {
      if (super.field1010 < 9) {
         ++super.field1010;
      }

      for(int var5 = super.field1010; var5 > 0; --var5) {
         super.pathX[var5] = super.pathX[var5 - 1];
         super.pathY[var5] = super.pathY[var5 - 1];
         super.field998[var5] = super.field998[var5 - 1];
      }

      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.field998[0] = var3;
   }

   final boolean method2065() {
      return null != this.field764;
   }
}
