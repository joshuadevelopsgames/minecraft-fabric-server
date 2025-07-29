import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class egi extends efy {
   static final Logger n = LogUtils.getLogger();
   private static final ecx o = new ecx() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public jb c() {
         return jb.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<jb, egi.d> p = Maps.newHashMap();
   private boolean q;
   final dmu r;
   @Nullable
   private Supplier<atp> s;
   @Nullable
   private egi.c t;
   private final Int2ObjectMap<eje> u;
   private final fkf<dpz> v;
   private final fkf<fak> w;
   private egi.e x = $$0x -> {};

   public egi(dmu $$0, dlz $$1) {
      this($$0, $$1, egv.a, new fkf<>(), new fkf<>(), 0L, null, null, null);
   }

   public egi(dmu $$0, dlz $$1, egv $$2, fkf<dpz> $$3, fkf<fak> $$4, long $$5, @Nullable egj[] $$6, @Nullable egi.c $$7, @Nullable eld $$8) {
      super($$1, $$2, $$0, $$0.K_().f(mn.aK), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (eka.a $$9 : eka.a.values()) {
         if (egz.n.e().contains($$9)) {
            this.h.put($$9, new eka(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public egi(aub $$0, egs $$1, @Nullable egi.c $$2) {
      this($$0, $$1.f(), $$1.t(), $$1.L(), $$1.M(), $$1.w(), $$1.d(), $$2, $$1.v());
      if (!Collections.disjoint($$1.j.keySet(), $$1.k.keySet())) {
         n.error("Chunk at {} contains duplicated block entities", $$1.f());
      }

      for (eaz $$3 : $$1.I().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.K());

      for (int $$4 = 0; $$4 < $$1.p().length; $$4++) {
         this.b[$$4] = $$1.p()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<eka.a, eka> $$5 : $$1.e()) {
         if (egz.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.a($$1.x());
      this.i();
   }

   public void a(egi.e $$0) {
      this.x = $$0;
      if (this.k()) {
         $$0.setUnsaved(this.c);
      }
   }

   @Override
   public void i() {
      boolean $$0 = this.k();
      super.i();
      if (!$$0) {
         this.x.setUnsaved(this.c);
      }
   }

   @Override
   public fkn<dpz> q() {
      return this.v;
   }

   @Override
   public fkn<fak> r() {
      return this.w;
   }

   @Override
   public efy.b a(long $$0) {
      return new efy.b(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public eje a(int $$0) {
      return this.r instanceof aub $$1 ? (eje)this.u.computeIfAbsent($$0, $$2 -> new eja($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public eeb a_(jb $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ak()) {
         eeb $$4 = null;
         if ($$2 == 60) {
            $$4 = dqb.iy.m();
         }

         if ($$2 == 70) {
            $$4 = ejr.a($$1, $$3);
         }

         return $$4 == null ? dqb.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               egj $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dqb.a.m();
         } catch (Throwable var8) {
            p $$8 = p.a(var8, "Getting block state");
            q $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> q.a(this, $$1, $$2, $$3));
            throw new aa($$8);
         }
      }
   }

   @Override
   public fal b_(jb $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public fal a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            egj $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return fam.a.g();
      } catch (Throwable var7) {
         p $$6 = p.a(var7, "Getting fluid state");
         q $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> q.a(this, $$0, $$1, $$2));
         throw new aa($$6);
      }
   }

   @Nullable
   @Override
   public eeb a(jb $$0, eeb $$1, int $$2) {
      int $$3 = $$0.v();
      egj $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         eeb $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dpz $$10 = $$1.b();
            this.h.get(eka.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(eka.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(eka.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(eka.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.T().q().a($$0, $$11);
               this.r.T().a(this.c.h, ke.a($$3), this.c.i, $$11);
            }

            if (fac.a($$9, $$1)) {
               btt $$12 = bts.a();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.T().q().a($$0);
               $$12.c();
            }

            boolean $$13 = !$$9.a($$10);
            boolean $$14 = ($$2 & 64) != 0;
            boolean $$15 = ($$2 & 256) == 0;
            if ($$13 && $$9.x()) {
               if (!this.r.C && $$15) {
                  eaz $$16 = this.r.c_($$0);
                  if ($$16 != null) {
                     $$16.a($$0, $$9);
                  }
               }

               this.d($$0);
            }

            if (($$13 || $$10 instanceof dpo) && this.r instanceof aub $$17 && (($$2 & 1) != 0 || $$14)) {
               $$9.a($$17, $$0, $$14);
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.r.C && ($$2 & 512) == 0) {
                  $$1.a(this.r, $$0, $$9, $$14);
               }

               if ($$1.x()) {
                  eaz $$18 = this.a($$0, egi.b.c);
                  if ($$18 != null && !$$18.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$18.q().a().h().a(), $$1});
                     this.d($$0);
                     $$18 = null;
                  }

                  if ($$18 == null) {
                     $$18 = ((dsu)$$10).a($$0, $$1);
                     if ($$18 != null) {
                        this.b($$18);
                     }
                  } else {
                     $$18.c($$1);
                     this.c($$18);
                  }
               }

               this.i();
               return $$9;
            }
         }
      }
   }

   @Deprecated
   @Override
   public void a(bzm $$0) {
   }

   @Nullable
   private eaz g(jb $$0) {
      eeb $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dsu)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public eaz c_(jb $$0) {
      return this.a($$0, egi.b.c);
   }

   @Nullable
   public eaz a(jb $$0, egi.b $$1) {
      eaz $$2 = this.k.get($$0);
      if ($$2 == null) {
         ui $$3 = this.j.remove($$0);
         if ($$3 != null) {
            eaz $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == egi.b.a) {
            $$2 = this.g($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.n()) {
         this.k.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(eaz $$0) {
      this.a($$0);
      if (this.M()) {
         if (this.r instanceof aub $$1) {
            this.b($$0, $$1);
         }

         this.r.b($$0);
         this.c($$0);
      }
   }

   private boolean M() {
      return this.q || this.r.B_();
   }

   boolean h(jb $$0) {
      if (!this.r.F_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aub $$1) ? true : this.G().a(atp.c) && $$1.c(dlz.a($$0));
      }
   }

   @Override
   public void a(eaz $$0) {
      jb $$1 = $$0.aA_();
      eeb $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         eeb $$3 = $$0.m();
         if ($$2 != $$3) {
            if (!$$0.q().a($$2)) {
               n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
               return;
            }

            if ($$2.b() != $$3.b()) {
               n.warn("Block state mismatch on block entity {} in position {}, {} != {}, updating", new Object[]{$$0, $$1, $$2, $$3});
            }

            $$0.c($$2);
         }

         $$0.a(this.r);
         $$0.o();
         eaz $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.av_();
         }
      }
   }

   @Nullable
   @Override
   public ui a(jb $$0, jn.a $$1) {
      eaz $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         ui $$3 = $$2.b(this.r.K_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ui $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.l();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(jb $$0) {
      if (this.M()) {
         eaz $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aub $$2) {
               this.a($$1, $$2);
            }

            $$1.av_();
         }
      }

      this.k($$0);
   }

   private <T extends eaz> void a(T $$0, aub $$1) {
      dpz $$2 = $$0.m().b();
      if ($$2 instanceof dsu) {
         ejd $$3 = ((dsu)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = ke.a($$0.aA_().v());
            eje $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(jb $$0) {
      egi.d $$1 = this.p.remove($$0);
      if ($$1 != null) {
         $$1.a(o);
      }
   }

   public void H() {
      if (this.t != null) {
         this.t.run(this);
         this.t = null;
      }
   }

   public boolean F() {
      return false;
   }

   public void a(wg $$0, Map<eka.a, long[]> $$1, Consumer<aeb.b> $$2) {
      this.K();

      for (egj $$3 : this.m) {
         $$3.a($$0);
      }

      $$1.forEach(this::a);
      this.C();

      try (bci.j $$4 = new bci.j(this.E(), n)) {
         $$2.accept(($$1x, $$2x, $$3x) -> {
            eaz $$4x = this.a($$1x, egi.b.a);
            if ($$4x != null && $$3x != null && $$4x.q() == $$2x) {
               $$4x.b(fcy.a($$4.a($$4x.t()), this.r.K_(), $$3x));
            }
         });
      }
   }

   public void a(wg $$0) {
      for (egj $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public dmu I() {
      return this.r;
   }

   public Map<jb, eaz> J() {
      return this.k;
   }

   public void a(aub $$0) {
      dlz $$1 = this.f();

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         if (this.b[$$2] != null) {
            ShortListIterator $$8 = this.b[$$2].iterator();

            while ($$8.hasNext()) {
               Short $$3 = (Short)$$8.next();
               jb $$4 = egs.a($$3, this.h($$2), $$1);
               eeb $$5 = this.a_($$4);
               fal $$6 = $$5.y();
               if (!$$6.c()) {
                  $$6.a($$0, $$4, $$5);
               }

               if (!($$5.b() instanceof duw)) {
                  eeb $$7 = dpz.b($$5, $$0, $$4);
                  if ($$7 != $$5) {
                     $$0.a($$4, $$7, 276);
                  }
               }
            }

            this.b[$$2].clear();
         }
      }

      UnmodifiableIterator var10 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var10.hasNext()) {
         jb $$8 = (jb)var10.next();
         this.c_($$8);
      }

      this.j.clear();
      this.e.a(this);
   }

   @Nullable
   private eaz a(jb $$0, ui $$1) {
      eeb $$2 = this.a_($$0);
      eaz $$3;
      if ("DUMMY".equals($$1.b("id", ""))) {
         if ($$2.x()) {
            $$3 = ((dsu)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = eaz.a($$0, $$2, $$1, this.r.K_());
      }

      if ($$3 != null) {
         $$3.a(this.r);
         this.b($$3);
      } else {
         n.warn("Tried to load a block entity for block {} but failed at location {}", $$2, $$0);
      }

      return $$3;
   }

   public void d(long $$0) {
      this.v.b($$0);
      this.w.b($$0);
   }

   public void b(aub $$0) {
      $$0.o().a(this.c, this.v);
      $$0.p().a(this.c, this.w);
   }

   public void c(aub $$0) {
      $$0.o().a(this.c);
      $$0.p().a(this.c);
   }

   @Override
   public egz n() {
      return egz.n;
   }

   public atp G() {
      return this.s == null ? atp.b : this.s.get();
   }

   public void b(Supplier<atp> $$0) {
      this.s = $$0;
   }

   public void K() {
      this.k.values().forEach(eaz::av_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void L() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aub $$2) {
            this.b($$0, $$2);
         }

         this.r.b($$0);
         this.c($$0);
      });
   }

   private <T extends eaz> void b(T $$0, aub $$1) {
      dpz $$2 = $$0.m().b();
      if ($$2 instanceof dsu) {
         ejd $$3 = ((dsu)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(ke.a($$0.aA_().v())).a($$3);
         }
      }
   }

   private <T extends eaz> void c(T $$0) {
      eeb $$1 = $$0.m();
      eba<T> $$2 = $$1.a(this.r, (ebb<T>)$$0.q());
      if ($$2 == null) {
         this.k($$0.aA_());
      } else {
         this.p.compute($$0.aA_(), ($$2x, $$3) -> {
            ecx $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (egi.d)$$3;
            } else if (this.M()) {
               egi.d $$5 = new egi.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends eaz> ecx a(T $$0, eba<T> $$1) {
      return new egi.a<>($$0, $$1);
   }

   class a<T extends eaz> implements ecx {
      private final T b;
      private final eba<T> c;
      private boolean d;

      a(final T $$0, final eba<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            jb $$0 = this.b.aA_();
            if (egi.this.h($$0)) {
               try {
                  btt $$1 = bts.a();
                  $$1.a(this::d);
                  eeb $$2 = egi.this.a_($$0);
                  if (this.b.q().a($$2)) {
                     this.c.tick(egi.this.r, this.b.aA_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     egi.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
                  }

                  $$1.c();
               } catch (Throwable var5) {
                  p $$4 = p.a(var5, "Ticking block entity");
                  q $$5 = $$4.a("Block entity being ticked");
                  this.b.a($$5);
                  throw new aa($$4);
               }
            }
         }
      }

      @Override
      public boolean b() {
         return this.b.n();
      }

      @Override
      public jb c() {
         return this.b.aA_();
      }

      @Override
      public String d() {
         return ebb.a(this.b.q()).toString();
      }

      @Override
      public String toString() {
         return "Level ticker for " + this.d() + "@" + this.c();
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   @FunctionalInterface
   public interface c {
      void run(egi var1);
   }

   static class d implements ecx {
      private ecx a;

      d(ecx $$0) {
         this.a = $$0;
      }

      void a(ecx $$0) {
         this.a = $$0;
      }

      @Override
      public void a() {
         this.a.a();
      }

      @Override
      public boolean b() {
         return this.a.b();
      }

      @Override
      public jb c() {
         return this.a.c();
      }

      @Override
      public String d() {
         return this.a.d();
      }

      @Override
      public String toString() {
         return this.a + " <wrapped>";
      }
   }

   @FunctionalInterface
   public interface e {
      void setUnsaved(dlz var1);
   }
}
