import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class435 {
    static int field4652;
    final int field4655;
    class421[] field4654;
    int field4653 = 0;
    Comparator field4657 = null;
    HashMap field4658;
    HashMap field4659;

    class435(int var1) {
        this.field4655 = var1;
        this.field4654 = this.method7768(var1);
        this.field4659 = new HashMap(var1 / 8);
        this.field4658 = new HashMap(var1 / 8);
    }

    abstract class421 method7736();

    abstract class421[] method7768(int var1);

    public void method7785() {
        this.field4653 = 0;
        Arrays.fill(this.field4654, null);
        this.field4659.clear();
        this.field4658.clear();
    }

    public int method7770() {
        return this.field4653;
    }

    public boolean method7719() {
        return this.field4653 == this.field4655;
    }

    public boolean method7720(class526 var1) {
        if (!var1.method9157()) {
            return false;
        } else {
            return this.field4659.containsKey(var1) || this.field4658.containsKey(var1);
        }
    }

    public class421 method7721(class526 var1) {
        class421 var3 = this.method7722(var1);
        return null != var3 ? var3 : this.method7723(var1);
    }

    class421 method7722(class526 var1) {
        return !var1.method9157() ? null : (class421) this.field4659.get(var1);
    }

    class421 method7723(class526 var1) {
        return !var1.method9157() ? null : (class421) this.field4658.get(var1);
    }

    public final boolean method7724(class526 var1) {
        class421 var3 = this.method7722(var1);
        if (var3 == null) {
            return false;
        } else {
            this.method7725(var3);
            return true;
        }
    }

    final void method7725(class421 var1) {
        int var3 = this.method7731(var1);
        if (var3 != -1) {
            this.method7735(var3);
            this.method7732(var1);
        }
    }

    class421 method7726(class526 var1) {
        return this.method7727(var1, null);
    }

    class421 method7727(class526 var1, class526 var2) {
        if (this.method7722(var1) != null) {
            throw new IllegalStateException();
        } else {
            class421 var4 = this.method7736();
            var4.method7545(var1, var2);
            this.method7733(var4);
            this.method7734(var4);
            return var4;
        }
    }

    public final class421 method7728(int var1) {
        if (var1 >= 0 && var1 < this.field4653) {
            return this.field4654[var1];
        } else {
            throw new ArrayIndexOutOfBoundsException(var1);
        }
    }

    public final void method7729() {
        if (null == this.field4657) {
            Arrays.sort(this.field4654, 0, this.field4653);
        } else {
            Arrays.sort(this.field4654, 0, this.field4653, this.field4657);
        }

    }

    final void method7730(class421 var1, class526 var2, class526 var3) {
        this.method7732(var1);
        var1.method7545(var2, var3);
        this.method7734(var1);
    }

    final int method7731(class421 var1) {
        for (int var3 = 0; var3 < this.field4653; ++var3) {
            if (var1 == this.field4654[var3]) {
                return var3;
            }
        }

        return -1;
    }

    final void method7732(class421 var1) {
        if (this.field4659.remove(var1.field4595) == null) {
            throw new IllegalStateException();
        } else {
            if (var1.field4596 != null) {
                this.field4658.remove(var1.field4596);
            }

        }
    }

    final void method7733(class421 var1) {
        this.field4654[++this.field4653 - 1] = var1;
    }

    final void method7734(class421 var1) {
        this.field4659.put(var1.field4595, var1);
        if (null != var1.field4596) {
            class421 var3 = (class421) this.field4658.put(var1.field4596, var1);
            if (null != var3 && var1 != var3) {
                var3.field4596 = null;
            }
        }

    }

    final void method7735(int var1) {
        --this.field4653;
        if (var1 < this.field4653) {
            System.arraycopy(this.field4654, var1 + 1, this.field4654, var1, this.field4653 - var1);
        }

    }

    public final void method7786() {
        this.field4657 = null;
    }

    public final void method7739(Comparator var1) {
        if (this.field4657 == null) {
            this.field4657 = var1;
        } else if (this.field4657 instanceof class442) {
            ((class442) this.field4657).method7817(var1);
        }

    }
}
