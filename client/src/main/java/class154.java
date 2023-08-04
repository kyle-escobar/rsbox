public class class154 {
   static int field1419;
   boolean field1402;
   boolean field1414;
   class469 field1396;
   int field1398 = 0;
   int field1400 = 0;
   int[] field1409;
   int[] field1410;
   long field1395;
   long[] field1407;
   long[] field1420;
   public boolean field1401;
   public boolean[] field1412;
   public byte field1397;
   public byte field1403;
   public byte field1404;
   public byte field1405;
   public byte[] field1408;
   public int field1406;
   public int field1413 = -1;
   public int field1415;
   public int field1416 = -1;
   public int[] field1411;
   public String field1399 = null;
   public String[] field1417;
   public String[] field1418;

   public class154(Buffer var1) {
      this.method2603(var1);
   }

   void method2585(int var1) {
      if (this.field1402) {
         if (this.field1407 != null) {
            System.arraycopy(this.field1407, 0, this.field1407 = new long[var1], 0, this.field1406);
         } else {
            this.field1407 = new long[var1];
         }
      }

      if (this.field1414) {
         if (null != this.field1417) {
            System.arraycopy(this.field1417, 0, this.field1417 = new String[var1], 0, this.field1406);
         } else {
            this.field1417 = new String[var1];
         }
      }

      if (null != this.field1408) {
         System.arraycopy(this.field1408, 0, this.field1408 = new byte[var1], 0, this.field1406);
      } else {
         this.field1408 = new byte[var1];
      }

      if (null != this.field1410) {
         System.arraycopy(this.field1410, 0, this.field1410 = new int[var1], 0, this.field1406);
      } else {
         this.field1410 = new int[var1];
      }

      if (this.field1411 != null) {
         System.arraycopy(this.field1411, 0, this.field1411 = new int[var1], 0, this.field1406);
      } else {
         this.field1411 = new int[var1];
      }

      if (null != this.field1412) {
         System.arraycopy(this.field1412, 0, this.field1412 = new boolean[var1], 0, this.field1406);
      } else {
         this.field1412 = new boolean[var1];
      }

   }

   void method2586(int var1) {
      if (this.field1402) {
         if (this.field1420 != null) {
            System.arraycopy(this.field1420, 0, this.field1420 = new long[var1], 0, this.field1415);
         } else {
            this.field1420 = new long[var1];
         }
      }

      if (this.field1414) {
         if (null != this.field1418) {
            System.arraycopy(this.field1418, 0, this.field1418 = new String[var1], 0, this.field1415);
         } else {
            this.field1418 = new String[var1];
         }
      }

   }

   public int method2601(String var1) {
      if (null != var1 && var1.length() != 0) {
         for(int var3 = 0; var3 < this.field1406; ++var3) {
            if (this.field1417[var3].equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int method2630(int var1, int var2, int var3) {
      int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
      return (this.field1410[var1] & var5) >>> var2;
   }

   public Integer method2589(int var1) {
      if (this.field1396 == null) {
         return null;
      } else {
         class470 var3 = this.field1396.method8096((long)var1);
         return var3 != null && var3 instanceof class492 ? new Integer(((class492)var3).field4960) : null;
      }
   }

   public int[] method2590() {
      if (null == this.field1409) {
         String[] var2 = new String[this.field1406];
         this.field1409 = new int[this.field1406];

         for(int var3 = 0; var3 < this.field1406; this.field1409[var3] = var3++) {
            var2[var3] = this.field1417[var3];
            if (var2[var3] != null) {
               var2[var3] = var2[var3].toLowerCase();
            }
         }

         int[] var4 = this.field1409;
         class502.method2094(var2, var4, 0, var2.length - 1);
      }

      return this.field1409;
   }

   void method2593(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (this.field1402 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (null != var3 != this.field1414) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.field1407 || this.field1406 >= this.field1407.length) || var3 != null && (null == this.field1417 || this.field1406 >= this.field1417.length)) {
            this.method2585(5 + this.field1406);
         }

         if (null != this.field1407) {
            this.field1407[this.field1406] = var1;
         }

         if (this.field1417 != null) {
            this.field1417[this.field1406] = var3;
         }

         if (this.field1413 == -1) {
            this.field1413 = this.field1406;
            this.field1408[this.field1406] = 126;
         } else {
            this.field1408[this.field1406] = 0;
         }

         this.field1410[this.field1406] = 0;
         this.field1411[this.field1406] = var4;
         this.field1412[this.field1406] = false;
         ++this.field1406;
         this.field1409 = null;
      }
   }

   void method2637(int var1) {
      if (var1 >= 0 && var1 < this.field1406) {
         --this.field1406;
         this.field1409 = null;
         if (0 == this.field1406) {
            this.field1407 = null;
            this.field1417 = null;
            this.field1408 = null;
            this.field1410 = null;
            this.field1411 = null;
            this.field1412 = null;
            this.field1413 = -1;
            this.field1416 = -1;
         } else {
            System.arraycopy(this.field1408, var1 + 1, this.field1408, var1, this.field1406 - var1);
            System.arraycopy(this.field1410, var1 + 1, this.field1410, var1, this.field1406 - var1);
            System.arraycopy(this.field1411, var1 + 1, this.field1411, var1, this.field1406 - var1);
            System.arraycopy(this.field1412, var1 + 1, this.field1412, var1, this.field1406 - var1);
            if (null != this.field1407) {
               System.arraycopy(this.field1407, var1 + 1, this.field1407, var1, this.field1406 - var1);
            }

            if (null != this.field1417) {
               System.arraycopy(this.field1417, var1 + 1, this.field1417, var1, this.field1406 - var1);
            }

            this.method2629();
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method2629() {
      if (this.field1406 == 0) {
         this.field1413 = -1;
         this.field1416 = -1;
      } else {
         this.field1413 = -1;
         this.field1416 = -1;
         int var2 = 0;
         byte var3 = this.field1408[0];

         for(int var4 = 1; var4 < this.field1406; ++var4) {
            if (this.field1408[var4] > var3) {
               if (var3 == 125) {
                  this.field1416 = var2;
               }

               var2 = var4;
               var3 = this.field1408[var4];
            } else if (-1 == this.field1416 && this.field1408[var4] == 125) {
               this.field1416 = var4;
            }
         }

         this.field1413 = var2;
         if (this.field1413 != -1) {
            this.field1408[this.field1413] = 126;
         }

      }
   }

   void method2594(long var1, String var3) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (this.field1402 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.field1414 != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.field1420 || this.field1415 >= this.field1420.length) || null != var3 && (this.field1418 == null || this.field1415 >= this.field1418.length)) {
            this.method2586(5 + this.field1415);
         }

         if (this.field1420 != null) {
            this.field1420[this.field1415] = var1;
         }

         if (null != this.field1418) {
            this.field1418[this.field1415] = var3;
         }

         ++this.field1415;
      }
   }

   void method2595(int var1) {
      --this.field1415;
      if (0 == this.field1415) {
         this.field1420 = null;
         this.field1418 = null;
      } else {
         if (null != this.field1420) {
            System.arraycopy(this.field1420, var1 + 1, this.field1420, var1, this.field1415 - var1);
         }

         if (null != this.field1418) {
            System.arraycopy(this.field1418, var1 + 1, this.field1418, var1, this.field1415 - var1);
         }
      }

   }

   int method2596(int var1, byte var2) {
      if (var2 != 126 && var2 != 127) {
         if (var1 != this.field1413 || -1 != this.field1416 && this.field1408[this.field1416] >= 125) {
            if (var2 == this.field1408[var1]) {
               return -1;
            } else {
               this.field1408[var1] = var2;
               this.method2629();
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   boolean method2592(int var1) {
      if (this.field1413 != var1 && this.field1408[var1] != 126) {
         this.field1408[this.field1413] = 125;
         this.field1416 = this.field1413;
         this.field1408[var1] = 126;
         this.field1413 = var1;
         return true;
      } else {
         return false;
      }
   }

   int method2619(int var1, boolean var2) {
      if (var2 == this.field1412[var1]) {
         return -1;
      } else {
         this.field1412[var1] = var2;
         return var1;
      }
   }

   int method2599(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      int var9 = this.field1410[var1];
      if (var2 == (var9 & var8)) {
         return -1;
      } else {
         var9 &= ~var8;
         this.field1410[var1] = var9 | var2;
         return var1;
      }
   }

   boolean method2600(int var1, int var2) {
      if (null != this.field1396) {
         class470 var4 = this.field1396.method8096((long)var1);
         if (var4 != null) {
            if (var4 instanceof class492) {
               class492 var5 = (class492)var4;
               if (var2 == var5.field4960) {
                  return false;
               }

               var5.field4960 = var2;
               return true;
            }

            var4.method8116();
         }
      } else {
         this.field1396 = new class469(4);
      }

      this.field1396.method8097(new class492(var2), (long)var1);
      return true;
   }

   boolean method2597(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      if (null != this.field1396) {
         class470 var9 = this.field1396.method8096((long)var1);
         if (var9 != null) {
            if (var9 instanceof class492) {
               class492 var10 = (class492)var9;
               if (var2 == (var10.field4960 & var8)) {
                  return false;
               }

               var10.field4960 &= ~var8;
               var10.field4960 |= var2;
               return true;
            }

            var9.method8116();
         }
      } else {
         this.field1396 = new class469(4);
      }

      this.field1396.method8097(new class492(var2), (long)var1);
      return true;
   }

   boolean method2602(int var1, long var2) {
      if (this.field1396 != null) {
         class470 var4 = this.field1396.method8096((long)var1);
         if (var4 != null) {
            if (var4 instanceof class490) {
               class490 var5 = (class490)var4;
               if (var5.field4955 == var2) {
                  return false;
               }

               var5.field4955 = var2;
               return true;
            }

            var4.method8116();
         }
      } else {
         this.field1396 = new class469(4);
      }

      this.field1396.method8097(new class490(var2), (long)var1);
      return true;
   }

   boolean method2648(int var1, String var2) {
      if (null == var2) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (null != this.field1396) {
         class470 var4 = this.field1396.method8096((long)var1);
         if (var4 != null) {
            if (var4 instanceof class486) {
               class486 var5 = (class486)var4;
               if (var5.field4940 instanceof String) {
                  if (var2.equals(var5.field4940)) {
                     return false;
                  }

                  var5.method8116();
                  this.field1396.method8097(new class486(var2), var5.field4816);
                  return true;
               }
            }

            var4.method8116();
         }
      } else {
         this.field1396 = new class469(4);
      }

      this.field1396.method8097(new class486(var2), (long)var1);
      return true;
   }

   void method2603(Buffer var1) {
      int var3 = var1.readUnsignedByte();
      if (var3 >= 1 && var3 <= 6) {
         int var4 = var1.readUnsignedByte();
         if ((var4 & 1) != 0) {
            this.field1402 = true;
         }

         if (0 != (var4 & 2)) {
            this.field1414 = true;
         }

         if (!this.field1402) {
            this.field1407 = null;
            this.field1420 = null;
         }

         if (!this.field1414) {
            this.field1417 = null;
            this.field1418 = null;
         }

         this.field1398 = var1.readInt();
         this.field1400 = var1.readInt();
         if (var3 <= 3 && this.field1400 != 0) {
            this.field1400 += 16912800;
         }

         this.field1406 = var1.readUnsignedShort();
         this.field1415 = var1.readUnsignedByte();
         this.field1399 = var1.readString();
         if (var3 >= 4) {
            var1.readInt();
         }

         this.field1401 = var1.readUnsignedByte() == 1;
         this.field1403 = var1.readByte();
         this.field1397 = var1.readByte();
         this.field1404 = var1.readByte();
         this.field1405 = var1.readByte();
         int var5;
         if (this.field1406 > 0) {
            if (this.field1402 && (this.field1407 == null || this.field1407.length < this.field1406)) {
               this.field1407 = new long[this.field1406];
            }

            if (this.field1414 && (this.field1417 == null || this.field1417.length < this.field1406)) {
               this.field1417 = new String[this.field1406];
            }

            if (null == this.field1408 || this.field1408.length < this.field1406) {
               this.field1408 = new byte[this.field1406];
            }

            if (null == this.field1410 || this.field1410.length < this.field1406) {
               this.field1410 = new int[this.field1406];
            }

            if (this.field1411 == null || this.field1411.length < this.field1406) {
               this.field1411 = new int[this.field1406];
            }

            if (this.field1412 == null || this.field1412.length < this.field1406) {
               this.field1412 = new boolean[this.field1406];
            }

            for(var5 = 0; var5 < this.field1406; ++var5) {
               if (this.field1402) {
                  this.field1407[var5] = var1.readLong();
               }

               if (this.field1414) {
                  this.field1417[var5] = var1.readStringOrNull();
               }

               this.field1408[var5] = var1.readByte();
               if (var3 >= 2) {
                  this.field1410[var5] = var1.readInt();
               }

               if (var3 >= 5) {
                  this.field1411[var5] = var1.readUnsignedShort();
               } else {
                  this.field1411[var5] = 0;
               }

               if (var3 >= 6) {
                  this.field1412[var5] = var1.readUnsignedByte() == 1;
               } else {
                  this.field1412[var5] = false;
               }
            }

            this.method2629();
         }

         if (this.field1415 > 0) {
            if (this.field1402 && (this.field1420 == null || this.field1420.length < this.field1415)) {
               this.field1420 = new long[this.field1415];
            }

            if (this.field1414 && (this.field1418 == null || this.field1418.length < this.field1415)) {
               this.field1418 = new String[this.field1415];
            }

            for(var5 = 0; var5 < this.field1415; ++var5) {
               if (this.field1402) {
                  this.field1420[var5] = var1.readLong();
               }

               if (this.field1414) {
                  this.field1418[var5] = var1.readStringOrNull();
               }
            }
         }

         if (var3 >= 3) {
            var5 = var1.readUnsignedShort();
            if (var5 > 0) {
               this.field1396 = new class469(var5 < 16 ? class311.method2196(var5) : 16);

               while(var5-- > 0) {
                  int var6 = var1.readInt();
                  int var7 = var6 & 1073741823;
                  int var8 = var6 >>> 30;
                  if (var8 == 0) {
                     int var9 = var1.readInt();
                     this.field1396.method8097(new class492(var9), (long)var7);
                  } else if (var8 == 1) {
                     long var11 = var1.readLong();
                     this.field1396.method8097(new class490(var11), (long)var7);
                  } else if (var8 == 2) {
                     String var12 = var1.readString();
                     this.field1396.method8097(new class486(var12), (long)var7);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var3);
      }
   }
}
