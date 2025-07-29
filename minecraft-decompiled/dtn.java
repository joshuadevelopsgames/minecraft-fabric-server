import com.mojang.serialization.MapCodec;

public class dtn extends dub {
   public static final MapCodec<dtn> a = b(dtn::new);

   @Override
   public MapCodec<dtn> a() {
      return a;
   }

   public dtn(eea.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(f, $$0.g().g());
   }
}
