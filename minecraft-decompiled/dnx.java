import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dnx {
   public static final Codec<dnx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            dnx.b.a.forGetter($$0x -> $$0x.i),
            dod.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
            dny.b.forGetter($$0x -> $$0x.j),
            doj.c.forGetter($$0x -> $$0x.k)
         )
         .apply($$0, dnx::new)
   );
   public static final Codec<dnx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnx.b.a.forGetter($$0x -> $$0x.i), dod.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
         .apply($$0, ($$0x, $$1) -> new dnx($$0x, $$1, dny.a, doj.b))
   );
   public static final Codec<jl<dnx>> c = ama.a(mn.aK, a);
   public static final Codec<jp<dnx>> d = ka.a(mn.aK, a);
   private static final ezq f = new ezq(new ekz(new ekb(1234L)), ImmutableList.of(0));
   static final ezq g = new ezq(new ekz(new ekb(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final ezq e = new ezq(new ekz(new ekb(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final dnx.b i;
   private final dny j;
   private final doj k;
   private final dod l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ag.a(() -> {
      Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0x.defaultReturnValue(Float.NaN);
      return $$0x;
   }));

   dnx(dnx.b $$0, dod $$1, dny $$2, doj $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public doj b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public dnx.c a(jb $$0, int $$1) {
      if (!this.c()) {
         return dnx.c.a;
      } else {
         return this.b($$0, $$1) ? dnx.c.c : dnx.c.b;
      }
   }

   private float e(jb $$0, int $$1) {
      float $$2 = this.i.d.a($$0, this.h());
      int $$3 = $$1 + 17;
      if ($$0.v() > $$3) {
         float $$4 = (float)(f.a($$0.u() / 8.0F, $$0.w() / 8.0F, false) * 8.0);
         return $$2 - ($$4 + $$0.v() - $$3) * 0.05F / 40.0F;
      } else {
         return $$2;
      }
   }

   @Deprecated
   private float f(jb $$0, int $$1) {
      long $$2 = $$0.a();
      Long2FloatLinkedOpenHashMap $$3 = this.m.get();
      float $$4 = $$3.get($$2);
      if (!Float.isNaN($$4)) {
         return $$4;
      } else {
         float $$5 = this.e($$0, $$1);
         if ($$3.size() == 1024) {
            $$3.removeFirstFloat();
         }

         $$3.put($$2, $$5);
         return $$5;
      }
   }

   public boolean a(dmx $$0, jb $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(dmx $$0, jb $$1, boolean $$2) {
      if (this.c($$1, $$0.Q())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(dnd.b, $$1) < 10) {
            eeb $$3 = $$0.a_($$1);
            fal $$4 = $$0.b_($$1);
            if ($$4.a() == fam.c && $$3.b() instanceof duw) {
               if (!$$2) {
                  return true;
               }

               boolean $$5 = $$0.B($$1.h()) && $$0.B($$1.i()) && $$0.B($$1.f()) && $$0.B($$1.g());
               if (!$$5) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean b(jb $$0, int $$1) {
      return !this.c($$0, $$1);
   }

   public boolean c(jb $$0, int $$1) {
      return this.f($$0, $$1) >= 0.15F;
   }

   public boolean d(jb $$0, int $$1) {
      return this.f($$0, $$1) > 0.1F;
   }

   public boolean b(dmx $$0, jb $$1) {
      if (this.c($$1, $$0.Q())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(dnd.b, $$1) < 10) {
            eeb $$2 = $$0.a_($$1);
            if (($$2.l() || $$2.a(dqb.ed)) && dqb.ed.m().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public dny d() {
      return this.j;
   }

   public int e() {
      return this.l.a();
   }

   public int a(double $$0, double $$1) {
      int $$2 = this.r();
      return this.l.h().a($$0, $$1, $$2);
   }

   private int r() {
      Optional<Integer> $$0 = this.l.g();
      return $$0.isPresent() ? $$0.get() : this.s();
   }

   private int s() {
      double $$0 = bcb.a(this.i.c, 0.0F, 1.0F);
      double $$1 = bcb.a(this.i.e, 0.0F, 1.0F);
      return dms.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::t);
   }

   private int t() {
      double $$0 = bcb.a(this.i.c, 0.0F, 1.0F);
      double $$1 = bcb.a(this.i.e, 0.0F, 1.0F);
      return dmp.a($$0, $$1);
   }

   public int g() {
      return this.l.f().orElseGet(this::u);
   }

   private int u() {
      double $$0 = bcb.a(this.i.c, 0.0F, 1.0F);
      double $$1 = bcb.a(this.i.e, 0.0F, 1.0F);
      return dmi.a($$0, $$1);
   }

   public float h() {
      return this.i.c;
   }

   public dod i() {
      return this.l;
   }

   public int j() {
      return this.l.b();
   }

   public int k() {
      return this.l.c();
   }

   public Optional<dnw> l() {
      return this.l.i();
   }

   public Optional<jl<ayy>> m() {
      return this.l.j();
   }

   public Optional<dnv> n() {
      return this.l.k();
   }

   public Optional<dnu> o() {
      return this.l.l();
   }

   public Optional<bvt<ayw>> p() {
      return this.l.m();
   }

   public float q() {
      return this.l.n();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private dnx.d c = dnx.d.a;
      @Nullable
      private Float d;
      @Nullable
      private dod e;
      @Nullable
      private doj f;
      @Nullable
      private dny g;

      public dnx.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public dnx.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dnx.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public dnx.a a(dod $$0) {
         this.e = $$0;
         return this;
      }

      public dnx.a a(doj $$0) {
         this.f = $$0;
         return this;
      }

      public dnx.a a(dny $$0) {
         this.g = $$0;
         return this;
      }

      public dnx.a a(dnx.d $$0) {
         this.c = $$0;
         return this;
      }

      public dnx a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new dnx(new dnx.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
         } else {
            throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
         }
      }

      @Override
      public String toString() {
         return "BiomeBuilder{\nhasPrecipitation="
            + this.a
            + ",\ntemperature="
            + this.b
            + ",\ntemperatureModifier="
            + this.c
            + ",\ndownfall="
            + this.d
            + ",\nspecialEffects="
            + this.e
            + ",\nmobSpawnSettings="
            + this.f
            + ",\ngenerationSettings="
            + this.g
            + ",\n}";
      }
   }

   record b(boolean b, float c, dnx.d d, float e) {
      public static final MapCodec<dnx.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
               Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
               dnx.d.c.optionalFieldOf("temperature_modifier", dnx.d.a).forGetter($$0x -> $$0x.d),
               Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dnx.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public dnx.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements bda {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<dnx.c> d = bda.a(dnx.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements bda {
      a("none") {
         @Override
         public float a(jb $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(jb $$0, float $$1) {
            double $$2 = dnx.g.a($$0.u() * 0.05, $$0.w() * 0.05, false) * 7.0;
            double $$3 = dnx.e.a($$0.u() * 0.2, $$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = dnx.e.a($$0.u() * 0.09, $$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<dnx.d> c = bda.a(dnx.d::values);

      public abstract float a(jb var1, float var2);

      d(final String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
