import java.util.Iterator;

class class514 implements Iterator {
   static class83 field5111;
   int field5113;
   // $FF: synthetic field
   final class510 this$0;

   class514(class510 var1) {
      this.this$0 = var1;
   }

   public boolean hasNext() {
      return this.field5113 < this.this$0.method8015();
   }

   public Object next() {
      int var1 = ++this.field5113 - 1;
      class454 var2 = (class454)this.this$0.field5092.method5665((long)var1);
      return null != var2 ? var2 : this.this$0.method8632(var1);
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
