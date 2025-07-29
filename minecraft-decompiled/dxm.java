import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dxm extends dov {
   public static final MapCodec<dxm> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dxm.a.b.fieldOf("kind").forGetter(dov::b), t()).apply($$0, dxm::new));
   public static final int d = efh.a();
   private static final int b = d + 1;
   public static final efb e = eer.be;
   private static final fjm f = dpz.b(8.0, 0.0, 8.0);
   private static final fjm g = dpz.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends dxm> a() {
      return c;
   }

   protected dxm(dxm.a $$0, eea.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, 0));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.b() == dxm.b.h ? g : f;
   }

   @Override
   protected fjm d_(eeb $$0) {
      return fjj.a();
   }

   @Override
   public eeb a(dgo $$0) {
      return super.a($$0).b(e, efh.a($$0.i()));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(e, $$1.a($$0.c(e), b));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.b(e, $$1.a($$0.c(e), b));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bda {
      Map<String, dxm.a> a = new Object2ObjectArrayMap();
      Codec<dxm.a> b = Codec.stringResolver(bda::c, a::get);
   }

   public static enum b implements dxm.a {
      c("skeleton"),
      d("wither_skeleton"),
      e("player"),
      f("zombie"),
      g("creeper"),
      h("piglin"),
      i("dragon");

      private final String j;

      private b(final String $$0) {
         this.j = $$0;
         a.put($$0, this);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
