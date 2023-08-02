public class class403 {
    public boolean field4492 = false;
    int field4493 = 0;
    int field4498 = 0;
    int field4499 = 0;
    int field4500 = 0;
    long field4491 = 0L;
    long field4494 = -1L;
    long field4495 = 0L;
    long field4496 = 0L;
    long field4497 = -1L;

    public static int method7092(int var0) {
        return (var0 & class511.field5096) - 1;
    }

    public void method7081() {
        this.field4494 = class302.method2194();
    }

    public void method7068() {
        if (this.field4494 != -1L) {
            this.field4495 = class302.method2194() - this.field4494;
            this.field4494 = -1L;
        }

    }

    public void method7069(int var1) {
        this.field4497 = class302.method2194();
        this.field4499 = var1;
    }

    public void method7070() {
        if (-1L != this.field4497) {
            this.field4491 = class302.method2194() - this.field4497;
            this.field4497 = -1L;
        }

        ++this.field4493;
        this.field4492 = true;
    }

    public void method7071() {
        this.field4492 = false;
        this.field4498 = 0;
    }

    public void method7072() {
        this.method7070();
    }

    public void method7073(class519 var1) {
        class76.method1563(var1, this.field4495);
        class76.method1563(var1, this.field4491);
        class76.method1563(var1, this.field4496);
        var1.method8732(this.field4499);
        var1.method8732(this.field4498);
        var1.method8732(this.field4493);
        var1.method8732(this.field4500);
    }
}
