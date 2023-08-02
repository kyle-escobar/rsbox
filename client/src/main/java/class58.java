public class class58 extends class470 {
    public static class342 field413;
    class38 field411;

    public class58() {
        this.field411 = null;
    }

    class58(class78 var1) {
        if (null != var1) {
            this.field411 = new class38(var1, null);
        }
    }

    public class58(class35 var1) {
        this.field411 = new class38(null, var1);
    }

    public boolean method1177() {
        return this.field411 == null;
    }

    public class35 method1175() {
        if (this.field411 != null && this.field411.field205.tryLock()) {
            class35 var2;
            try {
                var2 = this.method1180();
            } finally {
                this.field411.field205.unlock();
            }

            return var2;
        } else {
            return null;
        }
    }

    public class35 method1183() {
        if (this.field411 != null) {
            this.field411.field205.lock();

            class35 var2;
            try {
                var2 = this.method1180();
            } finally {
                this.field411.field205.unlock();
            }

            return var2;
        } else {
            return null;
        }
    }

    class35 method1180() {
        if (null == this.field411.field204) {
            this.field411.field204 = this.field411.field208.method1602(null);
            this.field411.field208 = null;
        }

        return this.field411.field204;
    }
}
