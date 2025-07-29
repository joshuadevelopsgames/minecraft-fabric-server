import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dle(
   bzw c, jl<ayy> d, Optional<amd<dlc>> e, Optional<ame> f, Optional<jp<bzv<?>>> g, boolean h, boolean i, boolean j, boolean k, boolean l, jl<ayy> m
) {
   public static final Codec<dle> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bzw.l.fieldOf("slot").forGetter(dle::b),
            ayy.b.optionalFieldOf("equip_sound", ayz.as).forGetter(dle::c),
            amd.a(dld.a).optionalFieldOf("asset_id").forGetter(dle::d),
            ame.a.optionalFieldOf("camera_overlay").forGetter(dle::e),
            ka.a(mn.D).optionalFieldOf("allowed_entities").forGetter(dle::f),
            Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dle::g),
            Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dle::h),
            Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dle::i),
            Codec.BOOL.optionalFieldOf("equip_on_interact", false).forGetter(dle::j),
            Codec.BOOL.optionalFieldOf("can_be_sheared", false).forGetter(dle::k),
            ayy.b.optionalFieldOf("shearing_sound", mm.b.e(ayz.xR)).forGetter(dle::l)
         )
         .apply($$0, dle::new)
   );
   public static final zm<wx, dle> b = zm.a(
      bzw.m,
      dle::b,
      ayy.d,
      dle::c,
      amd.b(dld.a).a(zk::a),
      dle::d,
      ame.b.a(zk::a),
      dle::e,
      zk.c(mn.D).a(zk::a),
      dle::f,
      zk.b,
      dle::g,
      zk.b,
      dle::h,
      zk.b,
      dle::i,
      zk.b,
      dle::j,
      zk.b,
      dle::k,
      ayy.d,
      dle::l,
      dle::new
   );

   public static dle a(dbt $$0) {
      return a(bzw.g).a(ayz.pp).a(dld.l.get($$0)).a(bzv.az, bzv.bA).e(true).b(ayz.pq).a();
   }

   public static dle a() {
      jm<bzv<?>> $$0 = mm.a(mm.f);
      return a(bzw.h).a(ayz.nO).a(dld.k).a($$0.b(azs.J)).d(true).e(true).b(ayz.Fq).a();
   }

   public static dle b(dbt $$0) {
      jm<bzv<?>> $$1 = mm.a(mm.f);
      return a(bzw.g).a(ayz.ng).a(dld.n.get($$0)).a($$1.b(azs.K)).d(true).e(true).b(mm.b.e(ayz.nh)).a();
   }

   public static dle.a a(bzw $$0) {
      return new dle.a($$0);
   }

   public bxj a(dcv $$0, cut $$1) {
      if ($$1.e(this.c) && this.a($$1.ap())) {
         dcv $$2 = $$1.a(this.c);
         if ((!djk.a($$2, djj.E) || $$1.gI()) && !dcv.c($$0, $$2)) {
            if (!$$1.ai().B_()) {
               $$1.b(azj.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               dcv $$3 = $$2.f() ? $$0 : $$2.g();
               dcv $$4 = $$1.gI() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bxj.a.a($$3);
            } else {
               dcv $$5 = $$2.g();
               dcv $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gs().g($$5)) {
                  $$1.a($$5, false);
               }

               return bxj.a.a($$0);
            }
         } else {
            return bxj.d;
         }
      } else {
         return bxj.e;
      }
   }

   public bxj a(cut $$0, cam $$1, dcv $$2) {
      if ($$1.a($$2, this.c) && !$$1.d(this.c) && $$1.bO()) {
         if (!$$0.ai().B_()) {
            $$1.a(this.c, $$2.a(1));
            if ($$1 instanceof cao $$3) {
               $$3.g(this.c);
            }
         }

         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   public boolean a(bzv<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bzw b() {
      return this.c;
   }

   public jl<ayy> c() {
      return this.d;
   }

   public Optional<amd<dlc>> d() {
      return this.e;
   }

   public Optional<ame> e() {
      return this.f;
   }

   public Optional<jp<bzv<?>>> f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public boolean h() {
      return this.i;
   }

   public boolean i() {
      return this.j;
   }

   public boolean j() {
      return this.k;
   }

   public boolean k() {
      return this.l;
   }

   public jl<ayy> l() {
      return this.m;
   }

   public static class a {
      private final bzw a;
      private jl<ayy> b = ayz.as;
      private Optional<amd<dlc>> c = Optional.empty();
      private Optional<ame> d = Optional.empty();
      private Optional<jp<bzv<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;
      private boolean i;
      private boolean j;
      private jl<ayy> k = mm.b.e(ayz.xR);

      a(bzw $$0) {
         this.a = $$0;
      }

      public dle.a a(jl<ayy> $$0) {
         this.b = $$0;
         return this;
      }

      public dle.a a(amd<dlc> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dle.a a(ame $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dle.a a(bzv<?>... $$0) {
         return this.a(jp.a(bzv::r, $$0));
      }

      public dle.a a(jp<bzv<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dle.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dle.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dle.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dle.a d(boolean $$0) {
         this.i = $$0;
         return this;
      }

      public dle.a e(boolean $$0) {
         this.j = $$0;
         return this;
      }

      public dle.a b(jl<ayy> $$0) {
         this.k = $$0;
         return this;
      }

      public dle a() {
         return new dle(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
      }
   }
}
