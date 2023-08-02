import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class441 implements Runnable {
    byte[] field4685;
    int field4682;
    int field4686 = 0;
    int field4688 = 0;
    IOException field4684;
    InputStream field4683;
    Thread field4687;

    class441(InputStream var1, int var2) {
        this.field4683 = var1;
        this.field4682 = var2 + 1;
        this.field4685 = new byte[this.field4682];
        this.field4687 = new Thread(this);
        this.field4687.setDaemon(true);
        this.field4687.start();
    }

    public void run() {
        while (true) {
            int var1;
            synchronized (this) {
                while (true) {
                    if (this.field4684 != null) {
                        return;
                    }

                    if (this.field4686 == 0) {
                        var1 = this.field4682 - this.field4688 - 1;
                    } else if (this.field4686 <= this.field4688) {
                        var1 = this.field4682 - this.field4688;
                    } else {
                        var1 = this.field4686 - this.field4688 - 1;
                    }

                    if (var1 > 0) {
                        break;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException var9) {
                    }
                }
            }

            int var2;
            try {
                var2 = this.field4683.read(this.field4685, this.field4688, var1);
                if (var2 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var10) {
                IOException var3 = var10;
                synchronized (this) {
                    this.field4684 = var3;
                    return;
                }
            }

            synchronized (this) {
                this.field4688 = (var2 + this.field4688) % this.field4682;
            }
        }
    }

    boolean method7814(int var1) throws IOException {
        if (var1 == 0) {
            return true;
        } else if (var1 > 0 && var1 < this.field4682) {
            synchronized (this) {
                int var4;
                if (this.field4686 <= this.field4688) {
                    var4 = this.field4688 - this.field4686;
                } else {
                    var4 = this.field4682 - this.field4686 + this.field4688;
                }

                if (var4 < var1) {
                    if (this.field4684 != null) {
                        throw new IOException(this.field4684.toString());
                    } else {
                        this.notifyAll();
                        return false;
                    }
                } else {
                    return true;
                }
            }
        } else {
            throw new IOException();
        }
    }

    int method7803() throws IOException {
        synchronized (this) {
            int var3;
            if (this.field4686 <= this.field4688) {
                var3 = this.field4688 - this.field4686;
            } else {
                var3 = this.field4688 + (this.field4682 - this.field4686);
            }

            if (var3 <= 0 && null != this.field4684) {
                throw new IOException(this.field4684.toString());
            } else {
                this.notifyAll();
                return var3;
            }
        }
    }

    int method7797() throws IOException {
        synchronized (this) {
            if (this.field4686 == this.field4688) {
                if (null != this.field4684) {
                    throw new IOException(this.field4684.toString());
                } else {
                    return -1;
                }
            } else {
                int var3 = this.field4685[this.field4686] & 255;
                this.field4686 = (1 + this.field4686) % this.field4682;
                this.notifyAll();
                return var3;
            }
        }
    }

    int method7798(byte[] var1, int var2, int var3) throws IOException {
        if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
            synchronized (this) {
                int var6;
                if (this.field4686 <= this.field4688) {
                    var6 = this.field4688 - this.field4686;
                } else {
                    var6 = this.field4688 + (this.field4682 - this.field4686);
                }

                if (var3 > var6) {
                    var3 = var6;
                }

                if (var3 == 0 && this.field4684 != null) {
                    throw new IOException(this.field4684.toString());
                } else {
                    if (var3 + this.field4686 <= this.field4682) {
                        System.arraycopy(this.field4685, this.field4686, var1, var2, var3);
                    } else {
                        int var7 = this.field4682 - this.field4686;
                        System.arraycopy(this.field4685, this.field4686, var1, var2, var7);
                        System.arraycopy(this.field4685, 0, var1, var7 + var2, var3 - var7);
                    }

                    this.field4686 = (var3 + this.field4686) % this.field4682;
                    this.notifyAll();
                    return var3;
                }
            }
        } else {
            throw new IOException();
        }
    }

    void method7799() {
        synchronized (this) {
            if (null == this.field4684) {
                this.field4684 = new IOException("");
            }

            this.notifyAll();
        }

        try {
            this.field4687.join();
        } catch (InterruptedException var4) {
        }

    }
}
