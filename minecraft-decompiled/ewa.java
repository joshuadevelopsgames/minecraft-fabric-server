import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewa extends ewg {
   public static final MapCodec<ewa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euc.b.fieldOf("feature").forGetter($$0x -> $$0x.c), f()).apply($$0, ewa::new)
   );
   private static final ame b = ame.b("bottom");
   private final jl<euc> c;
   private final ui d;

   protected ewa(jl<euc> $$0, ewi.a $$1) {
      super($$1);
      this.c = $$0;
      this.d = this.b();
   }

   private ui b() {
      ui $$0 = new ui();
      $$0.a("name", ame.a, b);
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", ecd.a, qx.a);
      $$0.a("target", ame.a, ecd.b);
      $$0.a("joint", ecd.a.c, ecd.a.a);
      return $$0;
   }

   @Override
   public kg a(ezb $$0, dwu $$1) {
      return kg.i;
   }

   @Override
   public List<eza.a> a(ezb $$0, jb $$1, dwu $$2, bck $$3) {
      return List.of(eza.a.a(new eza.d($$1, dqb.pI.m().b(duh.b, jj.a(jh.a, jh.d)), this.d)));
   }

   @Override
   public euq a(ezb $$0, jb $$1, dwu $$2) {
      kg $$3 = this.a($$0, $$2);
      return new euq($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ezb $$0, dnt $$1, dnq $$2, efz $$3, jb $$4, jb $$5, dwu $$6, euq $$7, bck $$8, eyk $$9, boolean $$10) {
      return this.c.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ewh<?> a() {
      return ewh.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.c + "]";
   }
}
