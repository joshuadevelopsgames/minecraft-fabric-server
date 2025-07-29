import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class efy implements dnz.a, egk, egu {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   private volatile boolean p;
   private volatile boolean q;
   protected final dlz c;
   private long r;
   @Nullable
   @Deprecated
   private dny s;
   @Nullable
   protected eke d;
   protected final egv e;
   @Nullable
   protected eld f;
   protected final Map<eka.a, eka> h = Maps.newEnumMap(eka.a.class);
   protected ezv i;
   private final Map<euy, evg> t = Maps.newHashMap();
   private final Map<euy, LongSet> u = Maps.newHashMap();
   protected final Map<jb, ui> j = Maps.newHashMap();
   protected final Map<jb, eaz> k = new Object2ObjectOpenHashMap();
   protected final dmw l;
   protected final egj[] m;

   public efy(dlz $$0, egv $$1, dmw $$2, jy<dnx> $$3, long $$4, @Nullable egj[] $$5, @Nullable eld $$6) {
      this.c = $$0;
      this.e = $$1;
      this.l = $$2;
      this.m = new egj[$$2.ap()];
      this.r = $$4;
      this.b = new ShortList[$$2.ap()];
      this.f = $$6;
      this.i = new ezv($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(jy<dnx> $$0, egj[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new egj($$0);
         }
      }
   }

   public eje a(int $$0) {
      return eje.a;
   }

   @Nullable
   public eeb a(jb $$0, eeb $$1) {
      return this.a($$0, $$1, 3);
   }

   @Nullable
   public abstract eeb a(jb var1, eeb var2, int var3);

   public abstract void a(eaz var1);

   public abstract void a(bzm var1);

   public int a() {
      egj[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         egj $$2 = $$0[$$1];
         if (!$$2.c()) {
            return $$1;
         }
      }

      return -1;
   }

   @Deprecated(
      forRemoval = true
   )
   public int b() {
      int $$0 = this.a();
      return $$0 == -1 ? this.L_() : ke.c(this.h($$0));
   }

   public Set<jb> c() {
      Set<jb> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public egj[] d() {
      return this.m;
   }

   public egj b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<eka.a, eka>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(eka.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public eka a(eka.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new eka(this, $$0x));
   }

   public boolean b(eka.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(eka.a $$0, int $$1, int $$2) {
      eka $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ac.aZ && this instanceof egi) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         eka.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public dlz f() {
      return this.c;
   }

   @Nullable
   @Override
   public evg a(euy $$0) {
      return this.t.get($$0);
   }

   @Override
   public void a(euy $$0, evg $$1) {
      this.t.put($$0, $$1);
      this.i();
   }

   public Map<euy, evg> g() {
      return Collections.unmodifiableMap(this.t);
   }

   public void a(Map<euy, evg> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.i();
   }

   @Override
   public LongSet b(euy $$0) {
      return this.u.getOrDefault($$0, o);
   }

   @Override
   public void a(euy $$0, long $$1) {
      this.u.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.i();
   }

   @Override
   public Map<euy, LongSet> h() {
      return Collections.unmodifiableMap(this.u);
   }

   @Override
   public void b(Map<euy, LongSet> $$0) {
      this.u.clear();
      this.u.putAll($$0);
      this.i();
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.L_()) {
         $$0 = this.L_();
      }

      if ($$1 > this.ao()) {
         $$1 = this.ao();
      }

      for (int $$2 = $$0; $$2 <= $$1; $$2 += 16) {
         if (!this.b(this.f($$2)).c()) {
            return false;
         }
      }

      return true;
   }

   public void i() {
      this.p = true;
   }

   public boolean j() {
      if (this.p) {
         this.p = false;
         return true;
      } else {
         return false;
      }
   }

   public boolean k() {
      return this.p;
   }

   public abstract egz n();

   public egz o() {
      egz $$0 = this.n();
      ejo $$1 = this.z();
      if ($$1 != null) {
         egz $$2 = $$1.a();
         return egz.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(jb var1);

   public void e(jb $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] p() {
      return this.b;
   }

   public void a(ShortList $$0, int $$1) {
      a(this.p(), $$1).addAll($$0);
   }

   public void a(ui $$0) {
      jb $$1 = eaz.a(this.c, $$0);
      if (!this.k.containsKey($$1)) {
         this.j.put($$1, $$0);
      }
   }

   @Nullable
   public ui f(jb $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract ui a(jb var1, jn.a var2);

   @Override
   public final void a(BiConsumer<jb, eeb> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<eeb> $$0, BiConsumer<jb, eeb> $$1) {
      jb.a $$2 = new jb.a();

      for (int $$3 = this.aq(); $$3 <= this.ar(); $$3++) {
         egj $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            jb $$5 = ke.a(this.c, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     eeb $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract fkn<dpz> q();

   public abstract fkn<fak> r();

   public boolean s() {
      return true;
   }

   public abstract efy.b a(long var1);

   public egv t() {
      return this.e;
   }

   public boolean u() {
      return this.f != null;
   }

   @Nullable
   public eld v() {
      return this.f;
   }

   public long w() {
      return this.r;
   }

   public void b(long $$0) {
      this.r += $$0;
   }

   public void c(long $$0) {
      this.r = $$0;
   }

   public static ShortList a(ShortList[] $$0, int $$1) {
      if ($$0[$$1] == null) {
         $$0[$$1] = new ShortArrayList();
      }

      return $$0[$$1];
   }

   public boolean x() {
      return this.q;
   }

   public void a(boolean $$0) {
      this.q = $$0;
      this.i();
   }

   @Override
   public int L_() {
      return this.l.L_();
   }

   @Override
   public int M_() {
      return this.l.M_();
   }

   public eke a(Function<efy, eke> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this);
      }

      return this.d;
   }

   @Deprecated
   public dny a(Supplier<dny> $$0) {
      if (this.s == null) {
         this.s = $$0.get();
      }

      return this.s;
   }

   @Override
   public jl<dnx> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jw.a(this.L_());
         int $$4 = $$3 + jw.a(this.M_()) - 1;
         int $$5 = bcb.a($$1, $$3, $$4);
         int $$6 = this.f(jw.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         p $$8 = p.a(var8, "Getting biome");
         q $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> q.a(this, $$0, $$1, $$2));
         throw new aa($$8);
      }
   }

   public void a(doa $$0, dog.f $$1) {
      dlz $$2 = this.f();
      int $$3 = jw.a($$2.d());
      int $$4 = jw.a($$2.e());
      dmw $$5 = this.B();

      for (int $$6 = $$5.aq(); $$6 <= $$5.ar(); $$6++) {
         egj $$7 = this.b(this.g($$6));
         int $$8 = jw.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean y() {
      return !this.h().isEmpty();
   }

   @Nullable
   public ejo z() {
      return null;
   }

   public boolean A() {
      return this.z() != null;
   }

   public dmw B() {
      return this;
   }

   public void C() {
      this.i.a(this);
   }

   @Override
   public ezv D() {
      return this.i;
   }

   public static bci.f a(dlz $$0) {
      return new efy.a($$0);
   }

   public bci.f E() {
      return a(this.f());
   }

   record a(dlz a) implements bci.f {
      @Override
      public String get() {
         return "chunk@" + this.a;
      }
   }

   public record b(List<fkj<dpz>> a, List<fkj<fak>> b) {
   }
}
