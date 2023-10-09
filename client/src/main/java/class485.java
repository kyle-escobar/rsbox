import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class485 {
   static final class475 field4887;
   static final class475 field4889;
   static final class475 field4921;
   boolean field4911 = false;
   boolean field4927 = false;
   boolean field4932 = true;
   class240 field4897;
   class253 field4882;
   class253 field4888;
   class253 field4895;
   class330 field4933 = null;
   class342 field4884;
   class342 field4885;
   class342 field4916;
   class393 field4890;
   class488 field4898;
   class523 field4935;
   class537[] field4892;
   float field4903;
   float field4929;
   int field4880 = 50;
   int field4881 = -1;
   int field4886 = 3;
   int field4894 = -1;
   int field4896 = -1;
   int field4899;
   int field4901 = -1;
   int field4905 = -1;
   int field4906 = -1;
   int field4908 = -1;
   int field4910;
   int field4913;
   int field4914 = -1;
   int field4915 = -1;
   int field4917 = -1;
   int field4918 = -1;
   int field4920;
   int field4922 = -1;
   int field4928 = 0;
   int field4936;
   int field4937 = -1;
   int field4938 = -1;
   int field4939 = -1;
   HashMap field4891;
   HashMap field4893;
   HashSet field4902 = new HashSet();
   HashSet field4923 = new HashSet();
   HashSet field4924 = new HashSet();
   HashSet field4925 = new HashSet();
   HashSet field4926 = new HashSet();
   HashSet field4934 = null;
   Iterator field4931;
   List field4930;
   long field4919;
   final int[] field4904 = new int[]{1008, 1009, 1010, 1011, 1012};
   public boolean field4900 = false;

   static {
      field4921 = class475.field4837;
      field4887 = class475.field4838;
      field4889 = class475.field4841;
   }

   public static class523 method8408(class342 var0, int var1, int var2) {
      byte[] var5 = var0.method6381(var1, var2);
      boolean var4;
      if (var5 == null) {
         var4 = false;
      } else {
         class538.method3764(var5);
         var4 = true;
      }

      return !var4 ? null : class538.method3296();
   }

   public void method8388(class342 var1, class342 var2, class342 var3, class393 var4, HashMap var5, class537[] var6) {
      this.field4892 = var6;
      this.field4884 = var1;
      this.field4885 = var2;
      this.field4916 = var3;
      this.field4890 = var4;
      this.field4891 = new HashMap();
      this.field4891.put(class244.field2686, var5.get(field4921));
      this.field4891.put(class244.field2687, var5.get(field4887));
      this.field4891.put(class244.field2688, var5.get(field4889));
      this.field4898 = new class488(var1);
      int var8 = this.field4884.getGroupId(class276.field3025.field3022);
      int[] var9 = this.field4884.method6392(var8);
      int var10 = null == var9 ? 0 : var9.length;
      this.field4893 = new HashMap(var10);

      for(int var11 = 0; var11 < var10; ++var11) {
         Buffer var12 = new Buffer(this.field4884.method6381(var8, var9[var11]));
         class253 var13 = new class253();
         var13.method4955(var12, var9[var11]);
         this.field4893.put(var13.method4937(), var13);
         if (var13.method4936()) {
            this.field4888 = var13;
         }
      }

      this.method8220(this.field4888);
      this.field4882 = null;
   }

   public void method8206() {
      class256.field2910.method5659(5);
   }

   public void method8207(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.field4898.method8415()) {
         this.method8291();
         this.method8211();
         if (var3) {
            int var9 = (int)Math.ceil((double)((float)var6 / this.field4903));
            int var10 = (int)Math.ceil((double)((float)var7 / this.field4903));
            List var11 = this.field4897.method4649(this.field4899 - var9 / 2 - 1, this.field4913 - var10 / 2 - 1, this.field4899 + var9 / 2 + 1, 1 + var10 / 2 + this.field4913, var4, var5, var6, var7, var1, var2);
            HashSet var12 = new HashSet();

            Iterator var13;
            class282 var14;
            class87 var15;
            class272 var16;
            for(var13 = var11.iterator(); var13.hasNext(); class63.method1516(var15)) {
               var14 = (class282)var13.next();
               var12.add(var14);
               var15 = new class87();
               var16 = new class272(var14.method5405(), var14.field3043, var14.field3046);
               var15.method1893(new Object[]{var16, var1, var2});
               if (this.field4902.contains(var14)) {
                  var15.method1894(17);
               } else {
                  var15.method1894(15);
               }
            }

            var13 = this.field4902.iterator();

            while(var13.hasNext()) {
               var14 = (class282)var13.next();
               if (!var12.contains(var14)) {
                  var15 = new class87();
                  var16 = new class272(var14.method5405(), var14.field3043, var14.field3046);
                  var15.method1893(new Object[]{var16, var1, var2});
                  var15.method1894(16);
                  class63.method1516(var15);
               }
            }

            this.field4902 = var12;
         }
      }
   }

   public void method8208(int var1, int var2, boolean var3, boolean var4) {
      long var6;
      label33: {
         var6 = class302.safeTime();
         this.method8209(var1, var2, var4, var6);
         if (!this.method8330() && (var4 || var3)) {
            boolean var8 = null != Client.field1512;
            if (!var8) {
               if (var4) {
                  this.field4917 = var1;
                  this.field4918 = var2;
                  this.field4894 = this.field4899;
                  this.field4896 = this.field4913;
               }

               if (-1 != this.field4894) {
                  int var9 = var1 - this.field4917;
                  int var10 = var2 - this.field4918;
                  this.method8212(this.field4894 - (int)((float)var9 / this.field4929), this.field4896 + (int)((float)var10 / this.field4929), false);
               }
               break label33;
            }
         }

         this.method8213();
      }

      if (var4) {
         this.field4919 = var6;
         this.field4920 = var1;
         this.field4910 = var2;
      }

   }

   void method8209(int var1, int var2, boolean var3, long var4) {
      if (null != this.field4895) {
         int var6 = (int)((float)this.field4899 + ((float)(var1 - this.field4906) - (float)this.method8242() * this.field4903 / 2.0F) / this.field4903);
         int var7 = (int)((float)this.field4913 - ((float)(var2 - this.field4908) - (float)this.method8280() * this.field4903 / 2.0F) / this.field4903);
         this.field4933 = this.field4895.method4933(var6 + this.field4895.method4974() * 64, var7 + this.field4895.method4943() * 64);
         if (this.field4933 != null && var3) {
            class216 var8 = Client.method4736();
            int var10;
            int var11;
            if (Client.method3215() && var8.isKeyDown(82) && var8.isKeyDown(81)) {
               int var13 = this.field4933.field3581;
               var10 = this.field4933.field3583;
               var11 = this.field4933.field3582;
               class308 var12 = class308.createPacket(ClientPacket.field3432, Client.serverConnection.field1046);
               var12.buffer.readIntME(0);
               var12.buffer.writeShortLEAdd(var13);
               var12.buffer.writeByteAdd(var11);
               var12.buffer.writeShortAdd(var10);
               Client.serverConnection.write(var12);
            } else {
               boolean var9 = true;
               if (this.field4932) {
                  var10 = var1 - this.field4920;
                  var11 = var2 - this.field4910;
                  if (var4 - this.field4919 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                     var9 = false;
                  }
               }

               if (var9) {
                  class308 var14 = class308.createPacket(ClientPacket.field3409, Client.serverConnection.field1046);
                  var14.buffer.readIntIME(this.field4933.method6190());
                  Client.serverConnection.write(var14);
                  this.field4919 = 0L;
               }
            }
         }
      } else {
         this.field4933 = null;
      }

   }

   void method8291() {
      if (null != class121.field1152) {
         this.field4903 = this.field4929;
      } else {
         if (this.field4903 < this.field4929) {
            this.field4903 = Math.min(this.field4929, this.field4903 / 30.0F + this.field4903);
         }

         if (this.field4903 > this.field4929) {
            this.field4903 = Math.max(this.field4929, this.field4903 - this.field4903 / 30.0F);
         }

      }
   }

   void method8211() {
      if (this.method8330()) {
         int var2 = this.field4901 - this.field4899;
         int var3 = this.field4881 - this.field4913;
         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         if (var3 != 0) {
            var3 /= Math.min(8, Math.abs(var3));
         }

         this.method8212(var2 + this.field4899, this.field4913 + var3, true);
         if (this.field4901 == this.field4899 && this.field4881 == this.field4913) {
            this.field4901 = -1;
            this.field4881 = -1;
         }

      }
   }

   final void method8212(int var1, int var2, boolean var3) {
      this.field4899 = var1;
      this.field4913 = var2;
      class302.safeTime();
      if (var3) {
         this.method8213();
      }

   }

   final void method8213() {
      this.field4918 = -1;
      this.field4917 = -1;
      this.field4896 = -1;
      this.field4894 = -1;
   }

   boolean method8330() {
      return this.field4901 != -1 && -1 != this.field4881;
   }

   public class253 method8215(int var1, int var2, int var3) {
      Iterator var5 = this.field4893.values().iterator();

      class253 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class253)var5.next();
      } while(!var6.method4998(var1, var2, var3));

      return var6;
   }

   public void method8216(int var1, int var2, int var3, boolean var4) {
      class253 var6 = this.method8215(var1, var2, var3);
      if (null == var6) {
         if (!var4) {
            return;
         }

         var6 = this.field4888;
      }

      boolean var7 = false;
      if (var6 != this.field4882 || var4) {
         this.field4882 = var6;
         this.method8220(var6);
         var7 = true;
      }

      if (var7 || var4) {
         this.method8223(var1, var2, var3);
      }

   }

   public void method8396(int var1) {
      class253 var3 = this.method8376(var1);
      if (var3 != null) {
         this.method8220(var3);
      }

   }

   public int method8315() {
      return this.field4895 == null ? -1 : this.field4895.method4935();
   }

   public class253 method8219() {
      return this.field4895;
   }

   void method8220(class253 var1) {
      if (this.field4895 == null || var1 != this.field4895) {
         this.method8353(var1);
         this.method8223(-1, -1, -1);
      }
   }

   void method8353(class253 var1) {
      this.field4895 = var1;
      this.field4897 = new class240(this.field4892, this.field4891, this.field4885, this.field4916);
      this.field4898.method8413(this.field4895 == null ? null : this.field4895.method4937());
   }

   public void method8333(class253 var1, class330 var2, class330 var3, boolean var4) {
      if (null != var1) {
         if (null == this.field4895 || var1 != this.field4895) {
            this.method8353(var1);
         }

         if (!var4 && this.field4895.method4998(var2.field3582, var2.field3581, var2.field3583)) {
            this.method8223(var2.field3582, var2.field3581, var2.field3583);
         } else {
            this.method8223(var3.field3582, var3.field3581, var3.field3583);
         }

      }
   }

   void method8223(int var1, int var2, int var3) {
      if (this.field4895 != null) {
         int[] var5 = this.field4895.method4932(var1, var2, var3);
         if (var5 == null) {
            var5 = this.field4895.method4932(this.field4895.method4946(), this.field4895.method4927(), this.field4895.method4947());
         }

         this.method8212(var5[0] - this.field4895.method4974() * 64, var5[1] - this.field4895.method4943() * 64, true);
         this.field4901 = -1;
         this.field4881 = -1;
         this.field4903 = this.method8230(this.field4895.method4940());
         this.field4929 = this.field4903;
         this.field4930 = null;
         this.field4931 = null;
         this.field4897.method4626();
      }
   }

   public void method8398(int var1, int var2, int var3, int var4, int var5) {
      int[] var7 = new int[4];
      class535.method9240(var7);
      class535.method9304(var1, var2, var3 + var1, var2 + var4);
      class535.method9231(var1, var2, var3, var4, -16777216);
      int var8 = this.field4898.method8416();
      if (var8 < 100) {
         this.method8229(var1, var2, var3, var4, var8);
      } else {
         if (!this.field4897.method4623()) {
            this.field4897.method4616(this.field4884, this.field4895.method4937(), Client.field1435);
            if (!this.field4897.method4623()) {
               return;
            }
         }

         if (null != this.field4934) {
            ++this.field4914;
            if (this.field4914 % this.field4880 == 0) {
               this.field4914 = 0;
               ++this.field4915;
            }

            if (this.field4915 >= this.field4886 && !this.field4911) {
               this.field4934 = null;
            }
         }

         int var9 = (int)Math.ceil((double)((float)var3 / this.field4903));
         int var10 = (int)Math.ceil((double)((float)var4 / this.field4903));
         this.field4897.method4618(this.field4899 - var9 / 2, this.field4913 - var10 / 2, this.field4899 + var9 / 2, var10 / 2 + this.field4913, var1, var2, var3 + var1, var2 + var4);
         if (!this.field4927) {
            boolean var11 = false;
            if (var5 - this.field4928 > 100) {
               this.field4928 = var5;
               var11 = true;
            }

            this.field4897.method4619(this.field4899 - var9 / 2, this.field4913 - var10 / 2, this.field4899 + var9 / 2, var10 / 2 + this.field4913, var1, var2, var1 + var3, var2 + var4, this.field4926, this.field4934, this.field4914, this.field4880, var11);
         }

         this.method8281(var1, var2, var3, var4, var9, var10);
         if (Client.method3215() && this.field4900 && this.field4933 != null) {
            this.field4890.method7163("Coord: " + this.field4933, class535.field5208 + 10, class535.field5206 + 20, 16776960, -1);
         }

         this.field4922 = var9;
         this.field4905 = var10;
         this.field4906 = var1;
         this.field4908 = var2;
         class535.method9226(var7);
      }
   }

   boolean method8225(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null == this.field4935) {
         return true;
      } else if (var1 == this.field4935.field5148 && var2 == this.field4935.field5153) {
         if (this.field4897.field2669 != this.field4936) {
            return true;
         } else if (Client.field1708 != this.field4939) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var1 + var3 < var5 || var4 + var2 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void method8281(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class121.field1152 != null) {
         int var8 = 512 / (this.field4897.field2669 * 2);
         int var9 = var3 + 512;
         int var10 = var4 + 512;
         float var11 = 1.0F;
         var9 = (int)((float)var9 / var11);
         var10 = (int)((float)var10 / var11);
         int var12 = this.method8265() - var5 / 2 - var8;
         int var13 = this.method8240() - var6 / 2 - var8;
         int var14 = var1 - this.field4897.field2669 * (var12 + var8 - this.field4937);
         int var15 = var2 - this.field4897.field2669 * (var8 - (var13 - this.field4938));
         if (this.method8225(var9, var10, var14, var15, var3, var4)) {
            if (this.field4935 != null && this.field4935.field5148 == var9 && this.field4935.field5153 == var10) {
               Arrays.fill(this.field4935.field5147, 0);
            } else {
               this.field4935 = new class523(var9, var10);
            }

            this.field4937 = this.method8265() - var5 / 2 - var8;
            this.field4938 = this.method8240() - var6 / 2 - var8;
            this.field4936 = this.field4897.field2669;
            class121.field1152.method6824(this.field4937, this.field4938, this.field4935, (float)this.field4936 / var11);
            this.field4939 = Client.field1708;
            var14 = var1 - (var12 + var8 - this.field4937) * this.field4897.field2669;
            var15 = var2 - (var8 - (var13 - this.field4938)) * this.field4897.field2669;
         }

         class535.method9230(var1, var2, var3, var4, 0, 128);
         if (var11 == 1.0F) {
            this.field4935.method9021(var14, var15, 192);
         } else {
            this.field4935.method9140(var14, var15, (int)((float)var9 * var11), (int)((float)var10 * var11), 192);
         }
      }

   }

   public void method8294(int var1, int var2, int var3, int var4) {
      if (this.field4898.method8415()) {
         if (!this.field4897.method4623()) {
            this.field4897.method4616(this.field4884, this.field4895.method4937(), Client.field1435);
            if (!this.field4897.method4623()) {
               return;
            }
         }

         this.field4897.method4620(var1, var2, var3, var4, this.field4934, this.field4914, this.field4880);
      }
   }

   public void method8228(int var1) {
      this.field4929 = this.method8230(var1);
   }

   void method8229(int var1, int var2, int var3, int var4, int var5) {
      byte var7 = 20;
      int var8 = var1 + var3 / 2;
      int var9 = var4 / 2 + var2 - 18 - var7;
      class535.method9231(var1, var2, var3, var4, -16777216);
      class535.method9223(var8 - 152, var9, 304, 34, -65536);
      class535.method9231(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
      this.field4890.method7166(class364.field4034, var8, var9 + var7, -1, -1);
   }

   float method8230(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (var1 == 37) {
         return 1.5F;
      } else if (var1 == 50) {
         return 2.0F;
      } else if (var1 == 75) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   public int method8231() {
      if (1.0 == (double)this.field4929) {
         return 25;
      } else if (1.5 == (double)this.field4929) {
         return 37;
      } else if ((double)this.field4929 == 2.0) {
         return 50;
      } else if ((double)this.field4929 == 3.0) {
         return 75;
      } else {
         return 4.0 == (double)this.field4929 ? 100 : 200;
      }
   }

   public void method8296() {
      this.field4898.method8414();
   }

   public boolean method8233() {
      return this.field4898.method8415();
   }

   public class253 method8376(int var1) {
      Iterator var3 = this.field4893.values().iterator();

      class253 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class253)var3.next();
      } while(var4.method4935() != var1);

      return var4;
   }

   public void method8235(int var1, int var2) {
      if (null != this.field4895 && this.field4895.method4931(var1, var2)) {
         this.field4901 = var1 - this.field4895.method4974() * 64;
         this.field4881 = var2 - this.field4895.method4943() * 64;
      }
   }

   public void method8236(int var1, int var2) {
      if (null != this.field4895) {
         this.method8212(var1 - this.field4895.method4974() * 64, var2 - this.field4895.method4943() * 64, true);
         this.field4901 = -1;
         this.field4881 = -1;
      }
   }

   public void method8237(int var1, int var2, int var3) {
      if (this.field4895 != null) {
         int[] var5 = this.field4895.method4932(var1, var2, var3);
         if (null != var5) {
            this.method8235(var5[0], var5[1]);
         }

      }
   }

   public void method8238(int var1, int var2, int var3) {
      if (null != this.field4895) {
         int[] var5 = this.field4895.method4932(var1, var2, var3);
         if (null != var5) {
            this.method8236(var5[0], var5[1]);
         }

      }
   }

   public int method8265() {
      return null == this.field4895 ? -1 : this.field4899 + this.field4895.method4974() * 64;
   }

   public int method8240() {
      return null == this.field4895 ? -1 : this.field4913 + this.field4895.method4943() * 64;
   }

   public class330 method8241() {
      return this.field4895 == null ? null : this.field4895.method4933(this.method8265(), this.method8240());
   }

   public int method8242() {
      return this.field4922;
   }

   public int method8280() {
      return this.field4905;
   }

   public void method8312(int var1) {
      if (var1 >= 1) {
         this.field4886 = var1;
      }

   }

   public void method8232() {
      this.field4886 = 3;
   }

   public void method8246(int var1) {
      if (var1 >= 1) {
         this.field4880 = var1;
      }

   }

   public void method8247() {
      this.field4880 = 50;
   }

   public void method8248(boolean var1) {
      this.field4911 = var1;
   }

   public void method8249(int var1) {
      this.field4934 = new HashSet();
      this.field4934.add(var1);
      this.field4915 = 0;
      this.field4914 = 0;
   }

   public void method8250(int var1) {
      this.field4934 = new HashSet();
      this.field4915 = 0;
      this.field4914 = 0;

      for(int var3 = 0; var3 < class62.field474; ++var3) {
         if (class197.method4100(var3) != null && class197.method4100(var3).field2170 == var1) {
            this.field4934.add(class197.method4100(var3).field2158);
         }
      }

   }

   public void method8251() {
      this.field4934 = null;
   }

   public void method8252(boolean var1) {
      this.field4927 = !var1;
   }

   public void method8253(int var1, boolean var2) {
      if (!var2) {
         this.field4923.add(var1);
      } else {
         this.field4923.remove(var1);
      }

      this.method8258();
   }

   public void method8254(int var1, boolean var2) {
      if (!var2) {
         this.field4924.add(var1);
      } else {
         this.field4924.remove(var1);
      }

      for(int var4 = 0; var4 < class62.field474; ++var4) {
         if (class197.method4100(var4) != null && class197.method4100(var4).field2170 == var1) {
            int var5 = class197.method4100(var4).field2158;
            if (!var2) {
               this.field4925.add(var5);
            } else {
               this.field4925.remove(var5);
            }
         }
      }

      this.method8258();
   }

   public boolean method8338() {
      return !this.field4927;
   }

   public boolean method8256(int var1) {
      return !this.field4923.contains(var1);
   }

   public boolean method8257(int var1) {
      return !this.field4924.contains(var1);
   }

   void method8258() {
      this.field4926.clear();
      this.field4926.addAll(this.field4923);
      this.field4926.addAll(this.field4925);
   }

   public void method8259(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field4898.method8415()) {
         int var8 = (int)Math.ceil((double)((float)var3 / this.field4903));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field4903));
         List var10 = this.field4897.method4649(this.field4899 - var8 / 2 - 1, this.field4913 - var9 / 2 - 1, 1 + var8 / 2 + this.field4899, 1 + var9 / 2 + this.field4913, var1, var2, var3, var4, var5, var6);
         if (!var10.isEmpty()) {
            Iterator var11 = var10.iterator();

            boolean var14;
            do {
               if (!var11.hasNext()) {
                  return;
               }

               class282 var12 = (class282)var11.next();
               class197 var13 = class197.method4100(var12.method5405());
               var14 = false;

               for(int var15 = this.field4904.length - 1; var15 >= 0; --var15) {
                  if (null != var13.field2149[var15]) {
                     Client.method3242(var13.field2149[var15], var13.field2159, this.field4904[var15], var12.method5405(), var12.field3043.method6190(), var12.field3046.method6190());
                     var14 = true;
                  }
               }
            } while(!var14);

         }
      }
   }

   public class330 method8260(int var1, class330 var2) {
      if (!this.field4898.method8415()) {
         return null;
      } else if (!this.field4897.method4623()) {
         return null;
      } else if (!this.field4895.method4931(var2.field3581, var2.field3583)) {
         return null;
      } else {
         HashMap var4 = this.field4897.method4624();
         List var5 = (List)var4.get(var1);
         if (var5 != null && !var5.isEmpty()) {
            class282 var6 = null;
            int var7 = -1;
            Iterator var8 = var5.iterator();

            while(true) {
               class282 var9;
               int var12;
               do {
                  if (!var8.hasNext()) {
                     return var6.field3046;
                  }

                  var9 = (class282)var8.next();
                  int var10 = var9.field3046.field3581 - var2.field3581;
                  int var11 = var9.field3046.field3583 - var2.field3583;
                  var12 = var11 * var11 + var10 * var10;
                  if (var12 == 0) {
                     return var9.field3046;
                  }
               } while(var12 >= var7 && null != var6);

               var6 = var9;
               var7 = var12;
            }
         } else {
            return null;
         }
      }
   }

   public void method8261(int var1, int var2, class330 var3, class330 var4) {
      class87 var6 = new class87();
      class272 var7 = new class272(var2, var3, var4);
      var6.method1893(new Object[]{var7});
      switch (var1) {
         case 1008:
            var6.method1894(10);
            break;
         case 1009:
            var6.method1894(11);
            break;
         case 1010:
            var6.method1894(12);
            break;
         case 1011:
            var6.method1894(13);
            break;
         case 1012:
            var6.method1894(14);
      }

      class63.method1516(var6);
   }

   public class282 method8262() {
      if (!this.field4898.method8415()) {
         return null;
      } else if (!this.field4897.method4623()) {
         return null;
      } else {
         HashMap var2 = this.field4897.method4624();
         this.field4930 = new LinkedList();
         Iterator var3 = var2.values().iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            this.field4930.addAll(var4);
         }

         this.field4931 = this.field4930.iterator();
         return this.method8263();
      }
   }

   public class282 method8263() {
      if (this.field4931 == null) {
         return null;
      } else {
         class282 var2;
         do {
            if (!this.field4931.hasNext()) {
               return null;
            }

            var2 = (class282)this.field4931.next();
         } while(var2.method5405() == -1);

         return var2;
      }
   }
}
