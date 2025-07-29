import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ekf(eki j, eeb k, eeb l, ekg m, ekr.o n, List<dog.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ekf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            eki.a.fieldOf("noise").forGetter(ekf::f),
            eeb.a.fieldOf("default_block").forGetter(ekf::g),
            eeb.a.fieldOf("default_fluid").forGetter(ekf::h),
            ekg.a.fieldOf("noise_router").forGetter(ekf::i),
            ekr.o.b.fieldOf("surface_rule").forGetter(ekf::j),
            dog.d.a.listOf().fieldOf("spawn_target").forGetter(ekf::k),
            Codec.INT.fieldOf("sea_level").forGetter(ekf::l),
            Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ekf::a),
            Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ekf::b),
            Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ekf::c),
            Codec.BOOL.fieldOf("legacy_random_source").forGetter(ekf::n)
         )
         .apply($$0, ekf::new)
   );
   public static final Codec<jl<ekf>> b = ama.a(mn.bc, a);
   public static final amd<ekf> c = amd.a(mn.bc, ame.b("overworld"));
   public static final amd<ekf> d = amd.a(mn.bc, ame.b("large_biomes"));
   public static final amd<ekf> e = amd.a(mn.bc, ame.b("amplified"));
   public static final amd<ekf> f = amd.a(mn.bc, ame.b("nether"));
   public static final amd<ekf> g = amd.a(mn.bc, ame.b("end"));
   public static final amd<ekf> h = amd.a(mn.bc, ame.b("caves"));
   public static final amd<ekf> i = amd.a(mn.bc, ame.b("floating_islands"));

   @Deprecated
   public boolean a() {
      return this.q;
   }

   public boolean b() {
      return this.r;
   }

   public boolean c() {
      return this.s;
   }

   public ekz.a d() {
      return this.t ? ekz.a.a : ekz.a.b;
   }

   public static void a(qq<ekf> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ekf b(qq<?> $$0) {
      return new ekf(eki.d, dqb.fY.m(), dqb.a.m(), ekh.a($$0.a(mn.aS)), rd.c(), List.of(), 0, true, false, false, true);
   }

   private static ekf c(qq<?> $$0) {
      return new ekf(eki.c, dqb.em.m(), dqb.K.m(), ekh.a($$0.a(mn.aS), $$0.a(mn.bd)), rd.b(), List.of(), 32, false, false, false, true);
   }

   private static ekf a(qq<?> $$0, boolean $$1, boolean $$2) {
      return new ekf(eki.b, dqb.b.m(), dqb.J.m(), ekh.a($$0.a(mn.aS), $$0.a(mn.bd), $$2, $$1), rd.a(), new don().a(), 63, false, true, true, false);
   }

   private static ekf d(qq<?> $$0) {
      return new ekf(eki.e, dqb.b.m(), dqb.J.m(), ekh.b($$0.a(mn.aS), $$0.a(mn.bd)), rd.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ekf e(qq<?> $$0) {
      return new ekf(eki.f, dqb.b.m(), dqb.J.m(), ekh.c($$0.a(mn.aS), $$0.a(mn.bd)), rd.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ekf e() {
      return new ekf(eki.b, dqb.b.m(), dqb.a.m(), ekh.a(), rd.d(), List.of(), 63, true, false, false, false);
   }

   public eki f() {
      return this.j;
   }

   public eeb g() {
      return this.k;
   }

   public eeb h() {
      return this.l;
   }

   public ekg i() {
      return this.m;
   }

   public ekr.o j() {
      return this.n;
   }

   public List<dog.d> k() {
      return this.o;
   }

   public int l() {
      return this.p;
   }

   public boolean m() {
      return this.r;
   }

   public boolean n() {
      return this.t;
   }
}
