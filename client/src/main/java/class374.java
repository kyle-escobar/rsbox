import java.util.Iterator;

public class class374 implements Iterator {
    class390 field4357;
    class476 field4358;
    class476 field4359 = null;

    class374(class390 var1) {
        this.field4357 = var1;
        this.field4358 = this.field4357.field4445.field4849;
        this.field4359 = null;
    }

    public Object next() {
        class476 var1 = this.field4358;
        if (var1 == this.field4357.field4445) {
            var1 = null;
            this.field4358 = null;
        } else {
            this.field4358 = var1.field4849;
        }

        this.field4359 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4358 != this.field4357.field4445;
    }

    public void remove() {
        if (this.field4359 == null) {
            throw new IllegalStateException();
        } else {
            this.field4359.method8161();
            this.field4359 = null;
        }
    }
}
