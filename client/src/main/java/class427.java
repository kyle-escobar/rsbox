public class class427 extends class435 {
   int field4615 = 1;
   final class438 field4617;
   final class477 field4613;
   public byte field4618;
   public int field4620;
   public String field4614 = null;
   public String field4616 = null;

   public class427(class477 var1, class438 var2) {
      super(500);
      this.field4613 = var1;
      this.field4617 = var2;
   }

   class421 method7736() {
      return new class423();
   }

   class421[] method7768(int var1) {
      return new class423[var1];
   }

   final void method7616(String var1) {
      this.field4616 = class325.method5891(var1);
   }

   final void method7617(String var1) {
      this.field4614 = class325.method5891(var1);
   }

   public final void method7618(PacketBuffer var1, int var2) {
      this.method7617(var1.readString());
      long var4 = var1.readLong();
      long var7 = var4;
      String var6;
      int var9;
      if (var4 > 0L && var4 < 6582952005840035281L) {
         if (var4 % 37L == 0L) {
            var6 = null;
         } else {
            var9 = 0;

            for(long var10 = var4; var10 != 0L; var10 /= 37L) {
               ++var9;
            }

            StringBuilder var12 = new StringBuilder(var9);

            while(var7 != 0L) {
               long var13 = var7;
               var7 /= 37L;
               var12.append(class365.field4332[(int)(var13 - var7 * 37L)]);
            }

            var6 = var12.reverse().toString();
         }
      } else {
         var6 = null;
      }

      this.method7616(var6);
      this.field4618 = var1.readByte();
      short var15;
      if (var2 == 1) {
         var9 = var1.readUnsignedByte();
         var15 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var9 = var1.readUnsignedSmartByteShortNull();
         var15 = -1;
      }

      if (var9 != var15) {
         this.method7785();

         for(int var16 = 0; var16 < var9; ++var16) {
            class423 var17 = (class423)this.method7726(new class526(var1.readString(), this.field4613));
            int var14 = var1.readUnsignedShort();
            var17.method7462(var14, ++this.field4615 - 1);
            var17.field4577 = var1.readByte();
            var1.readString();
            this.method7622(var17);
         }

      }
   }

   public final void method7628(PacketBuffer var1) {
      class526 var3 = new class526(var1.readString(), this.field4613);
      int var4 = var1.readUnsignedShort();
      byte var5 = var1.readByte();
      boolean var6 = false;
      if (var5 == -128) {
         var6 = true;
      }

      class423 var7;
      if (var6) {
         if (this.method7770() == 0) {
            return;
         }

         var7 = (class423)this.method7722(var3);
         if (var7 != null && var7.method7472() == var4) {
            this.method7725(var7);
         }
      } else {
         var1.readString();
         var7 = (class423)this.method7722(var3);
         if (var7 == null) {
            if (this.method7770() > super.field4655) {
               return;
            }

            var7 = (class423)this.method7726(var3);
         }

         var7.method7462(var4, ++this.field4615 - 1);
         var7.field4577 = var5;
         this.method7622(var7);
      }

   }

   public final void method7620() {
      for(int var2 = 0; var2 < this.method7770(); ++var2) {
         ((class423)this.method7728(var2)).method7582();
      }

   }

   public final void method7621() {
      for(int var2 = 0; var2 < this.method7770(); ++var2) {
         ((class423)this.method7728(var2)).method7569();
      }

   }

   final void method7622(class423 var1) {
      if (var1.method7542().equals(this.field4617.method7791())) {
         this.field4620 = var1.field4577;
      }

   }
}
