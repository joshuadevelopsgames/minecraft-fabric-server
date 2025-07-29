import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class fbt {
   public static final zm<ByteBuf, fbt> a = zk.a(fbt::a, fbt::i);
   private static final fbt[] b = ag.a(() -> {
      fbt[] $$0 = new fbt[48];
      a(new fbt(jh.b, jh.c, fbt.a.a), $$0);
      return $$0;
   });
   private final jh c;
   private final jh d;
   private final jh e;
   private final fbt.a f;
   private final int g;
   private final List<jh> h;
   private final List<jh> i;
   private final List<jh> j;
   private final Map<jh, fbt> k = new EnumMap<>(jh.class);
   private final Map<jh, fbt> l = new EnumMap<>(jh.class);
   private final Map<fbt.a, fbt> m = new EnumMap<>(fbt.a.class);

   private fbt(jh $$0, jh $$1, fbt.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      kg $$3 = $$1.q().d($$0.q());
      jh $$4 = jh.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == fbt.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static fbt a(jh $$0, jh $$1, fbt.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public fbt a(jh $$0) {
      return this.l.get($$0);
   }

   public fbt b(jh $$0) {
      return this.k.get($$0);
   }

   public fbt c(jh $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public fbt d(jh $$0) {
      fbt $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public fbt a(fbt.a $$0) {
      return this.m.get($$0);
   }

   public fbt a() {
      return this.a(this.f.a());
   }

   public jh b() {
      return this.d;
   }

   public jh c() {
      return this.c;
   }

   public jh d() {
      return this.e;
   }

   public fbt.a e() {
      return this.f;
   }

   public List<jh> f() {
      return this.h;
   }

   public List<jh> g() {
      return this.i;
   }

   public List<jh> h() {
      return this.j;
   }

   @Override
   public String toString() {
      return "[up=" + this.c + ",front=" + this.d + ",sideBias=" + this.f + "]";
   }

   public int i() {
      return this.g;
   }

   public static fbt a(int $$0) {
      return b[$$0];
   }

   public static fbt a(bck $$0) {
      return ag.a(b, $$0);
   }

   private static fbt a(fbt $$0, fbt[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (fbt.a $$2 : fbt.a.values()) {
            $$0.m.put($$2, a(new fbt($$0.c, $$0.d, $$2), $$1));
         }

         for (jh $$3 : jh.values()) {
            jh $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new fbt($$4, $$3, $$0.f), $$1));
         }

         for (jh $$5 : jh.values()) {
            jh $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new fbt($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jh $$0, jh $$1, fbt.a $$2) {
      if ($$0.o() == $$1.o()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int $$3;
         if ($$0.o() == jh.a.b) {
            $$3 = $$1.o() == jh.a.a ? 1 : 0;
         } else {
            $$3 = $$1.o() == jh.a.b ? 1 : 0;
         }

         int $$5 = $$3 << 1 | $$1.f().ordinal();
         return (($$0.ordinal() << 2) + $$5 << 1) + $$2.ordinal();
      }
   }

   public static enum a {
      a("left"),
      b("right");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public fbt.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
