public class class197 extends class476 {
   public static class290 field2150 = new class290(256);
   public static class342 field2151;
   byte[] field2169;
   int field2153 = -1;
   int field2162 = Integer.MAX_VALUE;
   int field2163 = Integer.MAX_VALUE;
   int field2165 = Integer.MIN_VALUE;
   int field2167 = Integer.MIN_VALUE;
   int[] field2155;
   int[] field2161;
   public boolean field2157 = true;
   public boolean field2171 = false;
   public class194 field2164;
   public class208 field2166;
   public int field2152 = -1;
   public int field2156 = 0;
   public int field2160;
   public int field2170;
   public String field2154;
   public String field2159;
   public String[] field2149 = new String[5];
   public final int field2158;

   public class197(int var1) {
      this.field2166 = class208.field2238;
      this.field2164 = class194.field2129;
      this.field2170 = -1;
      this.field2158 = var1;
   }

   public static class197 method4100(int var0) {
      return var0 >= 0 && var0 < class324.field3540.length && class324.field3540[var0] != null ? class324.field3540[var0] : new class197(var0);
   }

   public void method3769(PacketBuffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method3770(var1, var3);
      }
   }

   void method3770(PacketBuffer var1, int var2) {
      if (var2 == 1) {
         this.field2152 = var1.method8814();
      } else if (var2 == 2) {
         this.field2153 = var1.method8814();
      } else if (var2 == 3) {
         this.field2154 = var1.readString();
      } else if (var2 == 4) {
         this.field2160 = var1.readUnsignedMedium();
      } else if (var2 == 5) {
         var1.readUnsignedMedium();
      } else if (var2 == 6) {
         this.field2156 = var1.readUnsignedByte();
      } else {
         int var4;
         if (var2 == 7) {
            var4 = var1.readUnsignedByte();
            if (0 == (var4 & 1)) {
               this.field2157 = false;
            }

            if ((var4 & 2) == 2) {
               this.field2171 = true;
            }
         } else if (var2 == 8) {
            var1.readUnsignedByte();
         } else if (var2 >= 10 && var2 <= 14) {
            this.field2149[var2 - 10] = var1.readString();
         } else if (var2 == 15) {
            var4 = var1.readUnsignedByte();
            this.field2161 = new int[var4 * 2];

            int var5;
            for(var5 = 0; var5 < var4 * 2; ++var5) {
               this.field2161[var5] = var1.readShort();
            }

            var1.readInt();
            var5 = var1.readUnsignedByte();
            this.field2155 = new int[var5];

            int var6;
            for(var6 = 0; var6 < this.field2155.length; ++var6) {
               this.field2155[var6] = var1.readInt();
            }

            this.field2169 = new byte[var4];

            for(var6 = 0; var6 < var4; ++var6) {
               this.field2169[var6] = var1.readByte();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.field2159 = var1.readString();
            } else if (var2 == 18) {
               var1.method8814();
            } else if (var2 == 19) {
               this.field2170 = var1.readUnsignedShort();
            } else if (var2 == 21) {
               var1.readInt();
            } else if (var2 == 22) {
               var1.readInt();
            } else if (var2 == 23) {
               var1.readUnsignedByte();
               var1.readUnsignedByte();
               var1.readUnsignedByte();
            } else if (var2 == 24) {
               var1.readShort();
               var1.readShort();
            } else if (var2 == 25) {
               var1.method8814();
            } else if (var2 == 28) {
               var1.readUnsignedByte();
            } else if (var2 == 29) {
               class208[] var7 = new class208[]{class208.field2238, class208.field2244, class208.field2240};
               this.field2166 = (class208)class373.method1724(var7, var1.readUnsignedByte());
            } else if (var2 == 30) {
               this.field2164 = (class194)class373.method1724(class194.method7713(), var1.readUnsignedByte());
            }
         }
      }

   }

   public void method3778() {
      if (this.field2161 != null) {
         for(int var2 = 0; var2 < this.field2161.length; var2 += 2) {
            if (this.field2161[var2] < this.field2162) {
               this.field2162 = this.field2161[var2];
            } else if (this.field2161[var2] > this.field2167) {
               this.field2167 = this.field2161[var2];
            }

            if (this.field2161[var2 + 1] < this.field2163) {
               this.field2163 = this.field2161[var2 + 1];
            } else if (this.field2161[var2 + 1] > this.field2165) {
               this.field2165 = this.field2161[var2 + 1];
            }
         }
      }

   }

   public class523 method3771(boolean var1) {
      int var3 = var1 ? this.field2153 : this.field2152;
      return this.method3790(var3);
   }

   class523 method3790(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         class523 var3 = (class523)field2150.method5643((long)var1);
         if (var3 != null) {
            return var3;
         } else {
            var3 = class485.method8408(field2151, var1, 0);
            if (var3 != null) {
               field2150.method5640(var3, (long)var1);
            }

            return var3;
         }
      }
   }

   public int method3774() {
      return this.field2158;
   }
}
