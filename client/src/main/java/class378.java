import java.util.Iterator;

public class class378 implements Iterator {
    class382 field4375;
    class470 field4373 = null;
    class470 field4374;

    class378(class382 var1) {
        this.method6762(var1);
    }

    void method6762(class382 var1) {
        this.field4375 = var1;
        this.method6767();
    }

    void method6767() {
        this.field4374 = this.field4375 != null ? this.field4375.field4395.field4817 : null;
        this.field4373 = null;
    }

    public Object next() {
        class470 var1 = this.field4374;
        if (var1 == this.field4375.field4395) {
            var1 = null;
            this.field4374 = null;
        } else {
            this.field4374 = var1.field4817;
        }

        this.field4373 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4374 != this.field4375.field4395 && this.field4374 != null;
    }

    public void remove() {
        if (this.field4373 == null) {
            throw new IllegalStateException();
        } else {
            this.field4373.method8116();
            this.field4373 = null;
        }
    }
}
