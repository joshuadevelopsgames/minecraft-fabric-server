import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dns(dmh e, cyd f) {
   public static final String a = "enabled_features";
   public static final MapCodec<dns> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            dmh.b.lenientOptionalFieldOf("DataPacks", dmh.a).forGetter(dns::a), cyf.f.lenientOptionalFieldOf("enabled_features", cyf.h).forGetter(dns::b)
         )
         .apply($$0, dns::new)
   );
   public static final Codec<dns> c = b.codec();
   public static final dns d = new dns(dmh.a, cyf.h);

   public dns a(cyd $$0) {
      return new dns(this.e, this.f.c($$0));
   }

   public dmh a() {
      return this.e;
   }

   public cyd b() {
      return this.f;
   }
}
