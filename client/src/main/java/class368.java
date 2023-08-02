public class class368 {
    public class470 field4344 = new class470();
    class470 field4343;

    public class368() {
        this.field4344.field4817 = this.field4344;
        this.field4344.field4815 = this.field4344;
    }

    public static void method6682(class470 var0, class470 var1) {
        if (var0.field4815 != null) {
            var0.method8116();
        }

        var0.field4815 = var1.field4815;
        var0.field4817 = var1;
        var0.field4815.field4817 = var0;
        var0.field4817.field4815 = var0;
    }

    public void method6692() {
        while (true) {
            class470 var1 = this.field4344.field4817;
            if (var1 == this.field4344) {
                this.field4343 = null;
                return;
            }

            var1.method8116();
        }
    }

    public void method6680(class470 var1) {
        if (var1.field4815 != null) {
            var1.method8116();
        }

        var1.field4815 = this.field4344.field4815;
        var1.field4817 = this.field4344;
        var1.field4815.field4817 = var1;
        var1.field4817.field4815 = var1;
    }

    public void method6681(class470 var1) {
        if (var1.field4815 != null) {
            var1.method8116();
        }

        var1.field4815 = this.field4344;
        var1.field4817 = this.field4344.field4817;
        var1.field4815.field4817 = var1;
        var1.field4817.field4815 = var1;
    }

    public class470 method6683() {
        class470 var1 = this.field4344.field4817;
        if (var1 == this.field4344) {
            return null;
        } else {
            var1.method8116();
            return var1;
        }
    }

    public class470 method6688() {
        class470 var1 = this.field4344.field4815;
        if (var1 == this.field4344) {
            return null;
        } else {
            var1.method8116();
            return var1;
        }
    }

    public class470 method6706() {
        class470 var1 = this.field4344.field4817;
        if (var1 == this.field4344) {
            this.field4343 = null;
            return null;
        } else {
            this.field4343 = var1.field4817;
            return var1;
        }
    }

    public class470 method6695() {
        class470 var1 = this.field4344.field4815;
        if (var1 == this.field4344) {
            this.field4343 = null;
            return null;
        } else {
            this.field4343 = var1.field4815;
            return var1;
        }
    }

    public class470 method6687() {
        class470 var1 = this.field4343;
        if (var1 == this.field4344) {
            this.field4343 = null;
            return null;
        } else {
            this.field4343 = var1.field4817;
            return var1;
        }
    }

    public class470 method6704() {
        class470 var1 = this.field4343;
        if (var1 == this.field4344) {
            this.field4343 = null;
            return null;
        } else {
            this.field4343 = var1.field4815;
            return var1;
        }
    }

    public boolean method6689() {
        return this.field4344.field4817 == this.field4344;
    }
}
