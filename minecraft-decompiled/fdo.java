import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class fdo {
   private static final Logger g = LogUtils.getLogger();
   public static final Codec<amd<fdo>> a = amd.a(mn.bw);
   public static final bdo b = fgc.q;
   public static final long c = 0L;
   public static final Codec<fdo> d = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
         $$0 -> $$0.group(
               fgc.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.h),
               ame.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.i),
               fdn.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.j),
               fez.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, fdo::new)
      )
   );
   public static final Codec<jl<fdo>> e = ama.a(mn.bw, d);
   public static final fdo f = new fdo(fgc.b, Optional.empty(), List.of(), List.of());
   private final bdo h;
   private final Optional<ame> i;
   private final List<fdn> j;
   private final List<fex> k;
   private final BiFunction<dcv, fdj, dcv> l;

   fdo(bdo $$0, Optional<ame> $$1, List<fdn> $$2, List<fex> $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = fez.a($$3);
   }

   public static Consumer<dcv> a(aub $$0, Consumer<dcv> $$1) {
      return $$2 -> {
         if ($$2.a($$0.L())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  dcv $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(fdm $$0, Consumer<dcv> $$1) {
      this.a(new fdj.a($$0).a(this.i), $$1);
   }

   public void a(fdj $$0, Consumer<dcv> $$1) {
      fdj.c<?> $$2 = fdj.a(this);
      if ($$0.b($$2)) {
         Consumer<dcv> $$3 = fex.a(this.l, $$1, $$0);

         for (fdn $$4 : this.j) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         g.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(fdm $$0, long $$1, Consumer<dcv> $$2) {
      this.a(new fdj.a($$0).a($$1).a(this.i), a($$0.a(), $$2));
   }

   public void b(fdm $$0, Consumer<dcv> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(fdj $$0, Consumer<dcv> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<dcv> a(fdm $$0, bck $$1) {
      return this.a(new fdj.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<dcv> a(fdm $$0, long $$1) {
      return this.a(new fdj.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<dcv> a(fdm $$0) {
      return this.a(new fdj.a($$0).a(this.i));
   }

   private ObjectArrayList<dcv> a(fdj $$0) {
      ObjectArrayList<dcv> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bdo a() {
      return this.h;
   }

   public void a(fdp $$0) {
      for (int $$1 = 0; $$1 < this.j.size(); $$1++) {
         this.j.get($$1).a($$0.a(new bci.d("pools", $$1)));
      }

      for (int $$2 = 0; $$2 < this.k.size(); $$2++) {
         this.k.get($$2).a($$0.a(new bci.d("functions", $$2)));
      }
   }

   public void a(bxc $$0, fdm $$1, long $$2) {
      fdj $$3 = new fdj.a($$1).a($$2).a(this.i);
      ObjectArrayList<dcv> $$4 = this.a($$3);
      bck $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         dcv $$7 = (dcv)var9.next();
         if ($$6.isEmpty()) {
            g.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), dcv.l);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<dcv> $$0, int $$1, bck $$2) {
      List<dcv> $$3 = Lists.newArrayList();
      Iterator<dcv> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         dcv $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         dcv $$6 = $$3.remove(bcb.a($$2, 0, $$3.size() - 1));
         int $$7 = bcb.a($$2, 1, $$6.M() / 2);
         dcv $$8 = $$6.a($$7);
         if ($$6.M() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.M() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ag.c($$0, $$2);
   }

   private List<Integer> a(bxc $$0, bck $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ag.c($$2, $$1);
      return $$2;
   }

   public static fdo.a b() {
      return new fdo.a();
   }

   public static class a implements fet<fdo.a> {
      private final Builder<fdn> a = ImmutableList.builder();
      private final Builder<fex> b = ImmutableList.builder();
      private bdo c = fdo.b;
      private Optional<ame> d = Optional.empty();

      public fdo.a a(fdn.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public fdo.a a(bdo $$0) {
         this.c = $$0;
         return this;
      }

      public fdo.a a(ame $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public fdo.a a(fex.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public fdo.a a() {
         return this;
      }

      public fdo b() {
         return new fdo(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
