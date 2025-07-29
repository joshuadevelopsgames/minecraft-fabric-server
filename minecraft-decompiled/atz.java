import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class atz {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final aub f;
   private final bzm g;
   private final int h;
   private final boolean i;
   private final Consumer<zw<?>> j;
   private final BiConsumer<zw<?>, List<UUID>> k;
   private final ajr l = new ajr();
   private byte m;
   private byte n;
   private byte o;
   private fis p;
   private int q;
   private int r;
   private List<bzm> s = Collections.emptyList();
   private boolean t;
   private boolean u;
   @Nullable
   private List<all.c<?>> v;

   public atz(aub $$0, bzm $$1, int $$2, boolean $$3, Consumer<zw<?>> $$4, BiConsumer<zw<?>, List<UUID>> $$5) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k = $$5;
      this.l.e($$1.dw());
      this.p = $$1.dA();
      this.m = bcb.g($$1.dP());
      this.n = bcb.g($$1.dR());
      this.o = bcb.g($$1.cE());
      this.u = $$1.aK();
      this.v = $$1.au().c();
   }

   public void a() {
      List<bzm> $$0 = this.g.da();
      if (!$$0.equals(this.s)) {
         List<UUID> $$1 = this.a($$0).map(bzm::cK).toList();
         this.k.accept(new agh(this.g), $$1);
         this.s = $$0;
      }

      if (this.g instanceof cqs $$2 && this.q % 10 == 0) {
         dcv $$3 = $$2.v();
         if ($$3.h() instanceof ddi) {
            fce $$4 = $$3.a(kq.M);
            fcg $$5 = ddi.a($$4, this.f);
            if ($$5 != null) {
               for (auc $$6 : this.f.A()) {
                  $$5.a($$6, $$3);
                  zw<?> $$7 = $$5.a($$4, $$6);
                  if ($$7 != null) {
                     $$6.g.b($$7);
                  }
               }
            }
         }

         this.g();
      }

      if (this.q % this.h == 0 || this.g.aE || this.g.au().a()) {
         byte $$8 = bcb.g(this.g.dP());
         byte $$9 = bcb.g(this.g.dR());
         boolean $$10 = Math.abs($$8 - this.m) >= 1 || Math.abs($$9 - this.n) >= 1;
         if (this.g.cc()) {
            if ($$10) {
               this.j.accept(new aek.c(this.g.ar(), $$8, $$9, this.g.aK()));
               this.m = $$8;
               this.n = $$9;
            }

            this.l.e(this.g.dw());
            this.g();
            this.t = true;
         } else if (this.g instanceof cxg $$11 && $$11.f() instanceof cxv $$12) {
            this.a($$12, $$8, $$9, $$10);
         } else {
            this.r++;
            fis $$13 = this.g.dw();
            boolean $$14 = this.l.d($$13).h() >= 7.6293945E-6F;
            zw<?> $$15 = null;
            boolean $$16 = $$14 || this.q % 60 == 0;
            boolean $$17 = false;
            boolean $$18 = false;
            long $$19 = this.l.a($$13);
            long $$20 = this.l.b($$13);
            long $$21 = this.l.c($$13);
            boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
            if (this.g.aq() || $$22 || this.r > 400 || this.t || this.u != this.g.aK()) {
               this.u = this.g.aK();
               this.r = 0;
               $$15 = adu.a(this.g);
               $$17 = true;
               $$18 = true;
            } else if ((!$$16 || !$$10) && !(this.g instanceof cvb)) {
               if ($$16) {
                  $$15 = new aek.a(this.g.ar(), (short)$$19, (short)$$20, (short)$$21, this.g.aK());
                  $$17 = true;
               } else if ($$10) {
                  $$15 = new aek.c(this.g.ar(), $$8, $$9, this.g.aK());
                  $$18 = true;
               }
            } else {
               $$15 = new aek.b(this.g.ar(), (short)$$19, (short)$$20, (short)$$21, $$8, $$9, this.g.aK());
               $$17 = true;
               $$18 = true;
            }

            if (this.g.aE || this.i || this.g instanceof cam && ((cam)this.g).fQ()) {
               fis $$23 = this.g.dA();
               double $$24 = $$23.g(this.p);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.h() == 0.0) {
                  this.p = $$23;
                  if (this.g instanceof cvc $$25) {
                     this.j.accept(new adb(List.of(new agb(this.g.ar(), this.p), new afb($$25.ar(), $$25.c))));
                  } else {
                     this.j.accept(new agb(this.g.ar(), this.p));
                  }
               }
            }

            if ($$15 != null) {
               this.j.accept($$15);
            }

            this.g();
            if ($$17) {
               this.l.e($$13);
            }

            if ($$18) {
               this.m = $$8;
               this.n = $$9;
            }

            this.t = false;
         }

         byte $$26 = bcb.g(this.g.cE());
         if (Math.abs($$26 - this.o) >= 1) {
            this.j.accept(new afj(this.g, $$26));
            this.o = $$26;
         }

         this.g.aE = false;
      }

      this.q++;
      if (this.g.ag) {
         this.g.ag = false;
         this.a(new agb(this.g));
      }
   }

   private Stream<bzm> a(List<bzm> $$0) {
      return Streams.concat(new Stream[]{this.s.stream().filter($$1 -> !$$0.contains($$1)), $$0.stream().filter($$0x -> !this.s.contains($$0x))});
   }

   private void a(cxv $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         fis $$4 = this.g.dA();
         double $$5 = $$4.g(this.p);
         fis $$6 = this.g.dw();
         boolean $$7 = this.l.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.q % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new ael(this.g.ar(), List.of(new cxv.a(this.g.dv(), this.g.dA(), this.g.dP(), this.g.dR(), 1.0F))));
         }
      } else {
         this.j.accept(new ael(this.g.ar(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.m = $$1;
      this.n = $$2;
      this.l.e(this.g.dv());
   }

   public void a(auc $$0) {
      this.g.e($$0);
      $$0.g.b(new aff(this.g.ar()));
   }

   public void b(auc $$0) {
      List<zw<? super acq>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.g.b(new adb($$1));
      this.g.d($$0);
   }

   public void a(auc $$0, Consumer<zw<acq>> $$1) {
      if (this.g.dU()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zw<acq> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.v != null) {
         $$1.accept(new afz(this.g.ar(), this.v));
      }

      if (this.g instanceof cam $$3) {
         Collection<cbo> $$4 = $$3.fg().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new ahe(this.g.ar(), $$4));
         }
      }

      if (this.g instanceof cam $$5) {
         List<Pair<bzw, dcv>> $$6 = Lists.newArrayList();

         for (bzw $$7 : bzw.j) {
            dcv $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new agc(this.g.ar(), $$6));
         }
      }

      if (!this.g.da().isEmpty()) {
         $$1.accept(new agh(this.g));
      }

      if (this.g.cc()) {
         $$1.accept(new agh(this.g.dm()));
      }

      if (this.g instanceof cak $$9 && $$9.R_()) {
         $$1.accept(new aga(this.g, $$9.aj_()));
      }
   }

   public fis b() {
      return this.l.a();
   }

   public fis c() {
      return this.p;
   }

   public float d() {
      return bcb.a(this.n);
   }

   public float e() {
      return bcb.a(this.m);
   }

   public float f() {
      return bcb.a(this.o);
   }

   private void g() {
      all $$0 = this.g.au();
      List<all.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.v = $$0.c();
         this.a(new afz(this.g.ar(), $$1));
      }

      if (this.g instanceof cam) {
         Set<cbo> $$2 = ((cam)this.g).fg().a();
         if (!$$2.isEmpty()) {
            this.a(new ahe(this.g.ar(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zw<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof auc) {
         ((auc)this.g).g.b($$0);
      }
   }
}
