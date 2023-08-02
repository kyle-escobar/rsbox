import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class303 {
   public static int field3192 = 0;
   public static int field3202 = 0;
   public static int field3203 = 0;
   public static int field3207 = 0;
   public static ArrayList field3194 = new ArrayList(3);
   public static ArrayList field3195 = null;
   public static ArrayList field3198 = new ArrayList(3);
   public static LinkedList field3196 = new LinkedList();
   public static final List field3200 = new ArrayList();
   static class342 field3193;
   static class342 field3197;
   static class342 field3201;
   static ArrayList field3199 = new ArrayList();

   class303() throws Throwable {
   }

   public static boolean method5350(class342 var0, class342 var1, class342 var2, ArrayList var3) {
      field3193 = var0;
      field3197 = var1;
      field3201 = var2;
      field3195 = var3;
      return true;
   }

   public static void method1739(class326 var0) {
      if (!field3200.contains(var0)) {
         field3200.add(var0);
      }

   }

   public static void method3925(int var0, int var1) {
      Iterator var3 = field3200.iterator();

      while(var3.hasNext()) {
         class326 var4 = (class326)var3.next();
         var4.method5899(var0, var1);
      }

   }

   public static void method2298(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var5 || !field3196.isEmpty() && !var0.isEmpty()) {
         field3196.clear();
         field3199.clear();
      }

      if (!var0.isEmpty()) {
         method2577(var0, var5);
         if (!field3196.isEmpty()) {
            method2001(var1, var2, var3, var4);
            field3199.add(new class395((class406)null));
            field3199.add(new class409((class406)null, field3193, field3197, field3201));
            if (!field3194.isEmpty()) {
               ArrayList var7 = new ArrayList();
               var7.add(new class404(new class399(new class392((class406)null, 0, true, field3207)), field3203));
               ArrayList var8 = method3308();
               var7.add(new class404(new class414(new class411((class406)null, var8), 0, false, field3202), field3192));
               field3199.add(new class396((class406)null, var7));
            } else {
               field3199.add(new class404((class406)null, field3203));
               field3199.add(new class399((class406)null));
               field3199.add(new class392((class406)null, 0, true, field3207));
            }

         }
      }
   }

   public static void method375(int var0) {
      if (!field3194.isEmpty()) {
         Iterator var2 = field3194.iterator();

         while(var2.hasNext()) {
            class322 var3 = (class322)var2.next();
            if (null != var3) {
               var3.field3527 = var0;
            }
         }

         class322 var4 = (class322)field3194.get(0);
         if (null != var4 && var4.field3533 != null && var4.field3533.method5533() && !var4.field3532) {
            var4.field3533.method5525(var0);
            var4.field3528 = (float)var0;
         }
      }

   }

   public static void method4211(int var0, int var1) {
      method2001(var0, var1, 0, 0);
      field3198.clear();
      if (!field3194.isEmpty() && (var0 != 0 || var1 != 0)) {
         field3199.add(new class404((class406)null, field3192));
         field3199.add(new class414((class406)null, 0, false, field3202));
      }

      ArrayList var3 = method3308();
      field3199.add(new class411((class406)null, var3));
   }

   public static boolean method1987() {
      if (!field3199.isEmpty()) {
         return true;
      } else {
         return !field3194.isEmpty() && field3194.get(0) != null && ((class322)field3194.get(0)).field3533 != null ? ((class322)field3194.get(0)).field3533.method5533() : false;
      }
   }

   public static void method8062(int var0, int var1, int var2, int var3) {
      if (field3194.size() > 1 && field3194.get(0) != null && ((class322)field3194.get(0)).field3533.method5533() && field3194.get(1) != null && ((class322)field3194.get(1)).field3533.method5533()) {
         method2001(var0, var1, var2, var3);
         field3199.add(new class400((class406)null));
         ArrayList var5 = new ArrayList();
         var5.add(new class404(new class392((class406)null, 1, false, field3207), field3203));
         var5.add(new class404(new class414((class406)null, 0, false, field3202), field3192));
         field3199.add(new class396((class406)null, var5));
         if (field3198.get(0) != null && field3198.get(1) != null) {
            class322 var6 = (class322)field3198.get(0);
            field3198.set(0, field3194.get(1));
            field3198.set(1, var6);
         }
      }

   }

   public static boolean method3904() {
      return !field3198.isEmpty();
   }

   static void method2577(ArrayList var0, boolean var1) {
      if (!var1) {
         field3198.clear();
      }

      Iterator var3 = var0.iterator();

      while(var3.hasNext()) {
         class322 var4 = (class322)var3.next();
         if (-1 != var4.field3524 && -1 != var4.field3526) {
            if (!var1) {
               field3198.add(var4);
            }

            field3196.add(var4);
         }
      }

   }

   public static void method2001(int var0, int var1, int var2, int var3) {
      field3192 = var0;
      field3202 = var1;
      field3203 = var2;
      field3207 = var3;
   }

   static ArrayList method3308() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = field3194.iterator();

      while(var2.hasNext()) {
         class322 var3 = (class322)var2.next();
         var1.add(var3);
      }

      return var1;
   }
}
