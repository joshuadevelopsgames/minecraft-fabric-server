import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class dfn implements dga {
   private static final int d = -1;
   private static final int e = 256;
   public static final dfn a = new dfn(ju.a());
   public static final Codec<dfn> b = dfn.a.a.sizeLimitedListOf(256).xmap(dfn::b, dfn::f);
   public static final zm<wx, dfn> c = dcv.h.a(zk.c(256)).a(dfn::new, $$0 -> $$0.f);
   private final ju<dcv> f;
   private final int g;

   private dfn(ju<dcv> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = dcv.a($$0);
      }
   }

   private dfn(int $$0) {
      this(ju.a($$0, dcv.l));
   }

   private dfn(List<dcv> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dfn b(List<dfn.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dfn.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dfn $$2 = new dfn($$1.getAsInt() + 1);

         for (dfn.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dfn a(List<dcv> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dfn $$2 = new dfn($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<dcv> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dfn.a> f() {
      List<dfn.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         dcv $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dfn.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(ju<dcv> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         dcv $$2 = $$1 < this.f.size() ? this.f.get($$1) : dcv.l;
         $$0.set($$1, $$2.v());
      }
   }

   public dcv a() {
      return this.f.isEmpty() ? dcv.l : this.f.get(0).v();
   }

   public Stream<dcv> b() {
      return this.f.stream().map(dcv::v);
   }

   public Stream<dcv> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(dcv::v);
   }

   public Iterable<dcv> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<dcv> e() {
      return Iterables.transform(this.d(), dcv::v);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof dfn $$1 && dcv.a(this.f, $$1.f);
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      int $$4 = 0;
      int $$5 = 0;

      for (dcv $$6 : this.d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$1.accept(xo.a("item.container.item_count", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$1.accept(xo.a("item.container.more_items", $$5 - $$4).a(o.u));
      }
   }

   record a(int b, dcv c) {
      public static final Codec<dfn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dfn.a::a), dcv.b.fieldOf("item").forGetter(dfn.a::b)).apply($$0, dfn.a::new)
      );

      public int a() {
         return this.b;
      }

      public dcv b() {
         return this.c;
      }
   }
}
