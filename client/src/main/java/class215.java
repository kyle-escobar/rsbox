import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class215 extends class476 {
   static boolean field2334 = false;
   static class290 field2335 = new class290(64);
   static class290 field2342 = new class290(100);
   static class290 field2354 = new class290(100);
   static class342 field2350;
   boolean[] field2348;
   int field2340 = 0;
   int field2341 = 0;
   int[] field2343;
   int[] field2347;
   public boolean field2349 = false;
   public boolean field2357 = false;
   public int field2330 = 5;
   public int field2338 = -1;
   public int field2345 = -1;
   public int field2346 = 2;
   public int field2351 = -1;
   public int field2352 = -1;
   public int field2353 = 99;
   public int field2355 = -1;
   public int field2356 = -1;
   public int[] field2336;
   public int[] field2337;
   public int[] field2344;
   public Map field2339;

   class215() {
   }

   public static void method7149(class342 var0, class342 var1, class342 var2) {
      field2350 = var0;
      class323.field3536 = var1;
      class176.field1856 = var2;
   }

   public static class215 method2582(int var0) {
      class215 var2 = (class215)field2335.method5643((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field2350.method6381(12, var0);
         var2 = new class215();
         if (var3 != null) {
            var2.method4048(new PacketBuffer(var3));
         }

         var2.method4051();
         field2335.method5640(var2, (long)var0);
         return var2;
      }
   }

   static class247 method3309(int var0) {
      class247 var2 = (class247)field2354.method5643((long)var0);
      if (null != var2) {
         return var2;
      } else {
         var2 = class247.method2455(class323.field3536, class176.field1856, var0, false);
         if (null != var2) {
            field2354.method5640(var2, (long)var0);
         }

         return var2;
      }
   }

   public static int method5358(int var0) {
      class156 var3 = (class156)field2342.method5643((long)var0);
      class156 var2;
      if (null != var3) {
         var2 = var3;
      } else {
         class342 var5 = class323.field3536;
         class342 var6 = class176.field1856;
         boolean var7 = true;
         byte[] var8 = var5.method6389(var0 >> 16 & '\uffff', var0 & '\uffff');
         class156 var4;
         if (null == var8) {
            var7 = false;
            var4 = null;
         } else {
            int var9 = (var8[1] & 255) << 8 | var8[2] & 255;
            byte[] var10 = var6.method6389(var9, 0);
            if (var10 == null) {
               var7 = false;
            }

            if (!var7) {
               var4 = null;
            } else {
               if (null == class34.field173) {
                  class118.field1132 = Runtime.getRuntime().availableProcessors();
                  class34.field173 = new ThreadPoolExecutor(0, class118.field1132, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class118.field1132 * 100 + 100), new class198());
               }

               try {
                  var4 = new class156(var5, var6, var0, false);
               } catch (Exception var12) {
                  var4 = null;
               }
            }
         }

         if (null != var4) {
            field2342.method5640(var4, (long)var0);
         }

         var2 = var4;
      }

      if (null == var2) {
         return 2;
      } else {
         return var2.method2660() ? 0 : 1;
      }
   }

   static class156 method3425(int var0) {
      if (method5358(var0) != 0) {
         return null;
      } else {
         class156 var3 = (class156)field2342.method5643((long)var0);
         if (null == var3) {
            class342 var5 = class323.field3536;
            class342 var6 = class176.field1856;
            boolean var7 = true;
            byte[] var8 = var5.method6389(var0 >> 16 & '\uffff', var0 & '\uffff');
            class156 var4;
            if (null == var8) {
               var7 = false;
               var4 = null;
            } else {
               int var9 = (var8[1] & 255) << 8 | var8[2] & 255;
               byte[] var10 = var6.method6389(var9, 0);
               if (var10 == null) {
                  var7 = false;
               }

               if (!var7) {
                  var4 = null;
               } else {
                  if (class34.field173 == null) {
                     class118.field1132 = Runtime.getRuntime().availableProcessors();
                     class34.field173 = new ThreadPoolExecutor(0, class118.field1132, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class118.field1132 * 100 + 100), new class203());
                  }

                  try {
                     var4 = new class156(var5, var6, var0, false);
                  } catch (Exception var12) {
                     var4 = null;
                  }
               }
            }

            var3 = var4;
            if (var4 != null) {
               field2342.method5640(var4, (long)var0);
            }
         }

         return var3;
      }
   }

   public static void method8092() {
      field2335.method5637();
      field2354.method5637();
      field2342.method5637();
   }

   void method4048(PacketBuffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method4050(var1, var3);
      }
   }

   void method4050(PacketBuffer var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.readUnsignedShort();
         this.field2344 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2344[var5] = var1.readUnsignedShort();
         }

         this.field2336 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2336[var5] = var1.readUnsignedShort();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2336[var5] += var1.readUnsignedShort() << 16;
         }
      } else if (var2 == 2) {
         this.field2355 = var1.readUnsignedShort();
      } else if (var2 == 3) {
         var4 = var1.readUnsignedByte();
         this.field2347 = new int[var4 + 1];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2347[var5] = var1.readUnsignedByte();
         }

         this.field2347[var4] = 9999999;
      } else if (var2 == 4) {
         this.field2349 = true;
      } else if (var2 == 5) {
         this.field2330 = var1.readUnsignedByte();
      } else if (var2 == 6) {
         this.field2345 = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.field2352 = var1.readUnsignedShort();
      } else if (var2 == 8) {
         this.field2353 = var1.readUnsignedByte();
         this.field2357 = true;
      } else if (var2 == 9) {
         this.field2351 = var1.readUnsignedByte();
      } else if (var2 == 10) {
         this.field2356 = var1.readUnsignedByte();
      } else if (var2 == 11) {
         this.field2346 = var1.readUnsignedByte();
      } else if (var2 == 12) {
         var4 = var1.readUnsignedByte();
         this.field2343 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2343[var5] = var1.readUnsignedShort();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2343[var5] += var1.readUnsignedShort() << 16;
         }
      } else if (var2 == 13) {
         var4 = var1.readUnsignedByte();
         this.field2337 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2337[var5] = var1.readUnsignedMedium();
         }
      } else if (var2 == 14) {
         this.field2338 = var1.readInt();
      } else if (var2 == 15) {
         var4 = var1.readUnsignedShort();
         this.field2339 = new HashMap();

         for(var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.readUnsignedShort();
            int var7 = var1.readUnsignedMedium();
            this.field2339.put(var6, var7);
         }
      } else if (var2 == 16) {
         this.field2340 = var1.readUnsignedShort();
         this.field2341 = var1.readUnsignedShort();
      } else if (var2 == 17) {
         this.field2348 = new boolean[256];

         for(var4 = 0; var4 < this.field2348.length; ++var4) {
            this.field2348[var4] = false;
         }

         var4 = var1.readUnsignedByte();

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2348[var1.readUnsignedByte()] = true;
         }
      }

   }

   void method4051() {
      if (-1 == this.field2351) {
         if (this.field2347 == null && null == this.field2348) {
            this.field2351 = 0;
         } else {
            this.field2351 = 2;
         }
      }

      if (this.field2356 == -1) {
         if (this.field2347 == null && null == this.field2348) {
            this.field2356 = 0;
         } else {
            this.field2356 = 2;
         }
      }

   }

   public class249 method4052(class249 var1, int var2) {
      class249 var5;
      if (!this.method4058()) {
         var2 = this.field2336[var2];
         class247 var6 = method3309(var2 >> 16);
         var2 &= 65535;
         if (null == var6) {
            return var1.method4759(true);
         } else {
            var5 = var1.method4759(!var6.method4738(var2));
            var5.method4821(var6, var2);
            return var5;
         }
      } else {
         class156 var4 = method3425(this.field2338);
         if (null == var4) {
            return var1.method4759(true);
         } else {
            var5 = var1.method4759(!var4.method2677());
            var5.method4767(var4, var2);
            return var5;
         }
      }
   }

   class249 method4053(class249 var1, int var2, int var3) {
      class249 var6;
      if (!this.method4058()) {
         var2 = this.field2336[var2];
         class247 var7 = method3309(var2 >> 16);
         var2 &= 65535;
         if (null == var7) {
            return var1.method4759(true);
         } else {
            var6 = var1.method4759(!var7.method4738(var2));
            var3 &= 3;
            if (var3 == 1) {
               var6.method4857();
            } else if (var3 == 2) {
               var6.method4777();
            } else if (var3 == 3) {
               var6.method4774();
            }

            var6.method4821(var7, var2);
            if (var3 == 1) {
               var6.method4774();
            } else if (var3 == 2) {
               var6.method4777();
            } else if (var3 == 3) {
               var6.method4857();
            }

            return var6;
         }
      } else {
         class156 var5 = method3425(this.field2338);
         if (null == var5) {
            return var1.method4759(true);
         } else {
            var6 = var1.method4759(!var5.method2677());
            var3 &= 3;
            if (var3 == 1) {
               var6.method4857();
            } else if (var3 == 2) {
               var6.method4777();
            } else if (var3 == 3) {
               var6.method4774();
            }

            var6.method4767(var5, var2);
            if (var3 == 1) {
               var6.method4774();
            } else if (var3 == 2) {
               var6.method4777();
            } else if (var3 == 3) {
               var6.method4857();
            }

            return var6;
         }
      }
   }

   class249 method4054(class249 var1, int var2) {
      class249 var5;
      if (!this.method4058()) {
         var2 = this.field2336[var2];
         class247 var6 = method3309(var2 >> 16);
         var2 &= 65535;
         if (null == var6) {
            return var1.method4760(true);
         } else {
            var5 = var1.method4760(!var6.method4738(var2));
            var5.method4821(var6, var2);
            return var5;
         }
      } else {
         class156 var4 = method3425(this.field2338);
         if (null == var4) {
            return var1.method4760(true);
         } else {
            var5 = var1.method4760(!var4.method2677());
            var5.method4767(var4, var2);
            return var5;
         }
      }
   }

   public class249 method4055(class249 var1, int var2, class215 var3, int var4) {
      if (field2334 && !this.method4058() && !var3.method4058()) {
         return this.method4056(var1, var2, var3, var4);
      } else {
         class249 var6 = var1.method4759(false);
         boolean var7 = false;
         class247 var8 = null;
         class219 var9 = null;
         class156 var10;
         if (this.method4058()) {
            var10 = this.method4065();
            if (var10 == null) {
               return var6;
            }

            if (var3.method4058() && null == this.field2348) {
               var6.method4767(var10, var2);
               return var6;
            }

            var9 = var10.field1425;
            var6.method4771(var9, var10, var2, this.field2348, false, !var3.method4058());
         } else {
            var2 = this.field2336[var2];
            var8 = method3309(var2 >> 16);
            var2 &= 65535;
            if (var8 == null) {
               return var3.method4052(var1, var4);
            }

            if (!var3.method4058() && (null == this.field2347 || var4 == -1)) {
               var6.method4821(var8, var2);
               return var6;
            }

            if (this.field2347 == null || var4 == -1) {
               var6.method4821(var8, var2);
               return var6;
            }

            var7 = var3.method4058();
            if (!var7) {
               var6.method4772(var8, var2, this.field2347, false);
            }
         }

         if (var3.method4058()) {
            var10 = var3.method4065();
            if (null == var10) {
               return var6;
            }

            if (var9 == null) {
               var9 = var10.field1425;
            }

            var6.method4771(var9, var10, var4, this.field2348, true, true);
         } else {
            var4 = var3.field2336[var4];
            class247 var11 = method3309(var4 >> 16);
            var4 &= 65535;
            if (null == var11) {
               return this.method4052(var1, var2);
            }

            var6.method4772(var11, var4, this.field2347, true);
         }

         if (var7 && null != var8) {
            var6.method4772(var8, var2, this.field2347, false);
         }

         var6.method4790();
         return var6;
      }
   }

   class249 method4056(class249 var1, int var2, class215 var3, int var4) {
      var2 = this.field2336[var2];
      class247 var6 = method3309(var2 >> 16);
      var2 &= 65535;
      if (null == var6) {
         return var3.method4052(var1, var4);
      } else {
         var4 = var3.field2336[var4];
         class247 var7 = method3309(var4 >> 16);
         var4 &= 65535;
         class249 var8;
         if (null == var7) {
            var8 = var1.method4759(!var6.method4738(var2));
            var8.method4821(var6, var2);
            return var8;
         } else {
            var8 = var1.method4759(!var6.method4738(var2) & !var7.method4738(var4));
            var8.method4865(var6, var2, var7, var4, this.field2347);
            return var8;
         }
      }
   }

   public class249 method4057(class249 var1, int var2) {
      if (!this.method4058()) {
         int var4 = this.field2336[var2];
         class247 var5 = method3309(var4 >> 16);
         var4 &= 65535;
         if (var5 == null) {
            return var1.method4759(true);
         } else {
            class247 var6 = null;
            int var7 = 0;
            if (null != this.field2343 && var2 < this.field2343.length) {
               var7 = this.field2343[var2];
               var6 = method3309(var7 >> 16);
               var7 &= 65535;
            }

            class249 var8;
            if (var6 != null && var7 != 65535) {
               var8 = var1.method4759(!var5.method4738(var4) & !var6.method4738(var7));
               var8.method4821(var5, var4);
               var8.method4821(var6, var7);
               return var8;
            } else {
               var8 = var1.method4759(!var5.method4738(var4));
               var8.method4821(var5, var4);
               return var8;
            }
         }
      } else {
         return this.method4052(var1, var2);
      }
   }

   public boolean method4058() {
      return this.field2338 >= 0;
   }

   public int method4059() {
      return this.field2341 - this.field2340;
   }

   class156 method4065() {
      return this.method4058() ? method3425(this.field2338) : null;
   }
}
