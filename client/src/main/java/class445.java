public abstract class class445 implements class279 {
   static boolean field4699;
   class507 field4696;

   class445(int var1) {
   }

   abstract void method7831(PacketBuffer var1, int var2);

   public void method7840(PacketBuffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         class460 var4 = (class460)class373.method1724(class460.method2231(), var3);
         if (null != var4) {
            switch (var4.field4760) {
               case 0:
                  class373.method1724(class356.method1961(), var1.readUnsignedByte());
                  break;
               case 1:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
               case 2:
                  var1.readJagString();
                  break;
               case 3:
                  int var5 = var1.readUnsignedByte();
                  this.field4696 = class516.method7421(var5);
                  if (this.field4696 == null) {
                     throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                  }
            }
         } else {
            this.method7831(var1, var3);
         }
      }
   }

   boolean method7832() {
      return this.field4696 != null;
   }

   Object method7833() {
      if (this.field4696 == class507.field5074) {
         return 0;
      } else if (this.field4696 == class507.field5071) {
         return -1L;
      } else {
         return this.field4696 == class507.field5072 ? "" : null;
      }
   }
}
