import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class127 {
   static class363 field1209;
   boolean field1202 = false;
   boolean[] field1204;
   /** @deprecated */
   @Deprecated
   String[] field1206;
   Map field1203;
   long field1208;

   class127() {
      int var1 = class186.field2015.method6393(19);
      this.field1203 = new HashMap();
      this.field1204 = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         class187 var3 = class187.method2491(var2);
         this.field1204[var2] = var3.field2026;
      }

      var2 = 0;
      if (class186.field2015.method6628(15)) {
         var2 = class186.field2015.method6393(15);
      }

      this.field1206 = new String[var2];
      this.method2369();
   }

   void method2391(int var1, int var2) {
      this.field1203.put(var1, var2);
      if (this.field1204[var1]) {
         this.field1202 = true;
      }

   }

   int method2383(int var1) {
      Object var3 = this.field1203.get(var1);
      return var3 instanceof Integer ? (Integer)var3 : -1;
   }

   void method2363(int var1, String var2) {
      this.field1203.put(var1, var2);
   }

   String method2368(int var1) {
      Object var3 = this.field1203.get(var1);
      return var3 instanceof String ? (String)var3 : "";
   }

   /** @deprecated */
   @Deprecated
   void method2407(int var1, String var2) {
      this.field1206[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   String method2365(int var1) {
      return this.field1206[var1];
   }

   void method2366() {
      int var2;
      for(var2 = 0; var2 < this.field1204.length; ++var2) {
         if (!this.field1204[var2]) {
            this.field1203.remove(var2);
         }
      }

      for(var2 = 0; var2 < this.field1206.length; ++var2) {
         this.field1206[var2] = null;
      }

   }

   class508 method2367(boolean var1) {
      return class160.method1257("2", class12.field65.field3968, var1);
   }

   void method2378() {
      class508 var2 = this.method2367(true);

      try {
         int var3 = 3;
         int var4 = 0;
         Iterator var5 = this.field1203.entrySet().iterator();

         while(var5.hasNext()) {
            Map.Entry var6 = (Map.Entry)var5.next();
            int var7 = (Integer)var6.getKey();
            if (this.field1204[var7]) {
               Object var8 = var6.getValue();
               var3 += 3;
               if (var8 instanceof Integer) {
                  var3 += 4;
               } else if (var8 instanceof String) {
                  var3 += PacketBuffer.getJagStringSize((String)var8);
               }

               ++var4;
            }
         }

         PacketBuffer var21 = new PacketBuffer(var3);
         var21.writeByte(2);
         var21.writeShort(var4);
         Iterator var22 = this.field1203.entrySet().iterator();

         while(var22.hasNext()) {
            Map.Entry var23 = (Map.Entry)var22.next();
            int var24 = (Integer)var23.getKey();
            if (this.field1204[var24]) {
               var21.writeShort(var24);
               Object var9 = var23.getValue();
               class507 var10 = class507.method8594(var9.getClass());
               var21.writeByte(var10.field5073);
               class507.method8600(var9, var21);
            }
         }

         var2.method8610(var21.data, 0, var21.offset);
      } catch (Exception var19) {
      } finally {
         try {
            var2.method8611();
         } catch (Exception var18) {
         }

      }

      this.field1202 = false;
      this.field1208 = class302.safeTime();
   }

   void method2369() {
      class508 var2 = this.method2367(false);

      label234: {
         try {
            byte[] var3 = new byte[(int)var2.method8613()];

            int var5;
            for(int var4 = 0; var4 < var3.length; var4 += var5) {
               var5 = var2.method8615(var3, var4, var3.length - var4);
               if (var5 == -1) {
                  throw new EOFException();
               }
            }

            PacketBuffer var25 = new PacketBuffer(var3);
            if (var25.data.length - var25.offset >= 1) {
               int var6 = var25.readUnsignedByte();
               if (var6 >= 0 && var6 <= 2) {
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  if (var6 >= 2) {
                     var7 = var25.readUnsignedShort();
                     var8 = 0;

                     while(true) {
                        if (var8 >= var7) {
                           break label234;
                        }

                        var9 = var25.readUnsignedShort();
                        var10 = var25.readUnsignedByte();
                        class507 var11 = (class507)class373.method1724(class507.method8599(), var10);
                        Object var12 = var11.method8596(var25);
                        if (var9 >= 0 && var9 < this.field1204.length && this.field1204[var9]) {
                           this.field1203.put(var9, var12);
                        }

                        ++var8;
                     }
                  } else {
                     var7 = var25.readUnsignedShort();

                     for(var8 = 0; var8 < var7; ++var8) {
                        var9 = var25.readUnsignedShort();
                        var10 = var25.readInt();
                        if (var9 >= 0 && var9 < this.field1204.length && this.field1204[var9]) {
                           this.field1203.put(var9, var10);
                        }
                     }

                     var8 = var25.readUnsignedShort();
                     var9 = 0;

                     while(true) {
                        if (var9 >= var8) {
                           break label234;
                        }

                        var25.readUnsignedShort();
                        var25.readString();
                        ++var9;
                     }
                  }
               }

               return;
            }
         } catch (Exception var23) {
            break label234;
         } finally {
            try {
               var2.method8611();
            } catch (Exception var22) {
            }

         }

         return;
      }

      this.field1202 = false;
   }

   void method2395() {
      if (this.field1202 && this.field1208 < class302.safeTime() - 60000L) {
         this.method2378();
      }

   }

   boolean method2361() {
      return this.field1202;
   }
}
