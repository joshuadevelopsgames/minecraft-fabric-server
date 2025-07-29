import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import org.slf4j.Logger;

public class gao implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final bck b = bck.a();
   private static final float c = 32.0F;
   private final hru d;
   private final ame e;
   private gas f;
   private gas g;
   private List<flq.a> h = List.of();
   private List<flq> i = List.of();
   private final gal<gas> j = new gal<>(gas[]::new, gas[][]::new);
   private final gal<gao.a> k = new gal<>(gao.a[]::new, gao.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<gap> m = Lists.newArrayList();
   private final IntFunction<gao.a> n = this::b;
   private final IntFunction<gas> o = this::c;

   public gao(hru $$0, ame $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<flq.a> $$0, Set<gan> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<gan> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.m.clear();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = gau.b.bake(this::a);
      this.g = gau.a.bake(this::a);
   }

   private List<flq> b(List<flq.a> $$0, Set<gan> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<flq> $$3 = new ArrayList<>();

      for (flq.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<flq> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (flq $$3x : $$3) {
            flp $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != gau.b) {
                  ((IntList)this.l.computeIfAbsent(bcb.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      return $$3.stream().filter($$5::contains).toList();
   }

   @Override
   public void close() {
      this.m.clear();
   }

   private static boolean b(flp $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private gao.a b(int $$0) {
      flp $$1 = null;

      for (flq $$2 : this.i) {
         flp $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new gao.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new gao.a($$1, gau.b) : gao.a.c;
   }

   public flp a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private gas c(int $$0) {
      for (flq $$1 : this.i) {
         flp $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public gas a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private gas a(flr $$0) {
      for (gap $$1 : this.m) {
         gas $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ame $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      gaq $$5 = $$4 ? gaq.b($$3) : gaq.a($$3);
      gap $$6 = new gap($$3::toString, $$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      gas $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public gas a(flp $$0) {
      IntList $$1 = (IntList)this.l.get(bcb.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public ame a() {
      return this.e;
   }

   public gas b() {
      return this.g;
   }

   record a(flp a, flp b) {
      static final gao.a c = new gao.a(gau.b, gau.b);

      flp a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
