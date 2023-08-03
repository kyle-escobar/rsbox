public class class185 extends class476 {
   static class290 field1974 = new class290(64);
   static class290 field1981 = new class290(50);
   static class290 field2014 = new class290(200);
   static class393 field1996;
   class469 field1963;
   int field1956;
   int field1964;
   int field1983;
   int field1984;
   int field1985;
   int field1986;
   int field1987;
   int field1988;
   int field1989;
   int field1990;
   int field1991;
   int field1992;
   int field1993;
   int field1994;
   int field1995;
   int field2000;
   int field2001;
   int field2002;
   int field2004;
   int field2010;
   int[] field1965;
   int[] field2012;
   public boolean field1980;
   public boolean field2008;
   public int field1960;
   public int field1969;
   public int field1970;
   public int field1971;
   public int field1972;
   public int field1973;
   public int field1975;
   public int field1976;
   public int field1977;
   public int field1978;
   public int field1979;
   public int field1997;
   public int field1999;
   public int field2003;
   public int field2005;
   public int field2006;
   public int field2007;
   public int field2009;
   public int field2011;
   public String field1998;
   public String[] field1959;
   public String[] field1982;
   public short[] field1961;
   public short[] field1966;
   public short[] field1967;
   public short[] field1968;

   class185() {
      this.field1998 = class364.field4028;
      this.field1969 = 2000;
      this.field1970 = 0;
      this.field1960 = 0;
      this.field1972 = 0;
      this.field1973 = 0;
      this.field1971 = 0;
      this.field1975 = 0;
      this.field1976 = 1;
      this.field2009 = -1;
      this.field1978 = -1;
      this.field1979 = -1;
      this.field1980 = false;
      this.field1959 = new String[]{null, null, class364.field4021, null, null};
      this.field1982 = new String[]{null, null, null, null, class364.field4150};
      this.field1983 = -2;
      this.field1984 = -1;
      this.field1985 = -1;
      this.field1986 = 0;
      this.field1995 = -1;
      this.field1988 = -1;
      this.field1989 = 0;
      this.field1990 = -1;
      this.field1991 = -1;
      this.field1964 = -1;
      this.field1993 = -1;
      this.field1994 = -1;
      this.field2004 = -1;
      this.field1997 = -1;
      this.field1999 = -1;
      this.field2000 = 128;
      this.field2001 = 128;
      this.field2002 = 128;
      this.field2003 = 0;
      this.field2007 = 0;
      this.field2005 = 0;
      this.field2011 = 0;
      this.field2008 = false;
      this.field1987 = -1;
      this.field2010 = -1;
      this.field2006 = -1;
      this.field1977 = -1;
   }

   public static void method1378(class342 var0, class342 var1, boolean var2, class393 var3) {
      class247.field2714 = var0;
      class142.field1314 = var1;
      class503.field5055 = var2;
      class242.field2685 = class247.field2714.method6393(10);
      class224.field2460 = var3;
   }

   public static class185 method2355(int var0) {
      class185 var2 = (class185)field1974.method5643((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class247.field2714.method6381(10, var0);
         var2 = new class185();
         var2.field1992 = var0;
         if (null != var3) {
            var2.method3495(new PacketBuffer(var3));
         }

         var2.method3494();
         if (var2.field1999 != -1) {
            var2.method3497(method2355(var2.field1999), method2355(var2.field1997));
         }

         if (-1 != var2.field2010) {
            var2.method3534(method2355(var2.field2010), method2355(var2.field1987));
         }

         if (-1 != var2.field1977) {
            var2.method3538(method2355(var2.field1977), method2355(var2.field2006));
         }

         if (!class503.field5055 && var2.field1980) {
            if (-1 == var2.field1999 && var2.field2010 == -1 && var2.field1977 == -1) {
               var2.field1998 = var2.field1998 + class364.field4044;
            }

            var2.field2008 = false;

            int var4;
            for(var4 = 0; var4 < var2.field1959.length; ++var4) {
               var2.field1959[var4] = null;
            }

            for(var4 = 0; var4 < var2.field1982.length; ++var4) {
               if (var4 != 4) {
                  var2.field1982[var4] = null;
               }
            }

            var2.field1983 = -2;
            var2.field2005 = 0;
            if (var2.field1963 != null) {
               boolean var7 = false;

               for(class470 var5 = var2.field1963.method8100(); null != var5; var5 = var2.field1963.method8108()) {
                  class199 var6 = class199.method6362((int)var5.field4816);
                  if (var6.field2179) {
                     var5.method8116();
                  } else {
                     var7 = true;
                  }
               }

               if (!var7) {
                  var2.field1963 = null;
               }
            }
         }

         field1974.method5640(var2, (long)var0);
         return var2;
      }
   }

   static final String method3288(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + class364.field4198 + "</col>" : "<col=00ff80>" + var0 / 1000000 + class364.field4094 + "</col>";
      }
   }

   public static void method1508() {
      field1974.method5637();
      field1981.method5637();
      field2014.method5637();
   }

   public static void method2046() {
      field2014.method5637();
   }

   public static void method2117(boolean var0) {
      if (var0 != class503.field5055) {
         method1508();
         class503.field5055 = var0;
      }

   }

   void method3494() {
      if (this.field1975 == 1) {
         this.field2011 = 0;
      }

   }

   void method3495(PacketBuffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method3496(var1, var3);
      }
   }

   void method3496(PacketBuffer var1, int var2) {
      if (var2 == 1) {
         this.field1956 = var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.field1998 = var1.readString();
      } else if (var2 == 4) {
         this.field1969 = var1.readUnsignedShort();
      } else if (var2 == 5) {
         this.field1970 = var1.readUnsignedShort();
      } else if (var2 == 6) {
         this.field1960 = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.field1973 = var1.readUnsignedShort();
         if (this.field1973 > 32767) {
            this.field1973 -= 65536;
         }
      } else if (var2 == 8) {
         this.field1971 = var1.readUnsignedShort();
         if (this.field1971 > 32767) {
            this.field1971 -= 65536;
         }
      } else if (var2 == 9) {
         var1.readString();
      } else if (var2 == 11) {
         this.field1975 = 1;
      } else if (var2 == 12) {
         this.field1976 = var1.readInt();
      } else if (var2 == 13) {
         this.field2009 = var1.readUnsignedByte();
      } else if (var2 == 14) {
         this.field1978 = var1.readUnsignedByte();
      } else if (var2 == 16) {
         this.field1980 = true;
      } else if (var2 == 23) {
         this.field1984 = var1.readUnsignedShort();
         this.field1986 = var1.readUnsignedByte();
      } else if (var2 == 24) {
         this.field1985 = var1.readUnsignedShort();
      } else if (var2 == 25) {
         this.field1995 = var1.readUnsignedShort();
         this.field1989 = var1.readUnsignedByte();
      } else if (var2 == 26) {
         this.field1988 = var1.readUnsignedShort();
      } else if (var2 == 27) {
         this.field1979 = var1.readUnsignedByte();
      } else if (var2 >= 30 && var2 < 35) {
         this.field1959[var2 - 30] = var1.readString();
         if (this.field1959[var2 - 30].equalsIgnoreCase(class364.field4151)) {
            this.field1959[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.field1982[var2 - 35] = var1.readString();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.readUnsignedByte();
            this.field1961 = new short[var4];
            this.field1966 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1961[var5] = (short)var1.readUnsignedShort();
               this.field1966[var5] = (short)var1.readUnsignedShort();
            }
         } else if (var2 == 41) {
            var4 = var1.readUnsignedByte();
            this.field1967 = new short[var4];
            this.field1968 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1967[var5] = (short)var1.readUnsignedShort();
               this.field1968[var5] = (short)var1.readUnsignedShort();
            }
         } else if (var2 == 42) {
            this.field1983 = var1.readByte();
         } else if (var2 == 65) {
            this.field2008 = true;
         } else if (var2 == 75) {
            this.field2011 = var1.readShort();
         } else if (var2 == 78) {
            this.field1990 = var1.readUnsignedShort();
         } else if (var2 == 79) {
            this.field1991 = var1.readUnsignedShort();
         } else if (var2 == 90) {
            this.field1964 = var1.readUnsignedShort();
         } else if (var2 == 91) {
            this.field1994 = var1.readUnsignedShort();
         } else if (var2 == 92) {
            this.field1993 = var1.readUnsignedShort();
         } else if (var2 == 93) {
            this.field2004 = var1.readUnsignedShort();
         } else if (var2 == 94) {
            var1.readUnsignedShort();
         } else if (var2 == 95) {
            this.field1972 = var1.readUnsignedShort();
         } else if (var2 == 97) {
            this.field1997 = var1.readUnsignedShort();
         } else if (var2 == 98) {
            this.field1999 = var1.readUnsignedShort();
         } else if (var2 >= 100 && var2 < 110) {
            if (this.field2012 == null) {
               this.field2012 = new int[10];
               this.field1965 = new int[10];
            }

            this.field2012[var2 - 100] = var1.readUnsignedShort();
            this.field1965[var2 - 100] = var1.readUnsignedShort();
         } else if (var2 == 110) {
            this.field2000 = var1.readUnsignedShort();
         } else if (var2 == 111) {
            this.field2001 = var1.readUnsignedShort();
         } else if (var2 == 112) {
            this.field2002 = var1.readUnsignedShort();
         } else if (var2 == 113) {
            this.field2003 = var1.readByte();
         } else if (var2 == 114) {
            this.field2007 = var1.readByte() * 5;
         } else if (var2 == 115) {
            this.field2005 = var1.readUnsignedByte();
         } else if (var2 == 139) {
            this.field1987 = var1.readUnsignedShort();
         } else if (var2 == 140) {
            this.field2010 = var1.readUnsignedShort();
         } else if (var2 == 148) {
            this.field2006 = var1.readUnsignedShort();
         } else if (var2 == 149) {
            this.field1977 = var1.readUnsignedShort();
         } else if (var2 == 249) {
            this.field1963 = class200.method2466(var1, this.field1963);
         }
      }

   }

   void method3497(class185 var1, class185 var2) {
      this.field1956 = var1.field1956;
      this.field1969 = var1.field1969;
      this.field1970 = var1.field1970;
      this.field1960 = var1.field1960;
      this.field1972 = var1.field1972;
      this.field1973 = var1.field1973;
      this.field1971 = var1.field1971;
      this.field1961 = var1.field1961;
      this.field1966 = var1.field1966;
      this.field1967 = var1.field1967;
      this.field1968 = var1.field1968;
      this.field1998 = var2.field1998;
      this.field1980 = var2.field1980;
      this.field1976 = var2.field1976;
      this.field1975 = 1;
   }

   void method3534(class185 var1, class185 var2) {
      this.field1956 = var1.field1956;
      this.field1969 = var1.field1969;
      this.field1970 = var1.field1970;
      this.field1960 = var1.field1960;
      this.field1972 = var1.field1972;
      this.field1973 = var1.field1973;
      this.field1971 = var1.field1971;
      this.field1961 = var2.field1961;
      this.field1966 = var2.field1966;
      this.field1967 = var2.field1967;
      this.field1968 = var2.field1968;
      this.field1998 = var2.field1998;
      this.field1980 = var2.field1980;
      this.field1975 = var2.field1975;
      this.field2009 = var2.field2009;
      this.field1978 = var2.field1978;
      this.field1979 = var2.field1979;
      this.field1984 = var2.field1984;
      this.field1985 = var2.field1985;
      this.field1990 = var2.field1990;
      this.field1995 = var2.field1995;
      this.field1988 = var2.field1988;
      this.field1991 = var2.field1991;
      this.field1964 = var2.field1964;
      this.field1993 = var2.field1993;
      this.field1994 = var2.field1994;
      this.field2004 = var2.field2004;
      this.field2005 = var2.field2005;
      this.field1959 = var2.field1959;
      this.field2011 = var2.field2011;
      this.field1982 = new String[5];
      if (var2.field1982 != null) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.field1982[var4] = var2.field1982[var4];
         }
      }

      this.field1982[4] = class364.field4027;
      this.field1976 = 0;
   }

   void method3538(class185 var1, class185 var2) {
      this.field1956 = var1.field1956;
      this.field1969 = var1.field1969;
      this.field1970 = var1.field1970;
      this.field1960 = var1.field1960;
      this.field1972 = var1.field1972;
      this.field1973 = var1.field1973;
      this.field1971 = var1.field1971;
      this.field1961 = var1.field1961;
      this.field1966 = var1.field1966;
      this.field1967 = var1.field1967;
      this.field1968 = var1.field1968;
      this.field1975 = var1.field1975;
      this.field1998 = var2.field1998;
      this.field1976 = 0;
      this.field1980 = false;
      this.field2008 = false;
   }

   public final class213 method3500(int var1) {
      int var4;
      if (this.field2012 != null && var1 > 1) {
         int var3 = -1;

         for(var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1965[var4] && this.field1965[var4] != 0) {
               var3 = this.field2012[var4];
            }
         }

         if (var3 != -1) {
            return method2355(var3).method3500(1);
         }
      }

      class213 var5 = class213.method3952(class142.field1314, this.field1956, 0);
      if (null == var5) {
         return null;
      } else {
         if (this.field2000 != 128 || 128 != this.field2001 || this.field2002 != 128) {
            var5.method3971(this.field2000, this.field2001, this.field2002);
         }

         if (null != this.field1961) {
            for(var4 = 0; var4 < this.field1961.length; ++var4) {
               var5.method3968(this.field1961[var4], this.field1966[var4]);
            }
         }

         if (this.field1967 != null) {
            for(var4 = 0; var4 < this.field1967.length; ++var4) {
               var5.method3969(this.field1967[var4], this.field1968[var4]);
            }
         }

         return var5;
      }
   }

   public final class249 method3501(int var1) {
      if (null != this.field2012 && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1965[var4] && 0 != this.field1965[var4]) {
               var3 = this.field2012[var4];
            }
         }

         if (var3 != -1) {
            return method2355(var3).method3501(1);
         }
      }

      class249 var6 = (class249)field1981.method5643((long)this.field1992);
      if (null != var6) {
         return var6;
      } else {
         class213 var7 = class213.method3952(class142.field1314, this.field1956, 0);
         if (var7 == null) {
            return null;
         } else {
            if (128 != this.field2000 || this.field2001 != 128 || 128 != this.field2002) {
               var7.method3971(this.field2000, this.field2001, this.field2002);
            }

            int var5;
            if (this.field1961 != null) {
               for(var5 = 0; var5 < this.field1961.length; ++var5) {
                  var7.method3968(this.field1961[var5], this.field1966[var5]);
               }
            }

            if (this.field1967 != null) {
               for(var5 = 0; var5 < this.field1967.length; ++var5) {
                  var7.method3969(this.field1967[var5], this.field1968[var5]);
               }
            }

            var6 = var7.method3976(64 + this.field2003, 768 + this.field2007, -50, -10, -50);
            var6.field2749 = true;
            field1981.method5640(var6, (long)this.field1992);
            return var6;
         }
      }
   }

   public class185 method3502(int var1) {
      if (this.field2012 != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1965[var4] && this.field1965[var4] != 0) {
               var3 = this.field2012[var4];
            }
         }

         if (var3 != -1) {
            return method2355(var3);
         }
      }

      return this;
   }

   public final boolean method3569(int var1) {
      int var3 = this.field1984;
      int var4 = this.field1985;
      int var5 = this.field1990;
      if (var1 == 1) {
         var3 = this.field1995;
         var4 = this.field1988;
         var5 = this.field1991;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var6 = true;
         if (!class142.field1314.method6464(var3, 0)) {
            var6 = false;
         }

         if (var4 != -1 && !class142.field1314.method6464(var4, 0)) {
            var6 = false;
         }

         if (var5 != -1 && !class142.field1314.method6464(var5, 0)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final class213 method3504(int var1) {
      int var3 = this.field1984;
      int var4 = this.field1985;
      int var5 = this.field1990;
      if (var1 == 1) {
         var3 = this.field1995;
         var4 = this.field1988;
         var5 = this.field1991;
      }

      if (var3 == -1) {
         return null;
      } else {
         class213 var6 = class213.method3952(class142.field1314, var3, 0);
         if (var4 != -1) {
            class213 var7 = class213.method3952(class142.field1314, var4, 0);
            if (var5 != -1) {
               class213 var8 = class213.method3952(class142.field1314, var5, 0);
               class213[] var9 = new class213[]{var6, var7, var8};
               var6 = new class213(var9, 3);
            } else {
               class213[] var11 = new class213[]{var6, var7};
               var6 = new class213(var11, 2);
            }
         }

         if (var1 == 0 && 0 != this.field1986) {
            var6.method4004(0, this.field1986, 0);
         }

         if (var1 == 1 && this.field1989 != 0) {
            var6.method4004(0, this.field1989, 0);
         }

         int var10;
         if (null != this.field1961) {
            for(var10 = 0; var10 < this.field1961.length; ++var10) {
               var6.method3968(this.field1961[var10], this.field1966[var10]);
            }
         }

         if (this.field1967 != null) {
            for(var10 = 0; var10 < this.field1967.length; ++var10) {
               var6.method3969(this.field1967[var10], this.field1968[var10]);
            }
         }

         return var6;
      }
   }

   public final boolean method3505(int var1) {
      int var3 = this.field1964;
      int var4 = this.field1993;
      if (var1 == 1) {
         var3 = this.field1994;
         var4 = this.field2004;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!class142.field1314.method6464(var3, 0)) {
            var5 = false;
         }

         if (var4 != -1 && !class142.field1314.method6464(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   public final class213 method3556(int var1) {
      int var3 = this.field1964;
      int var4 = this.field1993;
      if (var1 == 1) {
         var3 = this.field1994;
         var4 = this.field2004;
      }

      if (var3 == -1) {
         return null;
      } else {
         class213 var5 = class213.method3952(class142.field1314, var3, 0);
         if (var4 != -1) {
            class213 var6 = class213.method3952(class142.field1314, var4, 0);
            class213[] var7 = new class213[]{var5, var6};
            var5 = new class213(var7, 2);
         }

         int var8;
         if (this.field1961 != null) {
            for(var8 = 0; var8 < this.field1961.length; ++var8) {
               var5.method3968(this.field1961[var8], this.field1966[var8]);
            }
         }

         if (this.field1967 != null) {
            for(var8 = 0; var8 < this.field1967.length; ++var8) {
               var5.method3969(this.field1967[var8], this.field1968[var8]);
            }
         }

         return var5;
      }
   }

   public int method3507(int var1, int var2) {
      return class200.method3300(this.field1963, var1, var2);
   }

   public String method3508(int var1, String var2) {
      class469 var5 = this.field1963;
      String var4;
      if (var5 == null) {
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

   public int method3547() {
      if (this.field1983 != -1 && this.field1982 != null) {
         if (this.field1983 >= 0) {
            return null != this.field1982[this.field1983] ? this.field1983 : -1;
         } else {
            return class364.field4150.equalsIgnoreCase(this.field1982[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   boolean method3518() {
      return this.field1966 != null;
   }

   boolean method3511() {
      return this.field1968 != null;
   }
}
