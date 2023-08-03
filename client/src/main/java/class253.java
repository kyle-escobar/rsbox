import java.util.Iterator;
import java.util.LinkedList;

public class class253 {
   boolean field2858 = false;
   class330 field2849 = null;
   int field2848 = -1;
   int field2851 = Integer.MAX_VALUE;
   int field2852 = -1;
   int field2854 = Integer.MAX_VALUE;
   int field2855 = 0;
   int field2856 = 0;
   int field2857 = -1;
   String field2850;
   String field2853;
   LinkedList field2859;

   static final boolean method5004(char var0) {
      return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
   }

   public void method4955(Buffer var1, int var2) {
      this.field2848 = var2;
      this.field2853 = var1.readString();
      this.field2850 = var1.readString();
      this.field2849 = new class330(var1.readInt());
      this.field2857 = var1.readInt();
      var1.readUnsignedByte();
      this.field2858 = var1.readUnsignedByte() == 1;
      this.field2852 = var1.readUnsignedByte();
      int var4 = var1.readUnsignedByte();
      this.field2859 = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field2859.add(this.method4929(var1));
      }

      this.method4934();
   }

   class286 method4929(Buffer var1) {
      int var3 = var1.readUnsignedByte();
      class265[] var4 = new class265[]{class265.field2955, class265.field2953, class265.field2952, class265.field2954};
      class265 var5 = (class265)class373.method1724(var4, var3);
      Object var6 = null;
      switch (var5.field2958) {
         case 0:
            var6 = new class285();
            break;
         case 1:
            var6 = new class258();
            break;
         case 2:
            var6 = new class264();
            break;
         case 3:
            var6 = new class267();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((class286)var6).method5444(var1);
      return (class286)var6;
   }

   public boolean method4998(int var1, int var2, int var3) {
      Iterator var5 = this.field2859.iterator();

      class286 var6;
      do {
         if (!var5.hasNext()) {
            return false;
         }

         var6 = (class286)var5.next();
      } while(!var6.method5440(var1, var2, var3));

      return true;
   }

   public boolean method4931(int var1, int var2) {
      int var4 = var1 / 64;
      int var5 = var2 / 64;
      if (var4 >= this.field2854 && var4 <= this.field2855) {
         if (var5 >= this.field2851 && var5 <= this.field2856) {
            Iterator var6 = this.field2859.iterator();

            class286 var7;
            do {
               if (!var6.hasNext()) {
                  return false;
               }

               var7 = (class286)var6.next();
            } while(!var7.method5437(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int[] method4932(int var1, int var2, int var3) {
      Iterator var5 = this.field2859.iterator();

      class286 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class286)var5.next();
      } while(!var6.method5440(var1, var2, var3));

      return var6.method5438(var1, var2, var3);
   }

   public class330 method4933(int var1, int var2) {
      Iterator var4 = this.field2859.iterator();

      class286 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (class286)var4.next();
      } while(!var5.method5437(var1, var2));

      return var5.method5449(var1, var2);
   }

   void method4934() {
      Iterator var2 = this.field2859.iterator();

      while(var2.hasNext()) {
         class286 var3 = (class286)var2.next();
         var3.method5436(this);
      }

   }

   public int method4935() {
      return this.field2848;
   }

   public boolean method4936() {
      return this.field2858;
   }

   public String method4937() {
      return this.field2853;
   }

   public String method4945() {
      return this.field2850;
   }

   int method4939() {
      return this.field2857;
   }

   public int method4940() {
      return this.field2852;
   }

   public int method4974() {
      return this.field2854;
   }

   public int method4942() {
      return this.field2855;
   }

   public int method4943() {
      return this.field2851;
   }

   public int method4944() {
      return this.field2856;
   }

   public int method4927() {
      return this.field2849.field3581;
   }

   public int method4946() {
      return this.field2849.field3582;
   }

   public int method4947() {
      return this.field2849.field3583;
   }

   public class330 method4948() {
      return new class330(this.field2849);
   }
}
