import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class etb {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<etb> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               ka.a(mn.bi).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
               esy.a.listOf().fieldOf("layers").forGetter(etb::e),
               Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
               dnx.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
               amc.d(doe.b),
               amc.d(sd.g),
               amc.d(sd.h)
            )
            .apply($$0, etb::new)
      )
      .comapFlatMap(etb::a, Function.identity())
      .stable();
   private final Optional<jp<eve>> c;
   private final List<esy> d = Lists.newArrayList();
   private final jl<dnx> e;
   private final List<eeb> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jl<euc>> j;

   private static DataResult<etb> a(etb $$0) {
      int $$1 = $$0.d.stream().mapToInt(esy::a).sum();
      return $$1 > ehy.c ? DataResult.error(() -> "Sum of layer heights is > " + ehy.c, $$0) : DataResult.success($$0);
   }

   private etb(Optional<jp<eve>> $$0, List<esy> $$1, boolean $$2, boolean $$3, Optional<jl<dnx>> $$4, jl.c<dnx> $$5, jl<euc> $$6, jl<euc> $$7) {
      this($$0, a($$4, $$5), List.of($$6, $$7));
      if ($$2) {
         this.b();
      }

      if ($$3) {
         this.a();
      }

      this.d.addAll($$1);
      this.g();
   }

   private static jl<dnx> a(Optional<? extends jl<dnx>> $$0, jl<dnx> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jl<dnx>)$$0.get();
      }
   }

   public etb(Optional<jp<eve>> $$0, jl<dnx> $$1, List<jl<euc>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public etb a(List<esy> $$0, Optional<jp<eve>> $$1, jl<dnx> $$2) {
      etb $$3 = new etb($$1, $$2, this.j);

      for (esy $$4 : $$0) {
         $$3.d.add(new esy($$4.a(), $$4.b().b()));
         $$3.g();
      }

      if (this.h) {
         $$3.a();
      }

      if (this.i) {
         $$3.b();
      }

      return $$3;
   }

   public void a() {
      this.h = true;
   }

   public void b() {
      this.i = true;
   }

   public dny a(jl<dnx> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dny $$1 = this.d().a().d();
         dny.b $$2 = new dny.b();
         if (this.i) {
            for (jl<euc> $$3 : this.j) {
               $$2.a(ejw.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(doe.a)) && this.h;
         if ($$4) {
            List<jp<euc>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ejw.a.d.ordinal() && $$6 != ejw.a.e.ordinal() && (!this.i || $$6 != ejw.a.b.ordinal())) {
                  for (jl<euc> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<eeb> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            eeb $$11 = $$9.get($$10);
            if (!eka.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ejw.a.k, sg.a(enh.ad, new epq($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jp<eve>> c() {
      return this.c;
   }

   public jl<dnx> d() {
      return this.e;
   }

   public List<esy> e() {
      return this.d;
   }

   public List<eeb> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (esy $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dqb.a));
   }

   public static etb a(jm<dnx> $$0, jm<eve> $$1, jm<euc> $$2) {
      jp<eve> $$3 = jp.a($$1.b(eur.r), $$1.b(eur.a));
      etb $$4 = new etb(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new esy(1, dqb.I));
      $$4.e().add(new esy(2, dqb.j));
      $$4.e().add(new esy(1, dqb.i));
      $$4.g();
      return $$4;
   }

   public static jl<dnx> a(jm<dnx> $$0) {
      return $$0.b(doe.b);
   }

   public static List<jl<euc>> b(jm<euc> $$0) {
      return List.of($$0.b(sd.g), $$0.b(sd.h));
   }
}
