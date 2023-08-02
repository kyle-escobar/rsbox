import java.util.*;

public class class394 extends AbstractQueue {
    final Comparator field4457;
    class391[] field4454;
    int field4456;
    int field4458;
    Map field4455;

    public class394(int var1) {
        this(var1, null);
    }

    public class394(int var1, Comparator var2) {
        this.field4458 = 0;
        this.field4454 = new class391[var1];
        this.field4455 = new HashMap();
        this.field4457 = var2;
    }

    void method6998() {
        int var2 = 1 + (this.field4454.length << 1);
        this.field4454 = Arrays.copyOf(this.field4454, var2);
    }

    public int size() {
        return this.field4456;
    }

    public boolean offer(Object var1) {
        if (this.field4455.containsKey(var1)) {
            throw new IllegalArgumentException("");
        } else {
            ++this.field4458;
            int var2 = this.field4456;
            if (var2 >= this.field4454.length) {
                this.method6998();
            }

            ++this.field4456;
            if (var2 == 0) {
                this.field4454[0] = new class391(var1, 0);
                this.field4455.put(var1, this.field4454[0]);
            } else {
                this.field4454[var2] = new class391(var1, var2);
                this.field4455.put(var1, this.field4454[var2]);
                this.method7002(var2);
            }

            return true;
        }
    }

    public Object peek() {
        return 0 == this.field4456 ? null : this.field4454[0].field4449;
    }

    public Object poll() {
        if (0 == this.field4456) {
            return null;
        } else {
            ++this.field4458;
            Object var1 = this.field4454[0].field4449;
            this.field4455.remove(var1);
            --this.field4456;
            if (this.field4456 == 0) {
                this.field4454[this.field4456] = null;
            } else {
                this.field4454[0] = this.field4454[this.field4456];
                this.field4454[0].field4447 = 0;
                this.field4454[this.field4456] = null;
                this.method7003(0);
            }

            return var1;
        }
    }

    public boolean remove(Object var1) {
        class391 var2 = (class391) this.field4455.remove(var1);
        if (null == var2) {
            return false;
        } else {
            ++this.field4458;
            --this.field4456;
            if (var2.field4447 == this.field4456) {
                this.field4454[this.field4456] = null;
                return true;
            } else {
                class391 var3 = this.field4454[this.field4456];
                this.field4454[this.field4456] = null;
                this.field4454[var2.field4447] = var3;
                this.field4454[var2.field4447].field4447 = var2.field4447;
                this.method7003(var2.field4447);
                if (var3 == this.field4454[var2.field4447]) {
                    this.method7002(var2.field4447);
                }

                return true;
            }
        }
    }

    void method7002(int var1) {
        class391 var3;
        int var4;
        for (var3 = this.field4454[var1]; var1 > 0; var1 = var4) {
            var4 = var1 - 1 >>> 1;
            class391 var5 = this.field4454[var4];
            if (this.field4457 != null) {
                if (this.field4457.compare(var3.field4449, var5.field4449) >= 0) {
                    break;
                }
            } else if (((Comparable) var3.field4449).compareTo(var5.field4449) >= 0) {
                break;
            }

            this.field4454[var1] = var5;
            this.field4454[var1].field4447 = var1;
        }

        this.field4454[var1] = var3;
        this.field4454[var1].field4447 = var1;
    }

    void method7003(int var1) {
        class391 var3 = this.field4454[var1];

        int var9;
        for (int var4 = this.field4456 >>> 1; var1 < var4; var1 = var9) {
            int var5 = (var1 << 1) + 1;
            class391 var6 = this.field4454[var5];
            int var7 = (var1 << 1) + 2;
            class391 var8 = this.field4454[var7];
            if (this.field4457 != null) {
                if (var7 < this.field4456 && this.field4457.compare(var6.field4449, var8.field4449) > 0) {
                    var9 = var7;
                } else {
                    var9 = var5;
                }
            } else if (var7 < this.field4456 && ((Comparable) var6.field4449).compareTo(var8.field4449) > 0) {
                var9 = var7;
            } else {
                var9 = var5;
            }

            if (this.field4457 != null) {
                if (this.field4457.compare(var3.field4449, this.field4454[var9].field4449) <= 0) {
                    break;
                }
            } else if (((Comparable) var3.field4449).compareTo(this.field4454[var9].field4449) <= 0) {
                break;
            }

            this.field4454[var1] = this.field4454[var9];
            this.field4454[var1].field4447 = var1;
        }

        this.field4454[var1] = var3;
        this.field4454[var1].field4447 = var1;
    }

    public boolean contains(Object var1) {
        return this.field4455.containsKey(var1);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4457 != null) {
            Arrays.sort(var1, this.field4457);
        } else {
            Arrays.sort(var1);
        }

        return var1;
    }

    public Iterator iterator() {
        return new class397(this);
    }
}
