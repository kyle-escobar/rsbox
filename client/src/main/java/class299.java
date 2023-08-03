import java.util.ArrayList;
import java.util.BitSet;

public class class299 extends class470 {
   static int[] field3155;
   byte[] field3159 = new byte[128];
   byte[] field3160 = new byte[128];
   byte[] field3164 = new byte[128];
   class297[] field3161 = new class297[128];
   class58[] field3158 = new class58[128];
   int field3162;
   int[] field3165 = new int[128];
   ArrayList field3163 = new ArrayList(8);
   short[] field3157 = new short[128];

   class299(byte[] var1) {
      Buffer var2 = new Buffer(var1);

      int var3;
      for(var3 = 0; 0 != var2.data[var3 + var2.offset]; ++var3) {
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.readByte();
      }

      ++var2.offset;
      ++var3;
      var5 = var2.offset;
      var2.offset += var3;

      int var6;
      for(var6 = 0; 0 != var2.data[var2.offset + var6]; ++var6) {
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.readByte();
      }

      ++var2.offset;
      ++var6;
      var8 = var2.offset;
      var2.offset += var6;

      int var9;
      for(var9 = 0; var2.data[var2.offset + var9] != 0; ++var9) {
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.readByte();
      }

      ++var2.offset;
      ++var9;
      byte[] var36 = new byte[var9];
      int var12;
      int var14;
      if (var9 > 1) {
         var36[1] = 1;
         int var13 = 1;
         var12 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.readUnsignedByte();
            if (var15 == 0) {
               var13 = var12++;
            } else {
               if (var15 <= var13) {
                  --var15;
               }

               var13 = var15;
            }

            var36[var14] = (byte)var13;
         }
      } else {
         var12 = var9;
      }

      class297[] var37 = new class297[var12];

      class297 var38;
      for(var14 = 0; var14 < var37.length; ++var14) {
         var38 = var37[var14] = new class297();
         int var16 = var2.readUnsignedByte();
         if (var16 > 0) {
            var38.field3140 = new byte[var16 * 2];
         }

         var16 = var2.readUnsignedByte();
         if (var16 > 0) {
            var38.field3139 = new byte[var16 * 2 + 2];
            var38.field3139[1] = 64;
         }
      }

      var14 = var2.readUnsignedByte();
      byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;
      var14 = var2.readUnsignedByte();
      byte[] var40 = var14 > 0 ? new byte[var14 * 2] : null;

      int var17;
      for(var17 = 0; var2.data[var17 + var2.offset] != 0; ++var17) {
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.readByte();
      }

      ++var2.offset;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readUnsignedByte();
         this.field3157[var20] = (short)var19;
      }

      var19 = 0;

      short[] var46;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readUnsignedByte();
         var46 = this.field3157;
         var46[var20] = (short)(var46[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.readVarInt();
         }

         var46 = this.field3157;
         var46[var23] = (short)(var46[var23] + ((var22 - 1 & 2) << 14));
         this.field3165[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if (this.field3165[var24] != 0) {
            if (var20 == 0) {
               if (var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.data[var5++] - 1;
            }

            this.field3160[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if (0 != this.field3165[var25]) {
            if (var20 == 0) {
               if (var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.data[var8++] + 16 << 2;
            }

            this.field3164[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      class297 var42 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if (0 != this.field3165[var26]) {
            if (var20 == 0) {
               var42 = var37[var36[var21]];
               if (var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.field3161[var26] = var42;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if (this.field3165[var27] > 0) {
               var26 = var2.readUnsignedByte() + 1;
            }
         }

         this.field3159[var27] = (byte)var26;
         --var20;
      }

      this.field3162 = var2.readUnsignedByte() + 1;

      class297 var28;
      int var29;
      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field3140 != null) {
            for(var29 = 1; var29 < var28.field3140.length; var29 += 2) {
               var28.field3140[var29] = var2.readByte();
            }
         }

         if (null != var28.field3139) {
            for(var29 = 3; var29 < var28.field3139.length - 2; var29 += 2) {
               var28.field3139[var29] = var2.readByte();
            }
         }
      }

      if (var39 != null) {
         for(var27 = 1; var27 < var39.length; var27 += 2) {
            var39[var27] = var2.readByte();
         }
      }

      if (null != var40) {
         for(var27 = 1; var27 < var40.length; var27 += 2) {
            var40[var27] = var2.readByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (null != var28.field3139) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field3139.length; var29 += 2) {
               var19 = var19 + 1 + var2.readUnsignedByte();
               var28.field3139[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field3140 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field3140.length; var29 += 2) {
               var19 = var19 + 1 + var2.readUnsignedByte();
               var28.field3140[var29] = (byte)var19;
            }
         }
      }

      int var30;
      int var31;
      int var32;
      int var33;
      int var34;
      int var43;
      byte var44;
      if (var39 != null) {
         var19 = var2.readUnsignedByte();
         var39[0] = (byte)var19;

         for(var27 = 2; var27 < var39.length; var27 += 2) {
            var19 = var19 + 1 + var2.readUnsignedByte();
            var39[var27] = (byte)var19;
         }

         var44 = var39[0];
         var43 = var39[1];

         for(var29 = 0; var29 < var44; ++var29) {
            this.field3159[var29] = (byte)(32 + var43 * this.field3159[var29] >> 6);
         }

         for(var29 = 2; var29 < var39.length; var29 += 2) {
            var30 = var39[var29];
            var31 = var39[var29 + 1];
            var32 = (var30 - var44) / 2 + (var30 - var44) * var43;

            for(var33 = var44; var33 < var30; ++var33) {
               var34 = class311.method4376(var32, var30 - var44);
               this.field3159[var33] = (byte)(var34 * this.field3159[var33] + 32 >> 6);
               var32 += var31 - var43;
            }

            var44 = (byte)var30;
            var43 = var31;
         }

         for(var30 = var44; var30 < 128; ++var30) {
            this.field3159[var30] = (byte)(32 + var43 * this.field3159[var30] >> 6);
         }

         var38 = null;
      }

      if (null != var40) {
         var19 = var2.readUnsignedByte();
         var40[0] = (byte)var19;

         for(var27 = 2; var27 < var40.length; var27 += 2) {
            var19 = var19 + 1 + var2.readUnsignedByte();
            var40[var27] = (byte)var19;
         }

         var44 = var40[0];
         var43 = var40[1] << 1;

         for(var29 = 0; var29 < var44; ++var29) {
            var30 = (this.field3164[var29] & 255) + var43;
            if (var30 < 0) {
               var30 = 0;
            }

            if (var30 > 128) {
               var30 = 128;
            }

            this.field3164[var29] = (byte)var30;
         }

         for(var29 = 2; var29 < var40.length; var29 += 2) {
            byte var45 = var40[var29];
            var31 = var40[var29 + 1] << 1;
            var32 = (var45 - var44) * var43 + (var45 - var44) / 2;

            for(var33 = var44; var33 < var45; ++var33) {
               var34 = class311.method4376(var32, var45 - var44);
               int var35 = (this.field3164[var33] & 255) + var34;
               if (var35 < 0) {
                  var35 = 0;
               }

               if (var35 > 128) {
                  var35 = 128;
               }

               this.field3164[var33] = (byte)var35;
               var32 += var31 - var43;
            }

            var44 = var45;
            var43 = var31;
         }

         for(var30 = var44; var30 < 128; ++var30) {
            var31 = (this.field3164[var30] & 255) + var43;
            if (var31 < 0) {
               var31 = 0;
            }

            if (var31 > 128) {
               var31 = 128;
            }

            this.field3164[var30] = (byte)var31;
         }

         Object var41 = null;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field3141 = var2.readUnsignedByte();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (null != var28.field3140) {
            var28.field3142 = var2.readUnsignedByte();
         }

         if (null != var28.field3139) {
            var28.field3144 = var2.readUnsignedByte();
         }

         if (var28.field3141 > 0) {
            var28.field3150 = var2.readUnsignedByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field3146 = var2.readUnsignedByte();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field3146 > 0) {
            var28.field3145 = var2.readUnsignedByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field3145 > 0) {
            var28.field3147 = var2.readUnsignedByte();
         }
      }

   }

   boolean method5690(class34 var1, BitSet var2) {
      boolean var4 = true;
      int var5 = 0;
      class58 var6 = new class58();

      int var8;
      for(int var7 = var2.nextSetBit(0); var7 != -1; var7 = var2.nextSetBit(var8)) {
         var8 = var2.nextClearBit(var7);

         for(int var9 = var7; var9 < var8; ++var9) {
            if (var2.get(var9)) {
               int var10 = this.field3165[var9];
               if (var10 != 0) {
                  if (var10 != var5) {
                     var5 = var10--;
                     if ((var10 & 1) == 0) {
                        var6 = new class58(var1.method506(var10 >> 2));
                     } else {
                        var6 = var1.method514(var10 >> 2);
                     }

                     if (var6.method1177()) {
                        var4 = false;
                     } else {
                        this.field3163.add(this.field3163.size(), var6);
                     }
                  }

                  if (!var6.method1177()) {
                     this.field3158[var9] = var6;
                     this.field3165[var9] = 0;
                  }
               }
            }
         }
      }

      return var4;
   }

   void method5693() {
      this.field3165 = null;
   }
}
