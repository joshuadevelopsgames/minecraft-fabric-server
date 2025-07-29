import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record der(Optional<jl<dep>> e, Optional<Integer> f, List<byq> g, Optional<String> h) implements dfb, dga {
   public static final der a = new der(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xo i = xo.c("effect.none").a(o.h);
   public static final int b = -13083194;
   private static final Codec<der> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            dep.a.optionalFieldOf("potion").forGetter(der::e),
            Codec.INT.optionalFieldOf("custom_color").forGetter(der::f),
            byq.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(der::d),
            Codec.STRING.optionalFieldOf("custom_name").forGetter(der::g)
         )
         .apply($$0, der::new)
   );
   public static final Codec<der> c = Codec.withAlternative(j, dep.a, der::new);
   public static final zm<wx, der> d = zm.a(dep.b.a(zk::a), der::e, zk.g.a(zk::a), der::f, byq.e.a(zk.a()), der::d, zk.p.a(zk::a), der::g, der::new);

   public der(jl<dep> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static dcv a(dcr $$0, jl<dep> $$1) {
      dcv $$2 = new dcv($$0);
      $$2.b(kq.R, new der($$1));
      return $$2;
   }

   public boolean a(jl<dep> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<byq> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<byq>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<byq> $$0, float $$1) {
      if (this.e.isPresent()) {
         for (byq $$2 : this.e.get().a().a()) {
            $$0.accept($$2.a($$1));
         }
      }

      for (byq $$3 : this.g) {
         $$0.accept($$3.a($$1));
      }
   }

   public der b(jl<dep> $$0) {
      return new der(Optional.of($$0), this.f, this.g, this.h);
   }

   public der a(byq $$0) {
      return new der(this.e, this.f, ag.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public xo a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((dep)$$0x.a()).b())).orElse("empty");
      return xo.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<byq> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (byq $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().i();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * baj.b($$6);
            $$2 += $$7 * baj.c($$6);
            $$3 += $$7 * baj.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(baj.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<byq> d() {
      return Lists.transform(this.g, byq::new);
   }

   public void a(cam $$0, float $$1) {
      if ($$0.ai() instanceof aub $$2) {
         cut $$5 = $$0 instanceof cut $$4 ? $$4 : null;
         this.a($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$2, $$5, $$5, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }, $$1);
      }
   }

   public static void a(Iterable<byq> $$0, Consumer<xo> $$1, float $$2, float $$3) {
      List<Pair<jl<cbn>, cbq>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (byq $$6 : $$0) {
         $$5 = false;
         jl<byo> $$7 = $$6.c();
         int $$8 = $$6.e();
         $$7.a().a($$8, ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         yc $$9 = a($$7, $$8);
         if (!$$6.a(20)) {
            $$9 = xo.a("potion.withDuration", $$9, byr.a($$6, $$2, $$3));
         }

         $$1.accept($$9.a($$7.a().h().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xn.a);
         $$1.accept(xo.c("potion.whenDrank").a(o.f));

         for (Pair<jl<cbn>, cbq> $$10 : $$4) {
            cbq $$11 = (cbq)$$10.getSecond();
            double $$12 = $$11.b();
            double $$14;
            if ($$11.c() != cbq.a.b && $$11.c() != cbq.a.c) {
               $$14 = $$11.b();
            } else {
               $$14 = $$11.b() * 100.0;
            }

            if ($$12 > 0.0) {
               $$1.accept(xo.a("attribute.modifier.plus." + $$11.c().a(), dfm.d.format($$14), xo.c(((cbn)((jl)$$10.getFirst()).a()).c())).a(o.j));
            } else if ($$12 < 0.0) {
               $$14 *= -1.0;
               $$1.accept(xo.a("attribute.modifier.take." + $$11.c().a(), dfm.d.format($$14), xo.c(((cbn)((jl)$$10.getFirst()).a()).c())).a(o.m));
            }
         }
      }
   }

   public static yc a(jl<byo> $$0, int $$1) {
      yc $$2 = xo.c($$0.a().f());
      return $$1 > 0 ? xo.a("potion.withAmplifier", $$2, xo.c("potion.potency." + $$1)) : $$2;
   }

   @Override
   public void a(dmu $$0, cam $$1, dcv $$2, dfa $$3) {
      this.a($$1, $$2.a(kq.S, 1.0F));
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      a(this.a(), $$1, $$3.a(kq.S, 1.0F), $$0.b());
   }

   public Optional<String> g() {
      return this.h;
   }
}
