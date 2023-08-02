import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class class428 {
   static int field4629;
   static String field4624;
   final class394 field4622;
   final class394 field4623;
   final class437 field4626;
   final int field4627;
   final Comparator field4621;
   final Map field4625;
   final long field4628;

   public class428(int var1, class437 var2) {
      this(-1L, var1, var2);
   }

   class428(long var1, int var3, class437 var4) {
      this.field4621 = new class431(this);
      this.field4628 = var1;
      this.field4627 = var3;
      this.field4626 = var4;
      if (-1 == this.field4627) {
         this.field4625 = new HashMap(64);
         this.field4623 = new class394(64, this.field4621);
         this.field4622 = null;
      } else {
         if (null == this.field4626) {
            throw new IllegalArgumentException("");
         }

         this.field4625 = new HashMap(this.field4627);
         this.field4623 = new class394(this.field4627, this.field4621);
         this.field4622 = new class394(this.field4627);
      }

   }

   public static class515 method7643(int var0) {
      class515 var2 = (class515)class515.field5115.method5643((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class515.field5118.method6381(38, var0);
         var2 = new class515();
         if (var3 != null) {
            var2.method8697(new class519(var3));
         }

         var2.method8710();
         class515.field5115.method5640(var2, (long)var0);
         return var2;
      }
   }

   boolean method7644() {
      return this.field4627 != -1;
   }

   public Object method7645(Object var1) {
      synchronized(this) {
         if (-1L != this.field4628) {
            this.method7648();
         }

         class434 var4 = (class434)this.field4625.get(var1);
         if (var4 == null) {
            return null;
         } else {
            this.method7647(var4, false);
            return var4.field4649;
         }
      }
   }

   public Object method7646(Object var1, Object var2) {
      synchronized(this) {
         if (-1L != this.field4628) {
            this.method7648();
         }

         class434 var5 = (class434)this.field4625.get(var1);
         if (var5 != null) {
            Object var9 = var5.field4649;
            var5.field4649 = var2;
            this.method7647(var5, false);
            return var9;
         } else {
            class434 var6;
            if (this.method7644() && this.field4625.size() == this.field4627) {
               var6 = (class434)this.field4622.remove();
               this.field4625.remove(var6.field4651);
               this.field4623.remove(var6);
            }

            var6 = new class434(var2, var1);
            this.field4625.put(var1, var6);
            this.method7647(var6, true);
            return null;
         }
      }
   }

   void method7647(class434 var1, boolean var2) {
      if (!var2) {
         this.field4623.remove(var1);
         if (this.method7644() && !this.field4622.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field4650 = System.currentTimeMillis();
      if (this.method7644()) {
         switch (this.field4626.field4670) {
            case 0:
               ++var1.field4648;
               break;
            case 1:
               var1.field4648 = var1.field4650;
         }

         this.field4622.add(var1);
      }

      this.field4623.add(var1);
   }

   void method7648() {
      if (-1L == this.field4628) {
         throw new IllegalStateException("");
      } else {
         long var2 = System.currentTimeMillis() - this.field4628;

         while(!this.field4623.isEmpty()) {
            class434 var4 = (class434)this.field4623.peek();
            if (var4.field4650 >= var2) {
               return;
            }

            this.field4625.remove(var4.field4651);
            this.field4623.remove(var4);
            if (this.method7644()) {
               this.field4622.remove(var4);
            }
         }

      }
   }

   public void method7665() {
      synchronized(this) {
         this.field4625.clear();
         this.field4623.clear();
         if (this.method7644()) {
            this.field4622.clear();
         }

      }
   }
}
