public class class432 extends class435 {
    final class477 field4640;
    public class377 field4642 = new class377();
    int field4641 = 1;

    public class432(class477 var1) {
        super(400);
        this.field4640 = var1;
    }

    class421 method7736() {
        return new class425();
    }

    class421[] method7768(int var1) {
        return new class425[var1];
    }

    public boolean method7690(class526 var1, boolean var2) {
        class425 var4 = (class425) this.method7721(var1);
        if (null == var4) {
            return false;
        } else {
            return !var2 || 0 != var4.field4575;
        }
    }

    public void method7691(class519 var1, int var2) {
        while (true) {
            if (var1.field5129 < var2) {
                boolean var4 = var1.method8748() == 1;
                class526 var5 = new class526(var1.method8873(), this.field4640);
                class526 var6 = new class526(var1.method8873(), this.field4640);
                int var7 = var1.method8750();
                int var8 = var1.method8748();
                int var9 = var1.method8748();
                boolean var10 = 0 != (var9 & 2);
                boolean var11 = 0 != (var9 & 1);
                if (var7 > 0) {
                    var1.method8873();
                    var1.method8748();
                    var1.method9000();
                }

                var1.method8873();
                if (null != var5 && var5.method9157()) {
                    class425 var12 = (class425) this.method7722(var5);
                    if (var4) {
                        class425 var13 = (class425) this.method7722(var6);
                        if (null != var13 && var12 != var13) {
                            if (null != var12) {
                                this.method7725(var13);
                            } else {
                                var12 = var13;
                            }
                        }
                    }

                    if (var12 != null) {
                        this.method7730(var12, var5, var6);
                        if (var12.field4575 != var7) {
                            boolean var15 = true;

                            for (class436 var14 = (class436) this.field4642.method6748(); var14 != null; var14 = (class436) this.field4642.method6749()) {
                                if (var14.field4661.equals(var5)) {
                                    if (var7 != 0 && var14.field4662 == 0) {
                                        var14.method8201();
                                        var15 = false;
                                    } else if (var7 == 0 && var14.field4662 != 0) {
                                        var14.method8201();
                                        var15 = false;
                                    }
                                }
                            }

                            if (var15) {
                                this.field4642.method6747(new class436(var5, var7));
                            }
                        }
                    } else {
                        if (this.method7770() >= 400) {
                            continue;
                        }

                        var12 = (class425) this.method7727(var5, var6);
                    }

                    if (var12.field4575 != var7) {
                        var12.field4576 = ++this.field4641 - 1;
                        if (-1 == var12.field4575 && var7 == 0) {
                            var12.field4576 = -(var12.field4576 * -294863233) * -1422851713;
                        }

                        var12.field4575 = var7;
                    }

                    var12.field4577 = var8;
                    var12.field4608 = var10;
                    var12.field4609 = var11;
                    continue;
                }

                throw new IllegalStateException();
            }

            this.method7729();
            return;
        }
    }
}
