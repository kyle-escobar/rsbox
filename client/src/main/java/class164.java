import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class164 extends class470 {
   public static short[][] field1774;
   boolean field1770;
   boolean field1777 = true;
   int[] field1773;
   long field1771;
   public byte field1776;
   public byte field1778;
   public String field1775 = null;
   public List field1772;

   static {
      new BitSet(65536);
   }

   public class164(class519 var1) {
      this.method3262(var1);
   }

   public int[] method3259() {
      if (this.field1773 == null) {
         String[] var2 = new String[this.field1772.size()];
         this.field1773 = new int[this.field1772.size()];

         for(int var3 = 0; var3 < this.field1772.size(); this.field1773[var3] = var3++) {
            var2[var3] = ((class152)this.field1772.get(var3)).field1389.method9156();
         }

         int[] var4 = this.field1773;
         class502.method2094(var2, var4, 0, var2.length - 1);
      }

      return this.field1773;
   }

   void method3260(class152 var1) {
      this.field1772.add(var1);
      this.field1773 = null;
   }

   void method3261(int var1) {
      this.field1772.remove(var1);
      this.field1773 = null;
   }

   public int method3279() {
      return this.field1772.size();
   }

   public int method3266(String var1) {
      if (!this.field1777) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var3 = 0; var3 < this.field1772.size(); ++var3) {
            if (((class152)this.field1772.get(var3)).field1389.method9155().equalsIgnoreCase(var1)) {
               return var3;
            }
         }

         return -1;
      }
   }

   void method3262(class519 var1) {
      int var3 = var1.method8748();
      if (0 != (var3 & 1)) {
         this.field1770 = true;
      }

      if ((var3 & 2) != 0) {
         this.field1777 = true;
      }

      int var4 = 2;
      if (0 != (var3 & 4)) {
         var4 = var1.method8748();
      }

      super.field4816 = var1.method8755();
      this.field1771 = var1.method8755();
      this.field1775 = var1.method8873();
      var1.method8757();
      this.field1778 = var1.method8768();
      this.field1776 = var1.method8768();
      int var5 = var1.method8750();
      if (var5 > 0) {
         this.field1772 = new ArrayList(var5);

         for(int var6 = 0; var6 < var5; ++var6) {
            class152 var7 = new class152();
            if (this.field1770) {
               var1.method8755();
            }

            if (this.field1777) {
               var7.field1389 = new class526(var1.method8873());
            }

            var7.field1391 = var1.method8768();
            var7.field1388 = var1.method8750();
            if (var4 >= 3) {
               var1.method8757();
            }

            this.field1772.add(var6, var7);
         }
      }

   }
}
