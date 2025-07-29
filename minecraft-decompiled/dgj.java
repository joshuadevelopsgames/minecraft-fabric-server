import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dgj {
   Codec<dgj> d = mm.aw.q().dispatch(dgj::a, dgj.a::a);
   zm<wx, dgj> e = zk.a(mn.n).b(dgj::a, dgj.a::b);

   dgj.a<? extends dgj> a();

   boolean a(dmu var1, dcv var2, cam var3);

   public record a<T extends dgj>(MapCodec<T> f, zm<wx, T> g) {
      public static final dgj.a<dgh> a = a("apply_effects", dgh.a, dgh.b);
      public static final dgj.a<dgl> b = a("remove_effects", dgl.a, dgl.b);
      public static final dgj.a<dgi> c = a("clear_all_effects", dgi.b, dgi.c);
      public static final dgj.a<dgm> d = a("teleport_randomly", dgm.a, dgm.b);
      public static final dgj.a<dgk> e = a("play_sound", dgk.a, dgk.b);

      private static <T extends dgj> dgj.a<T> a(String $$0, MapCodec<T> $$1, zm<wx, T> $$2) {
         return jy.a(mm.aw, $$0, new dgj.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zm<wx, T> b() {
         return this.g;
      }
   }
}
