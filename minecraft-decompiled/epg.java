import com.mojang.serialization.Codec;

public class epg implements epm {
   public static final Codec<epg> a = bwo.b(0, 256).fieldOf("count").xmap(epg::new, epg::a).codec();
   private final bwo b;

   public epg(int $$0) {
      this.b = bwl.a($$0);
   }

   public epg(bwo $$0) {
      this.b = $$0;
   }

   public bwo a() {
      return this.b;
   }
}
