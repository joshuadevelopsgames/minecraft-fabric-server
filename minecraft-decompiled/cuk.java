import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class cuk {
   public static final amd<cuk> a = a("desert");
   public static final amd<cuk> b = a("jungle");
   public static final amd<cuk> c = a("plains");
   public static final amd<cuk> d = a("savanna");
   public static final amd<cuk> e = a("snow");
   public static final amd<cuk> f = a("swamp");
   public static final amd<cuk> g = a("taiga");
   public static final Codec<jl<cuk>> h = amb.a(mn.aI);
   public static final zm<wx, jl<cuk>> i = zk.b(mn.aI);
   private static final Map<amd<dnx>, amd<cuk>> j = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(doe.B, a);
      $$0.put(doe.f, a);
      $$0.put(doe.C, a);
      $$0.put(doe.D, a);
      $$0.put(doe.A, b);
      $$0.put(doe.y, b);
      $$0.put(doe.z, b);
      $$0.put(doe.t, d);
      $$0.put(doe.s, d);
      $$0.put(doe.x, d);
      $$0.put(doe.Y, e);
      $$0.put(doe.X, e);
      $$0.put(doe.M, e);
      $$0.put(doe.e, e);
      $$0.put(doe.O, e);
      $$0.put(doe.r, e);
      $$0.put(doe.d, e);
      $$0.put(doe.G, e);
      $$0.put(doe.H, e);
      $$0.put(doe.I, e);
      $$0.put(doe.J, e);
      $$0.put(doe.g, f);
      $$0.put(doe.h, f);
      $$0.put(doe.p, g);
      $$0.put(doe.o, g);
      $$0.put(doe.v, g);
      $$0.put(doe.u, g);
      $$0.put(doe.q, g);
      $$0.put(doe.w, g);
   });

   private static amd<cuk> a(String $$0) {
      return amd.a(mn.aI, ame.b($$0));
   }

   private static cuk a(jy<cuk> $$0, amd<cuk> $$1) {
      return jy.a($$0, $$1, new cuk());
   }

   public static cuk a(jy<cuk> $$0) {
      a($$0, a);
      a($$0, b);
      a($$0, c);
      a($$0, d);
      a($$0, e);
      a($$0, f);
      return a($$0, g);
   }

   public static amd<cuk> a(jl<dnx> $$0) {
      return $$0.e().map(j::get).orElse(c);
   }
}
