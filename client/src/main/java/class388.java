import java.util.HashSet;
import java.util.Set;

public class class388 implements class383 {
   static int field4438;
   static int field4440;
   static int field4442;
   static final class388 field4423;
   static final class388 field4425;
   static final class388 field4426;
   static final class388 field4427;
   static final class388 field4428;
   static final class388 field4429;
   static final class388 field4430;
   static final class388 field4431;
   static final class388 field4432;
   static final class388 field4433;
   static final class388 field4434;
   static final class388 field4435;
   static final class388 field4439;
   final int field4436;
   final Set field4424 = new HashSet();

   static {
      field4439 = new class388("", 0, new class369[]{class369.field4348, class369.field4346});
      field4431 = new class388("", 1, new class369[]{class369.field4347, class369.field4348, class369.field4346});
      field4427 = new class388("", 2, new class369[]{class369.field4347, class369.field4345, class369.field4348});
      field4426 = new class388("", 3, new class369[]{class369.field4347});
      field4423 = new class388("", 4);
      field4428 = new class388("", 5, new class369[]{class369.field4347, class369.field4348});
      field4432 = new class388("", 6, new class369[]{class369.field4348});
      field4430 = new class388("", 8, new class369[]{class369.field4347, class369.field4348});
      field4425 = new class388("", 9, new class369[]{class369.field4347, class369.field4345});
      field4429 = new class388("", 10, new class369[]{class369.field4347});
      field4433 = new class388("", 11, new class369[]{class369.field4347});
      field4434 = new class388("", 12, new class369[]{class369.field4347, class369.field4348});
      field4435 = new class388("", 13, new class369[]{class369.field4347});
   }

   class388(String var1, int var2) {
      this.field4436 = var2;
   }

   class388(String var1, int var2, class369[] var3) {
      this.field4436 = var2;

      for(int var5 = 0; var5 < var3.length; ++var5) {
         class369 var6 = var3[var5];
         this.field4424.add(var6);
      }

   }

   public int serialId() {
      return this.field4436;
   }
}
