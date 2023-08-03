public class class184 extends class476 {
   public static boolean field1921 = false;
   public static class290 field1907 = new class290(4096);
   public static class290 field1909 = new class290(30);
   public static class290 field1910 = new class290(30);
   public static class290 field1914 = new class290(500);
   public static class342 field1906;
   public static class342 field1908;
   static class213[] field1951 = new class213[4];
   boolean field1911;
   boolean field1926;
   boolean field1935;
   class469 field1955;
   int field1917;
   int field1920;
   int field1925;
   int field1927;
   int field1928;
   int field1937;
   int field1939;
   int field1941;
   int field1942;
   int field1947;
   int field1948;
   int[] field1913;
   int[] field1938;
   short[] field1915;
   short[] field1916;
   short[] field1919;
   short[] field1923;
   public boolean field1905;
   public boolean field1918;
   public boolean field1936;
   public boolean field1943;
   public boolean field1954;
   public int field1912;
   public int field1922;
   public int field1924;
   public int field1929;
   public int field1930;
   public int field1931;
   public int field1933;
   public int field1934;
   public int field1940;
   public int field1944;
   public int field1945;
   public int field1949;
   public int field1950;
   public int field1952;
   public int[] field1946;
   public int[] field1953;
   public String field1904;
   public String[] field1932;

   class184() {
      this.field1904 = class364.field4028;
      this.field1940 = 1;
      this.field1944 = 1;
      this.field1922 = 2;
      this.field1905 = true;
      this.field1924 = -1;
      this.field1925 = -1;
      this.field1926 = false;
      this.field1918 = false;
      this.field1930 = -1;
      this.field1929 = 16;
      this.field1920 = 0;
      this.field1948 = 0;
      this.field1932 = new String[5];
      this.field1933 = -1;
      this.field1934 = -1;
      this.field1935 = false;
      this.field1936 = true;
      this.field1937 = 128;
      this.field1927 = 128;
      this.field1939 = 128;
      this.field1928 = 0;
      this.field1941 = 0;
      this.field1942 = 0;
      this.field1943 = false;
      this.field1911 = false;
      this.field1945 = -1;
      this.field1947 = -1;
      this.field1917 = -1;
      this.field1949 = -1;
      this.field1950 = 0;
      this.field1931 = 0;
      this.field1952 = 0;
      this.field1954 = true;
   }

   void method3470() {
      if (this.field1924 == -1) {
         this.field1924 = 0;
         if (null != this.field1913 && (this.field1938 == null || this.field1938[0] == 10)) {
            this.field1924 = 1;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if (this.field1932[var2] != null) {
               this.field1924 = 1;
            }
         }
      }

      if (-1 == this.field1945) {
         this.field1945 = 0 != this.field1922 ? 1 : 0;
      }

   }

   void method3460(PacketBuffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method3450(var1, var3);
      }
   }

   void method3450(PacketBuffer var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.readUnsignedByte();
         if (var4 > 0) {
            if (this.field1913 != null && !field1921) {
               var1.offset += var4 * 3;
            } else {
               this.field1938 = new int[var4];
               this.field1913 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field1913[var5] = var1.readUnsignedShort();
                  this.field1938[var5] = var1.readUnsignedByte();
               }
            }
         }
      } else if (var2 == 2) {
         this.field1904 = var1.readString();
      } else if (var2 == 5) {
         var4 = var1.readUnsignedByte();
         if (var4 > 0) {
            if (null != this.field1913 && !field1921) {
               var1.offset += var4 * 2;
            } else {
               this.field1938 = null;
               this.field1913 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field1913[var5] = var1.readUnsignedShort();
               }
            }
         }
      } else if (var2 == 14) {
         this.field1940 = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.field1944 = var1.readUnsignedByte();
      } else if (var2 == 17) {
         this.field1922 = 0;
         this.field1905 = false;
      } else if (var2 == 18) {
         this.field1905 = false;
      } else if (var2 == 19) {
         this.field1924 = var1.readUnsignedByte();
      } else if (var2 == 21) {
         this.field1925 = 0;
      } else if (var2 == 22) {
         this.field1926 = true;
      } else if (var2 == 23) {
         this.field1918 = true;
      } else if (var2 == 24) {
         this.field1930 = var1.readUnsignedShort();
         if (this.field1930 == 65535) {
            this.field1930 = -1;
         }
      } else if (var2 == 27) {
         this.field1922 = 1;
      } else if (var2 == 28) {
         this.field1929 = var1.readUnsignedByte();
      } else if (var2 == 29) {
         this.field1920 = var1.readByte();
      } else if (var2 == 39) {
         this.field1948 = var1.readByte() * 25;
      } else if (var2 >= 30 && var2 < 35) {
         this.field1932[var2 - 30] = var1.readString();
         if (this.field1932[var2 - 30].equalsIgnoreCase(class364.field4151)) {
            this.field1932[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.readUnsignedByte();
         this.field1916 = new short[var4];
         this.field1915 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1916[var5] = (short)var1.readUnsignedShort();
            this.field1915[var5] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 41) {
         var4 = var1.readUnsignedByte();
         this.field1923 = new short[var4];
         this.field1919 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1923[var5] = (short)var1.readUnsignedShort();
            this.field1919[var5] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 61) {
         var1.readUnsignedShort();
      } else if (var2 == 62) {
         this.field1935 = true;
      } else if (var2 == 64) {
         this.field1936 = false;
      } else if (var2 == 65) {
         this.field1937 = var1.readUnsignedShort();
      } else if (var2 == 66) {
         this.field1927 = var1.readUnsignedShort();
      } else if (var2 == 67) {
         this.field1939 = var1.readUnsignedShort();
      } else if (var2 == 68) {
         this.field1934 = var1.readUnsignedShort();
      } else if (var2 == 69) {
         var1.readUnsignedByte();
      } else if (var2 == 70) {
         this.field1928 = var1.readShort();
      } else if (var2 == 71) {
         this.field1941 = var1.readShort();
      } else if (var2 == 72) {
         this.field1942 = var1.readShort();
      } else if (var2 == 73) {
         this.field1943 = true;
      } else if (var2 == 74) {
         this.field1911 = true;
      } else if (var2 == 75) {
         this.field1945 = var1.readUnsignedByte();
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.field1949 = var1.readUnsignedShort();
            this.field1950 = var1.readUnsignedByte();
         } else if (var2 == 79) {
            this.field1931 = var1.readUnsignedShort();
            this.field1952 = var1.readUnsignedShort();
            this.field1950 = var1.readUnsignedByte();
            var4 = var1.readUnsignedByte();
            this.field1953 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1953[var5] = var1.readUnsignedShort();
            }
         } else if (var2 == 81) {
            this.field1925 = var1.readUnsignedByte() * 256;
         } else if (var2 == 82) {
            this.field1933 = var1.readUnsignedShort();
         } else if (var2 == 89) {
            this.field1954 = false;
         } else if (var2 == 249) {
            this.field1955 = class200.method2466(var1, this.field1955);
         }
      } else {
         this.field1947 = var1.readUnsignedShort();
         if (this.field1947 == 65535) {
            this.field1947 = -1;
         }

         this.field1917 = var1.readUnsignedShort();
         if (this.field1917 == 65535) {
            this.field1917 = -1;
         }

         var4 = -1;
         if (var2 == 92) {
            var4 = var1.readUnsignedShort();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         var5 = var1.readUnsignedByte();
         this.field1946 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field1946[var6] = var1.readUnsignedShort();
            if (this.field1946[var6] == 65535) {
               this.field1946[var6] = -1;
            }
         }

         this.field1946[var5 + 1] = var4;
      }

   }

   public final boolean method3479(int var1) {
      if (null != this.field1938) {
         for(int var5 = 0; var5 < this.field1938.length; ++var5) {
            if (var1 == this.field1938[var5]) {
               return field1906.method6464(this.field1913[var5] & '\uffff', 0);
            }
         }

         return true;
      } else if (null == this.field1913) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.field1913.length; ++var4) {
            var3 &= field1906.method6464(this.field1913[var4] & '\uffff', 0);
         }

         return var3;
      }
   }

   public final boolean method3458() {
      if (null == this.field1913) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field1913.length; ++var3) {
            var2 &= field1906.method6464(this.field1913[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   public final class228 method3465(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (null == this.field1938) {
         var8 = (long)(var2 + (this.field1912 << 10));
      } else {
         var8 = (long)(var2 + (this.field1912 << 10) + (var1 << 3));
      }

      Object var10 = (class228)field1909.method5643(var8);
      if (null == var10) {
         class213 var11 = this.method3455(var1, var2);
         if (var11 == null) {
            return null;
         }

         if (!this.field1926) {
            var10 = var11.method3976(this.field1920 + 64, 768 + this.field1948, -50, -10, -50);
         } else {
            var11.field2310 = (short)(this.field1920 + 64);
            var11.field2322 = (short)(this.field1948 + 768);
            var11.method3981();
            var10 = var11;
         }

         field1909.method5640((class476)var10, var8);
      }

      if (this.field1926) {
         var10 = ((class213)var10).method3960();
      }

      if (this.field1925 >= 0) {
         if (var10 instanceof class249) {
            var10 = ((class249)var10).method4758(var3, var4, var5, var6, true, this.field1925);
         } else if (var10 instanceof class213) {
            var10 = ((class213)var10).method4023(var3, var4, var5, var6, true, this.field1925);
         }
      }

      return (class228)var10;
   }

   public final class249 method3449(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (this.field1938 == null) {
         var8 = (long)((this.field1912 << 10) + var2);
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field1912 << 10));
      }

      class249 var10 = (class249)field1910.method5643(var8);
      if (null == var10) {
         class213 var11 = this.method3455(var1, var2);
         if (null == var11) {
            return null;
         }

         var10 = var11.method3976(64 + this.field1920, this.field1948 + 768, -50, -10, -50);
         field1910.method5640(var10, var8);
      }

      if (this.field1925 >= 0) {
         var10 = var10.method4758(var3, var4, var5, var6, true, this.field1925);
      }

      return var10;
   }

   public final class249 method3454(int var1, int var2, int[][] var3, int var4, int var5, int var6, class215 var7, int var8) {
      long var10;
      if (this.field1938 == null) {
         var10 = (long)(var2 + (this.field1912 << 10));
      } else {
         var10 = (long)(var2 + (this.field1912 << 10) + (var1 << 3));
      }

      class249 var12 = (class249)field1910.method5643(var10);
      if (var12 == null) {
         class213 var13 = this.method3455(var1, var2);
         if (var13 == null) {
            return null;
         }

         var12 = var13.method3976(this.field1920 + 64, 768 + this.field1948, -50, -10, -50);
         field1910.method5640(var12, var10);
      }

      if (var7 == null && -1 == this.field1925) {
         return var12;
      } else {
         if (var7 != null) {
            var12 = var7.method4053(var12, var8, var2);
         } else {
            var12 = var12.method4759(true);
         }

         if (this.field1925 >= 0) {
            var12 = var12.method4758(var3, var4, var5, var6, false, this.field1925);
         }

         return var12;
      }
   }

   final class213 method3455(int var1, int var2) {
      class213 var4 = null;
      boolean var5;
      int var6;
      int var8;
      if (this.field1938 == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.field1913 == null) {
            return null;
         }

         var5 = this.field1935;
         if (var1 == 2 && var2 > 3) {
            var5 = !var5;
         }

         var6 = this.field1913.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            var8 = this.field1913[var7];
            if (var5) {
               var8 += 65536;
            }

            var4 = (class213)field1914.method5643((long)var8);
            if (var4 == null) {
               var4 = class213.method3952(field1906, var8 & '\uffff', 0);
               if (var4 == null) {
                  return null;
               }

               if (var5) {
                  var4.method3983();
               }

               field1914.method5640(var4, (long)var8);
            }

            if (var6 > 1) {
               field1951[var7] = var4;
            }
         }

         if (var6 > 1) {
            var4 = new class213(field1951, var6);
         }
      } else {
         int var9 = -1;

         for(var6 = 0; var6 < this.field1938.length; ++var6) {
            if (this.field1938[var6] == var1) {
               var9 = var6;
               break;
            }
         }

         if (var9 == -1) {
            return null;
         }

         var6 = this.field1913[var9];
         boolean var10 = this.field1935 ^ var2 > 3;
         if (var10) {
            var6 += 65536;
         }

         var4 = (class213)field1914.method5643((long)var6);
         if (var4 == null) {
            var4 = class213.method3952(field1906, var6 & '\uffff', 0);
            if (var4 == null) {
               return null;
            }

            if (var10) {
               var4.method3983();
            }

            field1914.method5640(var4, (long)var6);
         }
      }

      if (128 == this.field1937 && 128 == this.field1927 && this.field1939 == 128) {
         var5 = false;
      } else {
         var5 = true;
      }

      boolean var11;
      if (this.field1928 == 0 && this.field1941 == 0 && this.field1942 == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      class213 var12 = new class213(var4, var2 == 0 && !var5 && !var11, null == this.field1916, this.field1923 == null, true);
      if (var1 == 4 && var2 > 3) {
         var12.method3966(256);
         var12.method4004(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var12.method3963();
      } else if (var2 == 2) {
         var12.method3964();
      } else if (var2 == 3) {
         var12.method3965();
      }

      if (this.field1916 != null) {
         for(var8 = 0; var8 < this.field1916.length; ++var8) {
            var12.method3968(this.field1916[var8], this.field1915[var8]);
         }
      }

      if (this.field1923 != null) {
         for(var8 = 0; var8 < this.field1923.length; ++var8) {
            var12.method3969(this.field1923[var8], this.field1919[var8]);
         }
      }

      if (var5) {
         var12.method3971(this.field1937, this.field1927, this.field1939);
      }

      if (var11) {
         var12.method4004(this.field1928, this.field1941, this.field1942);
      }

      return var12;
   }

   public final class184 method3456() {
      int var2 = -1;
      if (-1 != this.field1947) {
         var2 = class254.method5005(this.field1947);
      } else if (-1 != this.field1917) {
         var2 = class329.field3577[this.field1917];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field1946.length - 1) {
         var3 = this.field1946[var2];
      } else {
         var3 = this.field1946[this.field1946.length - 1];
      }

      return var3 != -1 ? class98.method2042(var3) : null;
   }

   public int method3457(int var1, int var2) {
      return class200.method3300(this.field1955, var1, var2);
   }

   public String method3480(int var1, String var2) {
      class469 var5 = this.field1955;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class486 var6 = (class486)var5.method8096((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = (String)var6.field4940;
         }
      }

      return var4;
   }

   public boolean method3459() {
      if (null == this.field1946) {
         return -1 != this.field1949 || this.field1953 != null;
      } else {
         for(int var2 = 0; var2 < this.field1946.length; ++var2) {
            if (-1 != this.field1946[var2]) {
               class184 var3 = class98.method2042(this.field1946[var2]);
               if (var3.field1949 != -1 || var3.field1953 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
