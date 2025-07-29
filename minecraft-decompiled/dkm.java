import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkm(mc d, dkm.a e, dkm.a f, dkm.c g, dkm.c h, bwm i) implements djz {
   public static final MapCodec<dkm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            me.bk.fieldOf("particle").forGetter(dkm::c),
            dkm.a.a.fieldOf("horizontal_position").forGetter(dkm::d),
            dkm.a.a.fieldOf("vertical_position").forGetter(dkm::e),
            dkm.c.a.fieldOf("horizontal_velocity").forGetter(dkm::f),
            dkm.c.a.fieldOf("vertical_velocity").forGetter(dkm::g),
            bwm.c.optionalFieldOf("speed", bwk.a).forGetter(dkm::h)
         )
         .apply($$0, dkm::new)
   );

   public static dkm.a a(float $$0) {
      return new dkm.a(dkm.b.a, $$0, 1.0F);
   }

   public static dkm.a b() {
      return new dkm.a(dkm.b.b, 0.0F, 1.0F);
   }

   public static dkm.c b(float $$0) {
      return new dkm.c($$0, bwk.a);
   }

   public static dkm.c a(bwm $$0) {
      return new dkm.c(0.0F, $$0);
   }

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      bck $$5 = $$3.ec();
      fis $$6 = $$3.ae();
      float $$7 = $$3.ds();
      float $$8 = $$3.dt();
      $$0.a(
         this.d,
         this.e.a($$4.a(), $$4.a(), $$7, $$5),
         this.f.a($$4.b(), $$4.b() + $$8 / 2.0F, $$8, $$5),
         this.e.a($$4.c(), $$4.c(), $$7, $$5),
         0,
         this.g.a($$6.a(), $$5),
         this.h.a($$6.b(), $$5),
         this.g.a($$6.c(), $$5),
         this.i.a($$5)
      );
   }

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public mc c() {
      return this.d;
   }

   public dkm.a d() {
      return this.e;
   }

   public dkm.a e() {
      return this.f;
   }

   public dkm.c f() {
      return this.g;
   }

   public dkm.c g() {
      return this.h;
   }

   public bwm h() {
      return this.i;
   }

   public record a(dkm.b b, float c, float d) {
      public static final MapCodec<dkm.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                  dkm.b.c.fieldOf("type").forGetter(dkm.a::a),
                  Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dkm.a::b),
                  bbi.r.optionalFieldOf("scale", 1.0F).forGetter(dkm.a::c)
               )
               .apply($$0, dkm.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dkm.b.a && $$0.c() != 1.0F
               ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
               : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, bck $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + this.c;
      }

      public dkm.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bda {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * $$2);

      public static final Codec<dkm.b> c = bda.a(dkm.b::values);
      private final String d;
      private final dkm.b.a e;

      private b(final String $$0, final dkm.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, bck $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, bck var6);
      }
   }

   public record c(float b, bwm c) {
      public static final MapCodec<dkm.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dkm.c::a), bwm.c.optionalFieldOf("base", bwk.a).forGetter(dkm.c::b))
            .apply($$0, dkm.c::new)
      );

      public double a(double $$0, bck $$1) {
         return $$0 * this.b + this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bwm b() {
         return this.c;
      }
   }
}
