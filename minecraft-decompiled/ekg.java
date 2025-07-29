import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ekg(ejt b, ejt c, ejt d, ejt e, ejt f, ejt g, ejt h, ejt i, ejt j, ejt k, ejt l, ejt m, ejt n, ejt o, ejt p) {
   public static final Codec<ekg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            a("barrier", ekg::a),
            a("fluid_level_floodedness", ekg::b),
            a("fluid_level_spread", ekg::c),
            a("lava", ekg::d),
            a("temperature", ekg::e),
            a("vegetation", ekg::f),
            a("continents", ekg::g),
            a("erosion", ekg::h),
            a("depth", ekg::i),
            a("ridges", ekg::j),
            a("initial_density_without_jaggedness", ekg::k),
            a("final_density", ekg::l),
            a("vein_toggle", ekg::m),
            a("vein_ridged", ekg::n),
            a("vein_gap", ekg::o)
         )
         .apply($$0, ekg::new)
   );

   private static RecordCodecBuilder<ekg, ejt> a(String $$0, Function<ekg, ejt> $$1) {
      return ejt.d.fieldOf($$0).forGetter($$1);
   }

   public ekg a(ejt.f $$0) {
      return new ekg(
         this.b.a($$0),
         this.c.a($$0),
         this.d.a($$0),
         this.e.a($$0),
         this.f.a($$0),
         this.g.a($$0),
         this.h.a($$0),
         this.i.a($$0),
         this.j.a($$0),
         this.k.a($$0),
         this.l.a($$0),
         this.m.a($$0),
         this.n.a($$0),
         this.o.a($$0),
         this.p.a($$0)
      );
   }

   public ejt a() {
      return this.b;
   }

   public ejt b() {
      return this.c;
   }

   public ejt c() {
      return this.d;
   }

   public ejt d() {
      return this.e;
   }

   public ejt e() {
      return this.f;
   }

   public ejt f() {
      return this.g;
   }

   public ejt g() {
      return this.h;
   }

   public ejt h() {
      return this.i;
   }

   public ejt i() {
      return this.j;
   }

   public ejt j() {
      return this.k;
   }

   public ejt k() {
      return this.l;
   }

   public ejt l() {
      return this.m;
   }

   public ejt m() {
      return this.n;
   }

   public ejt n() {
      return this.o;
   }

   public ejt o() {
      return this.p;
   }
}
