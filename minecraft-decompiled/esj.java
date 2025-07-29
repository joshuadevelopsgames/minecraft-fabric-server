import com.mojang.serialization.MapCodec;

public class esj<P extends esi> {
   public static final esj<esk> a = a("trunk_vine", esk.a);
   public static final esj<esf> b = a("leave_vine", esf.a);
   public static final esj<esg> c = a("pale_moss", esg.a);
   public static final esj<ese> d = a("creaking_heart", ese.a);
   public static final esj<esd> e = a("cocoa", esd.a);
   public static final esj<esc> f = a("beehive", esc.a);
   public static final esj<erz> g = a("alter_ground", erz.a);
   public static final esj<esa> h = a("attached_to_leaves", esa.a);
   public static final esj<esh> i = a("place_on_ground", esh.a);
   public static final esj<esb> j = a("attached_to_logs", esb.a);
   private final MapCodec<P> k;

   private static <P extends esi> esj<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.X, $$0, new esj<>($$1));
   }

   private esj(MapCodec<P> $$0) {
      this.k = $$0;
   }

   public MapCodec<P> a() {
      return this.k;
   }
}
