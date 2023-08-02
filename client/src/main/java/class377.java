public class class377 {
    class484 field4371;
    class484 field4372 = new class484();

    public class377() {
        this.field4372.field4879 = this.field4372;
        this.field4372.field4878 = this.field4372;
    }

    public void method6747(class484 var1) {
        if (var1.field4878 != null) {
            var1.method8201();
        }

        var1.field4878 = this.field4372.field4878;
        var1.field4879 = this.field4372;
        var1.field4878.field4879 = var1;
        var1.field4879.field4878 = var1;
    }

    public class484 method6748() {
        class484 var1 = this.field4372.field4879;
        if (var1 == this.field4372) {
            this.field4371 = null;
            return null;
        } else {
            this.field4371 = var1.field4879;
            return var1;
        }
    }

    public class484 method6749() {
        class484 var1 = this.field4371;
        if (var1 == this.field4372) {
            this.field4371 = null;
            return null;
        } else {
            this.field4371 = var1.field4879;
            return var1;
        }
    }
}
