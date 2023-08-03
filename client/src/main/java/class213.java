public class class213 extends class228 {
   static int field2320 = 0;
   static int[] field2279;
   static int[] field2288 = new int[10000];
   static int[] field2312;
   static int[] field2319 = new int[10000];
   boolean field2309 = false;
   byte field2295 = 0;
   byte[] field2278;
   byte[] field2291;
   byte[] field2292;
   byte[] field2297;
   byte[] field2316;
   class238[] field2307;
   class245[] field2289;
   class245[] field2308;
   int field2283;
   int field2284;
   int field2285 = 0;
   int field2290 = 0;
   int field2313;
   int field2314;
   int field2315;
   int field2321;
   int[] field2281;
   int[] field2282;
   int[] field2286;
   int[] field2287;
   int[] field2296;
   int[] field2301;
   int[] field2302;
   int[] field2311;
   int[][] field2303;
   int[][] field2304;
   int[][] field2305;
   int[][] field2306;
   short[] field2280;
   short[] field2293;
   short[] field2298;
   short[] field2299;
   short[] field2300;
   public short field2310;
   public short field2322;

   static {
      field2312 = class229.field2511;
      field2279 = class229.field2512;
   }

   class213() {
   }

   class213(byte[] var1) {
      PacketBuffer var2 = new PacketBuffer(10);
      var2.writeShort(-2);
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         this.method4021(var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         this.method3955(var1);
      } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method3956(var1);
      } else {
         this.method3957(var1);
      }

   }

   public class213(class213[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.field2290 = 0;
      this.field2285 = 0;
      this.field2321 = 0;
      this.field2295 = -1;

      int var10;
      class213 var11;
      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            this.field2290 += var11.field2290;
            this.field2285 += var11.field2285;
            this.field2321 += var11.field2321;
            if (var11.field2278 != null) {
               var4 = true;
            } else {
               if (this.field2295 == -1) {
                  this.field2295 = var11.field2295;
               }

               if (this.field2295 != var11.field2295) {
                  var4 = true;
               }
            }

            var3 |= var11.field2316 != null;
            var5 |= var11.field2291 != null;
            var6 |= var11.field2302 != null;
            var7 |= var11.field2280 != null;
            var8 |= var11.field2292 != null;
            var9 |= var11.field2305 != null;
         }
      }

      this.field2282 = new int[this.field2290];
      this.field2311 = new int[this.field2290];
      this.field2281 = new int[this.field2290];
      this.field2301 = new int[this.field2290];
      this.field2286 = new int[this.field2285];
      this.field2287 = new int[this.field2285];
      this.field2296 = new int[this.field2285];
      if (var3) {
         this.field2316 = new byte[this.field2285];
      }

      if (var4) {
         this.field2278 = new byte[this.field2285];
      }

      if (var5) {
         this.field2291 = new byte[this.field2285];
      }

      if (var6) {
         this.field2302 = new int[this.field2285];
      }

      if (var7) {
         this.field2280 = new short[this.field2285];
      }

      if (var8) {
         this.field2292 = new byte[this.field2285];
      }

      if (var9) {
         this.field2305 = new int[this.field2290][];
         this.field2306 = new int[this.field2290][];
      }

      this.field2293 = new short[this.field2285];
      if (this.field2321 > 0) {
         this.field2297 = new byte[this.field2321];
         this.field2298 = new short[this.field2321];
         this.field2299 = new short[this.field2321];
         this.field2300 = new short[this.field2321];
      }

      this.field2290 = 0;
      this.field2285 = 0;
      this.field2321 = 0;

      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            int var12;
            for(var12 = 0; var12 < var11.field2285; ++var12) {
               if (var3 && var11.field2316 != null) {
                  this.field2316[this.field2285] = var11.field2316[var12];
               }

               if (var4) {
                  if (var11.field2278 != null) {
                     this.field2278[this.field2285] = var11.field2278[var12];
                  } else {
                     this.field2278[this.field2285] = var11.field2295;
                  }
               }

               if (var5 && var11.field2291 != null) {
                  this.field2291[this.field2285] = var11.field2291[var12];
               }

               if (var6 && var11.field2302 != null) {
                  this.field2302[this.field2285] = var11.field2302[var12];
               }

               if (var7) {
                  if (var11.field2280 != null) {
                     this.field2280[this.field2285] = var11.field2280[var12];
                  } else {
                     this.field2280[this.field2285] = -1;
                  }
               }

               if (var8) {
                  if (var11.field2292 != null && var11.field2292[var12] != -1) {
                     this.field2292[this.field2285] = (byte)(var11.field2292[var12] + this.field2321);
                  } else {
                     this.field2292[this.field2285] = -1;
                  }
               }

               this.field2293[this.field2285] = var11.field2293[var12];
               this.field2286[this.field2285] = this.method3999(var11, var11.field2286[var12]);
               this.field2287[this.field2285] = this.method3999(var11, var11.field2287[var12]);
               this.field2296[this.field2285] = this.method3999(var11, var11.field2296[var12]);
               ++this.field2285;
            }

            for(var12 = 0; var12 < var11.field2321; ++var12) {
               byte var13 = this.field2297[this.field2321] = var11.field2297[var12];
               if (var13 == 0) {
                  this.field2298[this.field2321] = (short)this.method3999(var11, var11.field2298[var12]);
                  this.field2299[this.field2321] = (short)this.method3999(var11, var11.field2299[var12]);
                  this.field2300[this.field2321] = (short)this.method3999(var11, var11.field2300[var12]);
               }

               ++this.field2321;
            }
         }
      }

   }

   public class213(class213 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field2290 = var1.field2290;
      this.field2285 = var1.field2285;
      this.field2321 = var1.field2321;
      int var6;
      if (var2) {
         this.field2282 = var1.field2282;
         this.field2311 = var1.field2311;
         this.field2281 = var1.field2281;
      } else {
         this.field2282 = new int[this.field2290];
         this.field2311 = new int[this.field2290];
         this.field2281 = new int[this.field2290];

         for(var6 = 0; var6 < this.field2290; ++var6) {
            this.field2282[var6] = var1.field2282[var6];
            this.field2311[var6] = var1.field2311[var6];
            this.field2281[var6] = var1.field2281[var6];
         }
      }

      if (var3) {
         this.field2293 = var1.field2293;
      } else {
         this.field2293 = new short[this.field2285];

         for(var6 = 0; var6 < this.field2285; ++var6) {
            this.field2293[var6] = var1.field2293[var6];
         }
      }

      if (!var4 && var1.field2280 != null) {
         this.field2280 = new short[this.field2285];

         for(var6 = 0; var6 < this.field2285; ++var6) {
            this.field2280[var6] = var1.field2280[var6];
         }
      } else {
         this.field2280 = var1.field2280;
      }

      if (var5) {
         this.field2291 = var1.field2291;
      } else {
         this.field2291 = new byte[this.field2285];
         if (var1.field2291 == null) {
            for(var6 = 0; var6 < this.field2285; ++var6) {
               this.field2291[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.field2285; ++var6) {
               this.field2291[var6] = var1.field2291[var6];
            }
         }
      }

      this.field2286 = var1.field2286;
      this.field2287 = var1.field2287;
      this.field2296 = var1.field2296;
      this.field2316 = var1.field2316;
      this.field2278 = var1.field2278;
      this.field2292 = var1.field2292;
      this.field2295 = var1.field2295;
      this.field2297 = var1.field2297;
      this.field2298 = var1.field2298;
      this.field2299 = var1.field2299;
      this.field2300 = var1.field2300;
      this.field2301 = var1.field2301;
      this.field2302 = var1.field2302;
      this.field2303 = var1.field2303;
      this.field2304 = var1.field2304;
      this.field2308 = var1.field2308;
      this.field2307 = var1.field2307;
      this.field2289 = var1.field2289;
      this.field2305 = var1.field2305;
      this.field2306 = var1.field2306;
      this.field2310 = var1.field2310;
      this.field2322 = var1.field2322;
   }

   public static class213 method3952(class342 var0, int var1, int var2) {
      byte[] var3 = var0.method6381(var1, var2);
      return var3 == null ? null : new class213(var3);
   }

   static void method3975(class213 var0, class213 var1, int var2, int var3, int var4, boolean var5) {
      var0.method3974();
      var0.method3981();
      var1.method3974();
      var1.method3981();
      ++field2320;
      int var6 = 0;
      int[] var7 = var1.field2282;
      int var8 = var1.field2290;

      int var9;
      for(var9 = 0; var9 < var0.field2290; ++var9) {
         class245 var10 = var0.field2308[var9];
         if (var10.field2695 != 0) {
            int var11 = var0.field2311[var9] - var3;
            if (var11 <= var1.field2313) {
               int var12 = var0.field2282[var9] - var2;
               if (var12 >= var1.field2314 && var12 <= var1.field2315) {
                  int var13 = var0.field2281[var9] - var4;
                  if (var13 >= var1.field2284 && var13 <= var1.field2283) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class245 var15 = var1.field2308[var14];
                        if (var12 == var7[var14] && var13 == var1.field2281[var14] && var11 == var1.field2311[var14] && var15.field2695 != 0) {
                           if (var0.field2289 == null) {
                              var0.field2289 = new class245[var0.field2290];
                           }

                           if (var1.field2289 == null) {
                              var1.field2289 = new class245[var8];
                           }

                           class245 var16 = var0.field2289[var9];
                           if (var16 == null) {
                              var16 = var0.field2289[var9] = new class245(var10);
                           }

                           class245 var17 = var1.field2289[var14];
                           if (var17 == null) {
                              var17 = var1.field2289[var14] = new class245(var15);
                           }

                           var16.field2698 += var15.field2698;
                           var16.field2696 += var15.field2696;
                           var16.field2697 += var15.field2697;
                           var16.field2695 += var15.field2695;
                           var17.field2698 += var10.field2698;
                           var17.field2696 += var10.field2696;
                           var17.field2697 += var10.field2697;
                           var17.field2695 += var10.field2695;
                           ++var6;
                           field2288[var9] = field2320;
                           field2319[var14] = field2320;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field2285; ++var9) {
            if (field2288[var0.field2286[var9]] == field2320 && field2288[var0.field2287[var9]] == field2320 && field2288[var0.field2296[var9]] == field2320) {
               if (var0.field2316 == null) {
                  var0.field2316 = new byte[var0.field2285];
               }

               var0.field2316[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field2285; ++var9) {
            if (field2319[var1.field2286[var9]] == field2320 && field2319[var1.field2287[var9]] == field2320 && field2319[var1.field2296[var9]] == field2320) {
               if (var1.field2316 == null) {
                  var1.field2316 = new byte[var1.field2285];
               }

               var1.field2316[var9] = 2;
            }
         }

      }
   }

   static final int method3977(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static final int method3978(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   void method4021(byte[] var1) {
      PacketBuffer var2 = new PacketBuffer(var1);
      PacketBuffer var3 = new PacketBuffer(var1);
      PacketBuffer var4 = new PacketBuffer(var1);
      PacketBuffer var5 = new PacketBuffer(var1);
      PacketBuffer var6 = new PacketBuffer(var1);
      PacketBuffer var7 = new PacketBuffer(var1);
      PacketBuffer var8 = new PacketBuffer(var1);
      var2.offset = var1.length - 26;
      int var9 = var2.readUnsignedShort();
      int var10 = var2.readUnsignedShort();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.readUnsignedByte();
      int var19 = var2.readUnsignedShort();
      int var20 = var2.readUnsignedShort();
      int var21 = var2.readUnsignedShort();
      int var22 = var2.readUnsignedShort();
      int var23 = var2.readUnsignedShort();
      int var24 = var2.readUnsignedShort();
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.field2297 = new byte[var11];
         var2.offset = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.field2297[var28] = var2.readByte();
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.field2290 = var9;
      this.field2285 = var10;
      this.field2321 = var11;
      this.field2282 = new int[var9];
      this.field2311 = new int[var9];
      this.field2281 = new int[var9];
      this.field2286 = new int[var10];
      this.field2287 = new int[var10];
      this.field2296 = new int[var10];
      if (var17 == 1) {
         this.field2301 = new int[var9];
      }

      if (var12 == 1) {
         this.field2316 = new byte[var10];
      }

      if (var13 == 255) {
         this.field2278 = new byte[var10];
      } else {
         this.field2295 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2291 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2302 = new int[var10];
      }

      if (var16 == 1) {
         this.field2280 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field2292 = new byte[var10];
      }

      if (var18 == 1) {
         this.field2305 = new int[var9][];
         this.field2306 = new int[var9][];
      }

      this.field2293 = new short[var10];
      if (var11 > 0) {
         this.field2298 = new short[var11];
         this.field2299 = new short[var11];
         this.field2300 = new short[var11];
      }

      var2.offset = var11;
      var3.offset = var40;
      var4.offset = var41;
      var5.offset = var42;
      var6.offset = var34;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.readUnsignedByte();
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.readSmartByteShort();
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.readSmartByteShort();
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.readSmartByteShort();
         }

         this.field2282[var53] = var50 + var55;
         this.field2311[var53] = var51 + var56;
         this.field2281[var53] = var52 + var57;
         var50 = this.field2282[var53];
         var51 = this.field2311[var53];
         var52 = this.field2281[var53];
         if (var17 == 1) {
            this.field2301[var53] = var6.readUnsignedByte();
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.readUnsignedByte();
            this.field2305[var53] = new int[var54];
            this.field2306[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.field2305[var53][var55] = var6.readUnsignedByte();
               this.field2306[var53][var55] = var6.readUnsignedByte();
            }
         }
      }

      var2.offset = var39;
      var3.offset = var30;
      var4.offset = var32;
      var5.offset = var35;
      var6.offset = var33;
      var7.offset = var37;
      var8.offset = var38;

      for(var53 = 0; var53 < var10; ++var53) {
         this.field2293[var53] = (short)var2.readUnsignedShort();
         if (var12 == 1) {
            this.field2316[var53] = var3.readByte();
         }

         if (var13 == 255) {
            this.field2278[var53] = var4.readByte();
         }

         if (var14 == 1) {
            this.field2291[var53] = var5.readByte();
         }

         if (var15 == 1) {
            this.field2302[var53] = var6.readUnsignedByte();
         }

         if (var16 == 1) {
            this.field2280[var53] = (short)(var7.readUnsignedShort() - 1);
         }

         if (this.field2292 != null && this.field2280[var53] != -1) {
            this.field2292[var53] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.offset = var36;
      var3.offset = var31;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.readUnsignedByte();
         if (var58 == 1) {
            var53 = var2.readSmartByteShort() + var56;
            var54 = var2.readSmartByteShort() + var53;
            var55 = var2.readSmartByteShort() + var54;
            var56 = var55;
            this.field2286[var57] = var53;
            this.field2287[var57] = var54;
            this.field2296[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.readSmartByteShort() + var56;
            var56 = var55;
            this.field2286[var57] = var53;
            this.field2287[var57] = var54;
            this.field2296[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.readSmartByteShort() + var56;
            var56 = var55;
            this.field2286[var57] = var53;
            this.field2287[var57] = var54;
            this.field2296[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.readSmartByteShort() + var56;
            var56 = var55;
            this.field2286[var57] = var53;
            this.field2287[var57] = var59;
            this.field2296[var57] = var55;
         }
      }

      var2.offset = var43;
      var3.offset = var44;
      var4.offset = var45;
      var5.offset = var46;
      var6.offset = var47;
      var7.offset = var48;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.field2297[var57] & 255;
         if (var58 == 0) {
            this.field2298[var57] = (short)var2.readUnsignedShort();
            this.field2299[var57] = (short)var2.readUnsignedShort();
            this.field2300[var57] = (short)var2.readUnsignedShort();
         }
      }

      var2.offset = var28;
      var57 = var2.readUnsignedByte();
      if (var57 != 0) {
         new class235();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readInt();
      }

   }

   void method3955(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      PacketBuffer var4 = new PacketBuffer(var1);
      PacketBuffer var5 = new PacketBuffer(var1);
      PacketBuffer var6 = new PacketBuffer(var1);
      PacketBuffer var7 = new PacketBuffer(var1);
      PacketBuffer var8 = new PacketBuffer(var1);
      var4.offset = var1.length - 23;
      int var9 = var4.readUnsignedShort();
      int var10 = var4.readUnsignedShort();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.readUnsignedByte();
      int var18 = var4.readUnsignedShort();
      int var19 = var4.readUnsignedShort();
      int var20 = var4.readUnsignedShort();
      int var21 = var4.readUnsignedShort();
      int var22 = var4.readUnsignedShort();
      int var23 = 0;
      byte var24 = (byte)var23;
      var23 += var9;
      int var25 = var23;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      int var29 = var23;
      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      int var31 = var23;
      var23 += var21;
      int var32 = var23;
      var23 += var10 * 2;
      int var33 = var23;
      var23 += var11 * 6;
      int var34 = var23;
      var23 += var18;
      int var35 = var23;
      var23 += var19;
      int var10000 = var23 + var20;
      this.field2290 = var9;
      this.field2285 = var10;
      this.field2321 = var11;
      this.field2282 = new int[var9];
      this.field2311 = new int[var9];
      this.field2281 = new int[var9];
      this.field2286 = new int[var10];
      this.field2287 = new int[var10];
      this.field2296 = new int[var10];
      if (var11 > 0) {
         this.field2297 = new byte[var11];
         this.field2298 = new short[var11];
         this.field2299 = new short[var11];
         this.field2300 = new short[var11];
      }

      if (var16 == 1) {
         this.field2301 = new int[var9];
      }

      if (var12 == 1) {
         this.field2316 = new byte[var10];
         this.field2292 = new byte[var10];
         this.field2280 = new short[var10];
      }

      if (var13 == 255) {
         this.field2278 = new byte[var10];
      } else {
         this.field2295 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2291 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2302 = new int[var10];
      }

      if (var17 == 1) {
         this.field2305 = new int[var9][];
         this.field2306 = new int[var9][];
      }

      this.field2293 = new short[var10];
      var4.offset = var24;
      var5.offset = var34;
      var6.offset = var35;
      var7.offset = var23;
      var8.offset = var29;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.readUnsignedByte();
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.readSmartByteShort();
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.readSmartByteShort();
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.readSmartByteShort();
         }

         this.field2282[var40] = var37 + var42;
         this.field2311[var40] = var38 + var43;
         this.field2281[var40] = var39 + var44;
         var37 = this.field2282[var40];
         var38 = this.field2311[var40];
         var39 = this.field2281[var40];
         if (var16 == 1) {
            this.field2301[var40] = var8.readUnsignedByte();
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.readUnsignedByte();
            this.field2305[var40] = new int[var41];
            this.field2306[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.field2305[var40][var42] = var8.readUnsignedByte();
               this.field2306[var40][var42] = var8.readUnsignedByte();
            }
         }
      }

      var4.offset = var32;
      var5.offset = var28;
      var6.offset = var26;
      var7.offset = var30;
      var8.offset = var27;

      for(var40 = 0; var40 < var10; ++var40) {
         this.field2293[var40] = (short)var4.readUnsignedShort();
         if (var12 == 1) {
            var41 = var5.readUnsignedByte();
            if ((var41 & 1) == 1) {
               this.field2316[var40] = 1;
               var2 = true;
            } else {
               this.field2316[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.field2292[var40] = (byte)(var41 >> 2);
               this.field2280[var40] = this.field2293[var40];
               this.field2293[var40] = 127;
               if (this.field2280[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.field2292[var40] = -1;
               this.field2280[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.field2278[var40] = var6.readByte();
         }

         if (var14 == 1) {
            this.field2291[var40] = var7.readByte();
         }

         if (var15 == 1) {
            this.field2302[var40] = var8.readUnsignedByte();
         }
      }

      var4.offset = var31;
      var5.offset = var25;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.readUnsignedByte();
         if (var45 == 1) {
            var40 = var4.readSmartByteShort() + var43;
            var41 = var4.readSmartByteShort() + var40;
            var42 = var4.readSmartByteShort() + var41;
            var43 = var42;
            this.field2286[var44] = var40;
            this.field2287[var44] = var41;
            this.field2296[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.readSmartByteShort() + var43;
            var43 = var42;
            this.field2286[var44] = var40;
            this.field2287[var44] = var41;
            this.field2296[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.readSmartByteShort() + var43;
            var43 = var42;
            this.field2286[var44] = var40;
            this.field2287[var44] = var41;
            this.field2296[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.readSmartByteShort() + var43;
            var43 = var42;
            this.field2286[var44] = var40;
            this.field2287[var44] = var46;
            this.field2296[var44] = var42;
         }
      }

      var4.offset = var33;

      for(var44 = 0; var44 < var11; ++var44) {
         this.field2297[var44] = 0;
         this.field2298[var44] = (short)var4.readUnsignedShort();
         this.field2299[var44] = (short)var4.readUnsignedShort();
         this.field2300[var44] = (short)var4.readUnsignedShort();
      }

      if (this.field2292 != null) {
         boolean var47 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.field2292[var45] & 255;
            if (var46 != 255) {
               if ((this.field2298[var46] & '\uffff') == this.field2286[var45] && (this.field2299[var46] & '\uffff') == this.field2287[var45] && (this.field2300[var46] & '\uffff') == this.field2296[var45]) {
                  this.field2292[var45] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if (!var47) {
            this.field2292 = null;
         }
      }

      if (!var3) {
         this.field2280 = null;
      }

      if (!var2) {
         this.field2316 = null;
      }

   }

   void method3956(byte[] var1) {
      PacketBuffer var2 = new PacketBuffer(var1);
      PacketBuffer var3 = new PacketBuffer(var1);
      PacketBuffer var4 = new PacketBuffer(var1);
      PacketBuffer var5 = new PacketBuffer(var1);
      PacketBuffer var6 = new PacketBuffer(var1);
      PacketBuffer var7 = new PacketBuffer(var1);
      PacketBuffer var8 = new PacketBuffer(var1);
      var2.offset = var1.length - 23;
      int var9 = var2.readUnsignedShort();
      int var10 = var2.readUnsignedShort();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.readUnsignedShort();
      int var19 = var2.readUnsignedShort();
      int var20 = var2.readUnsignedShort();
      int var21 = var2.readUnsignedShort();
      int var22 = var2.readUnsignedShort();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.field2297 = new byte[var11];
         var2.offset = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field2297[var26] = var2.readByte();
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field2290 = var9;
      this.field2285 = var10;
      this.field2321 = var11;
      this.field2282 = new int[var9];
      this.field2311 = new int[var9];
      this.field2281 = new int[var9];
      this.field2286 = new int[var10];
      this.field2287 = new int[var10];
      this.field2296 = new int[var10];
      if (var17 == 1) {
         this.field2301 = new int[var9];
      }

      if (var12 == 1) {
         this.field2316 = new byte[var10];
      }

      if (var13 == 255) {
         this.field2278 = new byte[var10];
      } else {
         this.field2295 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2291 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2302 = new int[var10];
      }

      if (var16 == 1) {
         this.field2280 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field2292 = new byte[var10];
      }

      this.field2293 = new short[var10];
      if (var11 > 0) {
         this.field2298 = new short[var11];
         this.field2299 = new short[var11];
         this.field2300 = new short[var11];
      }

      var2.offset = var11;
      var3.offset = var38;
      var4.offset = var39;
      var5.offset = var40;
      var6.offset = var32;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.readUnsignedByte();
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.readSmartByteShort();
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.readSmartByteShort();
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.readSmartByteShort();
         }

         this.field2282[var51] = var48 + var53;
         this.field2311[var51] = var49 + var54;
         this.field2281[var51] = var50 + var55;
         var48 = this.field2282[var51];
         var49 = this.field2311[var51];
         var50 = this.field2281[var51];
         if (var17 == 1) {
            this.field2301[var51] = var6.readUnsignedByte();
         }
      }

      var2.offset = var37;
      var3.offset = var28;
      var4.offset = var30;
      var5.offset = var33;
      var6.offset = var31;
      var7.offset = var35;
      var8.offset = var36;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field2293[var51] = (short)var2.readUnsignedShort();
         if (var12 == 1) {
            this.field2316[var51] = var3.readByte();
         }

         if (var13 == 255) {
            this.field2278[var51] = var4.readByte();
         }

         if (var14 == 1) {
            this.field2291[var51] = var5.readByte();
         }

         if (var15 == 1) {
            this.field2302[var51] = var6.readUnsignedByte();
         }

         if (var16 == 1) {
            this.field2280[var51] = (short)(var7.readUnsignedShort() - 1);
         }

         if (this.field2292 != null && this.field2280[var51] != -1) {
            this.field2292[var51] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.offset = var34;
      var3.offset = var29;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.readUnsignedByte();
         if (var56 == 1) {
            var51 = var2.readSmartByteShort() + var54;
            var52 = var2.readSmartByteShort() + var51;
            var53 = var2.readSmartByteShort() + var52;
            var54 = var53;
            this.field2286[var55] = var51;
            this.field2287[var55] = var52;
            this.field2296[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.readSmartByteShort() + var54;
            var54 = var53;
            this.field2286[var55] = var51;
            this.field2287[var55] = var52;
            this.field2296[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.readSmartByteShort() + var54;
            var54 = var53;
            this.field2286[var55] = var51;
            this.field2287[var55] = var52;
            this.field2296[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.readSmartByteShort() + var54;
            var54 = var53;
            this.field2286[var55] = var51;
            this.field2287[var55] = var57;
            this.field2296[var55] = var53;
         }
      }

      var2.offset = var41;
      var3.offset = var42;
      var4.offset = var43;
      var5.offset = var44;
      var6.offset = var45;
      var7.offset = var46;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field2297[var55] & 255;
         if (var56 == 0) {
            this.field2298[var55] = (short)var2.readUnsignedShort();
            this.field2299[var55] = (short)var2.readUnsignedShort();
            this.field2300[var55] = (short)var2.readUnsignedShort();
         }
      }

      var2.offset = var26;
      var55 = var2.readUnsignedByte();
      if (var55 != 0) {
         new class235();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readInt();
      }

   }

   void method3957(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      PacketBuffer var4 = new PacketBuffer(var1);
      PacketBuffer var5 = new PacketBuffer(var1);
      PacketBuffer var6 = new PacketBuffer(var1);
      PacketBuffer var7 = new PacketBuffer(var1);
      PacketBuffer var8 = new PacketBuffer(var1);
      var4.offset = var1.length - 18;
      int var9 = var4.readUnsignedShort();
      int var10 = var4.readUnsignedShort();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.readUnsignedShort();
      int var18 = var4.readUnsignedShort();
      int var19 = var4.readUnsignedShort();
      int var20 = var4.readUnsignedShort();
      int var21 = 0;
      byte var22 = (byte)var21;
      var21 += var9;
      int var23 = var21;
      var21 += var10;
      int var24 = var21;
      if (var13 == 255) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      int var29 = var21;
      var21 += var20;
      int var30 = var21;
      var21 += var10 * 2;
      int var31 = var21;
      var21 += var11 * 6;
      int var32 = var21;
      var21 += var17;
      int var33 = var21;
      var21 += var18;
      int var10000 = var21 + var19;
      this.field2290 = var9;
      this.field2285 = var10;
      this.field2321 = var11;
      this.field2282 = new int[var9];
      this.field2311 = new int[var9];
      this.field2281 = new int[var9];
      this.field2286 = new int[var10];
      this.field2287 = new int[var10];
      this.field2296 = new int[var10];
      if (var11 > 0) {
         this.field2297 = new byte[var11];
         this.field2298 = new short[var11];
         this.field2299 = new short[var11];
         this.field2300 = new short[var11];
      }

      if (var16 == 1) {
         this.field2301 = new int[var9];
      }

      if (var12 == 1) {
         this.field2316 = new byte[var10];
         this.field2292 = new byte[var10];
         this.field2280 = new short[var10];
      }

      if (var13 == 255) {
         this.field2278 = new byte[var10];
      } else {
         this.field2295 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2291 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2302 = new int[var10];
      }

      this.field2293 = new short[var10];
      var4.offset = var22;
      var5.offset = var32;
      var6.offset = var33;
      var7.offset = var21;
      var8.offset = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.readUnsignedByte();
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.readSmartByteShort();
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.readSmartByteShort();
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.readSmartByteShort();
         }

         this.field2282[var38] = var35 + var40;
         this.field2311[var38] = var36 + var41;
         this.field2281[var38] = var37 + var42;
         var35 = this.field2282[var38];
         var36 = this.field2311[var38];
         var37 = this.field2281[var38];
         if (var16 == 1) {
            this.field2301[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var30;
      var5.offset = var26;
      var6.offset = var24;
      var7.offset = var28;
      var8.offset = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field2293[var38] = (short)var4.readUnsignedShort();
         if (var12 == 1) {
            var39 = var5.readUnsignedByte();
            if ((var39 & 1) == 1) {
               this.field2316[var38] = 1;
               var2 = true;
            } else {
               this.field2316[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.field2292[var38] = (byte)(var39 >> 2);
               this.field2280[var38] = this.field2293[var38];
               this.field2293[var38] = 127;
               if (this.field2280[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field2292[var38] = -1;
               this.field2280[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.field2278[var38] = var6.readByte();
         }

         if (var14 == 1) {
            this.field2291[var38] = var7.readByte();
         }

         if (var15 == 1) {
            this.field2302[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var29;
      var5.offset = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.readUnsignedByte();
         if (var43 == 1) {
            var38 = var4.readSmartByteShort() + var41;
            var39 = var4.readSmartByteShort() + var38;
            var40 = var4.readSmartByteShort() + var39;
            var41 = var40;
            this.field2286[var42] = var38;
            this.field2287[var42] = var39;
            this.field2296[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.readSmartByteShort() + var41;
            var41 = var40;
            this.field2286[var42] = var38;
            this.field2287[var42] = var39;
            this.field2296[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.readSmartByteShort() + var41;
            var41 = var40;
            this.field2286[var42] = var38;
            this.field2287[var42] = var39;
            this.field2296[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.readSmartByteShort() + var41;
            var41 = var40;
            this.field2286[var42] = var38;
            this.field2287[var42] = var44;
            this.field2296[var42] = var40;
         }
      }

      var4.offset = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field2297[var42] = 0;
         this.field2298[var42] = (short)var4.readUnsignedShort();
         this.field2299[var42] = (short)var4.readUnsignedShort();
         this.field2300[var42] = (short)var4.readUnsignedShort();
      }

      if (this.field2292 != null) {
         boolean var45 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field2292[var43] & 255;
            if (var44 != 255) {
               if ((this.field2298[var44] & '\uffff') == this.field2286[var43] && (this.field2299[var44] & '\uffff') == this.field2287[var43] && (this.field2300[var44] & '\uffff') == this.field2296[var43]) {
                  this.field2292[var43] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if (!var45) {
            this.field2292 = null;
         }
      }

      if (!var3) {
         this.field2280 = null;
      }

      if (!var2) {
         this.field2316 = null;
      }

   }

   final int method3999(class213 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field2282[var2];
      int var5 = var1.field2311[var2];
      int var6 = var1.field2281[var2];

      for(int var7 = 0; var7 < this.field2290; ++var7) {
         if (var4 == this.field2282[var7] && var5 == this.field2311[var7] && var6 == this.field2281[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field2282[this.field2290] = var4;
         this.field2311[this.field2290] = var5;
         this.field2281[this.field2290] = var6;
         if (var1.field2301 != null) {
            this.field2301[this.field2290] = var1.field2301[var2];
         }

         if (var1.field2305 != null) {
            this.field2305[this.field2290] = var1.field2305[var2];
            this.field2306[this.field2290] = var1.field2306[var2];
         }

         var3 = this.field2290++;
      }

      return var3;
   }

   public class213 method3960() {
      class213 var1 = new class213();
      if (this.field2316 != null) {
         var1.field2316 = new byte[this.field2285];

         for(int var2 = 0; var2 < this.field2285; ++var2) {
            var1.field2316[var2] = this.field2316[var2];
         }
      }

      var1.field2290 = this.field2290;
      var1.field2285 = this.field2285;
      var1.field2321 = this.field2321;
      var1.field2282 = this.field2282;
      var1.field2311 = this.field2311;
      var1.field2281 = this.field2281;
      var1.field2286 = this.field2286;
      var1.field2287 = this.field2287;
      var1.field2296 = this.field2296;
      var1.field2278 = this.field2278;
      var1.field2291 = this.field2291;
      var1.field2292 = this.field2292;
      var1.field2293 = this.field2293;
      var1.field2280 = this.field2280;
      var1.field2295 = this.field2295;
      var1.field2297 = this.field2297;
      var1.field2298 = this.field2298;
      var1.field2299 = this.field2299;
      var1.field2300 = this.field2300;
      var1.field2301 = this.field2301;
      var1.field2302 = this.field2302;
      var1.field2303 = this.field2303;
      var1.field2304 = this.field2304;
      var1.field2308 = this.field2308;
      var1.field2307 = this.field2307;
      var1.field2310 = this.field2310;
      var1.field2322 = this.field2322;
      return var1;
   }

   public class213 method4023(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3974();
      int var7 = var2 + this.field2314;
      int var8 = var2 + this.field2315;
      int var9 = var4 + this.field2284;
      int var10 = var4 + this.field2283;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class213 var11;
            if (var5) {
               var11 = new class213();
               var11.field2290 = this.field2290;
               var11.field2285 = this.field2285;
               var11.field2321 = this.field2321;
               var11.field2282 = this.field2282;
               var11.field2281 = this.field2281;
               var11.field2286 = this.field2286;
               var11.field2287 = this.field2287;
               var11.field2296 = this.field2296;
               var11.field2316 = this.field2316;
               var11.field2278 = this.field2278;
               var11.field2291 = this.field2291;
               var11.field2292 = this.field2292;
               var11.field2293 = this.field2293;
               var11.field2280 = this.field2280;
               var11.field2295 = this.field2295;
               var11.field2297 = this.field2297;
               var11.field2298 = this.field2298;
               var11.field2299 = this.field2299;
               var11.field2300 = this.field2300;
               var11.field2301 = this.field2301;
               var11.field2302 = this.field2302;
               var11.field2303 = this.field2303;
               var11.field2304 = this.field2304;
               var11.field2310 = this.field2310;
               var11.field2322 = this.field2322;
               var11.field2311 = new int[var11.field2290];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field2290; ++var12) {
                  var13 = this.field2282[var12] + var2;
                  var14 = this.field2281[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2311[var12] = this.field2311[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field2290; ++var12) {
                  var13 = (-this.field2311[var12] << 16) / super.field2507;
                  if (var13 < var6) {
                     var14 = this.field2282[var12] + var2;
                     var15 = this.field2281[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field2311[var12] = this.field2311[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method3973();
            return var11;
         }
      } else {
         return this;
      }
   }

   void method3962() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.field2301 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2290; ++var3) {
            var4 = this.field2301[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2303 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2303[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2290; this.field2303[var4][var1[var4]++] = var3++) {
            var4 = this.field2301[var3];
         }

         this.field2301 = null;
      }

      if (this.field2302 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2285; ++var3) {
            var4 = this.field2302[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2304 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2304[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2285; this.field2304[var4][var1[var4]++] = var3++) {
            var4 = this.field2302[var3];
         }

         this.field2302 = null;
      }

   }

   public void method3963() {
      for(int var1 = 0; var1 < this.field2290; ++var1) {
         int var2 = this.field2282[var1];
         this.field2282[var1] = this.field2281[var1];
         this.field2281[var1] = -var2;
      }

      this.method3973();
   }

   public void method3964() {
      for(int var1 = 0; var1 < this.field2290; ++var1) {
         this.field2282[var1] = -this.field2282[var1];
         this.field2281[var1] = -this.field2281[var1];
      }

      this.method3973();
   }

   public void method3965() {
      for(int var1 = 0; var1 < this.field2290; ++var1) {
         int var2 = this.field2281[var1];
         this.field2281[var1] = this.field2282[var1];
         this.field2282[var1] = -var2;
      }

      this.method3973();
   }

   public void method3966(int var1) {
      int var2 = field2312[var1];
      int var3 = field2279[var1];

      for(int var4 = 0; var4 < this.field2290; ++var4) {
         int var5 = this.field2281[var4] * var2 + this.field2282[var4] * var3 >> 16;
         this.field2281[var4] = this.field2281[var4] * var3 - this.field2282[var4] * var2 >> 16;
         this.field2282[var4] = var5;
      }

      this.method3973();
   }

   public void method4004(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2290; ++var4) {
         int[] var10000 = this.field2282;
         var10000[var4] += var1;
         var10000 = this.field2311;
         var10000[var4] += var2;
         var10000 = this.field2281;
         var10000[var4] += var3;
      }

      this.method3973();
   }

   public void method3968(short var1, short var2) {
      for(int var3 = 0; var3 < this.field2285; ++var3) {
         if (this.field2293[var3] == var1) {
            this.field2293[var3] = var2;
         }
      }

   }

   public void method3969(short var1, short var2) {
      if (this.field2280 != null) {
         for(int var3 = 0; var3 < this.field2285; ++var3) {
            if (this.field2280[var3] == var1) {
               this.field2280[var3] = var2;
            }
         }

      }
   }

   public void method3983() {
      int var1;
      for(var1 = 0; var1 < this.field2290; ++var1) {
         this.field2281[var1] = -this.field2281[var1];
      }

      for(var1 = 0; var1 < this.field2285; ++var1) {
         int var2 = this.field2286[var1];
         this.field2286[var1] = this.field2296[var1];
         this.field2296[var1] = var2;
      }

      this.method3973();
   }

   public void method3971(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2290; ++var4) {
         this.field2282[var4] = this.field2282[var4] * var1 / 128;
         this.field2311[var4] = this.field2311[var4] * var2 / 128;
         this.field2281[var4] = this.field2281[var4] * var3 / 128;
      }

      this.method3973();
   }

   public void method3981() {
      if (this.field2308 == null) {
         this.field2308 = new class245[this.field2290];

         int var1;
         for(var1 = 0; var1 < this.field2290; ++var1) {
            this.field2308[var1] = new class245();
         }

         for(var1 = 0; var1 < this.field2285; ++var1) {
            int var2 = this.field2286[var1];
            int var3 = this.field2287[var1];
            int var4 = this.field2296[var1];
            int var5 = this.field2282[var3] - this.field2282[var2];
            int var6 = this.field2311[var3] - this.field2311[var2];
            int var7 = this.field2281[var3] - this.field2281[var2];
            int var8 = this.field2282[var4] - this.field2282[var2];
            int var9 = this.field2311[var4] - this.field2311[var2];
            int var10 = this.field2281[var4] - this.field2281[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.field2316 == null) {
               var15 = 0;
            } else {
               var15 = this.field2316[var1];
            }

            if (var15 == 0) {
               class245 var16 = this.field2308[var2];
               var16.field2698 += var11;
               var16.field2696 += var12;
               var16.field2697 += var13;
               ++var16.field2695;
               var16 = this.field2308[var3];
               var16.field2698 += var11;
               var16.field2696 += var12;
               var16.field2697 += var13;
               ++var16.field2695;
               var16 = this.field2308[var4];
               var16.field2698 += var11;
               var16.field2696 += var12;
               var16.field2697 += var13;
               ++var16.field2695;
            } else if (var15 == 1) {
               if (this.field2307 == null) {
                  this.field2307 = new class238[this.field2285];
               }

               class238 var17 = this.field2307[var1] = new class238();
               var17.field2642 = var11;
               var17.field2641 = var12;
               var17.field2644 = var13;
            }
         }

      }
   }

   void method3973() {
      this.field2308 = null;
      this.field2289 = null;
      this.field2307 = null;
      this.field2309 = false;
   }

   void method3974() {
      if (!this.field2309) {
         super.field2507 = 0;
         this.field2313 = 0;
         this.field2314 = 999999;
         this.field2315 = -999999;
         this.field2283 = -99999;
         this.field2284 = 99999;

         for(int var1 = 0; var1 < this.field2290; ++var1) {
            int var2 = this.field2282[var1];
            int var3 = this.field2311[var1];
            int var4 = this.field2281[var1];
            if (var2 < this.field2314) {
               this.field2314 = var2;
            }

            if (var2 > this.field2315) {
               this.field2315 = var2;
            }

            if (var4 < this.field2284) {
               this.field2284 = var4;
            }

            if (var4 > this.field2283) {
               this.field2283 = var4;
            }

            if (-var3 > super.field2507) {
               super.field2507 = -var3;
            }

            if (var3 > this.field2313) {
               this.field2313 = var3;
            }
         }

         this.field2309 = true;
      }
   }

   public final class249 method3976(int var1, int var2, int var3, int var4, int var5) {
      this.method3981();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      class249 var8 = new class249();
      var8.field2743 = new int[this.field2285];
      var8.field2760 = new int[this.field2285];
      var8.field2735 = new int[this.field2285];
      if (this.field2321 > 0 && this.field2292 != null) {
         int[] var9 = new int[this.field2321];

         int var10;
         for(var10 = 0; var10 < this.field2285; ++var10) {
            if (this.field2292[var10] != -1) {
               ++var9[this.field2292[var10] & 255];
            }
         }

         var8.field2741 = 0;

         for(var10 = 0; var10 < this.field2321; ++var10) {
            if (var9[var10] > 0 && this.field2297[var10] == 0) {
               ++var8.field2741;
            }
         }

         var8.field2742 = new int[var8.field2741];
         var8.field2791 = new int[var8.field2741];
         var8.field2744 = new int[var8.field2741];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field2321; ++var11) {
            if (var9[var11] > 0 && this.field2297[var11] == 0) {
               var8.field2742[var10] = this.field2298[var11] & '\uffff';
               var8.field2791[var10] = this.field2299[var11] & '\uffff';
               var8.field2744[var10] = this.field2300[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field2738 = new byte[this.field2285];

         for(var11 = 0; var11 < this.field2285; ++var11) {
            if (this.field2292[var11] != -1) {
               var8.field2738[var11] = (byte)var9[this.field2292[var11] & 255];
            } else {
               var8.field2738[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field2285; ++var16) {
         byte var17;
         if (this.field2316 == null) {
            var17 = 0;
         } else {
            var17 = this.field2316[var16];
         }

         byte var18;
         if (this.field2291 == null) {
            var18 = 0;
         } else {
            var18 = this.field2291[var16];
         }

         short var12;
         if (this.field2280 == null) {
            var12 = -1;
         } else {
            var12 = this.field2280[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         class245 var13;
         int var14;
         class238 var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.field2307[var16];
                  var14 = var1 + (var3 * var19.field2642 + var4 * var19.field2641 + var5 * var19.field2644) / (var7 + var7 / 2);
                  var8.field2743[var16] = method3977(this.field2293[var16] & '\uffff', var14);
                  var8.field2735[var16] = -1;
               } else if (var17 == 3) {
                  var8.field2743[var16] = 128;
                  var8.field2735[var16] = -1;
               } else {
                  var8.field2735[var16] = -2;
               }
            } else {
               int var15 = this.field2293[var16] & '\uffff';
               if (this.field2289 != null && this.field2289[this.field2286[var16]] != null) {
                  var13 = this.field2289[this.field2286[var16]];
               } else {
                  var13 = this.field2308[this.field2286[var16]];
               }

               var14 = var1 + (var3 * var13.field2698 + var4 * var13.field2696 + var5 * var13.field2697) / (var7 * var13.field2695);
               var8.field2743[var16] = method3977(var15, var14);
               if (this.field2289 != null && this.field2289[this.field2287[var16]] != null) {
                  var13 = this.field2289[this.field2287[var16]];
               } else {
                  var13 = this.field2308[this.field2287[var16]];
               }

               var14 = var1 + (var3 * var13.field2698 + var4 * var13.field2696 + var5 * var13.field2697) / (var7 * var13.field2695);
               var8.field2760[var16] = method3977(var15, var14);
               if (this.field2289 != null && this.field2289[this.field2296[var16]] != null) {
                  var13 = this.field2289[this.field2296[var16]];
               } else {
                  var13 = this.field2308[this.field2296[var16]];
               }

               var14 = var1 + (var3 * var13.field2698 + var4 * var13.field2696 + var5 * var13.field2697) / (var7 * var13.field2695);
               var8.field2735[var16] = method3977(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.field2307[var16];
               var14 = var1 + (var3 * var19.field2642 + var4 * var19.field2641 + var5 * var19.field2644) / (var7 + var7 / 2);
               var8.field2743[var16] = method3978(var14);
               var8.field2735[var16] = -1;
            } else {
               var8.field2735[var16] = -2;
            }
         } else {
            if (this.field2289 != null && this.field2289[this.field2286[var16]] != null) {
               var13 = this.field2289[this.field2286[var16]];
            } else {
               var13 = this.field2308[this.field2286[var16]];
            }

            var14 = var1 + (var3 * var13.field2698 + var4 * var13.field2696 + var5 * var13.field2697) / (var7 * var13.field2695);
            var8.field2743[var16] = method3978(var14);
            if (this.field2289 != null && this.field2289[this.field2287[var16]] != null) {
               var13 = this.field2289[this.field2287[var16]];
            } else {
               var13 = this.field2308[this.field2287[var16]];
            }

            var14 = var1 + (var3 * var13.field2698 + var4 * var13.field2696 + var5 * var13.field2697) / (var7 * var13.field2695);
            var8.field2760[var16] = method3978(var14);
            if (this.field2289 != null && this.field2289[this.field2296[var16]] != null) {
               var13 = this.field2289[this.field2296[var16]];
            } else {
               var13 = this.field2308[this.field2296[var16]];
            }

            var14 = var1 + (var3 * var13.field2698 + var4 * var13.field2696 + var5 * var13.field2697) / (var7 * var13.field2695);
            var8.field2735[var16] = method3978(var14);
         }
      }

      this.method3962();
      var8.field2795 = this.field2290;
      var8.field2733 = this.field2282;
      var8.field2727 = this.field2311;
      var8.field2723 = this.field2281;
      var8.field2750 = this.field2285;
      var8.field2718 = this.field2286;
      var8.field2731 = this.field2287;
      var8.field2732 = this.field2296;
      var8.field2736 = this.field2278;
      var8.field2737 = this.field2291;
      var8.field2729 = this.field2295;
      var8.field2745 = this.field2303;
      var8.field2746 = this.field2304;
      var8.field2739 = this.field2280;
      var8.field2794 = this.field2305;
      var8.field2790 = this.field2306;
      return var8;
   }
}
