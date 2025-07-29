import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record edd(int d, float e, float f, float g, float h, int i, bvt<dno> j, bvt<amd<fdo>> k, amd<fdo> l) {
   public static final edd a = b().a();
   public static final Codec<edd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(edd::c),
            Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(edd::d),
            Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(edd::e),
            Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(edd::f),
            Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(edd::g),
            Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(edd::h),
            dno.c.optionalFieldOf("spawn_potentials", bvt.a()).forGetter(edd::i),
            bvt.a(fdo.a).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(edd::j),
            fdo.a.optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(edd::k)
         )
         .apply($$0, edd::new)
   );
   public static final Codec<jl<edd>> c = ama.a(mn.bn, b);

   public int a(int $$0) {
      return (int)Math.floor(this.e + this.g * $$0);
   }

   public int b(int $$0) {
      return (int)Math.floor(this.f + this.h * $$0);
   }

   public long a() {
      return 160L;
   }

   public static edd.a b() {
      return new edd.a();
   }

   public edd a(bzv<?> $$0) {
      ui $$1 = new ui();
      $$1.a("id", mm.f.b($$0).toString());
      dno $$2 = new dno($$1, Optional.empty(), Optional.empty());
      return new edd(this.d, this.e, this.f, this.g, this.h, this.i, bvt.a($$2), this.k, this.l);
   }

   public int c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public int h() {
      return this.i;
   }

   public bvt<dno> i() {
      return this.j;
   }

   public bvt<amd<fdo>> j() {
      return this.k;
   }

   public amd<fdo> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bvt<dno> g = bvt.a();
      private bvt<amd<fdo>> h = bvt.<amd<fdo>>b().a(fdf.aM).a(fdf.aL).a();
      private amd<fdo> i = fdf.aP;

      public edd.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public edd.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public edd.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public edd.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public edd.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public edd.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public edd.a a(bvt<dno> $$0) {
         this.g = $$0;
         return this;
      }

      public edd.a b(bvt<amd<fdo>> $$0) {
         this.h = $$0;
         return this;
      }

      public edd.a a(amd<fdo> $$0) {
         this.i = $$0;
         return this;
      }

      public edd a() {
         return new edd(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
