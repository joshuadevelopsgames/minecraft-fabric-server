import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dkc(boolean d, Optional<jl<byd>> e, Optional<djp> f, Optional<jp<dpz>> g, fis h, djp i, boolean j, dmu.a k, mc l, mc m, jl<ayy> n) implements djz {
   public static final MapCodec<dkc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dkc::b),
            byd.b.optionalFieldOf("damage_type").forGetter(dkc::c),
            djp.b.optionalFieldOf("knockback_multiplier").forGetter(dkc::d),
            ka.a(mn.i).optionalFieldOf("immune_blocks").forGetter(dkc::e),
            fis.a.optionalFieldOf("offset", fis.c).forGetter(dkc::f),
            djp.b.fieldOf("radius").forGetter(dkc::g),
            Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dkc::h),
            dmu.a.f.fieldOf("block_interaction").forGetter(dkc::i),
            me.bk.fieldOf("small_particle").forGetter(dkc::j),
            me.bk.fieldOf("large_particle").forGetter(dkc::k),
            ayy.b.fieldOf("sound").forGetter(dkc::l)
         )
         .apply($$0, dkc::new)
   );

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      fis $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dnn(this.k != dmu.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
         $$5.a(),
         $$5.b(),
         $$5.c(),
         Math.max(this.i.a($$1), 0.0F),
         this.j,
         this.k,
         this.l,
         this.m,
         this.n
      );
   }

   @Nullable
   private byb a(bzm $$0, fis $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new byb(this.e.get(), $$0) : new byb(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jl<byd>> c() {
      return this.e;
   }

   public Optional<djp> d() {
      return this.f;
   }

   public Optional<jp<dpz>> e() {
      return this.g;
   }

   public fis f() {
      return this.h;
   }

   public djp g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dmu.a i() {
      return this.k;
   }

   public mc j() {
      return this.l;
   }

   public mc k() {
      return this.m;
   }

   public jl<ayy> l() {
      return this.n;
   }
}
