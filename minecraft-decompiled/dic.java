import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dic implements dhb {
   final String d;
   final dgz e;
   final dcv f;
   final List<dhi> g;
   @Nullable
   private dhl h;

   public dic(String $$0, dgz $$1, dcv $$2, List<dhi> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public dhw<dic> a() {
      return dhw.b;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public dgz c() {
      return this.e;
   }

   @Override
   public dhl ao_() {
      if (this.h == null) {
         this.h = dhl.b(this.g);
      }

      return this.h;
   }

   public boolean a(dha $$0, dmu $$1) {
      if ($$0.e() != this.g.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.g.size() == 1 ? this.g.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public dcv a(dha $$0, jn.a $$1) {
      return this.f.v();
   }

   @Override
   public List<dis> g() {
      return List.of(new dix(this.g.stream().map(dhi::c).toList(), new diy.f(this.f), new diy.d(dcz.fi)));
   }

   public static class a implements dhw<dic> {
      private static final MapCodec<dic> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
               dgz.e.fieldOf("category").orElse(dgz.d).forGetter($$0x -> $$0x.e),
               dcv.d.fieldOf("result").forGetter($$0x -> $$0x.f),
               dhi.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dic::new)
      );
      public static final zm<wx, dic> w = zm.a(zk.p, $$0 -> $$0.d, dgz.g, $$0 -> $$0.e, dcv.j, $$0 -> $$0.f, dhi.a.a(zk.a()), $$0 -> $$0.g, dic::new);

      @Override
      public MapCodec<dic> a() {
         return x;
      }

      @Override
      public zm<wx, dic> b() {
         return w;
      }
   }
}
