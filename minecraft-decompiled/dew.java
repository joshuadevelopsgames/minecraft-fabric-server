import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record dew(float c, float d, List<dew.a> e, dew.b f, Optional<bae<byd>> g, Optional<jl<ayy>> h, Optional<jl<ayy>> i) {
   public static final Codec<dew> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bbi.q.optionalFieldOf("block_delay_seconds", 0.0F).forGetter(dew::b),
            bbi.q.optionalFieldOf("disable_cooldown_scale", 1.0F).forGetter(dew::c),
            dew.a.a.listOf().optionalFieldOf("damage_reductions", List.of(new dew.a(90.0F, Optional.empty(), 0.0F, 1.0F))).forGetter(dew::d),
            dew.b.a.optionalFieldOf("item_damage", dew.b.c).forGetter(dew::e),
            bae.b(mn.aR).optionalFieldOf("bypassed_by").forGetter(dew::f),
            ayy.b.optionalFieldOf("block_sound").forGetter(dew::g),
            ayy.b.optionalFieldOf("disabled_sound").forGetter(dew::h)
         )
         .apply($$0, dew::new)
   );
   public static final zm<wx, dew> b = zm.a(
      zk.l,
      dew::b,
      zk.l,
      dew::c,
      dew.a.b.a(zk.a()),
      dew::d,
      dew.b.b,
      dew::e,
      bae.c(mn.aR).a(zk::a),
      dew::f,
      ayy.d.a(zk::a),
      dew::g,
      ayy.d.a(zk::a),
      dew::h,
      dew::new
   );

   public void a(aub $$0, cam $$1) {
      this.h.ifPresent($$2 -> $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), (jl<ayy>)$$2, $$1.do(), 1.0F, 0.8F + $$0.A.i() * 0.4F));
   }

   public void a(aub $$0, cam $$1, float $$2, dcv $$3) {
      int $$4 = this.a($$2);
      if ($$4 > 0) {
         if ($$1 instanceof cut $$5) {
            $$5.gP().a($$3, $$4);
         }

         $$1.fM();
         this.i.ifPresent($$2x -> $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), $$2x, $$1.do(), 0.8F, 0.8F + $$0.A.i() * 0.4F));
      }
   }

   public void a(dmu $$0, dcv $$1, cam $$2, bxi $$3, float $$4) {
      if ($$2 instanceof cut $$5) {
         if (!$$0.C) {
            $$5.b(azj.c.b($$1.h()));
         }

         int $$7 = this.f.a($$4);
         if ($$7 > 0) {
            $$1.a($$7, $$2, cam.d($$3));
         }
      }
   }

   private int a(float $$0) {
      float $$1 = $$0 * this.d;
      return $$1 > 0.0F ? Math.round($$1 * 20.0F) : 0;
   }

   public int a() {
      return Math.round(this.c * 20.0F);
   }

   public float a(byb $$0, float $$1, double $$2) {
      float $$3 = 0.0F;

      for (dew.a $$4 : this.e) {
         $$3 += $$4.a($$0, $$1, $$2);
      }

      return bcb.a($$3, 0.0F, $$1);
   }

   public float b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public List<dew.a> d() {
      return this.e;
   }

   public dew.b e() {
      return this.f;
   }

   public Optional<bae<byd>> f() {
      return this.g;
   }

   public Optional<jl<ayy>> g() {
      return this.h;
   }

   public Optional<jl<ayy>> h() {
      return this.i;
   }

   public record a(float c, Optional<jp<byd>> d, float e, float f) {
      public static final Codec<dew.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               bbi.r.optionalFieldOf("horizontal_blocking_angle", 90.0F).forGetter(dew.a::a),
               ka.a(mn.aR).optionalFieldOf("type").forGetter(dew.a::b),
               Codec.FLOAT.fieldOf("base").forGetter(dew.a::c),
               Codec.FLOAT.fieldOf("factor").forGetter(dew.a::d)
            )
            .apply($$0, dew.a::new)
      );
      public static final zm<wx, dew.a> b = zm.a(zk.l, dew.a::a, zk.c(mn.aR).a(zk::a), dew.a::b, zk.l, dew.a::c, zk.l, dew.a::d, dew.a::new);

      public float a(byb $$0, float $$1, double $$2) {
         if ($$2 > (float) (Math.PI / 180.0) * this.c) {
            return 0.0F;
         } else {
            return this.d.isPresent() && !this.d.get().a($$0.l()) ? 0.0F : bcb.a(this.e + this.f * $$1, 0.0F, $$1);
         }
      }

      public float a() {
         return this.c;
      }

      public Optional<jp<byd>> b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public record b(float d, float e, float f) {
      public static final Codec<dew.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               bbi.q.fieldOf("threshold").forGetter(dew.b::a),
               Codec.FLOAT.fieldOf("base").forGetter(dew.b::b),
               Codec.FLOAT.fieldOf("factor").forGetter(dew.b::c)
            )
            .apply($$0, dew.b::new)
      );
      public static final zm<ByteBuf, dew.b> b = zm.a(zk.l, dew.b::a, zk.l, dew.b::b, zk.l, dew.b::c, dew.b::new);
      public static final dew.b c = new dew.b(1.0F, 0.0F, 1.0F);

      public int a(float $$0) {
         return $$0 < this.d ? 0 : bcb.d(this.e + this.f * $$0);
      }

      public float a() {
         return this.d;
      }

      public float b() {
         return this.e;
      }

      public float c() {
         return this.f;
      }
   }
}
