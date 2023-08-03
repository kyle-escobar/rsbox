import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class518 extends class476 {
   class507[] field5124;
   List field5122;

   public class518(class342 var1, int var2, int var3) {
      byte[] var4 = var1.method6381(var2, var3 + 1);
      this.method8723(new PacketBuffer(var4));
   }

   public class518(class342 var1, int var2) {
      byte[] var3 = var1.method6381(var2, 0);
      this.method8723(new PacketBuffer(var3));
   }

   void method8723(PacketBuffer var1) {
      int var3 = var1.readVarLength();
      this.field5124 = new class507[var3];
      this.field5122 = new ArrayList(var3);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field5124[var4] = (class507)class373.method1724(class507.method8599(), var1.readUnsignedByte());
         int var5 = var1.readVarLength();
         HashMap var6 = new HashMap(var5);

         while(var5-- > 0) {
            Object var7 = this.field5124[var4].method8596(var1);
            int var8 = var1.readVarLength();
            ArrayList var9 = new ArrayList();

            while(var8-- > 0) {
               int var10 = var1.readVarLength();
               var9.add(var10);
            }

            var6.put(var7, var9);
         }

         this.field5122.add(var4, var6);
      }

   }

   public List method8724(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var4 = (Map)this.field5122.get(var2);
      return (List)var4.get(var1);
   }
}
