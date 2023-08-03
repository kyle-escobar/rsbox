public class class429 extends class435 {
   final class477 field4631;

   public class429(class477 var1) {
      super(400);
      this.field4631 = var1;
   }

   class421 method7736() {
      return new class430();
   }

   class421[] method7768(int var1) {
      return new class430[var1];
   }

   public void method7674(Buffer var1, int var2) {
      while(var1.offset < var2) {
         int var4 = var1.readUnsignedByte();
         if (var4 == 4) {
            class526 var10 = new class526(var1.readString(), this.field4631);
            if (!var10.method9157()) {
               throw new IllegalStateException();
            }

            boolean var11 = false;
            class165.field1782.method1093(var10.method9155(), var11);
         } else {
            boolean var5 = (var4 & 1) != 0;
            class526 var6 = new class526(var1.readString(), this.field4631);
            class526 var7 = new class526(var1.readString(), this.field4631);
            var1.readString();
            if (!var6.method9157()) {
               throw new IllegalStateException();
            }

            class430 var8 = (class430)this.method7722(var6);
            if (var5) {
               class430 var9 = (class430)this.method7722(var7);
               if (null != var9 && var8 != var9) {
                  if (null != var8) {
                     this.method7725(var9);
                  } else {
                     var8 = var9;
                  }
               }
            }

            if (null != var8) {
               this.method7730(var8, var6, var7);
            } else if (this.method7770() < 400) {
               int var12 = this.method7770();
               var8 = (class430)this.method7727(var6, var7);
               var8.field4635 = var12;
            }
         }
      }

   }
}
