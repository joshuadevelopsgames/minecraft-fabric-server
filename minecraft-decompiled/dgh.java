import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dgh(List<byq> c, float f) implements dgj {
   public static final MapCodec<dgh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(byq.d.listOf().fieldOf("effects").forGetter(dgh::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(dgh::c))
         .apply($$0, dgh::new)
   );
   public static final zm<wx, dgh> b = zm.a(byq.e.a(zk.a()), dgh::b, zk.l, dgh::c, dgh::new);

   public dgh(byq $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public dgh(List<byq> $$0) {
      this($$0, 1.0F);
   }

   public dgh(byq $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dgj.a<dgh> a() {
      return dgj.a.a;
   }

   @Override
   public boolean a(dmu $$0, dcv $$1, cam $$2) {
      if ($$2.ec().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (byq $$4 : this.c) {
            if ($$2.a(new byq($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<byq> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
