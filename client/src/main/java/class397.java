import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class397 implements Iterator {
   class394 field4464;
   int field4465;
   int field4466 = 0;

   class397(class394 var1) {
      this.field4465 = this.field4464.field4458;
      this.field4464 = var1;
   }

   public boolean hasNext() {
      return this.field4466 < this.field4464.field4456;
   }

   public Object next() {
      if (this.field4465 != this.field4464.field4458) {
         throw new ConcurrentModificationException();
      } else if (this.field4466 < this.field4464.field4456) {
         Object var1 = this.field4464.field4454[this.field4466].field4449;
         ++this.field4466;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
