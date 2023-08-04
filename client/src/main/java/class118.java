import java.lang.management.GarbageCollectorMXBean;
import java.util.Comparator;

public class class118 implements Comparator {
   public static int field1132;
   static int[] regionMapArchiveIds;
   static GarbageCollectorMXBean field1133;
   final boolean field1131;

   public class118(boolean var1) {
      this.field1131 = var1;
   }

   int method2292(class417 var1, class417 var2) {
      return this.field1131 ? var1.field4576 - var2.field4576 : var2.field4576 - var1.field4576;
   }

   public int compare(Object var1, Object var2) {
      return this.method2292((class417)var1, (class417)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
