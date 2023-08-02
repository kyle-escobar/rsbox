import java.lang.ref.SoftReference;

public class class304 extends class287 {
   SoftReference field3209;

   class304(Object var1, int var2) {
      super(var2);
      this.field3209 = new SoftReference(var1);
   }

   Object method5457() {
      return this.field3209.get();
   }

   boolean method5458() {
      return true;
   }
}
