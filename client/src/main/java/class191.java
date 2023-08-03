public class class191 extends class476 {
   public static class342 field2044;
   static class290 field2046 = new class290(50);
   static class290 field2055 = new class290(64);
   static class493 field2089;
   class469 field2070;
   int field2074;
   int field2075;
   int field2077;
   int field2078;
   int field2081;
   int field2088;
   int[] field2051;
   int[] field2069;
   int[] field2086;
   short[] field2053;
   short[] field2067;
   short[] field2087;
   public boolean field2059;
   public boolean field2076;
   public boolean field2082;
   public boolean field2084;
   public boolean field2085;
   public int field2043;
   public int field2045;
   public int field2047;
   public int field2049;
   public int field2050;
   public int field2052;
   public int field2054;
   public int field2057;
   public int field2058;
   public int field2060;
   public int field2061;
   public int field2062;
   public int field2063;
   public int field2064;
   public int field2065;
   public int field2071;
   public int field2073;
   public int field2079;
   public int field2083;
   public int[] field2066;
   public String field2080;
   public String[] field2072;
   public short[] field2056;
   public short[] field2068;

   class191() {
      this.field2080 = class364.field4028;
      this.field2049 = 1;
      this.field2052 = -1;
      this.field2050 = -1;
      this.field2054 = -1;
      this.field2083 = -1;
      this.field2061 = -1;
      this.field2057 = -1;
      this.field2058 = -1;
      this.field2043 = -1;
      this.field2060 = -1;
      this.field2045 = -1;
      this.field2062 = -1;
      this.field2063 = -1;
      this.field2064 = -1;
      this.field2065 = -1;
      this.field2071 = -1;
      this.field2072 = new String[5];
      this.field2076 = true;
      this.field2073 = -1;
      this.field2074 = 128;
      this.field2075 = 128;
      this.field2059 = false;
      this.field2077 = 0;
      this.field2078 = 0;
      this.field2079 = 32;
      this.field2081 = -1;
      this.field2088 = -1;
      this.field2082 = true;
      this.field2084 = true;
      this.field2085 = false;
      this.field2086 = null;
      this.field2087 = null;
   }

   public static class191 method4208(int var0) {
      class191 var2 = (class191)field2055.method5643((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class527.field5167.method6381(9, var0);
         var2 = new class191();
         var2.field2047 = var0;
         if (null != var3) {
            var2.method3671(new PacketBuffer(var3));
         }

         var2.method3647();
         field2055.method5640(var2, (long)var0);
         return var2;
      }
   }

   public static void method2182() {
      field2055.method5637();
      field2046.method5637();
   }

   void method3647() {
   }

   void method3671(PacketBuffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method3664(var1, var3);
      }
   }

   void method3664(PacketBuffer var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.readUnsignedByte();
         this.field2069 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2069[var5] = var1.readUnsignedShort();
         }
      } else if (var2 == 2) {
         this.field2080 = var1.readString();
      } else if (var2 == 12) {
         this.field2049 = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.field2052 = var1.readUnsignedShort();
      } else if (var2 == 14) {
         this.field2083 = var1.readUnsignedShort();
      } else if (var2 == 15) {
         this.field2050 = var1.readUnsignedShort();
      } else if (var2 == 16) {
         this.field2054 = var1.readUnsignedShort();
      } else if (var2 == 17) {
         this.field2083 = var1.readUnsignedShort();
         this.field2061 = var1.readUnsignedShort();
         this.field2057 = var1.readUnsignedShort();
         this.field2058 = var1.readUnsignedShort();
      } else if (var2 == 18) {
         var1.readUnsignedShort();
      } else if (var2 >= 30 && var2 < 35) {
         this.field2072[var2 - 30] = var1.readString();
         if (this.field2072[var2 - 30].equalsIgnoreCase(class364.field4151)) {
            this.field2072[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.readUnsignedByte();
         this.field2053 = new short[var4];
         this.field2068 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2053[var5] = (short)var1.readUnsignedShort();
            this.field2068[var5] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 41) {
         var4 = var1.readUnsignedByte();
         this.field2067 = new short[var4];
         this.field2056 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2067[var5] = (short)var1.readUnsignedShort();
            this.field2056[var5] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 60) {
         var4 = var1.readUnsignedByte();
         this.field2051 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2051[var5] = var1.readUnsignedShort();
         }
      } else if (var2 == 93) {
         this.field2076 = false;
      } else if (var2 == 95) {
         this.field2073 = var1.readUnsignedShort();
      } else if (var2 == 97) {
         this.field2074 = var1.readUnsignedShort();
      } else if (var2 == 98) {
         this.field2075 = var1.readUnsignedShort();
      } else if (var2 == 99) {
         this.field2059 = true;
      } else if (var2 == 100) {
         this.field2077 = var1.readByte();
      } else if (var2 == 101) {
         this.field2078 = var1.readByte() * 5;
      } else {
         int var6;
         if (var2 == 102) {
            var4 = var1.readUnsignedByte();
            var5 = 0;

            for(var6 = var4; var6 != 0; var6 >>= 1) {
               ++var5;
            }

            this.field2086 = new int[var5];
            this.field2087 = new short[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               if ((var4 & 1 << var7) == 0) {
                  this.field2086[var7] = -1;
                  this.field2087[var7] = -1;
               } else {
                  this.field2086[var7] = var1.method8814();
                  this.field2087[var7] = (short)var1.readUnsignedSmartByteShortNull();
               }
            }
         } else if (var2 == 103) {
            this.field2079 = var1.readUnsignedShort();
         } else if (var2 != 106 && var2 != 118) {
            if (var2 == 107) {
               this.field2082 = false;
            } else if (var2 == 109) {
               this.field2084 = false;
            } else if (var2 == 111) {
               this.field2085 = true;
            } else if (var2 == 114) {
               this.field2043 = var1.readUnsignedShort();
            } else if (var2 == 115) {
               this.field2043 = var1.readUnsignedShort();
               this.field2060 = var1.readUnsignedShort();
               this.field2045 = var1.readUnsignedShort();
               this.field2062 = var1.readUnsignedShort();
            } else if (var2 == 116) {
               this.field2063 = var1.readUnsignedShort();
            } else if (var2 == 117) {
               this.field2063 = var1.readUnsignedShort();
               this.field2064 = var1.readUnsignedShort();
               this.field2065 = var1.readUnsignedShort();
               this.field2071 = var1.readUnsignedShort();
            } else if (var2 == 249) {
               this.field2070 = class200.method2466(var1, this.field2070);
            }
         } else {
            this.field2081 = var1.readUnsignedShort();
            if (this.field2081 == 65535) {
               this.field2081 = -1;
            }

            this.field2088 = var1.readUnsignedShort();
            if (65535 == this.field2088) {
               this.field2088 = -1;
            }

            var4 = -1;
            if (var2 == 118) {
               var4 = var1.readUnsignedShort();
               if (var4 == 65535) {
                  var4 = -1;
               }
            }

            var5 = var1.readUnsignedByte();
            this.field2066 = new int[var5 + 2];

            for(var6 = 0; var6 <= var5; ++var6) {
               this.field2066[var6] = var1.readUnsignedShort();
               if (this.field2066[var6] == 65535) {
                  this.field2066[var6] = -1;
               }
            }

            this.field2066[var5 + 1] = var4;
         }
      }

   }

   public final class249 method3614(class215 var1, int var2, class215 var3, int var4, class201 var5) {
      if (this.field2066 != null) {
         class191 var12 = this.method3652();
         return var12 == null ? null : var12.method3614(var1, var2, var3, var4, var5);
      } else {
         long var7 = (long)this.field2047;
         if (null != var5) {
            var7 |= var5.field2184 << 16;
         }

         class249 var9 = (class249)field2046.method5643(var7);
         if (var9 == null) {
            class213 var10 = this.method3620(this.field2069, var5);
            if (var10 == null) {
               return null;
            }

            var9 = var10.method3976(64 + this.field2077, this.field2078 + 850, -30, -50, -30);
            field2046.method5640(var9, var7);
         }

         class249 var11;
         if (var1 != null && null != var3) {
            var11 = var1.method4055(var9, var2, var3, var4);
         } else if (null != var1) {
            var11 = var1.method4052(var9, var2);
         } else if (null != var3) {
            var11 = var3.method4052(var9, var4);
         } else {
            var11 = var9.method4759(true);
         }

         if (128 != this.field2074 || this.field2075 != 128) {
            var11.method4779(this.field2074, this.field2075, this.field2074);
         }

         return var11;
      }
   }

   public final class213 method3619(class201 var1) {
      if (this.field2066 != null) {
         class191 var3 = this.method3652();
         return var3 == null ? null : var3.method3619(var1);
      } else {
         return this.method3620(this.field2051, var1);
      }
   }

   class213 method3620(int[] var1, class201 var2) {
      int[] var4 = var1;
      if (null != var2 && var2.field2187 != null) {
         var4 = var2.field2187;
      }

      if (var4 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var6 = 0; var6 < var4.length; ++var6) {
            if (var4[var6] != -1 && !field2044.method6464(var4[var6], 0)) {
               var5 = true;
            }
         }

         if (var5) {
            return null;
         } else {
            class213[] var10 = new class213[var4.length];

            for(int var7 = 0; var7 < var4.length; ++var7) {
               var10[var7] = class213.method3952(field2044, var4[var7], 0);
            }

            class213 var11;
            if (var10.length == 1) {
               var11 = var10[0];
               if (var11 == null) {
                  var11 = new class213(var10, var10.length);
               }
            } else {
               var11 = new class213(var10, var10.length);
            }

            short[] var8;
            int var9;
            if (this.field2053 != null) {
               var8 = this.field2068;
               if (var2 != null && null != var2.field2186) {
                  var8 = var2.field2186;
               }

               for(var9 = 0; var9 < this.field2053.length; ++var9) {
                  var11.method3968(this.field2053[var9], var8[var9]);
               }
            }

            if (this.field2067 != null) {
               var8 = this.field2056;
               if (null != var2 && var2.field2189 != null) {
                  var8 = var2.field2189;
               }

               for(var9 = 0; var9 < this.field2067.length; ++var9) {
                  var11.method3969(this.field2067[var9], var8[var9]);
               }
            }

            return var11;
         }
      }
   }

   public final class191 method3652() {
      int var2 = -1;
      if (this.field2081 != -1) {
         var2 = class254.method5005(this.field2081);
      } else if (-1 != this.field2088) {
         var2 = class329.field3577[this.field2088];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field2066.length - 1) {
         var3 = this.field2066[var2];
      } else {
         var3 = this.field2066[this.field2066.length - 1];
      }

      return var3 != -1 ? method4208(var3) : null;
   }

   public boolean method3626() {
      if (null == this.field2066) {
         return true;
      } else {
         int var2 = -1;
         if (this.field2081 != -1) {
            var2 = class254.method5005(this.field2081);
         } else if (-1 != this.field2088) {
            var2 = class329.field3577[this.field2088];
         }

         if (var2 >= 0 && var2 < this.field2066.length) {
            return -1 != this.field2066[var2];
         } else {
            return -1 != this.field2066[this.field2066.length - 1];
         }
      }
   }

   public int method3616(int var1, int var2) {
      return class200.method3300(this.field2070, var1, var2);
   }

   public String method3624(int var1, String var2) {
      class469 var5 = this.field2070;
      String var4;
      if (null == var5) {
         var4 = var2;
      } else {
         class486 var6 = (class486)var5.method8096((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field4940;
         }
      }

      return var4;
   }

   public boolean method3625() {
      return this.field2086 != null && this.field2087 != null;
   }

   public int[] method3630() {
      return this.field2086;
   }

   public int method3623(int var1) {
      return this.field2086 != null && var1 < this.field2086.length ? this.field2086[var1] : -1;
   }

   public short[] method3660() {
      return this.field2087;
   }

   public short method3629(int var1) {
      return this.field2087 != null && var1 < this.field2087.length ? this.field2087[var1] : -1;
   }
}
